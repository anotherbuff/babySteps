package Queues;

public interface Queue<X>
  {
    public int INTIAL_SIZE = 10;
    
    public void enqueue(X item);
    
    
    public X dequeue();
    
    
    public boolean contains(X item);
    
    
    public X access(X item);
    
    
    public X peek();
  }
