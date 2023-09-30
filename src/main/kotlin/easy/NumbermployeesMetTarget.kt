package easy

class NumbermployeesMetTarget {
    fun numberOfEmployeesWhoMetTarget(hours: IntArray, target: Int): Int {
        return hours
            .filter { it >= target }
            .size
    }
}