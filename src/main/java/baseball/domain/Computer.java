package baseball.domain;

import static baseball.constant.Constant.*;

import camp.nextstep.edu.missionutils.Randoms;

/**
 * Created by bangjinhyuk on 2022/01/07.
 */
public class Computer {

    private String answer;

    public String createAnswer() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < ANSWER_LENGTH; i++) {
            int number = Randoms.pickNumberInRange(ANSWER_START, ANSWER_END);
            stringBuilder.append(number);
        }

        answer = stringBuilder.toString();
        return answer;
    }

    public boolean isCorrectAnswer(String inputNumber) {
        if (inputNumber.equals(answer)) {
            return true;
        }
    }
}
