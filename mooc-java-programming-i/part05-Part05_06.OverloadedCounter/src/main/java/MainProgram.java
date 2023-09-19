
public class MainProgram {

    public static void main(String[] args) {
        Counter counter = new Counter(0);
        counter.increase();
        counter.decrease();
        counter.increase(2);
        counter.decrease(1);
        System.out.println(counter.value());

    }
}
