public class user1 extends user{
  
    user1(admin ad){
        super(ad);
        this.ad.attach(this);
    }
    void update(String msg){
        System.out.println(msg);
    }
}