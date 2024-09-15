import org.junit.jupiter.api.Test;

import com.example.Feline;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

class FelineTest {

    Feline feline = new Feline();

    @Test
    void getFamily_ShouldReturnFelineFamily() {
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    void getKittens_ShouldReturnOneKittenByDefault() {
        assertEquals(1, feline.getKittens());
    }

    @Test
    void getKittens_WithArgument_ShouldReturnGivenCount() {
        assertEquals(3, feline.getKittens(3));
    }

    @Test
    void eatMeat_ShouldReturnFoodListForPredator() throws Exception {
        // Подготовим мок для метода getFood
        List<String> expectedFood = Arrays.asList("Животные", "Птицы", "Рыба");
        // Мокаем поведение метода getFood
        when(feline.getFood("Хищник")).thenReturn(expectedFood);

        // Проверяем, что метод eatMeat возвращает ожидаемый список
        List<String> actualFood = feline.eatMeat();

        // Сравниваем результат с ожидаемым значением
        assertEquals(expectedFood, actualFood);
    }
}