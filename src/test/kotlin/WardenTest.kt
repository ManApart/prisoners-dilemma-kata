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
    fun pullRightLever(){
        val warden = Warden()
        warden.pullRightLever()
        assertTrue(warden.rightLeverPulled)
    }

}