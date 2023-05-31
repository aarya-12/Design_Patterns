public class SketchPenFactory implements PenFactory {
    //public void createSketchPen(){
    Tube x;
    Refill r;

   @Override
   public Tube createTube() {
     Tube x =  new Fibre();
     x.getTube();
     return x;
    }

   @Override
  public Refill createRefill() {

      Refill r =  new Sponge();
      r.getRefill();
       return r;
   }

    @Override
    public PenFactory createProduct() {
        System.out.println("Sketch Pen:");
       this.r= this.createRefill();
       this.x = this.createTube();
        return this;
    }


}
