fun main() {
    val celsiusToFahrenheit: (Double) -> Double = {
        9 / 5.0 * it + 32
    }
    
    val kelvinToCelsius: (Double) -> Double = {
        it - 273.15
    }
    
    val fahrenheitToKelvin: (Double) -> Double = {
        5 / 9.0 * (it - 32) + 273.15
    }
    
    val celsiusString = "Celsius"
    val fahrenheitString = "Fahrenheit"
    val kelvinString = "Kelvin"
    
    val initialCelsius = 27.0
    val initialKelvin = 350.0
    val initialFahrenheit = 10.0
    
    printFinalTemperature(initialCelsius, celsiusString, fahrenheitString, celsiusToFahrenheit)
    printFinalTemperature(initialKelvin, kelvinString, celsiusString, kelvinToCelsius)
    printFinalTemperature(initialFahrenheit, fahrenheitString, kelvinString, fahrenheitToKelvin)
}


fun printFinalTemperature(
    initialMeasurement: Double, 
    initialUnit: String, 
    finalUnit: String, 
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // two decimal places
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}