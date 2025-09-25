import Tasks.TemperatureConverter;

public class Main {
    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter();
        System.out.println("100 fahrenheit to celsius");
        System.out.println("Result: " + converter.fahrenheitToCelsius(100));

    }
}
