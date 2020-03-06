import org.junit.Assert.assertFalse
import org.junit.Test

class WardenTest {

    @Test
    fun wardenStartsWithTwoDownLevers(){
        val warden = Warden()
        assertFalse(warden.rightLeverPulled)
        assertFalse(warden.leftLeverPulled)
    }
}