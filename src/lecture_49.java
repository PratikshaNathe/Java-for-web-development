public class lecture_49 {
    public static void main(String[] args) throws InterruptedException {

        //------------sleep and join -------
        // System.out.println("main thread starts");

        // Thread t1 = new Thread(() -> {
        //     try {
        //         Thread.sleep(2000);
        //     } catch (InterruptedException e) {
        //     }

        //     System.out.println("Thread-0 starts");
        // });

        // t1.start();
        // //without join o/p is   main thread starts   main thread ends  thread 0 start


        // t1.join();   //let the t1 threadncomplete it execution and then execut below steps of t1   
        // //by using join o/p is  -->  main thread starts    thread 0 start   main thread ends 


        // System.out.println("main thread ends");
        
         

        //-------------------yeild-------------
        // Thread t1 = new Thread(() -> {
        //     for(int i=1;i<=10;i++){
        //         System.out.println("T1 : "+ i);
        //         Thread.yield();    // this method is not use in production
        //     }
        // });

        // Thread t2 = new Thread(() -> {
        //     for(int i =1;i<=10;i++){
        //         System.out.println("T2 : "+i);
        //     }
        // });

        // t1.start();

        // t2.start();





        //--------------------interrupt---------------
        // Thread t1 = new Thread(() -> {
        //     while (!Thread.currentThread().isInterrupted()) { // the the condition is false so while loop get stop
        //         System.out.println("Running"); 
                
        //     }
        // });

        // t1.start();
        // t1.interrupt();





        //--------------------------isAlive()-------------------------
        // Thread t1 = new Thread(()->{
        //     try {
        //         Thread.sleep(2000);
        //     } catch (Exception e) {
        //     }
        // });

        // System.out.println(t1.isAlive());//false
        // t1.start();
        // System.out.println(t1.isAlive()); //true





        //------------------------currentThread()--------------------
        // Thread t1 = new Thread(()->{
        //     System.out.println(Thread.currentThread().getName());
        // });
        // t1.setName("worker-1");

        // t1.start();





        //-----------------------thread priority------------------
        // Thread t1 = new Thread(()->{
        //     System.out.println("custom thread running");
        // });

        // t1.start();
        // t1.setPriority(10);   //we can set priority
        // System.out.println(t1.getPriority());




        //-------------------------------Daemon thread----------------
        Thread t1 = new Thread(()->{
            while (true) { 
                System.out.println("Running...");
            }
        });

        t1.setDaemon(true);
        t1.start();

        try {
            Thread.sleep(2000);
        } catch (Exception e) {
        }

        return; 
    }
}


