package easy

class RichestCustomerWealth {
    fun maximumWealth(accounts: Array<IntArray>): Int {
        return accounts.map { it.sum() }.max()

    }
}