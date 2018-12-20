public class Main {

    public static void main(String[] args) {

        for(int i = 0; i < 5; i++) {
            Runnable myFibonacci = new Fibonacci(2,5,4);
            Thread myThread = new Thread(myFibonacci);
            myThread.start();
            //myFibonacci.run();
            // 2 5 7 12
            System.out.println();
        }


    }
}
