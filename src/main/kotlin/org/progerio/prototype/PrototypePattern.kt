package main.kotlin.org.progerio.prototype

/**
 * Class PrototypePattern
 *
 * @author Paulo Rogerio.
 */
class PrototypePattern

/**
 * Main.
 */
fun main(array: Array<String>){
    ShapeCache.loadCache()

    println("Shape : " + ShapeCache.getShape("1").type)

    println("Shape : " + ShapeCache.getShape("2").type)

    println("Shape : " + ShapeCache.getShape("3").type)
}