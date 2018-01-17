public class CalculatorTest {
    public static void main(String[] args) {

        Square square = new Square(5);
        Rectangle rectangle = new Rectangle(4,7);
        Triangle triangle = new Triangle(4,5,6,7);
        Circle circle = new Circle(5);

        double rectArea = rectangle.rectangleArea();
        double rectPerimeter = rectangle.rectanglePerimeter();
        double circArea = circle.circleArea();
        double circPerimeter = circle.circlePerimeter();
        double triaArea = triangle.triangleArea();
        double triaPerimeter = triangle.trianglePerimeter();
        double squaArea = square.squareArea();
        double squaPerimeter = square.squarePerimeter();


        System.out.println("Pole koła: " + circArea);
        System.out.println("Obwód koła: " + circPerimeter);
        System.out.println("Pole prostokąta: " + rectArea);
        System.out.println("Obwód prostokąta: " + rectPerimeter);
        System.out.println("Pole trójkąta: " + triaArea);
        System.out.println("Obwód trójkąta: " + triaPerimeter);
        System.out.println("Pole kwadratu: " + squaArea);
        System.out.println("Obwód kwadratu: " + squaPerimeter);
    }
}
