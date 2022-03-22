package factory_design_pattern;

public class WithFactoryPattern {

    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circle = shapeFactory.getShape(SHAPENAME.CIRCLE.toString());

        circle.draw();
        circle.area(3);

        Shape square = shapeFactory.getShape(SHAPENAME.SQUARE.toString());

        square.draw();
        square.area(5);
    }

}
