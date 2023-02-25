package ch2.coordination;

import java.util.Objects;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        validate();
        this.x = x;
        this.y = y;
    }

    public double getDistance(Point p) {
        return Math.sqrt((Math.pow((this.x - p.x), 2) + Math.pow((this.y - p.y), 2)));
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
