class Circle extends Shape {
    public Circle(String name) {
        super(name);
    }

    @Override
    public String getName() {
        System.out.println("Shape name: " + name);
        return null;
    }
}