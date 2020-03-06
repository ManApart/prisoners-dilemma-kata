import junit.framework.Assert.assertEquals
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


}