package day8;
class PriorityThread extends Thread {
    public void run() {
        System.out.println("Running Thread: " + Thread.currentThread().getName() + 
                           " with Priority: " + Thread.currentThread().getPriority());
    }
}

public class ThreadPriorityDemo {
    public static void main(String[] args) {
        PriorityThread t1 = new PriorityThread();
        PriorityThread t2 = new PriorityThread();
        PriorityThread t3 = new PriorityThread();

        t1.setPriority(Thread.MAX_PRIORITY); // 10
        t2.setPriority(Thread.MIN_PRIORITY); // 1
        t3.setPriority(Thread.NORM_PRIORITY); // 5

        t1.setName("MAX");
        t2.setName("MIN");
        t3.setName("NORM");

        t1.start();
        t2.start();
        t3.start();
    }
}
