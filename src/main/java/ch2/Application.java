package ch2;

import ch2.coordination.Point;
import ch2.view.InputView;
import java.util.List;

public class Application {
    private static final InputView inputView = new InputView();

    public static void main(String[] args) {
        List<Point> points = InputView.receiveUserInput();

    }
}
