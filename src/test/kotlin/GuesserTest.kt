import junit.framework.TestCase.assertFalse
import org.junit.Assert
import org.junit.Assert.assertTrue
import org.junit.Test

class GuesserTest {

    @Test
    fun guesserKnowsHeHasBeenCalledByTheWarden(){
        val guesser = Guesser(10)
        val warden = Warden()
        Assert.assertFalse(guesser.hasVisitedWarden)
        warden.summon(guesser)
        assertTrue(guesser.hasVisitedWarden)
    }

    @Test
    fun pullTheLeftLeverIfRightIsNotPulled(){
        val guesser = Guesser(10)
        val warden = Warden()
        warden.summon(guesser)
        assertTrue(warden.leftLeverPulled)
    }

    @Test
    fun resetRightLeverWhenPulled(){
        val guesser = Guesser(10)
        val warden = Warden()
        warden.rightLeverPulled = true
        warden.summon(guesser)
        assertFalse(warden.rightLeverPulled)
    }

    @Test
    fun guessesWhenAllPrisonersHaveVisited(){
        val jail = Jail(10)
        jail.prisoners.forEach {
            jail.warden.summon(it)
            jail.warden.summon(jail.guesser)
        }
        jail.warden.summon(jail.guesser)
        assertTrue(jail.warden.hasBeenGivenCorrectGuess)
    }

}