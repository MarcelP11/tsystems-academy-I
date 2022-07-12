package shapes;

public class Triangle extends Shape {
    private int height;

    public Triangle(int height) {
        this.height = height;
    }

    public Triangle(int height, char color) {
        super(color);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String toString() {
        String s = "";
        for (int j = 0; j < height; j++) {
            for (int i = 0; i < height; i++) {
                s += super.color;

            }
            s += "\n";
            height--;
        }
        return s;
    }

    @Override
    public void print() {
        {
            System.out.println(this.toString());
        }
    }

}
