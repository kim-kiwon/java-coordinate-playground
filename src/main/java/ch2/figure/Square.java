package ch2.figure;

import ch2.coordination.Point;
import ch2.coordination.Points;
import java.util.List;
import java.util.stream.Collectors;

public class Square implements Figure {
    private Points points;

    public Square(Points points) {
        this.points = points;
        valid();
    }

    private void valid() {
        if (points.hasDuplicatedPoints()) {
            throw new IllegalArgumentException("도형이 중복되는 점을 가집니다.");
        }

        if (!isRectangle()) {
            throw new IllegalArgumentException("직사각형이 아닙니다.");
        }
    }

    private boolean isRectangle() {
        List<Integer> xPoints = points.getUniqueXCoords();
        List<Integer> yPoints = points.getUniqueYCoords();

        return xPoints.size() == 2 && yPoints.size() == 2;
    }

    @Override
    public double getCalcResult() {
        List<Integer> xPoints = points.getUniqueXCoords();
        List<Integer> yPoints = points.getUniqueYCoords();

        return Math.abs(xPoints.get(0) - xPoints.get(1)) * Math.abs(yPoints.get(0) - yPoints.get(1));
    }


}
