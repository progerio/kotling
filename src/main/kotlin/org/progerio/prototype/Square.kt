package main.kotlin.org.progerio.prototype

/**
 * class Square.
 *
 * @author Paulo Rogerio.
 */
class Square : Shape() {

    init {
        type = "Square"
    }

    /**
     * Draw
     * @return Any
     */
    override fun draw() {
        println("Inside Square::draw() method.")
    }


}
