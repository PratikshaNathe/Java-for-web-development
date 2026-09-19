import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class lecture_40 {
    public static void main(String[] args) {
        //List<Integer> list = new ArrayList<>(List.of(11,34,1,13,4,14,11));
        

        //--------------------------Intermediate functions---------------------


        // list.stream()
        //     .filter(x -> x>10)
        //     .map(x -> x*2)
        //     .peek(System.out::println)    //shows how our list looks before sort          perticular set of operations nantr aapli stream kashi diste te aaplyala kalte
        //     .sorted()   //it ia statefull mathod  i.e joparyanta sarva elements yat yrt nahi to paryanta to pudhe janar nahi
        //     //.sorted((a,b) -> b-a)  // sort in descending order
        //     .distinct()    //stores unique values , it is also statefull
        //     .forEach(System.out::println);


        // List<List<Integer>> list2 = List.of(
        //     List.of(1,2),
        //     List.of(3,4)
        // );

        // list2.stream()
        //     .flatMap(x -> x.stream())   // flatening operation
        //     .map(x -> x*2)
        //     .forEach(System.out::println);


        // Stream.iterate(1, x -> x+1)
        //       .limit(20)
        //       .skip(5)     //skips first 5 elements
        //       .forEach(System.out::println); 






        //--------------------------Terminal Operations--------------------
              
        // list.stream()
        //     .map(x -> x+1)
        //     //.forEach(System.out::println);
        //     .forEachOrdered(System.out::println);
        //     

        // List<Integer> list2 = list.stream()
        //     .map(x -> x+1)
        //     //.toList();   //convert stream into list   , not mutable
        //     .collect(Collectors.toList());  //mutable

        // // list2.add(7);  //only when collect method is used
        // System.out.println(list2);




        // Set<Integer> set = list.stream()
        //     .map(x -> x+1)
        //     .collect(Collectors.toSet());  //mutable

        // // list2.add(7);  //only when collect method is used
        // System.out.println(set);


    //     Optional<Integer> sum = list.stream()
    //         .reduce((a,b) -> a+b);    // combines stream elements into single value

    //     System.out.println(sum.get());
    // }

    // int sum = list.stream()
    //         // .reduce(0,(a,b) -> a+b);    // combines stream elements into single value
    //         .reduce(1,(a,b) -> a*b);  

    //     System.out.println(sum);
    

    // long num=list.stream()
    //     .filter(x -> x>10)
    //     .count();   //returns no of elements in the stream
        
    // System.out.println(num);


    // Optional<Integer> num=list.stream()
    //     .filter(x -> x>10)
    //     //.findFirst();
    //     .findAny();   //useful in parallel streams
        
    // System.out.println(num.get());



    // boolean num = list.stream()
    //     .filter(x -> x>10)
    //     // .anyMatch(x -> x % 2 == 0);
    //     // .allMatch(x -> x % 2 == 0);
    //     .noneMatch(x -> x % 2 == 0);
    // System.out.println(num);


    // int sum = list.stream()
    //     .filter(x -> x>10)
    //     .mapToInt(x -> x)
    //     .sum();
    // System.out.println(sum);


    // OptionalInt max = list.stream()
    //     .filter(x -> x>10)
    //     .mapToInt(x -> x)
    //     .max();
    // System.out.println(max.getAsInt());


    // OptionalDouble avg = list.stream()
    //     .filter(x -> x>10)
    //     .mapToInt(x -> x)
    //     .average();
    // System.out.println(avg.getAsDouble());




    //-----------------------------collectors---------------


        // List<String> list = new ArrayList<>(List.of("AA","BBB","CCCC"));

        // Map<Integer, String> mp = list.stream()
        //                             .collect(Collectors.toMap(
        //                                 x -> x.length(),
        //                                 x -> x
        //                             ));

        // System.out.println(mp); 
        
        


        // List<String> list = new ArrayList<>(List.of("AA","BBB","CCCC","EE","PPP"));
        // Map<Integer, List<String>> mp = list.stream()
        //                             .collect(Collectors.groupingBy(x -> x.length()));

        // System.out.println(mp);


        // List<String> list = new ArrayList<>(List.of("AA","BBB","CCCC","EE","PPP"));
        // Map<Integer, List<String>> mp = list.stream()
        //                                     .collect(Collectors.groupingBy(x -> x.length(),
        //                                     Collectors.mapping(x -> x.toLowerCase(), Collectors.toList())));

        // System.out.println(mp);



        List<String> list = new ArrayList<>(List.of("AA","BBB","CCCC","EE","PPP"));

        String result = list.stream()
            .collect(Collectors.joining("-"));

        System.out.println(result);

        // List<Integer> list = new ArrayList<>(List.of(3,6,4,7,87,54,34,33));
        // Map<Boolean, List<Integer>> mp = list.stream()
        //                             .collect(Collectors.partitioningBy(x -> x % 2 == 0));

        // System.out.println(mp);




        }

}
