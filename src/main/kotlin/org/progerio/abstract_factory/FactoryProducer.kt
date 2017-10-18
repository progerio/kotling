package main.kotlin.org.progerio.abstract_factory

/**
 * class FactoryProducer.
 *
 * @author Paulo Rogerio.
 */
class FactoryProducer {

    /**
     * Method getFactory.
     *
     * @param choice String.
     * @return AbstractFactory?.
     */

    companion object {
        fun getFactory(choice :String): AbstractFactory?{
            when(choice){
                "SHAPE" -> return ShapeFactory()
                "COLOR" -> return ColorFactory()
            }

            return null
        }
    }

}