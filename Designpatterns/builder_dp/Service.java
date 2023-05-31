public class Service{
    public static void main(String args[]){
        Phone p;
        PhoneBuilder x = new PhoneBuilder();
        p = x.setOS("Windows").setRAM("8gb").setScreenSize("13in").setOS("iOS").build();
        System.out.println(p);
    }
}