package main.kotlin.org.progerio.builder

/**
 * Class ColdDrink.
 *
 * @author Paulo Rogerio.
 */
abstract class ColdDrink : Item {
    /**
     * Packing.
     *
     * @return Packing.
     */
    override fun packing(): Packing {
        return Bottle()
    }

    /**
     * Price.
     *
     * @return Float.
     */
    abstract override fun price(): Float
}