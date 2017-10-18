package main.kotlin.org.progerio.factory

/**
 * class ShapeFactory.
 *
 * @author Paulo Rogerio.
 */
class ShapeFactory {

    fun getShape(shapeType: String): Shape?{
        when(shapeType){
            "CIRCLE" -> return Circle()
            "RECTANGLE" -> return Rectangle()
            "SQUARE" -> return Square()
        }
        return null
    }
}