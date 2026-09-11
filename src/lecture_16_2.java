//            -----------------by using import --------------

//import college.Student;
//import school.Student;

// public class lecture_16_2{
//     public static void main(String[] args) {
//         Student s1 = new Student();
//         s1.print();
        
//     }
// }




//------------------------without using import to use method from another packeges class method--------

public class lecture_16_2{
    public static void main(String[] args) {
        college.Student s1 = new college.Student();
        s1.print();
        school.Student s2 =new school.Student();
        s2.print();
        
    }
}