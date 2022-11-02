import java.util.Comparator;

public class Student implements Comparable<Student> {
    private String name;
    private int age;
    private String address;

    public Student(){}
    public Student(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", age: " + age + ", address: " + address + "\n";
    }

    @Override
    public int compareTo(Student student) {
        int n = this.getName().compareTo(student.getName()) >= 0 ? 1 : -1;
//        if (this.getName().compareTo(student.getName()) >= 0){
//            return 1;
//        } else {
//            return -1;
//        }
        return n;
    }

//    @Override
//    public int compare(Student o1, Student o2) {
//        int n = (o1.getAge() >= o2.getAge()) ? 1 : -1;
//        return n;
//    }
}
