class Rectangle extends Shape {
    public Rectangle(String name) {
        super(name);
    }

    @Override
    public String getName() {
        System.out.println("Shape name: " + name);
        return null;
    }
}