import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class WardenTest {

    @Test
    fun wardenStartsWithTwoDownLevers(){
        val warden = Warden()
        assertFalse(warden.rightLeverPulled)
        assertFalse(warden.leftLeverPulled)
    }

    @Test
    fun pullRightLeverToggles(){
        val warden = Warden()
        warden.pullRightLever()
        assertTrue(warden.rightLeverPulled)
        warden.pullRightLever()
        assertFalse(warden.rightLeverPulled)
    }

    @Test
    fun pullLeftLeverToggles(){
        val warden = Warden()
        warden.pullLeftLever()
        assertTrue(warden.leftLeverPulled)
        warden.pullLeftLever()
        assertFalse(warden.leftLeverPulled)
    }

    @Test
    fun guessCorrectly(){
        val warden = Warden()
        val jail = Jail(10)
        jail.prisoners.forEach {
            jail.warden.summon(it)
        }
        warden.guess()

        assertTrue(warden.hasBeenGivenCorrectGuess)
    }

}