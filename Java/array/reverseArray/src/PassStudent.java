import java.util.Scanner;

public class PassStudent {
    String studentName;
    int studentPoint;

    public PassStudent(String name, int point){
        studentName = name;
        studentPoint = point;
    }
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        PassStudent student1 = new PassStudent("Rooney", 10);
        PassStudent student2 = new PassStudent("Kaka", 10);
        PassStudent student3 = new PassStudent("Nesta", 8);
        PassStudent student4 = new PassStudent("Robinho", 3);
        int[] listStudentsPoint = new int[4];
        listStudentsPoint[0] = student1.studentPoint;
        listStudentsPoint[1] = student2.studentPoint;
        listStudentsPoint[2] = student3.studentPoint;
        listStudentsPoint[3] = student4.studentPoint;
        int count =0;
        for (int point : listStudentsPoint) {
            if (point >= 5){
                count++;
            }
        }
        System.out.printf("Số lượng số sinh viên thi đỗ là: %d", count);
    }
}
