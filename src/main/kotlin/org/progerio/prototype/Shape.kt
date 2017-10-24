package main.kotlin.org.progerio.prototype

/**
 * class Shape.
 *
 * @author Paulo Rogerio.
 */
abstract class Shape: Cloneable {
    var id:String = ""
    var type:String = ""

    /**
     * Draw.
     *
     */
    abstract fun draw()

    /**
     * Clone.
     *
     * @return Any
     */
    public override fun clone(): Any {
        return super.clone()
    }
}