package dev.garlicbread.euler.problems

import com.google.common.truth.Truth
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("Project Euler Problem 19")
internal class Problem019Test {

    @Test
    @DisplayName("Actual Input")
    fun `Matches Actual`() {
        val answer = Problem019().solveProblem()
        Truth.assertThat(answer).isEqualTo(171)
    }
}

