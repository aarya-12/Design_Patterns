public abstract class foodApp{
    void initialize(){
        System.out.println("Welcome to our app!");
        System.out.println("What would you like to order?");
    }
    abstract void order(String order);
    abstract void payment(int total);
    void orderOnline(String order, int total){
        initialize();
        order(order);
        payment(total);
    }
}