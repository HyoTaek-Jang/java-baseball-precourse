package baseball.controller;

import baseball.domain.Computer;
import baseball.domain.Player;

/**
 * Created by bangjinhyuk on 2022/01/07.
 */
public class BaseballController {

    Computer computer;
    Player player;

    public BaseballController(Computer computer, Player player) {
        this.computer = computer;
        this.player = player;
    }

    public void run(){
        //TODO
        System.out.println("run success");
    }
}
