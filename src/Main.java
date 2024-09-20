class Square {
    double height;

    public Square(double height) {
        this.height = height;
    }

    public double area() {
        return (this.height * this.height);
    }
}
class Action{
    public double compareArea(Square a, Square b){
        return a.area() - b.area();
    }
}
public class Main {
    public static void main(String[] args) {
        Square a = new Square(2);
        Square b = new Square(3);
        Action action = new Action();
        System.out.println(action.compareArea(a, b));
    }
}