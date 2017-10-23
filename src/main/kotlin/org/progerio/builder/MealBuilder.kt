package main.kotlin.org.progerio.builder

/**
 * class MealBuilder.
 *
 * @author Paulo Rogerio.
 */
class MealBuilder {

    /**
     * PrepareVegMeal.
     *
     * @return Meal.
     */
    fun prepareVegMeal(): Meal {
        val meal = Meal()
        meal.addItem(VegBurger())
        meal.addItem(Coke())
        return meal
    }

    /**
     * PrepareNonVegMeal.
     *
     * @return Meal.
     */
    fun prepareNonVegMeal(): Meal {
        val meal = Meal()
        meal.addItem(ChickenBurger())
        meal.addItem(Pepsi())
        return meal
    }
}