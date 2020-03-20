import org.gradle.api.artifacts.dsl.DependencyHandler
import org.gradle.kotlin.dsl.project

interface Applicable {
    fun DependencyHandler.apply()
}

fun DependencyHandler.apply(applicable: Applicable) = with(applicable) { apply() }

class ApplicableProject(
    private val path: String
): Applicable {
    override fun DependencyHandler.apply() {
        implementation(project(path))
    }
}