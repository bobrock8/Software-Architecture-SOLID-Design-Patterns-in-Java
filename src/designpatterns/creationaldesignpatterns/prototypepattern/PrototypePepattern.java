package designpatterns.creationaldesignpatterns.prototypepattern;

public class PrototypePepattern {

    public PrototypePepattern() {

        Shape square = new Square(10, 5);
        square.draw();

        Shape squareCloned = square.clonedObject();
        squareCloned.draw();

    }
}
