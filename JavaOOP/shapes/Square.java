package shapes;

public class Square extends Shape{
    private int size;

    public Square(int size){
        this.size=size;
    }

    public Square(int size, char color){
        super(color);
        this.size=size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
