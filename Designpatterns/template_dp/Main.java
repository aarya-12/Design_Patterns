public class Main{
    public static void main(String[] args){
        foodApp zomato = new Zomato();
        zomato.orderOnline("Pizza",350);
        foodApp swiggy = new Swiggy();
        swiggy.orderOnline("Pasta",300);
    }
}