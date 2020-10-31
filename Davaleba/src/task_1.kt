fun main(){
    val coord1 = Point(15,20)
    val coord2 = Point(15,20)

    println(coord1.toString())
    println(coord1.toString())
    println(coord1 == coord2)
    println(coord1 + coord2)
}
class Point(x : Int, y : Int){

    var x :Int = x
    var y :Int = y

    override fun toString(): String {
        return ("($x; $y)")
    }
    override fun equals(other: Any?): Boolean {
        if (other is Point){
            if (x == other.x && y == other.y) {
                return true
            }
        }
        return false
    }
    operator fun plus(other: Any?): Any? {
        if (other is Point){
            other.y = -other.y
            return("($x; -$y) , $other")
        }
        return("Check Parameters")
    }
}