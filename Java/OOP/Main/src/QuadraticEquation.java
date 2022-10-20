public class QuadraticEquation {
    private static double a, b, c;

    public QuadraticEquation() {

    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        double delta = this.b * this.b - 4 * this.a * this.c;
        return delta;
    }

    public double getRoot1() {
        double r1 = (-this.b + Math.sqrt(this.getDiscriminant())) / (2 * a);
        return r1;
    }

    public double getRoot2() {
        double r2 = (-this.b - Math.sqrt(this.getDiscriminant())) / (2 * a);
        return r2;
    }

    public void showResult() {
        System.out.println("Giải phương trình aX2 + bX + c = 0");
        double delta = getDiscriminant();
        if (this.a == 0 && this.b == 0 && this.c == 0) {
            System.out.println("Phương trình có vô số nghiệm");
        } else if (this.a == 0 && this.b == 0) {
            System.out.println("Phương trình vô nghiệm");
        } else if (this.a == 0) {
            System.out.println("Phương trình có nghiệm x = " + -this.c / this.b);
        } else if (delta < 0) {
            System.out.println("The equation has no roots");
        } else if (delta == 0) {
            System.out.println("Phương trình có nghiệm kép x1 = x2 = " + getRoot1());
        } else {
            System.out.println("Phương trình có hai nghiệm x1 = " + getRoot1() + ", x2 = " + getRoot2());
        }
    }

    public static void main(String[] args) {

    }
}
