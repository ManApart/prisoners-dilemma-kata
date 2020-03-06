class Warden {

    var rightLeverPulled = false
    val leftLeverPulled = false

    fun summon(prisoner: Prisoner) {
        prisoner.visit(this)
    }

    fun pullRightLever() {
        rightLeverPulled = true
    }
}