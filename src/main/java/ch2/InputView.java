package ch2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputView {
    private static final String INPUT_COORDINATE = "좌표를 입력하세요.";
    private static final String SEPERATOR = "-";
    private static final Scanner scanner = new Scanner(System.in);

    public static List<Point> receiveUserInput() {
        System.out.println(INPUT_COORDINATE);

        String userInput = scanner.nextLine();
        String[] pointStrArr = userInput.split(SEPERATOR);

        List<Point> points = new ArrayList<>();
        Arrays.stream(pointStrArr)
            .map(InputView::generatePoint)
            .map(point -> points.add(point));

        return points;
    }

    private static Point generatePoint(String input) {
        Pattern pattern = Pattern.compile("\\(([0-9]{1,2}),([0-9]{1,2})\\)");

        Matcher matcher = pattern.matcher(input);
        if (matcher.find()) {
            int x = Integer.parseInt(matcher.group(1));
            int y = Integer.parseInt(matcher.group(2));
            return new Point(x, y);
        }
        throw new IllegalArgumentException();
    }
}
