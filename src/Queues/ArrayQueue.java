package Queues;

public class ArrayQueue<X> implements Queue<X>
  {
    
    private X[] dataArray=(X[]) new Object[INTIAL_SIZE];
    private int start = dataArray.length-1,end = dataArray.length-1;
    
    
    
    @Override
    public void enqueue(X item)
      {
        if(end==0)
          throw new IllegalStateException("Invalid Call : Queue's Full");
        
        dataArray[end--] = item;
      }
    
    
    @Override
    public X dequeue()
      {
        if(start == end)
          throw new IllegalStateException("Invalid Call : Queue's Empty");
        
        //TODO: check logic
        
        X temp = dataArray[end];
        dataArray[end] = null;
        end++;
        return temp;
        
        
        
      }
    
    @Override
    public boolean contains(X item)
      {
        return false;
      }
    
    
    @Override
    public X access(X item)
      {
        return null;
      }
    
    
    @Override
    public X peek()
      {
        return null;
      }
  }
