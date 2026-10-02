//----------------------------race condition------------------------

// public class lecture_50 {
//     public static void main(String[] args) throws InterruptedException {
        
//         Counter c1 = new Counter();

//         Thread t1 = new Thread(()->{
//             for(int i=1;i<=10000;i++){
//                 c1.increment();
//             }
//         });

//         Thread t2 = new Thread(()->{
//             for(int i=1;i<=10000;i++){
//                 c1.increment();
//             }
//         });

//         t1.start();

//         t2.start();

//         t1.join();

//         t2.join();

//         System.out.println(c1.count);


//     }
// }

// class Counter{
//     public int count;
//     void increment(){
//         count++;
//     }
// }


// //every time it gives different output , because of race condition






//-----------------------visibility problem---------------------------

public class lecture_50{
    static volatile boolean flag = false;    

    public static void main(String[] args) {
        Thread t1 = new Thread(()->{
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                
            }
            flag=true;
        });

        Thread t2 = new Thread(()->{   //this thread ignores the flafe value changed by t1
            while (!flag) { 
                System.out.println("thread 2 running...");
            }
            System.out.println("thread 2 finished...");
        });

        t1.start();

        t2.start();
        

    }
}