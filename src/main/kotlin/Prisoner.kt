open class Prisoner {
    var hasVisitedWarden = false
    private var hasPulledRightLeverBefore = false

    open fun visit(warden: Warden) {
        if (!warden.rightLeverPulled && !hasPulledRightLeverBefore) {
            warden.pullRightLever()
            hasPulledRightLeverBefore = true
        } else {
            warden.pullLeftLever()
        }
        hasVisitedWarden = true
    }

}
