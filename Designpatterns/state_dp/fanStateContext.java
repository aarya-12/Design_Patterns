public class fanStateContext{
    fanStates f;
    fanStateContext(){
        f = new fanStateOff();
    }
   
    public fanStates getState(){
        return f;
    }
    public void power(){
        System.out.println("Check current state and work accordingly.");
        f.power(this);
    }
}