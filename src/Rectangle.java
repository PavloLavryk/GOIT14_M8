class Rectangle extends Shape {
    public Rectangle(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println("Shape name: " + name);
    }
}