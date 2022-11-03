import myinterfaces.Comparable;
import java.util.*;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Hello world!");

        BubbleSort bubbleSort = new BubbleSort();
//        System.out.println(bubbleSort.toString());
//        bubbleSort.sortByBubble();
//        System.out.println(bubbleSort.toString());

        BubbleSort bubbleSort1 = new BubbleSort();
        System.out.println(bubbleSort1.toString());

        bubbleSort.bubbleSortByStep(bubbleSort1.getArr());
        System.out.println(bubbleSort1.toString());


//        int[] arr = bubbleSort.getArr();
//        for (int item : arr) {
//            System.out.print(item + " ");
//        }
//
//        System.out.println();
//        bubbleSort.sortByBubble(arr);
//        for (int item : arr) {
//            System.out.print(item + " ");
//
//        }
//        System.out.println();


//        ProductManageLinkedList linkedList = new ProductManageLinkedList();
//        linkedList.showItem();
//
//        linkedList.addItem(new Product("bnrueib", 3258));
//        linkedList.addItem(new Product("owpgm", 378742));
//        linkedList.addItem(new Product("bnrueib", 378742));
//        linkedList.showItem();
//
//        linkedList.addItem(3, new Product("aprehrmob", -13258));
//        linkedList.showItem();
//
//        linkedList.removeItem(2);
//        linkedList.showItem();
//
//        System.out.println(linkedList.searchItem(6));
//
//        System.out.println(linkedList.searchItem("bnrueib"));


//        ProductManage productList = new ProductManage();
//
//        System.out.println(productList.toString());
//
//        productList.addE(new Product("jtyn", 925726));
//        productList.addE(new Product("nfkojt", 2626474));
//        System.out.println(productList.toString());
//
//        System.out.println(productList.search(6));
//        System.out.println(productList.search("bwrob"));
//
//        productList.removeId(4);
//        System.out.println(productList.toString());

//        Student student1 = new Student("Rebecca", 23, "UK");
//        Student student2 = new Student("Roronoa", 36, "Swiss");
//        Student student3 = new Student("Nami", 13, "Russia");
//        Student student4 = new Student("Brook", 99, "VN");
//
//        List<Student> studentList = new ArrayList<>();
//        studentList.add(student1);
//        studentList.add(student2);
//        studentList.add(student3);
//        studentList.add(student4);
//        Collections.sort(studentList);
//        System.out.println(studentList);
//
//        Collections.sort(studentList, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                int n = (o1.getAge() >= o2.getAge()) ? 1 : -1;
//                return n;
//            }
//        });
//        System.out.println(studentList);

//        Map<Integer, Student> studentMap = new HashMap<>();
//        studentMap.put(1, student1);
//        studentMap.put(2, student2);
//        studentMap.put(3, student3);
//        studentMap.put(4, student4);
//        for (Map.Entry<Integer, Student> student : studentMap.entrySet()){
//            System.out.println(student.toString());
//        }
//
//        Set<Student> students = new HashSet<>();
//        students.add(student1);
//        students.add(student2);
//        students.add(student3);
//        students.add(student4);
//        for (Student student : students) {
//            System.out.println(student.toString());
//        }

//        CountWordByMap.countWord("gnweioge");

//        System.out.println(ConvertDecimalToBinary.convertDecimalToBinary(11));
//        System.out.println(ConvertDecimalToBinary.convertDecimalToBinary(5));

//        String str1 = "hrerhm";
//        String str2 = ReverseArrayStringByStack.reverseString(str1);
//        System.out.println(str2);
//
//        int[] arr = ReverseArrayNumberByStack.makeRandomArr();
//        System.out.println(ReverseArrayNumberByStack.printArr(arr));
//        int[] arr1 = ReverseArrayNumberByStack.reverseArr(arr);
//        System.out.println(ReverseArrayNumberByStack.printArr(arr1));

//        MyLinkedListPractice<String> list = new MyLinkedListPractice<>();
//        list.addFirstNode("one");
//        list.addFirstNode("three");
//        list.addLastNode("four");
//        list.add("four", "two");
//        System.out.println(list.remove(3));
//        list.addLastNode("five");
////        System.out.println(list.remove("two"));
//        list.printList();





