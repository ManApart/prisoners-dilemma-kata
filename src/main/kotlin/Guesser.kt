class Guesser(val prisonerCount: Int) : Prisoner() {
    private var visitedCount = 1

    override fun visit(warden: Warden) {
        when {
            visitedCount == prisonerCount -> {
                warden.guess()
            }
            warden.rightLeverPulled -> {
                warden.pullRightLever()
                visitedCount++
            }
            else -> {
                warden.pullLeftLever()
            }
        }
        hasVisitedWarden = true
    }
}