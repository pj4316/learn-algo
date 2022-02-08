class Solution {
    fun maxProfit(prices: IntArray): Int {
        var minPrice = Int.MAX_VALUE;
        return prices.fold(0) { max, price ->
            minPrice = min(minPrice, price);
            max(max, price - minPrice);
        }
    }
}
