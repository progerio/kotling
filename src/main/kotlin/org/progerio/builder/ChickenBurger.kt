package main.kotlin.org.progerio.builder

/**
 * class ChickenBurger.
 *
 * @author Paulo Rogerio.
 */
class ChickenBurger : Burger() {
    /**
     * Price.
     *
     * @return Float.
     */
    override fun price(): Float {
        return 50.5F
    }

    /**
     * Name.
     *
     * @return String.
     */
    override fun name(): String {
        return "Chicken Burger"
    }
}