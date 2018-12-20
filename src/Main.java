public class Main {

    public static void main(String[] args) {

        for(int i = 0; i < 5; i++) {
            Fibonacci myFibonacci = new Fibonacci(2,5,4);
            myFibonacci.run();
            // 2 5 7 12
            System.out.println();
        }


    }
}
