import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class WardenTest {

    @Test
    fun wardenStartsWithTwoDownLevers() {
        val warden = Warden()
        assertFalse(warden.rightLeverPulled)
        assertFalse(warden.leftLeverPulled)
    }

    @Test
    fun pullRightLeverToggles() {
        val warden = Warden()
        warden.pullRightLever()
        assertTrue(warden.rightLeverPulled)
        warden.pullRightLever()
        assertFalse(warden.rightLeverPulled)
    }

    @Test
    fun pullLeftLeverToggles() {
        val warden = Warden()
        warden.pullLeftLever()
        assertTrue(warden.leftLeverPulled)
        warden.pullLeftLever()
        assertFalse(warden.leftLeverPulled)
    }

    @Test
    fun guessCorrectly() {
        val jail = Jail(10)
        jail.prisoners.forEach {
            jail.warden.summon(it)
        }
        jail.warden.guess()

        assertTrue(jail.warden.hasBeenGivenCorrectGuess)
    }

    @Test
    fun guessIncorrectly() {
        val jail = Jail(10)
        jail.warden.guess()

        assertFalse(jail.warden.hasBeenGivenCorrectGuess)
    }

    @Test
    fun cannotReGuess() {
        val jail = Jail(10)
        jail.warden.guess()

        assertFalse(jail.warden.hasBeenGivenCorrectGuess)

        jail.prisoners.forEach {
            jail.warden.summon(it)
        }
        jail.warden.guess()
        assertFalse(jail.warden.hasBeenGivenCorrectGuess)
    }

}