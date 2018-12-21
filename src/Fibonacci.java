
public class Fibonacci implements Runnable{
       int FN;
       int SN;
       int TN;
       boolean recursiveMode;


    Fibonacci(int NumberOne, int NumberTwo, int NumberThree, boolean mode) {
        FN = NumberOne;
        SN = NumberTwo;
        TN = NumberThree;
        mode = recursiveMode;
    }

    private void RecursiveMode(int i){
        if (i > 0){
           RecursiveMode(i - 1);
        }
    }
    public void InterativeMode(){
        System.out.println(FN);
        System.out.println(SN);
        for (int i = TN - 2; i > 0; i--) {
            System.out.println(FN + SN);
            FN = FN + SN;
        }
    }

        public void run() {
           if (recursiveMode = true){
               RecursiveMode();
           }

        }

    private void RecursiveMode() {
    }

}
