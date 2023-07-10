class Ellipse extends Shape {
    public Ellipse(String name) {
        super(name);
    }

    @Override
    public String getName() {
        System.out.println("Shape name: " + name);
        return null;
    }
}