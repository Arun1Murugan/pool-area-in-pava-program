public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("getWidth() called,  " + rectangle.getWidth());
        System.out.println("getLength() called, " + rectangle.getLength());
        System.out.println("getAreaOfRectangle(), " + rectangle.getAreaOfRectangle());
        Cuboid cuboid = new Cuboid(5, 10, 5);
        System.out.println("getHeight() called,  " + cuboid.getHeight());
        System.out.println("getCuboid() called, " + cuboid.getVolume());
        System.out.println("Executed Successfully.");

    }
}