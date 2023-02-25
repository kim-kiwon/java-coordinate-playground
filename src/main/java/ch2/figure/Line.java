package ch2.figure;

import ch2.coordination.Point;
import ch2.coordination.Points;
import java.util.List;

public class Line implements Figure {
    private Points points;

    public Line(Points points) {
        this.points = points;
        valid();
    }

    private void valid() {
        if (points.hasDuplicatedPoints()) {
            throw new IllegalArgumentException("도형이 중복되는 점을 가집니다.");
        }
    }

    @Override
    public double getCalcResult() {
        List<Point> pointList = points.getPointList();

        Point pointA = pointList.get(0);
        Point pointB = pointList.get(1);

        return pointA.getDistance(pointB);
    }
}
