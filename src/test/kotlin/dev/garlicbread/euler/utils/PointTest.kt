package dev.garlicbread.euler.utils

import com.google.common.truth.Truth
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("Point class tests")
class PointTest {

    @Test
    @DisplayName("GIVEN a point, WHEN adding another point, THEN a new point should have both values added")
    fun plus() {
        Truth.assertThat(Point(0, 0) + Point(1, 1)).isEqualTo(Point(1, 1))
    }

    @Test
    @DisplayName("GIVEN a point, WHEN adding another point, THEN a new point should have both values multiplied")
    fun times() {
        Truth.assertThat(Point(0, 0) * Point(1, 1)).isEqualTo(Point(0, 0))
        Truth.assertThat(Point(4, 0) * Point(9, 1)).isEqualTo(Point(36, 0))
    }

    @Test
    @DisplayName("GIVEN a point, WHEN subtracting another point, THEN a new point should have subtracted from other point")
    fun minus() {
        Truth.assertThat(Point(0, 0) - Point(1, 1)).isEqualTo(Point(-1, -1))
    }

    @Test
    @DisplayName("GIVEN a point, WHEN adding another point, THEN a new point should have both values added")
    fun timesInt() {
        Truth.assertThat(Point(1, 1) * 8).isEqualTo(Point(8, 8))
        Truth.assertThat(Point(-1, 1) * 8).isEqualTo(Point(-8, 8))
    }

    @Test
    @DisplayName("GIVEN a point, WHEN move North, THEN point should move y +1")
    fun moveNorth() {
        Truth.assertThat(Point(1, 1).move(Direction.North)).isEqualTo(Point(1, 2))
    }

    @Test
    @DisplayName("GIVEN a point, WHEN move South, THEN point should move y -1")
    fun moveSouth() {
        Truth.assertThat(Point(1, 1).move(Direction.South)).isEqualTo(Point(1, 0))
    }

    @Test
    @DisplayName("GIVEN a point, WHEN move East, THEN point should move x +1")
    fun moveEast() {
        Truth.assertThat(Point(1, 1).move(Direction.East)).isEqualTo(Point(2, 1))
    }

    @Test
    @DisplayName("GIVEN a point, WHEN move West, THEN point should move x -1")
    fun moveWest() {
        Truth.assertThat(Point(1, 1).move(Direction.West)).isEqualTo(Point(0, 1))
    }

    @Test
    @DisplayName("GIVEN a point, WHEN move North East, THEN point should move x +1, y +1")
    fun moveNorthEast() {
        Truth.assertThat(Point(1, 1).move(Direction.NorthEast)).isEqualTo(Point(2, 2))
    }

    @Test
    @DisplayName("GIVEN a point, WHEN move North West, THEN point should move x -1, y +1")
    fun moveNorthWest() {
        Truth.assertThat(Point(1, 1).move(Direction.NorthWest)).isEqualTo(Point(0, 2))
    }

    @Test
    @DisplayName("GIVEN a point, WHEN move South East, THEN point should move x +1, y -1")
    fun moveSouthEast() {
        Truth.assertThat(Point(1, 1).move(Direction.SouthEast)).isEqualTo(Point(2, 0))
    }

    @Test
    @DisplayName("GIVEN a point, WHEN move South West, THEN point should move x -1, y -1")
    fun moveSouthWest() {
        Truth.assertThat(Point(1, 1).move(Direction.SouthWest)).isEqualTo(Point(0, 0))
    }

    @Test
    @DisplayName("GIVEN a point, WHEN move by int x, y, THEN point should move by given values")
    fun testMove() {
        Truth.assertThat(Point(0, 0).move(5, 4)).isEqualTo(Point(5, 4))
        Truth.assertThat(Point(-5, -4).move(5, 4)).isEqualTo(Point(0, 0))
    }

    @Test
    @DisplayName("GIVEN a point, WHEN move by direction and x times, THEN point should move x in given direction")
    fun moveBy() {
        Truth.assertThat(Point(0, 0).moveBy(Direction.North, 10)).isEqualTo(Point(0, 10))
        Truth.assertThat(Point(0, 0).moveBy(Direction.South, 10)).isEqualTo(Point(0, -10))
        Truth.assertThat(Point(0, 0).moveBy(Direction.East, 10)).isEqualTo(Point(10, 0))
        Truth.assertThat(Point(0, 0).moveBy(Direction.West, 10)).isEqualTo(Point(-10, 0))
        Truth.assertThat(Point(0, 0).moveBy(Direction.NorthWest, 10)).isEqualTo(Point(-10, 10))
        Truth.assertThat(Point(0, 0).moveBy(Direction.NorthEast, 10)).isEqualTo(Point(10, 10))
        Truth.assertThat(Point(0, 0).moveBy(Direction.SouthWest, 10)).isEqualTo(Point(-10, -10))
        Truth.assertThat(Point(0, 0).moveBy(Direction.SouthEast, 10)).isEqualTo(Point(10, -10))
    }

    @Test
    @DisplayName("GIVEN a point, WHEN move up, THEN point should move y +1")
    fun up() {
        Truth.assertThat(Point(0, 0).up()).isEqualTo(Point(0, 1))
    }

    @Test
    @DisplayName("GIVEN a point, WHEN move left, THEN point should move x -1")
    fun left() {
        Truth.assertThat(Point(0, 0).left()).isEqualTo(Point(-1, 0))
    }

    @Test
    @DisplayName("GIVEN a point, WHEN move right, THEN point should move x +1")
    fun right() {
        Truth.assertThat(Point(0, 0).right()).isEqualTo(Point(1, 0))
    }

    @Test
    @DisplayName("GIVEN a point, WHEN move down, THEN point should move y -1")
    fun down() {
        Truth.assertThat(Point(0, 0).down()).isEqualTo(Point(0, -1))
    }

    @Test
    @DisplayName("GIVEN a point, WHEN call neighbors without diagonals, THEN should list points up, down, left, and right")
    fun neighborsNonDiagonal() {
        val sut = Point(0, 0).neighbors(diagonal = false)
        Truth.assertThat(sut).hasSize(4)
        Truth.assertThat(sut).containsExactly(
            Point(0, 1),
            Point(1, 0),
            Point(0, -1),
            Point(-1, 0),
        )
    }

    @Test
    @DisplayName("GIVEN a point, WHEN call neighbors with diagonals, THEN should list points all around")
    fun neighborsDiagonal() {
        val sut = Point(0, 0).neighbors(diagonal = true)
        Truth.assertThat(sut).hasSize(8)
        Truth.assertThat(sut).containsExactly(
            Point(1, 0),
            Point(0, 1),
            Point(0, -1),
            Point(-1, 0),
            Point(1, 1),
            Point(-1, 1),
            Point(1, -1),
            Point(-1, -1),
        )
    }
}
