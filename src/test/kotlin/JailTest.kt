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

    
}