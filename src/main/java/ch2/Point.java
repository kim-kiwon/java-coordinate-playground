package ch2;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        validate();
        this.x = x;
        this.y = y;
    }

    private void validate() {
        if (x > 24) {
            throw new IllegalArgumentException("x 좌표는 24까지만 입력 가능합니다.");
        }

        if (x < 0) {
            throw new IllegalArgumentException("x 좌표에 음수는 입력할 수 없습니다.");
        }

        if (y > 24) {
            throw new IllegalArgumentException("y 좌표는 24까지만 입력 가능합니다.");
        }

        if (y < 0) {
            throw new IllegalArgumentException("y 좌표에 음수는 입력할 수 없습니다.");
        }
    }
}
