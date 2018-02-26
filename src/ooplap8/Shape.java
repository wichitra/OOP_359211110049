package ooplap8;

// Abstract class

public abstract class Shape {                               // Abstract class
    private int width;
    private int length;

    public abstract double getArea();                           // Abstract method

    // constructorcon
    public Shape(int width, int length) {
        this.width = width;
        this.length = length;
    }

    // get and set
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }


} // shpe