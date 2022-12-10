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
    private final String gender;


    public TestLion(boolean isHasMane, String gender) {
        this.isHasMane = isHasMane;
        this.gender=gender;

    }
    @Parameterized.Parameters
        public static Object[][] getSumData() {
        return new Object[][] {
                { true, "Самец"},
                { false, "Самка"}
        };
    }

    @Test
    public void determineGender() throws Exception {
        try {
            Lion lion = new Lion(gender);
            boolean actual = lion.doesHaveMane();
            assertEquals(isHasMane, actual);
        } catch (Exception ex) {
            assertEquals("Используйте допустимые значения пола животного - самей или самка",ex.getMessage());
        }
    }

}