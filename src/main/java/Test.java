import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        var a = Test.<Integer>array(10);
        a[0] = 1;
    }

    static <T> T[] array(int size, T... vals) {
        return Arrays.copyOf(vals, size);
    }
}
