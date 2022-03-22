package factory_design_pattern;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside factory_design_pattern.Circle::draw() method.");
    }

    @Override
    public void area(int radius) {
        System.out.println("Area of circle : " + Math.PI * (radius * radius));
    }

}
