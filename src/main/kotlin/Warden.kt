class Warden {

    val rightLeverPulled = false
    val leftLeverPulled = false

    fun summon(prisoner: Prisoner) {
        prisoner.visit(this)
    }
}