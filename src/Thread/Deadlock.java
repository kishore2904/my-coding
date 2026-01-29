package Thread;


class Account {
    int balance;

    Account(int balance) {
        this.balance = balance;
    }
}

public class Deadlock {

    private static final Object acc1Lock = new Object();
    private static final Object acc2Lock = new Object();

    static Account acc1 = new Account(1000);
    static Account acc2 = new Account(2000);

    public static void transfer(Account from, Account to, int amount) {
        synchronized (from) {
            System.out.println(Thread.currentThread().getName() + " locked FROM account");

            try { Thread.sleep(100); } catch (InterruptedException e) {}

            synchronized (to) {
                System.out.println(Thread.currentThread().getName() + " locked TO account");
                from.balance -= amount;
                to.balance += amount;
            }
        }
    }

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> transfer(acc1, acc2, 100), "Thread-1");
        Thread t2 = new Thread(() -> transfer(acc2, acc1, 200), "Thread-2");

        t1.start();
        t2.start();
    }
}
