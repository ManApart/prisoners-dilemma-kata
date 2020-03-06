class Prisoner {
    var hasVisitedWarden = false

    fun visit(warden: Warden) {
        warden.pullRightLever()
        hasVisitedWarden = true
    }

}
