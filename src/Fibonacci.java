
public class Fibonacci implements Runnable{
       int FN;
       int SN;
       int TN;

    Fibonacci(int NumberOne, int NumberTwo, int NumberThree) {
        FN = NumberOne;
        SN = NumberTwo;
        TN = NumberThree;
    }

        public void run() {
            System.out.println(FN);
            System.out.println(SN);
            for (int i = TN - 2; i > 0; i--) {
                System.out.println(FN + SN);
                FN = FN + SN;
            }
            System.out.println(FN);
            System.out.println(TN);
            for (int i = SN - 2; i > 0; i--) {
                System.out.println(FN + TN);
                FN = FN + TN;
            }


        }

    }
