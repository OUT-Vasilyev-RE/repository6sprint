package filane;
import static org.junit.Assert.assertEquals;
import com.example.Feline;
import org.junit.Test;


public class TestFeline {


    @Test
    public void testFamily() {
        Feline feline = new Feline();
        String family = feline.getFamily();
        assertEquals("Кошачьи",family);

    }

    @Test
    public void testGetKittens() {
        Feline feline = new Feline();
        int kittens = feline.getKittens();
        assertEquals(kittens, 1);

    }

    @Test
    public void testCountKittens() {
        Feline feline = new Feline();
        int kittensCount = feline.getKittens(3);
        assertEquals(kittensCount, 3);

    }
}