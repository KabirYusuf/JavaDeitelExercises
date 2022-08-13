package Chapter6Test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TemperatureConversionTest {
    private double kelvin;
    private double celsius;

    TemperatureConversion temperatureConversion;

    @BeforeEach
    void setUp(){
        temperatureConversion = new TemperatureConversion();
    }

    @Test
    public void testThatObjectExist(){
        //given that we have a temperature converter
        //test to determine if the object exists
        assertNotNull(temperatureConversion);
    }

    @Test
    public void testToTestConversionOfCelsiusToKelvin(){
        //given that we have a converter
        //when temperature in celsius = 30
        //temperature in kelvin is = 303.15
        assertEquals(303.15,temperatureConversion.temperatureConversionToKelvin(30));
    }

    @Test
    public void testToTestConversionOfCelsiusToCelsius(){
        //given that we have a converter
        //when temperature in Kelvin = 30
        //temperature in celsius is = 243.15
        assertEquals(-243.1499999,temperatureConversion.temperatureConversionToCelsius(30));
    }


}
