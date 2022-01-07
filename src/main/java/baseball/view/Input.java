package baseball.view;

import camp.nextstep.edu.missionutils.Console;

/**
 * Created by bangjinhyuk on 2022/01/07.
 */
public class Input {

	public static void getNumberMsg() {
		System.out.println("숫자를 입력해주세요 : ");
	}

	public static String getNumber() {
		return Console.readLine();
	}
}
