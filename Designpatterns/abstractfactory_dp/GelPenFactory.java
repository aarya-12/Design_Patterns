public class GelPenFactory implements PenFactory{
    Tube x;
    Refill r;
    @Override
    public Tube createTube() {
        Tube x =  new Metal();
        x.getTube();
        return x;
    }

    @Override
    public Refill createRefill() {
        Refill r =  new Plastic();
        r.getRefill();
        return r;
    }

    @Override
    public PenFactory createProduct() {
        System.out.println("Gel Pen:");
        this.x = this.createTube();
        this.r = this.createRefill();
        return this;
    }
}