//        ArrayListPractice<Integer> listNumbers = new ArrayListPractice<>();
//
//        listNumbers.add(0,randomInt());
//        listNumbers.add(1,randomInt());
//        listNumbers.add(2,randomInt());
//        listNumbers.add(3,-2);
//        listNumbers.add(4,randomInt());
//
//        System.out.println(listNumbers.toString());
//
//        listNumbers.add(2,-1);
//
//        System.out.println(listNumbers.toString());
//
//        listNumbers.add(randomInt());
//        listNumbers.add(randomInt());
//
//        System.out.println(listNumbers.toString());
//
//        listNumbers.add(randomInt());
//        listNumbers.add(randomInt());
//
//        System.out.println(listNumbers.toString());
//
//        int a = (Integer) listNumbers.remove(1);
//        System.out.println(a);
//
//        System.out.println(listNumbers.toString());
//
//        Object in = new Integer(-2);
//        Object inn = new Integer(-20);
//        boolean flag = listNumbers.remove(in);
//
//        System.out.println(listNumbers.toString());
//
//        System.out.println(flag);
//        System.out.println(listNumbers.size());
//        ArrayListPractice<Integer> newClone = (ArrayListPractice<Integer>) listNumbers.clone();
//
//        System.out.println(newClone.toString());
//
//        newClone.add(randomInt());
//
//        System.out.println(newClone.toString());
//
//        System.out.println(listNumbers.toString());
//
//        System.out.println(listNumbers.contains(in));
//        listNumbers.add(-2);
//        System.out.println(listNumbers.contains(in));
//
//        System.out.println(listNumbers.toString());
//
//        System.out.println(listNumbers.indexOf(inn));
//        System.out.println(listNumbers.get(3));
//        listNumbers.clear();
//
//        System.out.println(listNumbers.toString());
//
//        System.out.println(listNumbers.size());

//        System.out.println("Nhập chiều dài hình chữ nhật:");
//        double width = scanner.nextDouble();
//        System.out.println("Nhập chiều rộng hình chữ nhật:");
//        double height = scanner.nextDouble();
//        Rectangle rectangle1 = new Rectangle(width, height);
//        rectangle1.display();

//        System.out.println("Nhập hệ số a:");
//        double a = scanner.nextDouble();
//        System.out.println("Nhập hệ số b:");
//        double b = scanner.nextDouble();
//        System.out.println("Nhập hệ số c:");
//        double c = scanner.nextDouble();
//        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
//        quadraticEquation.showResult();
//        StopWatch stopWatch = new StopWatch();
//        stopWatch.runStopWatch();

//        StaticMethod student1 = new StaticMethod("chicken");
//        StaticMethod student2 = new StaticMethod("duck");
//        StaticMethod student3 = new StaticMethod("bird");
//
//        student1.display();
//        student2.display();
//
//        StaticMethod.change();
//        student3.display();

//        Fan fan1 = new Fan( 3, true, 7, "yellow");
//        System.out.println(fan1.toString());

//        Car car1 = new Car("Lambo", "Diezel");
//        System.out.println(car1.numberOfCar);
//        Car car2 = new Car("BMW", "Electric");
//        System.out.println(car2.numberOfCar);

//        Student std1 = new Student();
//        std1.setName("Leesin");
//        std1.setClasses("C0822G1");
//        System.out.println(std1.getName());
//        System.out.println(std1.getClasses());

//        Shape shape = new Shape();
//        System.out.println(shape.toString());
//
//        Shape shape5 = new Shape("red", false);
//        System.out.println(shape5.toString());
//
//        Circle circle = new Circle("white", true, 4);
//        System.out.println(circle.getArea());
//        System.out.println(circle.getPerimeter());
//        System.out.println(circle.toString());

//        Circle c1 = new Circle(8);
//        System.out.println(c1.getArea());
//        System.out.println(c1.getPerimeter());
//        System.out.println(c1.toString());

//        RectangleShape rec1 = new RectangleShape("red", true, 7, 11);
//        System.out.println(rec1.getArea());
//        System.out.println(rec1.getPerimeter());
//        System.out.println(rec1.toString());
//        System.out.println(rec1.getColor());

//        Square square = new Square("pink", false, 9);
//        System.out.println(square.getArea());
//        System.out.println(square.getPerimeter());
//        System.out.println(square.toString());
//        System.out.println(square.getColor());
//
//        Cylinder cyl = new Cylinder("purple", true, 13, 17);
//        System.out.println(cyl.getArea());
//        System.out.println(cyl.toString());
//        System.out.println(cyl.getColor());

//        Point2d point2d = new Point2d(7, 11);
//        System.out.println(point2d.toString());
//
//        Point3d point3d = new Point3d(4, 1, 8);
//        point3d.printCoordinate();
//        System.out.println(point3d.toString());
//
//        MovablePoint p1 = new MovablePoint(1, 1, 1, 1);
//        System.out.println(p1.toString());
//        System.out.println(p1.move());
//        System.out.println(p1.move());
//        System.out.println(p1.move());
//
//        MovablePoint p2 = new MovablePoint(0, 0, 2, 3);
//        System.out.println(p2.toString());
//        System.out.println(p2.move());
//        System.out.println(p2.move());
//        System.out.println(p2.move());

