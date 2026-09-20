
import java.util.Optional;

public class lecture_41 {
    public static void main(String[] args) {
        Optional<String> name = getName();

        //name.ifPresent(System.out::println);

        //System.out.println(name.orElse("unknown"));
        //System.out.println(name.orElseGet(() -> "unknown"));
        //System.out.println(name.orElseThrow());
        name.ifPresentOrElse(System.out::println, () -> System.out.println("unknown"));
        
    }

    public static Optional<String> getName(){
        //return Optional.of("pratu");
        //return Optional.of(null);
        return Optional.ofNullable(null);

    }

     
}
