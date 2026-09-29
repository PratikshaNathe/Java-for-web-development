//import java.io.FileReader;
//import java.io.FileNotFoundException;

public class lecture_44 {
    //public static void main(String[] args) {
        

        //inner try handle its own exception
        // try{
        //     System.out.println("outer try starts");
        //     try {
        //         System.out.println("inner try starts");
        //         System.out.println(5/0);
        //         System.out.println("inner try ends");

        //     } catch (ArithmeticException e) {
        //         System.out.println("divide by zero is not allowed : inner");
        //     }

        //     System.out.println("outer try ends");
        // }
        // catch(ArithmeticException e){

        //     System.out.println("divide by zero is not alloud : outer");

        // }





        //outer catch handle inner exception
        // try{
        //     System.out.println("outer try starts");
        //     try {
        //         System.out.println("inner try starts");
        //         System.out.println(5/0);
        //         System.out.println("inner try ends");

        //     } catch (NullPointerException e) {
        //         System.out.println("nulls are not allowed");
        //     }

        //     System.out.println("outer try ends");
        // }
        // catch(ArithmeticException e){

        //     System.out.println("divide by zero is not alloud : outer");

        // }





        //hierarchy of exception handling
        //multiple exception handling
        // try {
        //     System.out.println(5/0);
        // } catch (RuntimeException e) { //instead of runtimeexception we can use exception and throwable   , but throwable is not recommended
        //     System.out.println("catched by runtime exception");
        // }


        // try {               //at a time only one catch block will execute
        //     System.out.println(5/0);
        //     String s =null;
        //     s.length();
        // } 
        // // catch (ArithmeticException e) { 
        // //     System.out.println("divide by 0 not allowed");
        // // }
        // // catch(NullPointerException e){
        // //     System.out.println("null are not allowed"); 
        // // }
        // catch(ArithmeticException | NullPointerException e){  //handles both exception , only siblings not parent child   , we can write this instead of above both 
        //     System.out.println(e.getMessage());
        // }
        // catch(Exception e){
        //     System.out.println("some generic exception");    //this catch handles all exceptions
        // }
        //first we write child catch then weite parent 



        //-------------------throw--------------------


        //checkEligibility(21);
        // try {
        //     checkEligibility(21);
        // } catch (IllegalArgumentException e) {
        //     System.out.println(e.getMessage());
        // }



    //}


    // private static void checkEligibility(int age){
    //     if(age <= 0){
    //         throw new IllegalArgumentException("age can not be negatove or zero");
    //     }

    //     if(age>18){
    //         System.out.println("you are eligible to vote");
    //     }
    // }


    
    //----------throws------------
    // public static void main(String[] args) throws FileNotFoundException {
    //     readFile();         //file not found exception

    // }

    // private static void readFile() throws FileNotFoundException {
    //     FileReader fr = new FileReader("abc.txt");
    // }






    //-------------custom exception--------------

    public static void main(String [] args){
        try{
            checkEligibility(-5);
        }
        catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }

    }

    private static void checkEligibility(int age) throws InvalidAgeException{
        if(age<=0){
            throw new InvalidAgeException("age cannot be negative");
        }

        if(age>18){
            System.out.println("you are eligible to vote");
        }
    }

}
class InvalidAgeException extends Exception{

        public InvalidAgeException(String message){
            super(message);
        }
}