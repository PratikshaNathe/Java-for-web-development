import java.util.ArrayList;
import java.util.List;

public class lecture_no_42 {
    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10,11));

        //sequential stream
        // list.stream()
        //     .map(x -> x*2)
        //     .forEach(System.out::println);


        //parallel stream
        list.parallelStream()
            .map(x -> x*2)
            //.forEach(System.out::println);   //does not print in order
            .forEachOrdered(System.out::println);   //print in order  , it removes parallalism
    }
    
}
