import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import com.example.Lion;
import com.example.Feline;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.when;

class LionTest {

    Feline feline;
    Lion lionMale;
    Lion lionFemale;

    @BeforeEach
    void setUp() throws Exception {
        feline = Mockito.mock(Feline.class);
        lionMale = new Lion(feline, "Самец");
        lionFemale = new Lion(feline, "Самка");
    }

    @Test
    void doesHaveMane_MaleLion_ShouldHaveMane() {
        assertTrue(lionMale.doesHaveMane());
    }

    @Test
    void doesHaveMane_FemaleLion_ShouldNotHaveMane() {
        assertFalse(lionFemale.doesHaveMane());
    }

    @Test
    void getFood_ShouldReturnFoodList() throws Exception {
        List<String> expectedFood = Arrays.asList("Мясо", "Рыба");
        when(feline.getFood("Хищник")).thenReturn(expectedFood);

        List<String> food = lionMale.getFood();

        assertEquals(expectedFood, food);
    }

    @Test
    void getKittens_ShouldReturnKittenCount() {
        when(feline.getKittens()).thenReturn(2);
        assertEquals(2, lionMale.getKittens());
    }
}
