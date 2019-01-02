
public class Fibonacci implements Runnable {
    int FN;
    int SN;
    int TN;
    boolean recursiveMode;


    Fibonacci(int NumberOne, int NumberTwo, int NumberThree, boolean mode) {
        FN = NumberOne;
        SN = NumberTwo;
        TN = NumberThree;
        recursiveMode = mode;
    }


    public void InterativeMode() {
        System.out.println(FN);
        System.out.println(SN);
        for (int i = TN - 2; i > 0; i--) {
            System.out.println(FN + SN);
            FN = FN + SN;
            TN = TN - 1;
        }
    }

    public void RecursiveMode(int first, int second, int count) {
        if (count > 0) {
            System.out.println(first);
            RecursiveMode(second, first + second, count -1);
        }
    }

    public void run() {
        if(recursiveMode){
            RecursiveMode(FN,SN,TN);
        } else {
            InterativeMode();
        }
    }




}


