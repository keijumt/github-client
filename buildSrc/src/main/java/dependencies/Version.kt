object Version {
    const val targetSdkVersion = 29
    const val compileSdkVersion = 29
    const val minSdkVersion = 21

    private const val versionMajor = 1
    private const val versionMinor = 1
    private const val versionPatch = 0
    private const val versionOffset = 0
    const val versionCode =
        ((1 + versionMajor) * 10000 + versionMinor * 100 + versionPatch) * 100 + versionOffset

    const val versionName = "$versionMajor.$versionMinor.$versionPatch"
}