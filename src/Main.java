import java.lang.constant.Constable;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        System.out.println(sqrt().apply(40.9));
    }
    public static UnaryOperator<Double> sqrt() {
        UnaryOperator<Double> unaryOperator = x -> Math.sqrt(x);
        return unaryOperator;
    }
}
