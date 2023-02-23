package ch2.figure;

import ch2.coordination.Point;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import javax.sound.sampled.Line;

public class FigureFactory {
    private static final Map<Integer, Function<List<Point>, Figure>> figureConstructorMap = new HashMap<>();
    private static final Integer LINE_POINT_COUNT = 2;
    private static final Integer TRIANGLE_POINT_COUNT = 3;
    private static final Integer SQUARE_POINT_COUNT = 4;

    static {
        figureConstructorMap.put(LINE_POINT_COUNT, Line::new);
        figureConstructorMap.put(TRIANGLE_POINT_COUNT, Triangle::new);
        figureConstructorMap.put(SQUARE_POINT_COUNT, Square::new);
    }

    public static Figure create(List<Point> points) {
        return figureConstructorMap.get(points.size()).apply(points);
    }
}
