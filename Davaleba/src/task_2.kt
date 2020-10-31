fun main(){

    val f1 = Fraction(3F,4F)
    val f2 = Fraction(3F,4F)

    println(f1 == f2)
    println(f1.toString())
    println(f2.toString())
    println(f1 + f2)
    println(f1 * f2)
}
class Fraction(n :Float, d :Float) {

    private var numerator: Float = n
    private var denominator: Float = d


    override fun equals(other: Any?): Boolean {
        if (other is Fraction) {
            if (numerator * other.denominator / denominator == other.numerator) {
                return true
            }
        }
        return false
    }
    override fun toString(): String {
        return "$numerator/$denominator"
    }

    operator fun plus(other : Any?): Any? {
        if (other is Fraction) {
            return(numerator / denominator + other.numerator / other.denominator)
        }
        return("Check Parameters")
    }

    operator fun times(other : Any?): Any? {
        if (other is Fraction) {
            return(numerator / denominator * other.numerator / other.denominator)
        }
        return("Check Parameters")
    }

}