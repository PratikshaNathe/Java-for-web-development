public class lecture_38 {
    public static void main(String[] args) {
        
        print(5,4,(a,b) -> (a+b));   //lambda function 
        
    }

    public static void print(int a,int b,Calculator c){
        System.out.println(c.calculate(a,b));
    }
}


@FunctionalInterface
interface Calculator{
    int calculate(int a,int b);
}
