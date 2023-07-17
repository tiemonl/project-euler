package dev.garlicbread.euler.problems

import com.google.common.truth.Truth
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("Project Euler Problem 3")
internal class Problem003Test {

    @Test
    @DisplayName("Example Input 1")
    fun `Matches example 1`() {
        val answer = Problem003(problemInput = 13195).solveProblem()
        Truth.assertThat(answer).isEqualTo(29)
    }

    @Test
    @DisplayName("Actual Input")
    fun `Matches Actual`() {
        val answer = Problem003().solveProblem()
        Truth.assertThat(answer).isEqualTo(6857)
    }
}
