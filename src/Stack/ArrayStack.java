    package Stack;
    
    public class ArrayStack<X> implements Stack<X>
        {
            
            private X[] dataArray;
            private int stackPointer;
            
            
            public ArrayStack()
                {
                    stackPointer = 0;
                    dataArray = (X[]) new Object[INITIAL_SIZE];
                }
            
            
            @Override
            public void push(X item)
                {
                    dataArray[stackPointer++] = item;
                }
            
            
            @Override
            public X pop()
                {
                    if (stackPointer == 0) throw new IllegalStateException("Invalid Call:NO MORE ITEMS LEFT TO POP");
                    return dataArray[--stackPointer];
                }
            
            
            @Override
            public boolean contains(X item)
                {
                    for (int i = 0; i < stackPointer; i++)
                        {
                            if (item.equals(dataArray[i]))
                                {
                                    return true;
                                }
                        }
                    return false;
                }
            
            
            @Override
            public X access(X item)
                {
                    while (stackPointer > 0)
                        {
                            X temp = pop();
                            if (item.equals(temp))
                                {
                                    return temp;
                                }
                        }
                    throw new IllegalArgumentException("Invalid Access Call:NO SUCH ELEMENT");
                }
            
            
            @Override
            public int size()
                {
                    return stackPointer;
                }
        }
