package shapes;

public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }



    public Rectangle(int width, int height, char color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
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
            for (int i = 0; i < width; i++) {
                s += super.color;
            }
        s+="\n";
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


