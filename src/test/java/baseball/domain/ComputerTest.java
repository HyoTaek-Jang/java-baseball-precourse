package baseball.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

import static baseball.constant.Constant.ANSWER_LENGTH;

/**
 * Created by bangjinhyuk on 2022/01/07.
 */
class ComputerTest {

    @Test
    void makeAnswerTest(){
        //given
        Computer computer = new Computer();

        //when
        String answer = computer.createAnswer();

        //then
        Assertions.assertThat(answer.length()).isEqualTo(ANSWER_LENGTH);
    }

    @Test
    void duplicateAnswerTest(){
        //given
        Computer computer = new Computer();

        //when
        String answer = computer.createAnswer();
        String[] split = answer.split("");

        //then
        Assertions.assertThat(Arrays.stream(split).distinct().toArray().length).isEqualTo(ANSWER_LENGTH);
    }

}