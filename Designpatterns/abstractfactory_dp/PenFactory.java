
public interface PenFactory {
    Tube createTube();
    Refill createRefill();
    PenFactory createProduct();
}
