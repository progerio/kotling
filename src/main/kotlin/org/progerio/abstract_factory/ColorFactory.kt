package main.kotlin.org.progerio.abstract_factory

import main.kotlin.org.progerio.factory.Shape

/**
 * class ColorFactory
 *
 * @author Paulo Rogerio.
 */
class ColorFactory : AbstractFactory() {

    /**
     * Method getShape.
     *
     * @param shape String.
     * @return Shape?.
     */
    override fun getShape(shape: String): Shape? {
        return null
    }

    /**
     * Method getColor.
     *
     * @param color String
     * @return Color?.
     */
    override fun getColor(color: String): Color? {
        when (color){
            "RED" -> return Red()
            "GREEN" -> return Green()
            "BLUE" -> return Blue()
        }
        return null
    }
}