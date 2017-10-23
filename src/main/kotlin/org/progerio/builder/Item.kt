package main.kotlin.org.progerio.builder

/**
 * Interface Item.
 *
 * @author Paulo Rogerio.
 */
interface Item {

    /**
     * Name.
     *
     * @return String.
     */
    fun name(): String

    /**
     * Packing.
     *
     * @return Packing.
     */
    fun packing(): Packing

    /**
     * Price.
     *
     * @return Float.
     */
    fun price(): Float
}