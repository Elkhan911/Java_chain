public class Main {
    public static void main(String[] args) {
        var x = 10;
        var y = 11;
        var z = 22;

        y = 100;

        final var key = 500;
        System.out.println(key);

        System.out.println(x);
        System.out.println(y + z);
    }
}