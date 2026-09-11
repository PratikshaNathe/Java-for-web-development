
import java.util.*;


//own iterator method
// public class lecture_30 {
//     public static void main(String[] args) {
//         String [] names = {"pratu","naina","shraddha","tanu"};
//         NameContainer container = new NameContainer(names);
//         Iterator<String> it = container.iterator();

//         while(it.hasNext()){
//             System.out.println(it.next());
//         }
        
//     }
    
// }

// class NameContainer implements Iterable<String>{
//     private String [] names;
//     private int size;

//     NameContainer(String [] names) {
//         this.names=names;
//         this.size=this.names.length;
//     }

//     @Override
//     public Iterator<String> iterator(){

//         return new NameContainerIterator();
//     }

//     private class NameContainerIterator implements Iterator<String>{

//         private int pos = 0;

//         @Override
//         public boolean hasNext(){
//             return pos < size;

//         }

//         @Override
//         public String next(){
//             return names[pos++];

//         }
//     }
    
// }




//same code with anonymous class

public class lecture_30 {
    public static void main(String[] args) {
        String [] names = {"pratu","naina","shraddha","tanu"};
        NameContainer container = new NameContainer(names);
        

        //instead of this
        // Iterator<String> it = container.iterator();

        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }


        //we can use for each loop

        for(String name : container){
            System.out.println(name);
        }
    }
    
}

class NameContainer implements Iterable<String>{
    private String [] names;
    private int size;

    NameContainer(String [] names) {
        this.names=names;
        this.size=this.names.length;
    }

    @Override
    public Iterator<String> iterator(){

        return new Iterator<String>() {
            private int pos = 0;

        @Override
        public boolean hasNext(){
            return pos < size;

        }

        @Override
        public String next(){
            return names[pos++];

        }
            
        };
    }

    
    
}