package easy

class DefangingIPAddress {
    fun defangIPaddr(address: String): String {
        return address.replace(".","[.]")
    }
}