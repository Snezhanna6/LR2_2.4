package Main;

import org.junit.jupiter.api.Test;
import sun.jvm.hotspot.utilities.Assert;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    private float[] numbers = new float[2];

    //Метод для тестирования метода residual класса Main
    @Test
    void residualMethodMainTest() {

        numbers[0] = 25.02f;
        numbers[1] = 30.02f;

        float expected = Main.residual(numbers[0],numbers[1]);
        float actual = -5.0f;

        assertEquals(expected,actual,0.01);

        numbers[0] = 25234.12839f;
        numbers[1] = 16289.023232f;

        expected = Main.residual(numbers[0],numbers[1]);
        actual = 8945.1050f;

        assertEquals(expected,actual,0.0001);

    }
}