import org.junit.Assert
import org.junit.Test

class Test {
    @Test
    fun testResult() {
        val numberWithFactorial = mapOf(
                0 to 1L,
                1 to 1L,
                2 to 2L,
                3 to 6L,
                4 to 24L,
                10 to 3628800L,
                15 to 1307674368000L,
                20 to 2432902008176640000L
        )
        for ((i, factorialResult) in numberWithFactorial) {
            Assert.assertEquals(factorialResult, factorial(i))
        }
    }
}