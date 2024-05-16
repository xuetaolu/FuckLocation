package fuck.location.app.ui.models

class FakeLocation(
    val x: Double,
    val y: Double,
//    val offset:Double,

    val eci: Int,
    val pci: Int,
    val tac: Int,
    val earfcn: Int,
    val bandwidth: Int,
    val x_bais : Double,
    val y_bais : Double,
)

// Used for migrate from older version
class FakeLocationHistory(
    val x: Double,
    val y: Double,
)