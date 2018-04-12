package Lists;

public  class BasicLinkedList<X>
  {
    
    private Node front;
    private Node end;
    private int size;
    
    
    public BasicLinkedList()
      {
        front = null;
        end = null;
        size = 0;
      }
    
    
    private class Node
      {
  
        private Node nextNode;
        private X item;
        
        
        public Node()
          {
            nextNode = null;
            item = null;
          }
        
        
        public Node(X item)
          {
            nextNode = null;
            this.item = item;
          }
        
        
        public void setNextNode(Node nextNode)
          {
            this.nextNode = nextNode;
          }
        
        
        public Node getNextNode()
          {
            return nextNode;
          }
        
        
        public void setItem(X item)
          {
            this.item = item;
          }
        
        
        public X getItem()
          {
            return item;
          }
      }
  
  
    public int size()
      {
        return size;
      }
  
  
    public void add(X item)
      {
        Node temp = null;
        temp = new Node(item);
  
        if (end.nextNode == null)
          {
            front = temp;
            end.setNextNode(front);
            size++;
            return;
          }
  
        temp.setNextNode(end);
        temp = end;
        size++;
      }
  
    
  }

