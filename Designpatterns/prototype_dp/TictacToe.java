public class TictacToe implements Prototype {
    int size,dimension;
    public TictacToe(int size,int dimension)
    {
        this.size=size;
        this.dimension=dimension;
    }
    public Prototype getClone()
    {
        return new TictacToe(size,dimension);
    }
    public String toString() {
        // TODO Auto-generated method stub
        return "Created Tictactoe of:"+size+" "+dimension;
    }
}
