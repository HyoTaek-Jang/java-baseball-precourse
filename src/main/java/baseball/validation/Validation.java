package baseball.validation;

import static baseball.constant.Constant.EXIT;
import static baseball.constant.Constant.RESTART;

public class Validation {

	public static String validateInputNumber(String inputNumber) {
		if (inputNumber.length() != 3) {
			throw new IllegalArgumentException("[ERROR] 길이가 3이어야 합니다.");
		}
		try {
			Integer.parseInt(inputNumber);
		} catch (Exception e) {
			throw new IllegalArgumentException("[ERROR] 숫자만 입력해주세요.");
		}
		return inputNumber;
	}

	public static String validateRestartNumber(String restartNumber) {
		if (!(restartNumber.equals(RESTART) || restartNumber.equals(EXIT))) {
			throw new IllegalArgumentException("[ERROR] 1 또는 2어야 합니다.");
		}
		return restartNumber;
	}
}
