import java.util.concurrent.atomic.AtomicInteger;

public class lecture_55 {
    public static void main(String[] args) {
        

        countLikes countlike = new countLikes();

        Thread t1 = new Thread(()->countlike.like());
        Thread t2 = new Thread(()->countlike.like());
        Thread t3 = new Thread(()->countlike.like());
        Thread t4 = new Thread(()->countlike.like());
        Thread t5 = new Thread(()->countlike.like());
        Thread t6 = new Thread(()->countlike.like());
        Thread t7 = new Thread(()->countlike.like());
        Thread t8 = new Thread(()->countlike.like());
        Thread t9 = new Thread(()->countlike.like());
        Thread t10 = new Thread(()->countlike.like());


        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();


        try {
            Thread.sleep(3000);
        } catch (Exception e) {
        }


        System.out.println("total likes : "+ countlike.getTotalLikes());
    }
}



//----using atomicreference-----


// class countLikes{

//     AtomicReference<Integer> totalCount = new AtomicReference<>(0);

//     public void like(){

//         Integer currentCount ;
//         Integer finalCount ; 

//         //Re-try logic
//         while (true) { 
            
//             //1.we will capture thr latest value of totalcount

//             currentCount = totalCount.get();

//             //2.increment like counter by 1

//             finalCount = currentCount + 1;

//             //3.check again , if the count is still what i saw

//             if(totalCount.compareAndSet(currentCount, finalCount)){
//                 return;
//             }

//             //4.if a thread reaches here, someone else must have updated the counter value
//             //re-try
//             System.out.println("conflict detected. Re-trying...");
//         }
//     }

//     public int getTotalLikes(){
//         return totalCount.get();
//     }
// }




//-------------using atomicinteger---------

class countLikes{

    AtomicInteger totalCount = new AtomicInteger(0);

    public void like(){

        totalCount.incrementAndGet();

        
    }

    public int getTotalLikes(){
        return totalCount.get();
    }
}
