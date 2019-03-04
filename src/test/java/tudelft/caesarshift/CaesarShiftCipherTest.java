package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CaesarShiftCipherTest {


    @ParameterizedTest(name = "Cipher={0}, Shift={1}, Result={2}")
    @CsvSource({"abc,3,def", "xyz,3,abc", "xyz,-3,uvw", "a%c,3,invalid", "efghi,5,jklmn"})
    public void cipherTest(String str, int shift, String expectedResult) {
        String code = new CaesarShiftCipher().CaesarShiftCipher(str,shift);
        Assertions.assertEquals(expectedResult, code);
    }

}
