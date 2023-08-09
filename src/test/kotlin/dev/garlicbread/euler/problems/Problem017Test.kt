package dev.garlicbread.euler.problems

import com.google.common.truth.Truth
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("Project Euler Problem 17")
internal class Problem017Test {

    @Test
    @DisplayName("Example Input 1")
    fun `Matches example 1`() {
        val answer = Problem017(problemInput = 5).solveProblem()
        Truth.assertThat(answer).isEqualTo(19)
    }

    @Test
    @DisplayName("Actual Input")
    fun `Matches Actual`() {
        val answer = Problem017().solveProblem()
        Truth.assertThat(answer).isEqualTo(21124)
    }
}

