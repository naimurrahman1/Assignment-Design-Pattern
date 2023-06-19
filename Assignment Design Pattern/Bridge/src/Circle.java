public class Circle extends Shape{
    private int radius;

    public Circle(int radius, Renderer renderer) {
        super(renderer);
        this.radius = radius;
    }

    public void draw() {
        renderer.renderCircle(radius);
    }
}
