package main.kotlin.org.progerio.builder

/**
 * class Meal.
 *
 * @author Paulo Rogerio.
 */
class Meal {

    private val items = arrayListOf<Item>()

    /**
     * AddItem.
     *
     * @return Any.
     */
    fun addItem(item: Item) {
        items.add(item)
    }

    /**
     * GetCost.
     *
     * @return Float.
     */
    fun getCost(): Float {
        var cost = 0.0F
        for (it in items) {
            cost += it.price()
        }
        return cost
    }

    /**
     * ShowItems.
     *
     * @return Any.
     */
    fun showItems() {
        for (it in items) {
            println("Item : " + it.name())
            println(", Packing : " + it.packing().pack())
            println(", Price   : " + it.price())
        }
    }
}