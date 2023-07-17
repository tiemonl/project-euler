package dev.garlicbread.euler.problems

import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("Project Euler Problem 16")
internal class Problem016Test {
    @Test
    @DisplayName("Example Input 1")
    fun `Matches example 1`() {
        val answer = Problem016(problemInput = 15).solveProblem()
        assertThat(answer).isEqualTo(26)
    }

    @Test
    @DisplayName("Actual Input")
    fun `Matches Actual`() {
        val answer = Problem016().solveProblem()
        assertThat(answer).isEqualTo(1366)
    }
}
