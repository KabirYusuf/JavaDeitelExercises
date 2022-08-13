package Chapter6Test;

public class TemperatureConversion {
//    private  double tempInKelvin;
//    private double tempInCelsius;
//
//    private final double conversionConstant = 273.15;
//    private double result;

//    public TemperatureConversion(double temInKelvin, double tempInCelsius, double result){
//        this.tempInKelvin = tempInKelvin;
//        this.tempInCelsius = tempInCelsius;
//        this.result = result;
//    }

//    public void setCelsius(double tempInCelsius){
//        this.tempInCelsius = tempInCelsius;
//    }
//    public double getTempInCelsius(){
//        return tempInCelsius;
//    }
//
//    public void setKelvin(double tempInKelvin){
//        this.tempInKelvin = tempInKelvin;
//    }
//    public double getTempInKelvin(){
//        return tempInKelvin;
//    }
//
    public double  temperatureConversionToKelvin(double tempInCelsius){
//        this.tempInCelsius = tempInCelsius;
        double result = tempInCelsius + 273.15;
        return result;
    }

    public double  temperatureConversionToCelsius(double tempInKelvin){
//        this.tempInKelvin = tempInKelvin;
        double result = tempInKelvin - 273.15;
        return result;
    }

}
