package shapes;

public abstract class Shape {
    protected char color;
    protected int x;
    protected int y;

    public Shape() {
        this('*');
    }

    public Shape(char color) {
        this.color = color;
    }



    public int getColor() {
        return color;
    }

    public void setColor(char color) {
        this.color = color;
    }

    public String toString() {
        return ": color = " + color;
    }

    public void print() {
        System.out.println(this);
    }

    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
}