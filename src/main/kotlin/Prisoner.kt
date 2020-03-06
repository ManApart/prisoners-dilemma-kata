class Prisoner {
    var hasVisitedWarden = false

    fun visit(warden: Warden) {
        if (!warden.rightLeverPulled) {
            warden.pullRightLever()
        } else {
            warden.pullLeftLever()
        }
        hasVisitedWarden = true
    }

}
