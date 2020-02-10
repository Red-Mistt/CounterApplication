package counterapplication;

public class FancyCounter extends Counter {
    
    public void decrement() {
        value = value - 2;
    }
    
    @Override
    public void reset() {
        value = 15;
    }
}
