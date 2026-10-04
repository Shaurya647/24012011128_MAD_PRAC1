class Car(
    val type: String,
    val model: Int,
    val owner: String,
    var milesDriven: Int,
    val originalPrice: Double,
    var currentPrice: Double,
) {

    init {
        println("Object of class is created and Init is called.")
        println("-".repeat(50))
    }

    constructor(
        type: String,
        model: Int,
        owner: String,
        originalPrice: Double,
        currentPrice: Double,
    ) : this(type, model, owner, 0, originalPrice, currentPrice)

    fun getCarInformation(): String {
        return "$type, $model"
    }

    fun getOriginalCarPrice(): Double {
        return originalPrice
    }

    fun getCurrentCarPrice(): Double {
        return currentPrice
    }

    fun displayCarInfo() {
        println("\nCar Information: ${getCarInformation()}")
        println("Car Owner: $owner")
        println("Miles Drive: $milesDriven")
        println("Original Car Price: ${getOriginalCarPrice()}")
        println("Current Car Price: ${getCurrentCarPrice()}")
        println("-".repeat(50))
    }
}

fun main() {
    println("Creating Car Class Object car1 in next time")
    val car1 = Car(
        type = "BMW",
        model = 2018,
        owner = "Aman",
        milesDriven = 105,
        originalPrice = 100000.0,
        currentPrice = 98950.0,
    )
    car1.displayCarInfo()
    println()

    println("Creating Car Class Object car2 in next time")
    val car2 = Car(
        type = "BMW",
        model = 2019,
        owner = "Karan",
        originalPrice = 400000.0,
        currentPrice = 399800.0,
    )
    car2.displayCarInfo()
    println()

    println("****** ArrayList of Car **********")
    val carList = arrayListOf<Car>()

    val car3 = Car(
        type = "Toyota",
        model = 2017,
        owner = "KJS",
        milesDriven = 100,
        originalPrice = 1080000.0,
        currentPrice = 1079000.0,
    )
    carList.add(car3)
    car3.displayCarInfo()
    println()

    val car4 = Car(
        type = "Maruti",
        model = 2020,
        owner = "NRP",
        milesDriven = 200,
        originalPrice = 4000000.0,
        currentPrice = 3998000.0,
    )
    carList.add(car4)
    car4.displayCarInfo()
    println()

    println("All Cars in ArrayList:")
    println()
    for (car in carList) {
        println("Car Type: ${car.type}, Model: ${car.model}")
        println("Owner: ${car.owner}")
        println("Original Price: ${car.originalPrice}")
        println("Current Price: ${car.currentPrice}")
        println("-".repeat(50))
    }
}
