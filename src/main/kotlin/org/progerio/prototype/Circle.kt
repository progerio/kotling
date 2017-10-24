package main.kotlin.org.progerio.prototype

/**
 * class Circle.
 *
 * @author Paulo Rogerio.
 */
class Circle: Shape() {
    init {
        type = "Circle"
    }

    /**
     * Draw.
     *
     * @return Any
     */
    override fun draw() {
        println("Inside Circle::draw() method.")
    }
}