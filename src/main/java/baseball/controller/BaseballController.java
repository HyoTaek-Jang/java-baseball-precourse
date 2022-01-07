package baseball.controller;

import baseball.domain.Computer;
import baseball.domain.Player;
import baseball.validation.Validation;
import baseball.view.Input;
import baseball.view.Output;
import jdk.nashorn.internal.objects.annotations.Where;

import static baseball.constant.Constant.EXIT;

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
        while(true){
            Computer.BaseballResult baseballResult = computer.isCorrectAnswer(requestAnswer());
            Output.resultMsg(baseballResult);
            if (baseballResult.isSuccessed()) {
                Output.successMsg();
                if (Input.getRestartMsg().equals(EXIT)) return;
                computer.createAnswer();
            }
        }
    }

    private String requestAnswer(){
        String number = player.getNumber();
        return Validation.validateInputNumber(number);
    }
}
