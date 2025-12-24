package Topics.ThreadsExample;

/*

Problem statement:
    Create two threads:

    Thread-1 prints odd numbers

    Thread-2 prints even numbers.
    Numbers must be printed in correct order (1,2,3,4,5,...).
 */

//Solution:
class Printer{
    private boolean isOdd = true;

    /*

    The below method printOdd is used to print all the odd numbers

    initially the value is one
     */
    public synchronized void printOdd(int number) throws InterruptedException {
        while(!isOdd){
            wait();
        }
        System.out.print(number+ " ");
        isOdd = false;
        notify();
    }

    public synchronized void printEven(int number) throws InterruptedException {
        while(isOdd){
            wait();
        }
        System.out.print(number+ " ");
        isOdd = true;
        notify();
    }

}
public class PrintOddAndEven {
    public static void main(String[] args){
        Printer printer = new Printer();

        Thread oddThread = new Thread(()->{
           for (int i=1;i<=20;i+=2){
               try{
                   printer.printOdd(i);
               } catch (Exception e) {
               }
           }
        });

        Thread evenThread = new Thread(() -> {
            for (int i = 2; i <= 20; i += 2) {
                try {
                    printer.printEven(i);
                } catch (Exception e) {}
            }
        });

        oddThread.start();
        evenThread.start();
    }
}
