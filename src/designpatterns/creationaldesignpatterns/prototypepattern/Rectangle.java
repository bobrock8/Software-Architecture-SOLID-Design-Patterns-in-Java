package designpatterns.creationaldesignpatterns.prototypepattern;

public class Rectangle extends Shape{

    public Rectangle(int width, int height) {
        super(width, height);
    }

    @Override
    public void draw() {
        System.out.println("Rectangle with width: " + width + " height: " + height);
    }

    @Override
    public Shape clonedObject() {
        // this is prototype pattern
        return new Rectangle(width, height);
    }
}
