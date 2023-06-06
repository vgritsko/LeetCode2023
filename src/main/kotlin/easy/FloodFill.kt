package main.kotlin.easy

class FloodFillSolution {
    fun floodFill(image: Array<IntArray>, sr: Int, sc: Int, color: Int): Array<IntArray> {
        if (image[sr][sc] == color) return image
        val currentColor = image[sr][sc]
        fillPoint(image, sr, sc, newColor = color, currentColor)
        return image
    }

    private fun fillPoint(image: Array<IntArray>, sr: Int, sc: Int, newColor: Int, currentColor: Int) {
        if (sr < 0 || sr >= image.size) return
        if (sc < 0 || sc >= image[0].size) return

        if (image[sr][sc] != currentColor) return

        image[sr][sc] = newColor

        fillPoint(image, sr, sc - 1, newColor, currentColor)
        fillPoint(image, sr, sc + 1, newColor, currentColor)
        fillPoint(image, sr - 1, sc, newColor, currentColor)
        fillPoint(image, sr + 1, sc, newColor, currentColor)
    }
}