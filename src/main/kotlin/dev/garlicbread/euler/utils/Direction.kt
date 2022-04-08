package dev.garlicbread.euler.utils

enum class Direction(val point: Point) {
    North(Point(0, 1)),
    NorthEast(Point(1, 1)),
    NorthWest(Point(-1, 1)),
    East(Point(1, 0)),
    South(Point(0, -1)),
    SouthEast(Point(1, -1)),
    SouthWest(Point(-1, -1)),
    West(Point(-1, 0));
}
