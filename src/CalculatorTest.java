public class CalculatorTest {
    public static void main(String[] args) {

        Square square = new Square(5);
        Rectangle rectangle = new Rectangle(4,7);
        Triangle triangle = new Triangle(4,5,6,7);
        Circle circle = new Circle(5);

        ShapeCalculator shapeCalculator = new ShapeCalculator();


        System.out.println("Pole koła: " + shapeCalculator.circleArea(circle));
        System.out.println("Obwód koła: " + shapeCalculator.circlePerimeter(circle));
        System.out.println("Pole prostokąta: " + shapeCalculator.rectangleArea(rectangle));
        System.out.println("Obwód prostokąta: " + shapeCalculator.rectanglePerimeter(rectangle));
        System.out.println("Pole trójkąta: " + shapeCalculator.triangleArea(triangle));
        System.out.println("Obwód trójkąta: " + shapeCalculator.trianglePerimeter(triangle));
        System.out.println("Pole kwadratu: " + shapeCalculator.squareArea(square));
        System.out.println("Obwód kwadratu: " + shapeCalculator.squarePerimeter(square));
    }
}
