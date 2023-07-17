package dev.garlicbread.euler.problems

import com.google.common.truth.Truth
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("Project Euler Problem 14")
internal class Problem014Test {

    @Test
    @DisplayName("Example Input 1")
    fun `Matches example 1`() {
        val answer = Problem014(problemInput = 15).solveProblem()
        Truth.assertThat(answer).isEqualTo(9)
    }

    @Test
    @DisplayName("Actual Input")
    fun `Matches Actual`() {
        val answer = Problem014().solveProblem()
        Truth.assertThat(answer).isEqualTo(837799)
    }
}
