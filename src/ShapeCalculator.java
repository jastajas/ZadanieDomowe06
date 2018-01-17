public class ShapeCalculator {

    double squareArea(Square square){
        return square.a * square.a;
    }

    double squarePerimeter(Square square){
        return square.a * 4;
    }

    double rectangleArea(Rectangle rectangle){
        return rectangle.a * rectangle.b;
    }

    double rectanglePerimeter(Rectangle rectangle){
        return rectangle.a * 2 + rectangle.b * 2;
    }

    double circleArea(Circle circle){
        return 3.14 * circle.r * circle.r;
    }

    double circlePerimeter(Circle circle){
        return 2 * 3.14 * circle.r;
    }

    double triangleArea(Triangle triangle){
        return triangle.h * triangle.a / 2;
    }

    double trianglePerimeter(Triangle triangle){
        return triangle.a + triangle.b + triangle.c;
    }

}
