package factory_design_pattern;

public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside factory_design_pattern.Square::draw() method.");
    }

    @Override
    public void area(int size) {
        System.out.println("Area of square : " + size * size);
    }

}
