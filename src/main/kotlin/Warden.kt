class Warden(val prisoners: List<Prisoner> = listOf()) {

    var rightLeverPulled = false
    var leftLeverPulled = false
    var hasBeenGivenCorrectGuess = false
    private var hasGuessed = false

    fun summon(prisoner: Prisoner) {
        prisoner.visit(this)
    }

    fun pullRightLever() {
        rightLeverPulled = !rightLeverPulled
    }

    fun pullLeftLever() {
        leftLeverPulled = !leftLeverPulled
    }

    fun guess() {
        if (!hasGuessed && prisoners.all { it.hasVisitedWarden }) {
            hasBeenGivenCorrectGuess = true
        }
        hasGuessed = true
    }
}