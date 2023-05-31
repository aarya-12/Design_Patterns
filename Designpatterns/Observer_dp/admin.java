import java.util.*;
public class admin{
    private List<user> u = new ArrayList<user>();
    private String msg;
    String getMsg(){
        return msg;
    }
    void setMsg(String msg){
        this.msg = msg;
        notifyAllUsers(msg);
    }
    void attach(user usr){
        u.add(usr);
    }
    void notifyAllUsers(String msg){
        for(user u1 : u){
            u1.update(msg);
        }
    }
}