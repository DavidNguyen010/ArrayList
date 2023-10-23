import java.util.Arrays;
public class MyList {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }
    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }
    public void add(Exception e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }
}
