// public class lecture_48 {
//     public static void main(String[] args) {
//         // MyThread t1 = new MyThread();
//         // t1.start(); 


//         // MyRunnable r1 = new MyRunnable();
//         // Thread t1 = new Thread(r1);
//         // t1.start();
        
//     }
// }



//here we creating actual thread
// class MyThread extends Thread {    //thread class also implements Runnable interface
//     @Override 
//     public void run(){
//         System.out.println("thread is running");
//     }
// }

/*
t1.start(); --> JVM ask to create a new thread  -->  thread gets stack/PC space  -->  thread execute run method
*/



//here we creating task not directly thread
//always we preffer this
// class MyRunnable implements Runnable{
//     @Override 
//     public void run(){
//         System.out.println("thread is running");
//     }
// }







public class lecture_48 {
    public static void main(String[] args) {
        // System.out.println(Thread.currentThread().getName());    //givea the name of currenet thread   i.e main thread
        // System.out.println(Thread.currentThread().getId());  //givea id   ,  it is deprecated method

        // Thread t1 = new Thread(() -> {
        //     System.out.println(Thread.currentThread().getName());
        //     System.out.println(Thread.currentThread().getId());
        // });


        // Thread t2 = new Thread(() -> {
        //     System.out.println(Thread.currentThread().getName());
        //     System.out.println(Thread.currentThread().getId());
        // });
        
        // t1.start();   //it creates the new thread , if we not write this then the thread will not be created           //we can not create one thread twice
        // //t1.run();    // if we directlt write this without start() method then it does not create new thread ,  it runs on main thread

        // t2.start(); 








        //threading is non deterministic , means it doea not follow order while runing  , every time gives different output
        // Thread t1 = new Thread(() -> {
        //     for(int i=1;i<=100;i++){
        //         if(i%2==0){
        //             System.out.println("T1 : " +i);
        //         }
        //     }
        // });


        // Thread t2 = new Thread(() -> {
        //     for(int i=1;i<=100;i++){
        //         if(i%2!=0){
        //             System.out.println("T2 : " +i);
        //         }
        //     }
        // });

        // t1.start();
        // t2.start();







        Thread mainThread = Thread.currentThread();

        //-----------------------thread lifecycle-------------------
        Thread t1 = new Thread(()->{
            System.out.println("Name if current thread is : "+ Thread.currentThread().getName());
            System.out.println("main thread state  : "+ mainThread.getState());   // timed sleeping       , this state is given only after sleep method
        });

        //System.out.println(t1.getState());   //new state

        // t1.start();

        // System.out.println(t1.getState());  //runnable state   , terminated stere(rarely)
        

        t1.start();
        try {
    
            Thread.sleep(2000);

        } catch (Exception e) {
        }
        
        System.out.println(t1.getState());   //terminated state



    }
}