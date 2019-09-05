public class Rectangle {
    public int a;
    public int b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getArea() {
        return a*b;
    }

    public int getCicrumference() {
        return 2*(a+b);
    }
}
