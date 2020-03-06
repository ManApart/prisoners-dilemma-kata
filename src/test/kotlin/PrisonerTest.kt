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

}