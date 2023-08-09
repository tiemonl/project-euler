package dev.garlicbread.euler.problems

import com.google.common.truth.Truth
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("Project Euler Problem 22")
internal class Problem022Test {

    @Test
    @DisplayName("Example Input 1")
    fun `Matches example 1`() {
        val answer = Problem022(problemInput = TODO()).solveProblem()
        Truth.assertThat(answer).isEqualTo(TODO())
    }

    @Test
    @DisplayName("Actual Input")
    fun `Matches Actual`() {
        val answer = Problem022().solveProblem()
        Truth.assertThat(answer).isEqualTo(TODO())
    }
}

