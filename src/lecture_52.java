
//-----------------------producer consumer problem-------------------------
public class lecture_52 {
    public static void main(String[] args) {
        
        Box box = new Box();

        Thread t1 = new Thread(()->{
            for (int i = 1; i <= 20; i++) {
                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                }

                box.producer(i);
                
            }
        });

        Thread t2 = new Thread(()->{
            for (int i = 1; i <= 20; i++) {
                try {
                    Thread.sleep(70);
                } catch (Exception e) {
                }
                box.cunsumer();
            }
        });

        t1.start();

        t2.start();

    }
}

class Box{
    volatile Integer item;
    volatile Boolean flag=false;

    synchronized void producer(int value){

        while(flag==true){
            //do nothing
        }
        item = value;
        flag=true;
        System.out.println("profucer produces "+item);
    }

    synchronized void cunsumer(){

        while(flag==false){
            //do nothing
        }
        System.out.println("consumer consume "+item);
        item = null;
        flag=false;
    }
}
