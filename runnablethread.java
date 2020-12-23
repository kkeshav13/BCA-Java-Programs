public class runnablethread{
    public static void main(String[] args){
        System.out.println("main thread is-" + Thread.currentThread().getName());

        Thread t1 = new Thread(new runnablethread().new RunnableImpl());
        t1.start();
    }
    private class RunnableImpl implements Runnable{
        public void run(){
            System.out.println(Thread.currentThread().getName()
            +
             ", executing run() method!"       );
        }
    }
}