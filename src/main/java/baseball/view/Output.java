package baseball.view;

import static baseball.constant.Constant.*;

import baseball.domain.Computer;

/**
 * Created by bangjinhyuk on 2022/01/07.
 */
public class Output {

	public static void resultMsg(Computer.BaseballResult baseballResult) {
		System.out.println(baseballResult);
	}

	public static void successMsg() {
		System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
	}
}
