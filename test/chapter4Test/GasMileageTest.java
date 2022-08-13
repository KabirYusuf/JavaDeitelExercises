package chapter4Test;

import Chapter4.GasMileage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GasMileageTest {
    GasMileage gasMileage;

    private int milesAmount;
    private int fuelAmount;

    @BeforeEach
    void setUp(){
        gasMileage = new GasMileage();
    }

    @Test
    void testFuelAmount(){
        //gasMileage.g
    }
}
