public class TestMovable {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(0, 0);
        System.out.println("Initial position: " + point);

        point.moveUp();
        point.moveRight();
        System.out.println("New position: " + point);

        point.moveDown();
        point.moveLeft();
        System.out.println("Final position: " + point);
    }
}