package baseball.domain;

import static baseball.constant.Constant.*;

import baseball.validation.Validation;
import baseball.view.Input;
import baseball.view.Output;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bangjinhyuk on 2022/01/07.
 */
public class Computer {

	private String answer;

	public Computer() {
		createAnswer();
	}

	public class BaseballResult {
		int strike;
		int ball;

		public int getStrike() {
			return strike;
		}

		public BaseballResult(int strike, int ball) {
			this.strike = strike;
			this.ball = ball;
		}

		public boolean isSuccessed() {
			return strike == ANSWER_LENGTH;
		}

		public boolean isRestart() {
			if (isSuccessed()) {
				Output.successMsg();
                String restart = Input.getRestartMsg();
                Validation.validateRestartNumber(restart);
                if (restart.equals(EXIT))
					return true;
				createAnswer();
			}
			return false;
		}

		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder();
			if (ball != 0) {
				sb.append(ball)
					.append("볼 ");
			}
			if (strike != 0) {
				sb.append(strike)
					.append("스트라이크");
			}
			if (ball == 0 && strike == 0) {
				sb.append("낫싱");
			}

			return sb.toString();
		}
	}

	public String createAnswer() {
		List<String> answerList = new ArrayList<>();
		while (answerList.size() != ANSWER_LENGTH) {
			String number = String.valueOf(Randoms.pickNumberInRange(ANSWER_START, ANSWER_END));
			if (!answerList.contains(number))
				answerList.add(number);
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
