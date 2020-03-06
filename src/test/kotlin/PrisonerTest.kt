import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class PrisonerTest {

    @Test
    fun prisonerKnowsHeHasBeenCalledByTheWarden(){
        val prisoner = Prisoner()
        val warden = Warden()
        assertFalse(prisoner.hasVisitedWarden)
        warden.summon(prisoner)
        assertTrue(prisoner.hasVisitedWarden)
    }

    @Test
    fun pullTheRightLeverIfNew(){
        val prisoner = Prisoner()
        val warden = Warden()
        warden.summon(prisoner)
        assertTrue(warden.rightLeverPulled)
    }

    @Test
    fun pullTheLeftLeverIfRightAlreadyPulled(){
        val prisoner = Prisoner()
        val warden = Warden()
        warden.rightLeverPulled = true
        warden.summon(prisoner)
        assertTrue(warden.leftLeverPulled)
    }

    @Test
    fun pullTheLeftLeverIfPulledRightBefore(){
        val prisoner = Prisoner()
        val warden = Warden()
        warden.summon(prisoner)
        assertTrue(warden.rightLeverPulled)
        warden.rightLeverPulled = false
        warden.summon(prisoner)
        assertTrue(warden.leftLeverPulled)
    }


}