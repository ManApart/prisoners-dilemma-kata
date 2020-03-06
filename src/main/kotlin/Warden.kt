class Warden(val prisoners: List<Prisoner> = listOf()) {

    var rightLeverPulled = false
    var leftLeverPulled = false

    fun summon(prisoner: Prisoner) {
        prisoner.visit(this)
    }

    fun pullRightLever() {
        rightLeverPulled = !rightLeverPulled
    }

    fun pullLeftLever() {
        leftLeverPulled = !leftLeverPulled
    }
}