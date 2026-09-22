public class lecture_43 {
    public static void main(String[] args) {

        // System.out.println("step 1");
        
        // try {
        //     int a=8;
        //     int b=0;
        //     System.out.println(a/b);
        // }
        // catch (ArithmeticException e) {
        //     System.out.println("division by 0 not allowed.");
        // }

        // System.out.println("step 2");


        methodA(5, 0);
    }



    //exception handling in chain of methods

    // public static void methodA(int a, int b ){
    //     try{
    //         methodB(a,b);
    //     }
    //     catch(ArithmeticException e){
    //         System.out.println("can not divide by 0");
    //     }
    // }
    // public static void methodB(int a, int b){
    //     System.out.println(a/b);
    // }


    //or

    public static void methodA(int a, int b ){
        methodB(a,b);
    }
    public static void methodB(int a, int b){
        try{
            System.out.println(a/b);
        }
        catch(ArithmeticException e){
            //System.out.println("can not divide by 0");
            System.out.println(e.getMessage());
        }
        finally{
            // this block always runs
            
        }
    }
}
 