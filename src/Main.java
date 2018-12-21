public class Main {

    public static void main(String[] args) {

        for(int i = 0; i < 1; i++) {
            Runnable myFibonacci = new Fibonacci(2,5,4, true);
            Runnable myFibonacci2 = new Fibonacci(1,2,4, true);
            Thread myThread = new Thread(myFibonacci);
            Thread myThread2 = new Thread(myFibonacci2);
            myThread.start();
            myThread2.start();
            //myFibonacci.run();
            // 2 5 7 12
            System.out.println();
        }


    }
}
