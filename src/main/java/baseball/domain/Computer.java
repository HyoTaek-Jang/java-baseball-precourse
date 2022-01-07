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

    public class BaseballResult {
        public int getStrike() {
            return strike;
        }

        int strike;
        int ball;

        public BaseballResult(int strike, int ball) {
            this.strike = strike;
            this.ball = ball;
        }

        @Override
        public String toString() {
            return ball
                + "볼 "
                + strike
                + "스트라이크";
        }
    }

    public String createAnswer() {
        List<String> answerList = new ArrayList<>();
        while(answerList.size() != ANSWER_LENGTH){
            int number = Randoms.pickNumberInRange(ANSWER_START, ANSWER_END);
            if(!answerList.contains(number)) answerList.add(String.valueOf(number));
        }

        answer = String.join("", answerList);
        return answer;
    }

    public BaseballResult isCorrectAnswer(String inputNumber) {
        int strike = 0;
        int ball = 0;

        for (int i = 0; i < ANSWER_LENGTH; i++) {
            if (inputNumber.charAt(i) == answer.charAt(i))
                strike++;
            else if (answer.contains(String.valueOf(inputNumber.charAt(i)))) {
                ball++;
            }
        }

        return new BaseballResult(strike, ball);
    }



}
