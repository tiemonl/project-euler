package dev.garlicbread.euler.problems

import com.google.common.truth.Truth
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("Project Euler Problem 23")
internal class Problem023Test {

    @Test
    @DisplayName("Actual Input")
    fun `Matches Actual`() {
        val answer = Problem023().solveProblem()
        Truth.assertThat(answer).isEqualTo(4179871)
    }
}
