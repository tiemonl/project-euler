package dev.garlicbread.euler.problems

import com.google.common.truth.Truth
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("Project Euler Problem 10")
internal class Problem010Test {

    @Test
    @DisplayName("Example Input 1")
    fun `Matches example 1`() {
        val answer = Problem010(problemInput = 10).solveProblem()
        Truth.assertThat(answer).isEqualTo(17)
    }

    @Test
    @DisplayName("Actual Input")
    fun `Matches Actual`() {
        val answer = Problem010().solveProblem()
        Truth.assertThat(answer).isEqualTo(142913828922)
    }
}
