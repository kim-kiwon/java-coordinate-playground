package ch2.coordination;

import java.util.List;
import java.util.stream.Collectors;

public class Points {
    List<Point> pointList;

    public Points(List<Point> pointList) {
        this.pointList = pointList;
    }

    public List<Point> getPointList() {
        return pointList;
    }

    public boolean hasDuplicatedPoints() {
        List<Point> uniquePoints = pointList.stream()
            .distinct()
            .collect(Collectors.toList());

        return pointList.size() != uniquePoints.size();
    }

    public List<Integer> getUniqueXCoords() {
        return pointList
            .stream()
            .map(Point::getX)
            .distinct()
            .collect(Collectors.toList());
    }

    public List<Integer> getUniqueYCoords() {
        return pointList
            .stream()
            .map(Point::getY)
            .distinct()
            .collect(Collectors.toList());
    }
}
