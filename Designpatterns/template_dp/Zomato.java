public class Zomato extends foodApp{
    void initialize(){
        super.initialize();
        System.out.println("Start ordering on Zomato!");
    }
     void order(String order){
        System.out.println("Your cart contains : "+ order);
     }
    void payment(int total){
        System.out.println("Your total is : "+ total);
        System.out.println("Your address details.");
        System.out.println("Mode of payment");

    }
}