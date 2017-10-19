package main.kotlin.org.progerio.abstract_factory

/**
 * class AbstractFactoryPattern.
 *
 * @author Paulo Rogerio.
 */
class AbstractFactoryPattern

/**
 * Method main.
 */
fun main(args: Array<String>) {

    //get shape factory
    val shapeFactory = FactoryProducer.getFactory("SHAPE")

    //get an object of Shape Circle
    val shape1 = shapeFactory?.getShape("CIRCLE")

    //call draw method of Shape Circle
    shape1?.draw()

    //get an object of Shape Rectangle
    val shape2 = shapeFactory?.getShape("RECTANGLE")

    //call draw method of Shape Rectangle
    shape2?.draw()

    //get an object of Shape Square
    val shape3 = shapeFactory?.getShape("SQUARE")

    //call draw method of Shape Square
    shape3?.draw()

    //get color factory
    val colorFactory = FactoryProducer.getFactory("COLOR")

    //get an object of Color Red
    val color1 = colorFactory?.getColor("RED")

    //call fill method of Red
    color1?.fill()

    //get an object of Color Green
    val color2 = colorFactory?.getColor("GREEN")

    //call fill method of Green
    color2?.fill()

    //get an object of Color Blue
    val color3 = colorFactory?.getColor("BLUE")

    //call fill method of Color Blue
    color3?.fill()
}
