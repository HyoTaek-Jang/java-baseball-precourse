package baseball;

import baseball.controller.BaseballController;
import baseball.domain.Computer;
import baseball.domain.Player;

public class Application {
    public static void main(String[] args) {

        BaseballController baseballController = new BaseballController(new Computer(), new Player());
        baseballController.run();
    }
}
