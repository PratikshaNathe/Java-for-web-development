import java.util.concurrent.locks.StampedLock;

//----------------------reentrantlook------------------------

// import java.util.concurrent.locks.Lock;
// import java.util.concurrent.locks.ReentrantLock;

// public class lecture_53 {
//     public static void main(String[] args) {

//         Resources r1 =new Resources();
//         Thread t1 = new Thread(()->r1.f1());
//         Thread t2 = new Thread(()->r1.f1());
//         Thread t3 = new Thread(()->r1.f1());
//         t1.start();
//         t2.start();
//         t3.start();

//     }
// }

// class  Resources{

//     Lock lock = new ReentrantLock();

//     void f1(){
//         lock.lock();
//         try {
//             System.out.println(Thread.currentThread().getName()+" entered");

//             try {
                
//             } catch (Exception e) {

//             }
//             System.out.println(Thread.currentThread().getName()+" exit");
//         } 
//         finally{
//             lock.unlock();
//         }
//     }
// }







//---------------------------------------ReadWriteLock------------------------


// public class lecture_53 {
//     public static void main(String[] args) {
//         SharedResource sr = new SharedResource();

//         Thread r1 = new Thread(()->sr.read());
//         Thread r2 = new Thread(()->sr.read());
//         Thread r3 = new Thread(()->sr.read());


//         Thread w1 = new Thread(()->sr.write(5));
//         Thread w2 = new Thread(()->sr.write(6));
//         Thread w3 = new Thread(()->sr.write(9));

//         r1.start();
//         r2.start();
//         r3.start();

//         w1.start();
//         w2.start();
//         w3.start();

//     }
// }

// class SharedResource{
//     private int value = 0;

//     ReadWriteLock rwLock = new ReentrantReadWriteLock();

//     Lock rl = rwLock.readLock();  //shared
//     Lock wl = rwLock.writeLock();  //exclusive




//     public int read(){
//         rl.lock();
//         try {
//             try {
//                 Thread.sleep(1000);
//             } catch (Exception e) {
//             }
//             System.out.println(Thread.currentThread().getName()+" read value to "+ value);
//             return value;
//         } 
//         finally{
//             rl.unlock();
//         }
//     }

//     public void write(int newValue){
//         wl.lock();
//         try {
//             try {
//                 Thread.sleep(1000);
//             } catch (Exception e) {
//             }
//             value = newValue ;
//             System.out.println(Thread.currentThread().getName()+" changes value to "+ value);
//         } 
//         finally{
//             wl.unlock();
//         }
//     }

// }





//-----------------------------------stampedLock------------------------

public class lecture_53 {
    public static void main(String[] args) {
        SharedResource sr = new SharedResource();

        Thread r1 = new Thread(()->sr.read());
        Thread r2 = new Thread(()->sr.read());
        Thread r3 = new Thread(()->sr.read());


        Thread w1 = new Thread(()->sr.write(5));
        Thread w2 = new Thread(()->sr.write(6));
        Thread w3 = new Thread(()->sr.write(9));

        r1.start();
        r2.start();
        r3.start();

        w1.start();
        w2.start();
        w3.start();

    }
}

class SharedResource{
    private int value = 0;

    StampedLock lock = new StampedLock();

    public int read(){

        long stamp = lock.tryOptimisticRead();

        int currentValue = value;

        if(lock.validate(stamp) == false ){
            //fallover logic
            //try pessimistic read
            stamp = lock.readLock();
            try{
                currentValue = value;
            }
            finally{
                lock.unlockRead(stamp);
            } 
        }

        System.out.println(Thread.currentThread().getName()+" read value as "+ currentValue);
        return currentValue;
        
    }

    public void write(int newValue){
        long stamp = lock.writeLock();
        
        try {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
            value = newValue ;
            System.out.println(Thread.currentThread().getName()+" changes value to "+ value);
        } 
        finally{
            lock.unlockWrite(stamp);
        }
    }

}