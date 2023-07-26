package easy

//https://leetcode.com/problems/first-bad-version/
class FirstBadVersion {
    fun firstBadVersion(n: Int): Int {
        if (isBadVersion(n) && isBadVersion(1)) {
            return 1
        }
        var low = 1
        var high = n
        var mid: Int

        while (low < high) {
            mid = low + ((high - low) / 2)
            if (isBadVersion(mid)) {
                high = mid
            } else {
                low = mid + 1
            }
        }
        return low
    }

    private fun isBadVersion(n: Int): Boolean {
        return n > 3
    }
}

