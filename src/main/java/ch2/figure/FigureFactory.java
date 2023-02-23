package ch2.figure;

import ch2.coordination.Point;
import ch2.coordination.Points;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FigureFactory {
    // 유틸성 클래스는 private 생성자를 만들어 디폴트 생성자를 막자
    private FigureFactory() {
    }

    private static final Map<Integer, Function<Points, Figure>> figureConstructorMap = new HashMap<>();
    private static final Integer LINE_POINT_COUNT = 2;
    private static final Integer TRIANGLE_POINT_COUNT = 3;
    private static final Integer SQUARE_POINT_COUNT = 4;

    static {
        figureConstructorMap.put(LINE_POINT_COUNT, Line::new);
        figureConstructorMap.put(TRIANGLE_POINT_COUNT, Triangle::new);
        figureConstructorMap.put(SQUARE_POINT_COUNT, Square::new);
    }

    public static Figure create(List<Point> points) {
        return figureConstructorMap.get(points.size()).apply(new Points(points));
    }
}
