

public class Service {

    public static void main(String[] args) {
	// write your code here
        PenFactory pen = new GelPenFactory();
        pen.createProduct();
        pen = new SketchPenFactory();
        pen.createProduct();

    }
}
