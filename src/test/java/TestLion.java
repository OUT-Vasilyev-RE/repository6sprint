import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.MockitoAnnotations;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TestLion {
    private final boolean isHasMane;
    private final String sex;
    private final Feline feline;

    public TestLion(boolean isHasMane, String sex) {
        this.isHasMane = isHasMane;
        this.sex=sex;
        this.feline = new Feline();
    }
    @Parameterized.Parameters
        public static Object[][] getSumData() {
        return new Object[][] {
                { true, "Самец"},
                { false, "Самка"}
        };
    }

    @Test
    public void determineSex() throws Exception {

        try {
            Lion lion = new Lion(sex, feline);
            boolean actual = lion.doesHaveMane();
            assertEquals(isHasMane, actual);
        } catch (Exception ex) {
            assertEquals("Используйте допустимые значения пола животного - самец или самка",ex.getMessage());
        }
    }

}