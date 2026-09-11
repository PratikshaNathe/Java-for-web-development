public class lecture_19 {
    public static void main(String[] args) {

        //static class
        // Outer outer = new  Outer();
        // Outer.Inner inner = new  Outer.Inner();
        // inner.fun(outer);


        //inner class
        // Outer outer= new Outer();
        // Outer.Inner inner =outer.new Inner();

        // inner.fun();


        //local class
        // Outer outer = new Outer();
        // outer.greet();


        //Anonymous Class
        Person p = new Person(){
            @Override 
            void introduce(){
                System.out.println("Hi,I am guest");
            }
        };
        p.introduce();


        
    }
}

//static class

// class Outer{
//     int x=10;
//     static int y=20;

//     static class Inner{
//         void fun(Outer outer){
//             System.out.println(outer.x);
//             System.out.println(y);
//         }
//     }
// }



//Inner class

// class Outer{

//     int x=10;
//     static int y=30;

//     class Inner{
//         void fun(){
//             System.out.println(x);
//             System.out.println(y);
//         }
//     }
// }




//local class
// class Outer{
//     void  greet(){
//         class Inner{
//             void sayHello(){
//                 System.out.println("hello");
//             }
//         }

//         Inner inner = new Inner();
//         inner.sayHello();
//     }
// }




//Anonymous class
class Person{
    void introduce(){
        System.out.println("Hi,I am a girl");
    }
}