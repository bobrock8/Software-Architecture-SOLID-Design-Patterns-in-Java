package designpatterns.creationaldesignpatterns.prototypepattern;

public class PrototypePattern {

    public PrototypePattern() {

        Shape square = new Square(10, 5);
        square.draw();

        Shape squareCloned = square.clonedObject();
        squareCloned.draw();

    }
}
