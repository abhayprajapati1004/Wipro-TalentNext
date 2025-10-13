import java.util.ArrayList;
import java.util.List;

public class Student {
    private int rollNo;
    private String name;
    private int mark;

    public Student(int rollNo, String name, int mark) {
        this.rollNo = rollNo;
        this.name = name;
        this.mark = mark;
    }

    public int getMark() {
        return mark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", mark=" + mark +
                '}';
    }
    
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Student1", 60));
        students.add(new Student(2, "Student2", 40));
        students.add(new Student(3, "Student3", 55));
        students.add(new Student(4, "Student4", 30));
        students.add(new Student(5, "Student5", 70));

        long count = students.stream()
                .filter(student -> student.getMark() >= 50)
                .count();

        System.out.println("Number of students who cleared the test: " + count);
    }
}