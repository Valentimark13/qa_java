import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import com.example.Predator;
import com.example.Cat;
import com.example.Feline;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

class CatTest {

    Predator predator;  // Используем Predator без приведения к Feline
    Cat cat;

    @BeforeEach
    void setUp() {
        predator = Mockito.mock(Feline.class);  // Создаем мок на основе интерфейса Predator
        cat = new Cat((Feline) predator);  // Передаем мок Predator в качестве Feline
    }

    @Test
    void getSound_ShouldReturnMeow() {
        assertEquals("Мяу", cat.getSound());
    }

    @Test
    void getFood_ShouldReturnFoodList() throws Exception {
        List<String> expectedFood = Arrays.asList("Мясо", "Рыба");
        when(predator.eatMeat()).thenReturn(expectedFood);

        List<String> food = cat.getFood();

        assertEquals(expectedFood, food);
    }
}
