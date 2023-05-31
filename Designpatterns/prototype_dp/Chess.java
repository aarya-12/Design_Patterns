public class Chess implements Prototype {
   
    int size,dimension;
    //constructor
    public Chess(int size,int dimension)
    {
        this.size=size;
        this.dimension=dimension;
    }
    public Prototype getClone()
    {
        return new Chess(size,dimension);
    }
    
    public String toString() {
        // TODO Auto-generated method stub
        return "Created Chess of:"+size+" "+dimension;
    }
        
        

    }
    

