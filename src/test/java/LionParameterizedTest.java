import com.example.Feline;
import com.example.Lion;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertThrows;

class LionParameterizedTest {

    @ParameterizedTest
    @ValueSource(strings = {"Самка", "Самец"})
    void lionConstructor_ValidSex_ShouldNotThrowException(String sex) throws Exception {
        Feline feline = new Feline();
        new Lion(feline, sex);
    }

    @ParameterizedTest
    @ValueSource(strings = {"", "Неизвестно"})
    void lionConstructor_InvalidSex_ShouldThrowException(String sex) {
        Feline feline = new Feline();
        assertThrows(Exception.class, () -> new Lion(feline, sex));
    }
}
