class Triangle extends Shape {
    public Triangle(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println("Shape name: " + name);
    }
}