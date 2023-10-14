package easy

class GetMaxGeneratedArray {
    fun getMaximumGenerated(n: Int): Int {
        if (n == 0) return 0
        val array  = IntArray(n+1)
        array[0] = 0
        array [1] = 1
        generateArray(array,n)
        return array.max()
    }

    private fun generateArray(array:IntArray, n:Int){
        for (i in 2..n) {
            if (i % 2 == 0) {
                array[i] = array[i/2]
            } else {
                array[i] = array[i/2] + array[i/2 + 1]
            }
        }
    }
}