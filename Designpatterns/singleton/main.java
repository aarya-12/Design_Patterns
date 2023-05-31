public class main {
    public static void main(String args[]) {
        singleton s= singleton.getInstance();
        System.out.println(s);
        singleton.setInstance(21,"Pranjali");
        System.out.println(s);
    }
}