class Square extends Shape {
    public Square(String name) {
        super(name);
    }

    @Override
    public String getName() {
        System.out.println("Shape name: " + name);
        return null;
    }
}