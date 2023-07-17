package dev.garlicbread.euler.problems

import com.google.common.truth.Truth
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import java.math.BigInteger

@DisplayName("Project Euler Problem 15")
internal class Problem015Test {

    @Test
    @DisplayName("Example Input 1")
    fun `Matches example 1`() {
        val answer = Problem015(problemInput = 2).solveProblem()
        Truth.assertThat(answer).isEqualTo(BigInteger.valueOf(6))
    }

    @Test
    @DisplayName("Actual Input")
    fun `Matches Actual`() {
        val answer = Problem015().solveProblem()
        Truth.assertThat(answer).isEqualTo(BigInteger.valueOf(137846528820))
    }
}
