import main.kotlin.easy.FloodFillSolution

fun main() {
    val image = arrayOf(intArrayOf(1,1,1),intArrayOf(1,1,0), intArrayOf(1,0,1))
    val res = FloodFillSolution().floodFill(image,1,1,2)

    println(res)
}


