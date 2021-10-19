import org.gradle.api.services.BuildService
import org.gradle.api.services.BuildServiceParameters

abstract class BuildSrcBuildService implements BuildService<BuildServiceParameters.None> {
    void customFunction() {
        println("BuildSrcBuildService.customFunction()")
    }
}
