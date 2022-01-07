package baseball.view;

import camp.nextstep.edu.missionutils.Console;

/**
 * Created by bangjinhyuk on 2022/01/07.
 */
public class Input {

	public static String getNumberMsg() {
		System.out.print("숫자를 입력해주세요 : ");
		return Console.readLine();
	}

	public static String getRestartMsg() {
		System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
		return Console.readLine();
	}



}
