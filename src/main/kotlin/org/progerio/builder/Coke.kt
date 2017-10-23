package main.kotlin.org.progerio.builder

class Coke : ColdDrink() {
    /**
     * Price.
     *
     * @return Float.
     */
    override fun price(): Float {
        return 30.0F
    }

    /**
     * Name.
     *
     * @return String.
     */
    override fun name(): String {
        return "Coke"
    }
}