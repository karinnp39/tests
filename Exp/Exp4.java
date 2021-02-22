public class Exp4 {
    private static void fizzBuzz(int num) {
        System.out.println(
                num % 3 == 0 ? num % 5 == 0 ? "FizzBuzz" : "Fizz" : num % 5 == 0 ? "Buzz" : String.format("%d", num));
    }

    public static void main(String[] args) {
        fizzBuzz(25);
    }
}
