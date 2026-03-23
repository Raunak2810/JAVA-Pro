public class Student{
    public int roll ;
    public String name;
    public static String college;

    public static void read(){
        System.out.println("reading");
    }
    public void printstd(){
        System.out.println("roll : "+roll);
        System.out.println("name : "+name);
        System.out.println("college : "+college);
    }
    public Student(int roll, String name){
        this.roll = roll;
        this.name = name;
        college="arya";
    }
        public Student(Student s){
        this.roll = s.roll;
        this.name = s.name;
    }
}
class Test{
    public static void main(String[] args) {
        Student s1 = new Student(657, "Raunak");
        s1.printstd();
        Student s2 = new Student(658, "Rahul");
        s2.printstd();
        s1.name = "Rohit";
        s1.roll = 659;
        Student s3 = new Student(s1);
        s3.printstd(); 
        Student s4=s3;
        s4.printstd(); 
    }
}