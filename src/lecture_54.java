
import java.util.concurrent.atomic.AtomicReference;


// import java.util.concurrent.atomic.AtomicInteger;

// class lecture_54{
//     public static void main(String[] args) {
//         Counter counter = new Counter();

//         Thread t1 = new Thread(()->{
//             for(int i=1;i<=10000;i++){
//                 counter.increment();
//             }
//         });

//         Thread t2 = new Thread(()->{
//             for(int i=1;i<=10000;i++){
//                 counter.increment();
//             }
//         });

//         t1.start();
//         t2.start();

//         try {
//             Thread.sleep(2000);
//         } catch (Exception e) {
//         }

//         System.out.println(counter.count);


//     }
// }





// //---------------------------------------Atomic Variables----------------------------

// //----------AtomicInteger------it recuces race condition , it handles the concurrent and parallel execution of threads
// class Counter{
//     //int count=0;
//     AtomicInteger count = new AtomicInteger(0);

//     void increment(){
//         //count++;

//         count.incrementAndGet();  //atomic opration   -- either the operatin will get completely perform or nothing  and then context switching happens
//     }
// }







//----------------------------AtomicLong----------------------------------

//its range is more than AtomicInteger
//race condition never occurs



//---------------------------AtomicBoolean----------------------------

//no need to use volatile keyword




//why do not use synchronised keyword?
// --> it uses locking mechanism that makes the code slower



//-----------------------------Atomic References-----------------------


//only one person will get the seat , another can not overrite first person who booked the seat
class lecture_54{
    public static void main(String[] args) {
        
        SeatBooking sb = new SeatBooking();

        Thread t1 =new Thread(()->{
            boolean value = sb.bookSeat("pratiksha");
            System.out.println("t1 says "+ value);
        });

        
        
        Thread t2 =new Thread(()->{
            boolean value = sb.bookSeat("naina");
            System.out.println("t2 says "+ value);
        });

        t1.start();
        t2.start();

        try {
            Thread.sleep(2000);
        } catch (Exception e) {
        }
        
        System.out.println(sb.seat);
    }
}

class SeatBooking{
    AtomicReference<String> seat= new AtomicReference<>("EMPTY");

    boolean bookSeat(String name){
        String currentValue = seat.get();  

        if(currentValue.equals("EMPTY") == false){
            return false;
        }

        return seat.compareAndSet("EMPTY", name);    //if currentValue is EMPTY then put name otherwise not          it overcome the overwriting
    }
}