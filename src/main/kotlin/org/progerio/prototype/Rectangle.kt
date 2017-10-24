package main.kotlin.org.progerio.prototype

/**
 * class Rectangle.
 *
 * @author Paulo Rogerio.
 */
class Rectangle : Shape() {
    /**
     * Construtor.
     */
   init {
       type = "Rectangle"
   }

    /**
     * Draw.
     *
     * @return Any.
     */
    override fun draw() {
      println("Inside Rectangle::draw() method.")
    }
}