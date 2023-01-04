package designpatterns.structrualdesignpatterns.flyweightpattern;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {

    // we will create rectangle for every color
    private Map<String, Shape> shapes;

    public ShapeFactory() {
        this.shapes = new HashMap<>();
    }

    // get a shape based on a given color
    public Shape getShape(String color) {
        if (shapes.containsKey(color))
            return shapes.get(color);

        System.out.println("--- Create new rectangle ---");
        Shape shape = new Rectangle(color);
        shapes.put(color, shape);
        return shape;
    }
}
