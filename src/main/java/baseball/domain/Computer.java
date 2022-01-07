package baseball.domain;

import static baseball.constant.Constant.*;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bangjinhyuk on 2022/01/07.
 */
public class Computer {

    private String answer;

    public String createAnswer() {
        List<String> answerList = new ArrayList<>();
        while(answerList.size() != ANSWER_LENGTH){
            int number = Randoms.pickNumberInRange(ANSWER_START, ANSWER_END);
            if(!answerList.contains(number)) answerList.add(String.valueOf(number));
        }

        return String.join("", answerList);
    }

    public boolean isCorrectAnswer(String inputNumber) {
        if (inputNumber.equals(answer)) {
            return true;
        }
        return true;
    }
}
