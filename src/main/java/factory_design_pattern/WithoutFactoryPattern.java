package factory_design_pattern;

public class WithoutFactoryPattern {

    public static void main(String[] args) {

        Circle circle = new Circle();
        circle.draw();
        circle.area(3);

        Square square = new Square();
        square.draw();
        square.area(5);
    }

}
