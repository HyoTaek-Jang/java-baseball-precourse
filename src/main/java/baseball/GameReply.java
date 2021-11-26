package baseball;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import camp.nextstep.edu.missionutils.Console;

public class GameReply {

	List<Integer> gameReply;

	public GameReply() {
		System.out.print("숫자를 입력해주세요 : ");
		String input = Console.readLine();
		this.gameReply = Arrays.asList(makeIntArray(input));
		validation();
	}

	public Integer[] makeIntArray(String input) {
		try {
			return Stream.of(input.split("")).mapToInt(Integer::parseInt).boxed().toArray(Integer[]::new);
		} catch (NumberFormatException numberFormatException) {
			throw (new IllegalArgumentException());
		}
	}

	public void validation() {
		if (this.gameReply.size() > 3) {
			throw (new IllegalArgumentException());
		}
		for (Integer cur :
			this.gameReply) {
			int front = this.gameReply.indexOf(cur);
			int tail = this.gameReply.lastIndexOf(cur);
			if (front != tail) {
				throw (new IllegalArgumentException());
			}
		}
	}

}
