package dev.garlicbread.euler.problems

import com.google.common.truth.Truth
import dev.garlicbread.euler.problems.Problem004.Problem004Input
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("Project Euler Problem 4")
internal class Problem004Test {

    @Test
    @DisplayName("Example Input 1")
    fun `Matches example 1`() {
        val answer = Problem004(problemInput = Problem004Input(upperBound = 99, lowerBound = 10)).solveProblem()
        Truth.assertThat(answer).isEqualTo(9009)
    }

    @Test
    @DisplayName("Actual Input")
    fun `Matches Actual`() {
        val answer = Problem004().solveProblem()
        Truth.assertThat(answer).isEqualTo(906609)
    }
}
