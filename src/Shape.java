abstract class Shape implements Print {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract void print();
}
