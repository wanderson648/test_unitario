import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class MainPort {

    @Test
    @DisplayName("Testing types of access port")
    fun testLobby() {
        Assertions.assertAll(
            { assertEquals(lobby(15, "", ""), "denied") },
            { assertEquals(lobby(20, "", ""), "denied") },
            { assertEquals(lobby(25, "VIP", ""), "denied") },
            { assertEquals(lobby(25, "common", "xt45689"), "Welcome") },
            { assertEquals(lobby(25, "common", "45689"), "denied") },
            { assertEquals(lobby(25, "premium", "xt45689"), "denied") },
            { assertEquals(lobby(25, "premium", "45689"), "denied") },
            { assertEquals(lobby(25, "premium", "xl45689"), "Welcome") },
            { assertEquals(lobby(25, "lux", "xl45689"), "Welcome") },
        )
    }

}