package main.kotlin.org.progerio.abstract_factory

import main.kotlin.org.progerio.factory.Circle
import main.kotlin.org.progerio.factory.Rectangle
import main.kotlin.org.progerio.factory.Shape
import main.kotlin.org.progerio.factory.Square

/**
 * class ShapeFactory
 *
 * @author Paulo Rogerio.
 */
class ShapeFactory: AbstractFactory() {

    /**
     * Method  getColor.
     *
     * @param color String
     * @return Color?
     */
    override fun getColor(color: String): Color? {
        return null
    }

    /**
     * Method getShape.
     *
     * @param shape String
     * @return Shape?.
     */
    override fun getShape(shape: String): Shape? {
        when(shape){
            "CIRCLE" -> return Circle()
            "RECTANGLE" -> return Rectangle()
            "SQUARE" -> return Square()
        }
        return null
    }
}