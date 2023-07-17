package dev.garlicbread.euler.problems

import com.google.common.truth.Truth
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("Project Euler Problem 7")
internal class Problem007Test {

    @Test
    @DisplayName("Example Input 1")
    fun `Matches example 1`() {
        val answer = Problem007(problemInput = 6).solveProblem()
        Truth.assertThat(answer).isEqualTo(13)
    }

    @Test
    @DisplayName("Actual Input")
    fun `Matches Actual`() {
        val answer = Problem007().solveProblem()
        Truth.assertThat(answer).isEqualTo(104743)
    }
}
