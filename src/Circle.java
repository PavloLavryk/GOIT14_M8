class Circle extends Shape {
    public Circle(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println("Shape name: " + name);
    }
}