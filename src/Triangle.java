class Triangle extends Shape {
    public Triangle(String name) {
        super(name);
    }

    @Override
    public String getName() {
        System.out.println("Shape name: " + name);
        return null;
    }
}