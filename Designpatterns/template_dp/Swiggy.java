public class Swiggy extends foodApp{
    void initialize(){
        super.initialize();
        System.out.println("Start ordering on Swiggy!");
    }
     void order(String order){
        System.out.println("Your cart contains : "+ order);
     }
    void payment(int total){
        System.out.println("Your total is : "+ total);
        System.out.println("Mode of payment");
        System.out.println("Your address details.");
       

    }
}