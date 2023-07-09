class Square extends Shape {
    public Square(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println("Shape name: " + name);
    }
}