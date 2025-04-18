package ro.ulbs.paradigme.lab2;

public class Triangle extends Form {
    private final float height;
    private final float base;

    public Triangle() {
        super();
        this.height = 0;
        this.base = 0;
    }

    public Triangle(float height, float base, String color) {
        super(color);
        this.height = height;
        this.base = base;
    }

    @Override
    public float getArea() {
        return (this.height * this.base) / 2;
    }

    @Override
    public String toString() {
        return super.toString() + ", and is a Triangle with base = " + base + ", height = " + height;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Triangle triangle = (Triangle) obj;
        return Float.compare(triangle.height, height) == 0 &&
                Float.compare(triangle.base, base) == 0 &&
                super.toString().equals(triangle.toString());
    }
}