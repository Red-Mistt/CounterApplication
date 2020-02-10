package counterapplication;

// Counter class

public class Counter {
    protected int value;
    
    public Counter() {
        value = 0;
    }
    
    public void increment() {
        value = value + 1;
    }
    
    public void reset() {
        value = 0;
    }
    
    public int value() {
        return value;
    }
    
    @Override
    public String toString() {
        return Integer.toString(this.value);
    }
}
