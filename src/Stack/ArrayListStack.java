package Stack;

import java.util.ArrayList;

public class ArrayListStack<X> implements Stack<X>
  {
    
    private ArrayList<X> list = new ArrayList<>();
    
    
    @Override
    public void push(X item)
      {
        list.add(item);
      }
    
    
    @Override
    public X pop()
      {
        if(list.size()==0)
          throw new IllegalStateException("Invalid Call:NO MORE ITEMS LEFT TO POP");
        
        return list.remove(list.size()-1);
      }
    
    
    @Override
    public boolean contains(X item)
      {
        if(!list.contains(item))
          {
            return false;
          }
        return true;
      }
    
    
    @Override
    public X access(X item)
      {
        X temp;
        while(list.size() >0)
          {
            temp = pop();
            if(item.equals(temp))
              return temp;
          }
        throw new IllegalArgumentException("Invalid Access Call:NO SUCH ELEMENT");
      }
    
    
    @Override
    public int size()
      {
        return list.size();
      }
  }
