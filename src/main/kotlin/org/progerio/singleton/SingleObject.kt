package main.kotlin.org.progerio.singleton

/**
 * class SingleObject
 */
class SingleObject {

    companion object {
       internal val instance = SingleObject()

        /**
         * Method getInstance.
         *
         * @return SingleObjet.
         */
        fun getInstance(): SingleObject {
            return instance
        }
    }

    /**
     * Construtor.
     */
    private fun constructor(){
    }

    /**
     * Method showMessage.
     *
     * @return Unit.
     */
    fun showMessage(){
        println("Hello World!")
    }
}