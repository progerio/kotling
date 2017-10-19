package main.kotlin.org.progerio.singleton

/**
 * class SingletonPattern.
 *
 * @author Paulo Rogerio.
 */
class SingletonPattern

/**
 * Method main.
 */
fun main(args: Array<String>){
    val singleton: SingleObject = SingleObject.getInstance()
    singleton.showMessage()
}