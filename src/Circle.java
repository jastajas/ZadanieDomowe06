public class Circle {
    double r;

    public Circle(double r) {
        this.r = r;
    }
    double circleArea(){
        return 3.14 * this.r * this.r;
    }

    double circlePerimeter(){
        return 2 * 3.14 * this.r;
    }
}
