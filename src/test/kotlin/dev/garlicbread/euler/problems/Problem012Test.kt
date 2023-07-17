package dev.garlicbread.euler.problems

import com.google.common.truth.Truth
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("Project Euler Problem 12")
internal class Problem012Test {

    @Test
    @DisplayName("Example Input 1")
    fun `Matches example 1`() {
        val answer = Problem012(problemInput = 5).solveProblem()
        Truth.assertThat(answer).isEqualTo(28)
    }

    @Test
    @DisplayName("Actual Input")
    fun `Matches Actual`() {
        val answer = Problem012().solveProblem()
        Truth.assertThat(answer).isEqualTo(76576500)
    }
}
