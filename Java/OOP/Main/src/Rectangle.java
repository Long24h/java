public class Rectangle {
    double width, height;
    public Rectangle (){

    };
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    public double getArea(){
        return this.width * this.height;
    }
    public double getPerimeter(){
        return (this.width + this.height)*2;
    }
    public void display(){
                System.out.println("Chiều dài của hình chữ nhật: " + this.width);
        System.out.println("Chiều rộng của hình chữ nhật: " + this.height);
        System.out.println("Chu vi của hình chữ nhật: " + this.getPerimeter());
        System.out.println("Diện tích của hình chữ nhật: " + this.getArea());
    }
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 15);
        System.out.println(rectangle.getArea());
        rectangle.display();
    }
}
