package main.kotlin.org.progerio.builder

/**
 * Class BuilderPattern.
 */
class BuilderPattern

/**
 * Method principal.
 */
fun main(args: Array<String>) {
    val mealBuilder = MealBuilder()
    val vegMeal = mealBuilder.prepareVegMeal()
    println("Veg Meal")
    vegMeal.showItems()
    println("Total cost : " + vegMeal.getCost())

    val nonVegMeal = mealBuilder.prepareNonVegMeal()
    println("\n\nNon Veg Meal")
    nonVegMeal.showItems()
    println("Total cost : " + nonVegMeal.getCost())
}