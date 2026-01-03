package Thread;

class Worker extends Thread{
    public void run(){
        for (int i=0;i<=3;i++){
            System.out.println("Worker: "+i);
        }
    }
}
class Employee extends Thread{
    public void run(){
        for (int i=0;i<=3;i++){
            System.out.println("Employee: "+i);
        }
    }
}

public class MyThread {
    public static void main(String[] args){
        Worker worker = new Worker();
        worker.start();
        worker.setPriority(Thread.MIN_PRIORITY);

        Employee employee = new Employee();
        employee.start();
        employee.setPriority(Thread.MAX_PRIORITY);
    }
}
