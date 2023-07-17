package dev.garlicbread.euler.problems

import com.google.common.truth.Truth
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("Project Euler Problem 8")
internal class Problem008Test {

    @Test
    @DisplayName("Example Input 1")
    fun `Matches example 1`() {
        val answer = Problem008(problemInput = 4).solveProblem()
        Truth.assertThat(answer).isEqualTo(5832)
    }

    @Test
    @DisplayName("Actual Input")
    fun `Matches Actual`() {
        val answer = Problem008().solveProblem()
        Truth.assertThat(answer).isEqualTo(23514624000)
    }
}
