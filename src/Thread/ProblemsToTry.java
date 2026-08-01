package Thread;

class NumberPrinter{

    int number =1;
    int limit =10;
    boolean isOddTrue = true;
    public synchronized void printOdd() throws InterruptedException {
        while(number<=limit){
            if(!isOddTrue){
                wait();
            }
            if(number<=limit){
                System.out.println("Odd Thread : " +number);
                number++;
                isOddTrue = false;
                notify();
            }

        }
    }
}
public class ProblemsToTry {
    /* Print odd and even numbers using two thread */
}
