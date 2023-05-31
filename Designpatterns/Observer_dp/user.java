abstract class user{
    protected admin ad;
    user(admin ad){
        this.ad = ad;
    }
  abstract void update(String msg);
}