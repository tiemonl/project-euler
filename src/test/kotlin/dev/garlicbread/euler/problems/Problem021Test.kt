package dev.garlicbread.euler.problems

import com.google.common.truth.Truth
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("Project Euler Problem 21")
internal class Problem021Test {

    @Test
    @DisplayName("Example Input 1")
    fun `Matches example 1`() {
        val answer = Problem021(problemInput = 1000).solveProblem()
        Truth.assertThat(answer).isEqualTo(504)
    }

    @Test
    @DisplayName("Actual Input")
    fun `Matches Actual`() {
        val answer = Problem021().solveProblem()
        Truth.assertThat(answer).isEqualTo(31626)
    }
}

