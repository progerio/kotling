package main.kotlin.org.progerio.abstract_factory

import main.kotlin.org.progerio.factory.Shape

/**
 * class AbstractFactory
 *
 * @author Paulo Rogerio.
 */
abstract class AbstractFactory {

    /**
     * Abstract Method getColor.
     *
     * @param color String.
     * @return Color?.
     */
    abstract fun getColor(color: String): Color?

    /**
     * Abstract Method getShape.
     *
     * @param shape String.
     * @return Shape?.
     */
    abstract fun getShape(shape: String): Shape?
}