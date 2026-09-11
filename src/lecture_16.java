public class lecture_16 {
    public static void main(String[] args) {
        Student s1 = new Student("pratu",21,179);
        // Student.college="AVCOE";

        System.out.println(s1.name+","+s1.age+","+s1.rollNo+","+Student.college);
    }

}

class Student{
    String name;
    int age;
    int rollNo;
    static String college;   //we can directly assign the valus here also

    Student(String name,int age,int rollNo){
        this.name=name;
        this.age=age;
        this.rollNo=rollNo;
    }


    //static block
    //instead of Student.college="AVCOE"; in main class we use static block

    static {
        college="AVCOE";
    }
    //when we run the code the static block is executed first 

}
