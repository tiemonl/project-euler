package dev.garlicbread.euler.problems

import com.google.common.truth.Truth
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("Project Euler Problem 6")
internal class Problem006Test {

    @Test
    @DisplayName("Example Input 1")
    fun `Matches example 1`() {
        val answer = Problem006(problemInput = 10).solveProblem()
        Truth.assertThat(answer).isEqualTo(2640)
    }

    @Test
    @DisplayName("Actual Input")
    fun `Matches Actual`() {
        val answer = Problem006().solveProblem()
        Truth.assertThat(answer).isEqualTo(25164150)
    }
}
