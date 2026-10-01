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

        Thread t1 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getId());
        });


        Thread t2 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getId());
        });
        
        t1.start();   //it creates the new thread , if we not write this then the thread will not be created
        //t1.run();    // if we directlt write this without start() method then it does not create new thread ,  it runs on main thread

        t2.start(); 
    }
}