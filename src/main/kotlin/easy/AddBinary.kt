package easy
//https://leetcode.com/problems/add-binary/
class AddBinary {
    fun addBinary(a: String, b: String): String {
        val arrA: CharArray
        val arrB: CharArray
        var commonLength: Int = 0
        if (a.length > b.length) {
            arrA = a.toCharArray()
            arrB = CharArray(a.length){'0'}
            b.toCharArray(arrB, a.length - b.length, 0, b.length)
            commonLength = a.length
        } else if (a.length < b.length) {
            arrB = b.toCharArray()
            arrA = CharArray(b.length){'0'}
            a.toCharArray(arrA, b.length - a.length, 0, a.length)
            commonLength = b.length
        } else {
            arrA = a.toCharArray()
            arrB = b.toCharArray()
            commonLength = a.length
        }

        var carryingVal = 0
        val resCharArray = CharArray(commonLength)
        for (i in commonLength - 1 downTo 0) {
            when (arrA[i].toInt() + arrB[i].toInt() + carryingVal) {
                96 -> {
                    carryingVal = 0;
                    resCharArray[i] = '0'
                }  //0
                97 -> {
                    carryingVal = 0
                    resCharArray[i] = '1'
                }

                98 -> {
                    carryingVal = 1
                    resCharArray[i] = '0'
                }

                99 -> {
                    carryingVal = 1
                    resCharArray[i] = '1'
                }
            }
        }
        if (carryingVal == 0) {
            return String(resCharArray)
        } else {
            val newResCharArray = CharArray(commonLength + 1)
            newResCharArray[0] = '1'
            System.arraycopy(resCharArray, 0, newResCharArray, 1, resCharArray.size)
            return String(newResCharArray)
        }
    }
}