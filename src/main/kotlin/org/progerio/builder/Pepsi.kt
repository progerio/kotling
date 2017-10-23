package main.kotlin.org.progerio.builder

/**
 * Class Pepsi.
 *
 * @author Paulo Rogerio.
 */
class Pepsi : ColdDrink() {
    /**
     * Price.
     *
     * @return Float.
     */
    override fun price(): Float {
        return 35.0F
    }

    /**
     * Name.
     *
     * @return String.
     */
    override fun name(): String {
        return "Pepsi"
    }
}