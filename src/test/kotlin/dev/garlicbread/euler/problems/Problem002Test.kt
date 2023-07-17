package dev.garlicbread.euler.problems

import com.google.common.truth.Truth
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("Project Euler Problem 2")
internal class Problem002Test {

    @Test
    @DisplayName("Example Input 1")
    fun `Matches example 1`() {
        val answer = Problem002(problemInput = 100).solveProblem()
        Truth.assertThat(answer).isEqualTo(188)
    }

    @Test
    @DisplayName("Actual Input")
    fun `Matches Actual`() {
        val answer = Problem002().solveProblem()
        Truth.assertThat(answer).isEqualTo(4613732)
    }
}
