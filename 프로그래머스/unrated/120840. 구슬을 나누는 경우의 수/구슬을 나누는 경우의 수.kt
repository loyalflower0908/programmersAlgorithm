import java.math.BigInteger

class Solution {
    fun solution(balls: Int, share: Int): BigInteger {
        return factorial(balls) / (factorial(balls - share) * factorial(share))
    }
}

fun factorial(n: Int): BigInteger {
    if (n == 0) return BigInteger.ONE
    return BigInteger.valueOf(n.toLong()) * factorial(n - 1)
}
