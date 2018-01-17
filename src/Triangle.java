public class Triangle {
    double h;
    double a;
    double b;
    double c;

    public Triangle(double h, double a, double b, double c) {
        this.h = h;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    double triangleArea(){
        return this.h * this.a / 2;
    }

    double trianglePerimeter(){
        return this.a + this.b + this.c;
    }

}
