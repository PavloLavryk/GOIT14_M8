class ShapePrinter {

    public static void main(String[] args) {
        Circle circle = new Circle("Circle");
        Square square = new Square("Square");
        Triangle triangle = new Triangle("Triangle");
        Rectangle rectangle = new Rectangle("Rectangle");
        Ellipse ellipse = new Ellipse("Ellipse");

        circle.print();
        square.print();
        triangle.print();
        rectangle.print();
        ellipse.print();

    }
}
