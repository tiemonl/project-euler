package dev.garlicbread.euler.problems

import com.google.common.truth.Truth
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("Project Euler Problem 1")
internal class Problem001Test {

    @Test
    @DisplayName("Example Input 1")
    fun `Matches example 1`() {
        val answer = Problem001(problemInput = 9L).solveProblem()
        Truth.assertThat(answer).isEqualTo(23)
    }

    @Test
    @DisplayName("Actual Input")
    fun `Matches Actual`() {
        val answer = Problem001().solveProblem()
        Truth.assertThat(answer).isEqualTo(233168)
    }
}
