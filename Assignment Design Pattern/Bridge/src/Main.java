// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Renderer vectorRenderer = new VectorRenderer();
        Renderer rasterRenderer = new RasterRenderer();

        Shape circle1 = new Circle(5, vectorRenderer);
        circle1.draw();

        Shape circle2 = new Circle(10, rasterRenderer);
        circle2.draw();
    }
}