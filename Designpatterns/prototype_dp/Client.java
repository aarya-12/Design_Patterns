public class Client {
    public static void main(String[] args) {
        Prototype P1=new Chess(64,2);
        Chess c1=(Chess)P1.getClone();
        Prototype P2=new TictacToe(9,5);
        TictacToe t1=(TictacToe)P2.getClone();
        System.out.println(c1);
        System.out.println(t1);


        

    }
    
}
