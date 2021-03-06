package main.kotlin.org.progerio.factory

/**
 * class FactoryPattern
 * @author Paulo Rogerio.
 */
class FactoryPattern

/**
 * Method main.
 *
 * @param args Array.
 * @author Paulo Rogerio.
 */
fun main(args: Array<String>) {

    val shapeFactory = ShapeFactory()

    val shape1 = shapeFactory.getShape(Type.CIRCLE)
    shape1?.draw()

    val shape2 = shapeFactory.getShape(Type.RECTANGLE)
    shape2?.draw()

    val shape3 = shapeFactory.getShape(Type.SQUARE)
    shape3?.draw()
}