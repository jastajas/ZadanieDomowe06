public class Rectangle {
    double a;
    double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }
    double rectangleArea(){
        return this.a * this.b;
    }

    double rectanglePerimeter(){
        return this.a * 2 + this.b * 2;
    }
}
