package baseball.controller;

import baseball.domain.Computer;
import baseball.domain.Player;
import baseball.view.Input;
import baseball.view.Output;

/**
 * Created by bangjinhyuk on 2022/01/07.
 */
public class BaseballController {

    Computer computer;
    Player player;

    public BaseballController(Computer computer, Player player) {
        this.computer = computer;
        this.player = player;
        String asdf = " ";
    }

    public void run(){
        computer.createAnswer();
        // if (computer.isCorrectAnswer(player.getNumber())) {
        //TO-DO : 모두 맞췄을 때, 아웃풋 메시지 출력, 게임 시작 여부(Input)
        // }
    }
}
