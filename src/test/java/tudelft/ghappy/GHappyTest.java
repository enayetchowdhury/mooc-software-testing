package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GHappyTest {

    @ParameterizedTest(name = "String={0}, Result={1}")
    @CsvSource({"xxggxx,true", "yyggxx,ture", "xxggyy,true"})

    public void gHappyTest(String str, boolean expectedResult){
        boolean ans = new GHappy().gHappy(str);
        Assertions.assertEquals(true, ans);
    }
}
