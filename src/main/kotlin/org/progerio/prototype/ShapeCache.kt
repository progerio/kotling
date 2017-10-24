package main.kotlin.org.progerio.prototype

import java.util.*

/**
 * Class ShapeCache.
 *
 * @author Paulo Rogerio.
 */
class ShapeCache {

    /**
     * static
     */
    companion object {

        val shapeMap: Hashtable<String, Shape> = Hashtable<String, Shape>()

        /**
         * getShape.
         *
         * @return Shape.
         */
        fun getShape(shapeId: String): Shape {
            val cachedShape: Shape? = shapeMap.get(shapeId)
            return cachedShape?.clone() as Shape
        }

        /**
         * LoadCache.
         *
         * @return Any.
         */
        fun loadCache() {
            val circle = Circle()
            circle.id = "1"
            shapeMap.put(circle.id, circle)

            val square = Square()
            square.id = "2"
            shapeMap.put(square.id, square)

            val rectangle = Rectangle()
            rectangle.id = "3"
            shapeMap.put(rectangle.id, rectangle)
        }
    }

}