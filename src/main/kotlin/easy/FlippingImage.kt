package easy

class FlippingImage {
    fun flipAndInvertImage(image: Array<IntArray>): Array<IntArray> {
        val flipped = image.map{
            it.reversedArray()
        }
            .map {
                invert(it)
            }

        return flipped.toTypedArray()
    }

    private fun invert(array: IntArray): IntArray {
        val newArray = IntArray(array.size)
        array.forEachIndexed() { index, it ->
            if (it == 0) newArray[index] = 1
            else newArray[index] = 0
        }
        return newArray
    }
}