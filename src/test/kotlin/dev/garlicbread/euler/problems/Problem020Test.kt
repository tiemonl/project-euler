package dev.garlicbread.euler.problems

import com.google.common.truth.Truth
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("Project Euler Problem 20")
internal class Problem020Test {

    @Test
    @DisplayName("Example Input 1")
    fun `Matches example 1`() {
        val answer = Problem020(problemInput = 10).solveProblem()
        Truth.assertThat(answer).isEqualTo(27)
    }

    @Test
    @DisplayName("Actual Input")
    fun `Matches Actual`() {
        val answer = Problem020().solveProblem()
        Truth.assertThat(answer).isEqualTo(648)
    }
}

