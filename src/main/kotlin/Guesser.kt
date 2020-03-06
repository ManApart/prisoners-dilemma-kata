class Guesser : Prisoner() {
    override fun visit(warden: Warden) {
        if (warden.rightLeverPulled) {
            warden.pullRightLever()
        } else {
            warden.pullLeftLever()
        }
    }
}