//        Triangle tri = new Triangle("grey", false, 3, 4, 3);
//        System.out.println(tri.toString());
//
//        Triangle tri1 = new Triangle("black", true, 3, 4, 5);
//        System.out.println(tri1.toString());

//        Circle[] circles = new Circle[5];
//        circles[0] = new Circle(5);
//        circles[1] = new Circle(11);
//        circles[2] = new Circle(4);
//        circles[3] = new Circle(19);
//        circles[4] = new Circle(12);
//
//        sort(circles);
//        System.out.println(Arrays.toString(circles));
//        System.out.println();
//        Circle[] c1 = new Circle[5];
//        c1[0] = new Circle(29);
//        c1[1] = new Circle(35);
//        c1[2] = new Circle(26);
//        c1[3] = new Circle(14);
//        c1[4] = new Circle(37);
//        sortByCompareTwo(c1);
//        System.out.println(Arrays.toString(c1));

//        RectangleShape[] rec = new RectangleShape[5];
//        rec[0] = new RectangleShape(4, 9);
//        rec[1] = new RectangleShape(25, 27);
//        rec[2] = new RectangleShape(33, 2);
//        rec[3] = new RectangleShape(74, 27);
//        rec[4] = new RectangleShape(15, 15);
//        sortAll(rec);
//        System.out.println(Arrays.toString(rec));

//        RectangleShape rec = new RectangleShape(5, 9);
//        System.out.println(rec.toString());
//        rec.resize(0.2);
//        System.out.println(rec.toString());
//        Triangle tri = new Triangle(4, 9, 10);
//        System.out.println(tri.toString());
//        tri.resize(0.2);
//        System.out.println(tri.toString());
//        Circle cir = new Circle(10);
//        System.out.println(cir.toString());
//        cir.resize(0.2);
//        System.out.println(cir.toString());
//        Square sq = new Square( 11);
//        System.out.println(sq.toString());
//        sq.resize(0.2);
//        System.out.println(sq.toString());

//        Shape[] shapes = new Shape[5];
//        shapes[0] = new Square(8);
//        shapes[1] = new Circle(13);
//        shapes[2] = new Triangle(8, 6, 10);
//        shapes[3] = new Square(11);
//        shapes[4] = new RectangleShape(34, 27);
//        for (Shape shape : shapes) {
//            if (shape instanceof RectangleShape) {
//                ((RectangleShape) shape).howToColor();
//            } else {
//                System.out.println(shape.toString());
//            }
//        }

//        listNumber.add(randomInt());
//        listNumber.add(randomInt());
//        listNumber.add(randomInt());
//        listNumber.add(randomInt());
//        System.out.println("1: " + listNumber.get(0));
//        System.out.println("2: " + listNumber.get(1));
//        System.out.println("3: " + listNumber.get(2));
//        System.out.println("4: " + listNumber.get(3));
//        System.out.println("5: " + listNumber.get(4));
//        listNumber.remove(2);


//        MyLinkedList qq = new MyLinkedList(10);
//        qq.addFirst("gwe");
//        qq.addFirst("egw wghi");
//        qq.addFirst(14);
//        qq.addFirst(326.98);
//        qq.printList();




    }
    public static int randomInt(){
        int random =(int) Math.floor(Math.random()*(100 - 50 +1)) +50;
        return random;
    }

    public static void sort(Circle[] circles) {
        for (int i = 0; i < circles.length - 1; i++) {
            for (int j = i + 1; j < circles.length; j++) {
                Comparable circle = (Comparable) circles[i];
                if (circle.compareTo(circles[j]) == 1) {
                    Circle temp = circles[i];
                    circles[i] = circles[j];
                    circles[j] = temp;
                }
            }
        }

    }

    public static void sortAll(Object[] obj) {
        for (int i = 0; i < obj.length - 1; i++) {
            for (int j = i + 1; j < obj.length; j++) {
                Comparable obj1 = (Comparable) obj[i];
                if (obj1.compareTo(obj[j]) == 1) {
                    Object temp = obj[i];
                    obj[i] = obj[j];
                    obj[j] = temp;
                }
            }

        }
    }

    public static void sortByCompareTwo(Circle[] circles) {
        for (int i = 0; i < circles.length - 1; i++) {
            for (int j = i + 1; j < circles.length; j++) {
                if (Circle.compareTwo(circles[i], circles[j]) == 1){
                    Circle temp = circles[i];
                    circles[i] = circles[j];
                    circles[j] = temp;
                }
            }
        }
    }

}