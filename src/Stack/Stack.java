package Stack;

public interface Stack<X>
    {
        
        int INITIAL_SIZE = 100;
        
        
        public void push(X item);
        
        
        public X pop();
        
        
        public boolean contains(X item);
        
        
        public X access(X item);
        
        
        public int size();
    }
