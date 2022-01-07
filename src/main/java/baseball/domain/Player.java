package baseball.domain;

import baseball.view.Input;

/**
 * Created by bangjinhyuk on 2022/01/07.
 */
public class Player {

	private String inputNumber;

	public String getNumber() {
		Input.getNumberMsg();
		this.inputNumber = Input.getNumber();
		return inputNumber;
	}
}
