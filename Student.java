public class Student {
    private String name;
    private double score;

    public Student(String Sname, double Sscore) {
        name = Sname;
        score = Sscore;
    }

    @Override
    public String toString() {
        return String.format("Student name: %s, score: %f", name, score);
    }

    public static void main(String[] args) {
        Student s1 = new Student("aa", 99.3);
        Student s2 = new Student("bb", 903.4);
        Student s3 = new Student("cc", 323.439);
        Array<Student> arrstu = new Array<>();
        arrstu.addLast(s1);
        arrstu.addLast(s2);
        arrstu.addLast(s3);
        System.out.println(arrstu);

    }

}
