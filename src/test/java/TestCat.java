import com.example.Cat;
import com.example.Feline;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;



public class TestCat {

    @Test
    public void TestCatSound(){
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        String voice = cat.getSound();
        assertEquals(voice, "Мяу");
    }
    @Test
    public void TestCatFood()throws Exception{
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        List<String> foods = cat.getFood();
        assertEquals(List.of("Животные", "Птицы", "Рыба"), foods);
    }
}
