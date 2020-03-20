
object Version {
    val targetSdkVersion = 29
    val compileSdkVersion = 29
    val minSdkVersion = 21

    private val versionMajor = 1
    private val versionMinor = 1
    private val versionPatch = 0
    private val versionOffset = 0
    val versionCode =
        ((1 + versionMajor) * 10000 + versionMinor * 100 + versionPatch) * 100 + versionOffset

    val versionName = "$versionMajor.$versionMinor.$versionPatch"
}