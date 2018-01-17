public class Square {
    double a;

    Square(double a){
        this.a = a;
    }
    double squareArea(){
        return this.a * this.a;
    }

    double squarePerimeter(){
        return this.a * 4;
    }
}
