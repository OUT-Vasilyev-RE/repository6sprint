import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.assertEquals;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class TestLionMethode {
    @Mock
    Lion lion;

    @Test
    public void testKittensAndFood() {
        Mockito.when(lion.getKittens()).thenReturn(1);
        int result = lion.getKittens();
        assertEquals(1, result);
    }

    @Test
    public void testFoodByLine() throws Exception {
        Mockito.when(lion.getFood()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> foods = lion.getFood();
        assertEquals(List.of("Животные", "Птицы", "Рыба"), foods);
    }
}