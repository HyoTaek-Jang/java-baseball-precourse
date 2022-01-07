package baseball.validation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static baseball.constant.Constant.EXIT;
import static baseball.constant.Constant.RESTART;


/**
 * Created by bangjinhyuk on 2022/01/07.
 */
class ValidationTest {
    @Test
    void validateInputNumberTest(){
        //given
        String inputNum = "d12";

        //when, then
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            Validation.validateInputNumber(inputNum);
        });
    }

    @Test
    void validateRestarNumberFailedTest(){
        //given
        String inputNum = "3";

        //when, then
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            Validation.validateRestartNumber(inputNum);
        });
    }

    @Test
    void validateRestarNumberSuccessTest(){
        //given, when, then
        org.assertj.core.api.Assertions.assertThat(Validation.validateRestartNumber(EXIT)).isEqualTo(EXIT);
        org.assertj.core.api.Assertions.assertThat(Validation.validateRestartNumber(RESTART)).isEqualTo(RESTART);
    }

}