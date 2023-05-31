public class Leaf implements Assembly{
    String nm;double price;
    Leaf(String name,double price){
        this.nm=name;
        this.price=price;
    }

    @Override
    public void showAssemblyDetails() {
        System.out.println("Name: "+this.nm+" Price: "+this.price);


    }

    @Override
    public void addAssembly(Assembly a) {
    //do nothing
    }

    @Override
    public void removeAssembly(Assembly b) {
// do nothing
    }
    public double addPrice( ){
        return price;
    }
}
