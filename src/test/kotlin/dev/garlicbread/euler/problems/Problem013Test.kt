package dev.garlicbread.euler.problems

import com.google.common.truth.Truth
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("Project Euler Problem 13")
internal class Problem013Test {

    @Test
    @DisplayName("Actual Input")
    fun `Matches Actual`() {
        val answer = Problem013().solveProblem()
        Truth.assertThat(answer).isEqualTo(5537376230)
    }
}
