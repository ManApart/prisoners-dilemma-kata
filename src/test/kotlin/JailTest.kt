import junit.framework.TestCase.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class JailTest {

    @Test
    fun jailStartsWithAllNonVisitedPrisoners(){
        val jail = Jail(5)
        assertEquals(5, jail.prisoners.size)
        assertTrue(jail.prisoners.none {it.hasVisitedWarden})
    }

    @Test
    fun guesserIsAPrisoner(){
        val jail = Jail(5)

        assertTrue(jail.prisoners.contains(jail.guesser))
    }

    @Test
    fun guesserKnowsPrisonerCount(){
        val jail = Jail(10)
        assertEquals(10, jail.guesser.prisonerCount)
    }

    @Test
    fun wardenHasListOfPrisoners(){
        val jail = Jail(10)
        assertEquals(10, jail.warden.prisoners.size)
    }


}