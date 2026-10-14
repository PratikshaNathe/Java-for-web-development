
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;


//     public static void main(String[] args) {
        
//         //it is a threaddpool with 2 workers
//         ExecutorService executor = Executors.newFixedThreadPool(2);   //--> here Executors is a utility class

//         //number of tasks = 5
//         for(int i=1;i<=5;i++){
//             int taskID=i;
//             executor.execute(()->{
//                 System.out.println("Task "+ taskID +" is performed by " +Thread.currentThread().getName());
//             });

//         }
        
//         executor.shutdown(); 

//         //first only 2 task will be oerform because only 2 threads are there and remaining 3 task will go in queue

//     }
    
// }




// public class lecture_56{
//     public static void main(String[] args) {
        
//         //----------------------future and callable -----------------

//         ExecutorService executor = Executors.newFixedThreadPool(2);

//         Future<Integer> f1 = executor.submit(()->10);
//         try {
//             System.out.println(f1.get());
//         } catch (Exception e) {
//         }

//     }
// }






// public class lecture_56{
//     public static void main(String[] args) {
        
//         ExecutorService executor =Executors.newFixedThreadPool(2);

//         // executor.execute(()->{    // gives error , if we write it in try catch then also it gives error
//         //     int x = 10/0;
//         // });

//         Future<Integer> f1 = executor.submit(()->{
//             return (10/0);
//         });

//         try {
//             System.out.println(f1.get());
//         } catch (Exception e) {
//         }
//     }
// }






//------------------------athreadPoolExecutor------------------------

public class lecture_56{
    public static void main(String[] args) {
        
        ThreadPoolExecutor executor = 
        new ThreadPoolExecutor(2, 
                                5, 
                                10,
                                TimeUnit.SECONDS, 
                                new ArrayBlockingQueue<>(5));

        for(int i=1;i<=5;i++){
            int taskID = i;

            executor.execute(()->{
                System.out.println("Task "+taskID+" is performed by "+Thread.currentThread().getName());


                try {
                    Thread.sleep(2000);
                } catch (Exception e) {
                }
            });
        }

        executor.shutdown();  //important to shutdown the thread
    }
}