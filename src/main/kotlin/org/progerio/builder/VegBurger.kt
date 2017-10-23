package main.kotlin.org.progerio.builder

/**
 * class VegBurger.
 *
 * @author Paulo Rogerio.
 */
class VegBurger : Burger() {
    /**
     * Price.
     *
     * @return Float.
     */
    override fun price(): Float {
        return 25.0F
    }

    /**
     * Name.
     *
     * @return String.
     */
    override fun name(): String {
        return "Veg Burger"
    }
}