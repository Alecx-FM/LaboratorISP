package ro.ulbs.paradigme.lab2;

public class Circle extends Form {
    private final float radius;

    public Circle() {
        super();
        this.radius = 0;
    }

    public Circle(float radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public float getArea() {
        return (float) (Math.PI * Math.pow(radius, 2));
    }

    @Override
    public String toString() {
        return super.toString() + ", and is a Circle with radius = " + radius;
    }
}