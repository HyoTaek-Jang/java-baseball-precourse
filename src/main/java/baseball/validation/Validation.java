package baseball.validation;

public class Validation {

	public static void validateInputNumber(String inputNumber) {
		if (inputNumber.length() != 3) {
			throw new IllegalArgumentException("[ERROR] 길이가 3 이하입니다.");
		}
		try {
			Integer.parseInt(inputNumber);
		} catch (Exception e) {
			throw new IllegalArgumentException("[ERROR] 숫자만 입력해주세요.");
		}
	}
}
