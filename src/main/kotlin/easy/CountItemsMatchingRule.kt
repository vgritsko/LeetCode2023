package easy

class CountItemsMatchingRule {
    fun countMatches(items: List<List<String>>, ruleKey: String, ruleValue: String): Int {
        when (ruleKey) {
            "type" -> return filterByRule(items,0,ruleValue)
            "color" -> return filterByRule(items,1,ruleValue)
            "name" -> return filterByRule(items,2,ruleValue)
            else ->return 0
        }
    }

    private fun filterByRule(items: List<List<String>>,ruleIndex:Int, ruleValue:String) : Int {
        return items.count { it[ruleIndex] == ruleValue }
    }
}