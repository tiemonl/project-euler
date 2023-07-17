package dev.garlicbread.euler.problems

import com.google.common.truth.Truth
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("Project Euler Problem 11")
internal class Problem011Test {

    @Test
    @DisplayName("Actual Input")
    fun `Matches Actual`() {
        val answer = Problem011().solveProblem()
        Truth.assertThat(answer).isEqualTo(70600674)
    }
}
