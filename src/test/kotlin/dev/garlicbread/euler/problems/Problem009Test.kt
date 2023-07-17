package dev.garlicbread.euler.problems

import com.google.common.truth.Truth
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("Project Euler Problem 9")
internal class Problem009Test {

    @Test
    @DisplayName("Example Input 1")
    fun `Matches example 1`() {
        val answer = Problem009(problemInput = 12).solveProblem()
        Truth.assertThat(answer).isEqualTo(60)
    }

    @Test
    @DisplayName("Actual Input")
    fun `Matches Actual`() {
        val answer = Problem009().solveProblem()
        Truth.assertThat(answer).isEqualTo(31875000)
    }
}
