package shapes;

public class Triangle extends Shape{
    private int height;

    public Triangle(int height){
        this.height=height;
    }

    public Triangle(int height, char color){
        super(color);
        this.height=height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
