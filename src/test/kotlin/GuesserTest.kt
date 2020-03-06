import org.junit.Assert
import org.junit.Test

class GuesserTest {

    @Test
    fun pullTheLeftLeverIfRightIsNotPulled(){
        val guesser = Guesser()
        val warden = Warden()
        warden.summon(guesser)
        Assert.assertTrue(warden.leftLeverPulled)
    }

}