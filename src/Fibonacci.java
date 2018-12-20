
public class Fibonacci {
       int FN;
       int SN;
       int TN;

    Fibonacci(int NumberOne, int NumberTwo, int NumberThree) {
        FN = NumberOne;
        SN = NumberTwo;
        TN = NumberThree;
    }

        void run() {
            System.out.println(FN);
            System.out.println(SN);
            for (int i = TN - 2; i > 0; i--) {
                System.out.println(FN + SN);
                FN = FN + SN;
            }



        }

    }
