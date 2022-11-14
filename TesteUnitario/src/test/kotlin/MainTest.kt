import org.junit.jupiter.api.*
import java.lang.NullPointerException

class MainTest {

    @Test
    @DisplayName("test method countXO")
    fun testCountXO() {
        Assertions.assertAll(
            { Assertions.assertTrue(countXO("xxoo")) },
            { Assertions.assertTrue(countXO("xXoo")) },
            { Assertions.assertTrue(countXO("xxxxoooo")) },
        )
    }

    @Test
    @Disabled
    fun notImplemented(){}

    @Test
    fun willFail() {
        println("I can't finish the tests without this test")
    }

    @Test
    fun assumption() {
        Assumptions.assumeTrue(countXO("xoo"))
        Assumptions.assumeTrue(abc())
    }

    @Test
    fun exception() {
        assertThrows<NullPointerException> { abc() }
    }
}