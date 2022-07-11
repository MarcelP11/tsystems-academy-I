package shapes;

public class TestShapes {

    public static void main(String[] args) {
        Point point1 = new Point(0, 0);
        Point point2 = new Point(10, 10);
        Line line = new Line(point1, point2);
        Shape point3 = new Point(2, 3);

        Shape[] shapes = {
                new Square(10),
                new Square(20, '0'),
                new Rectangle(10, 30),
                new Rectangle(100, 20, 'o'),
                new Triangle(50),
                new Triangle(30, 'u')
};

        for (Shape shape:shapes) {
            shape.print();

        }
        /*
        System.out.println("P1: " + point1.toString());
        System.out.println("L : " + line.toString());
        line.move(5, 5);
        System.out.println("L : " + line.toString());
        System.out.println("P1: " + point1.toString());
        point3.move(10, 10);        
        System.out.println("P3: " + point3.toString());

         */
    }
}
