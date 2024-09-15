import com.example.Alex;
import com.example.Feline;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AlexTest {

    Feline feline;
    Alex alex;

    @BeforeEach
    void setUp() throws Exception {
        alex = new Alex();  // Создаем объект AlexLion
    }

    @Test
    void getKittens_ShouldReturnZero() {
        assertEquals(0, alex.getKittens());  // Проверяем, что у Алекса нет львят
    }

    @Test
    void getFriends_ShouldReturnListOfFriends() {
        List<String> expectedFriends = List.of("Марти", "Глория", "Мелман");
        assertEquals(expectedFriends, alex.getFriends());  // Проверяем список друзей
    }

    @Test
    void getPlaceOfLiving_ShouldReturnNewYorkZoo() {
        assertEquals("Нью-Йоркский зоопарк", alex.getPlaceOfLiving());  // Проверяем место жительства
    }

    @Test
    void lionShouldHaveMane() {
        assertTrue(alex.doesHaveMane());  // Алекс должен быть самцом и иметь гриву
    }
}
