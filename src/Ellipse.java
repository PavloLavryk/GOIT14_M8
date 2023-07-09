class Ellipse extends Shape {
    public Ellipse(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println("Shape name: " + name);
    }
}