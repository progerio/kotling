package main.kotlin.org.progerio.builder

/**
 * class abstract Burger.
 *
 * @author Paulo Rogerio.
 */
abstract class Burger : Item {

    /**
     * Packing.
     *
     * @return Packing.
     */
    override fun packing(): Packing {
        return Wrapper();
    }

    /**
     * Price.
     *
     * @return Float.
     */
    abstract override fun price(): Float

}