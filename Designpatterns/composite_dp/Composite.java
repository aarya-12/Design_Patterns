import java.util.*;

public class Composite implements Assembly{
    List<Assembly> subordinates = new ArrayList<Assembly>();
   protected double total =0;
    @Override
    public void showAssemblyDetails() {
        for(Assembly a:subordinates){
            a.showAssemblyDetails();
        }

    }

    @Override
    public void addAssembly(Assembly a) {
        subordinates.add(a);


    }

    @Override
    public void removeAssembly(Assembly b) {
        subordinates.remove(b);

    }
    public double addPrice(){

        if(subordinates==null){
         total = this.addPrice();
        }
        else{
            for(Assembly a:subordinates){
                total += a.addPrice();;
            }
        }
        return total;
    }

}
