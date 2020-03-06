import org.junit.Assert.assertFalse
import org.junit.Test

class PrisonerTest {

    @Test
    fun prisonerKnowsHeHasntBeenCalledByTheWarden(){
        val prisoner = Prisoner()
        assertFalse(prisoner.hasVisitedWarden)
    }

}