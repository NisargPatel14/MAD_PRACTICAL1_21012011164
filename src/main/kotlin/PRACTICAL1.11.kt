class Matrix(private val data: Array<DoubleArray>) {
    val rows: Int = data.size
    val cols: Int = if (rows > 0) data[0].size else 0
    operator fun plus(other: Matrix): Matrix {
        val resultData = Array(rows) { DoubleArray(cols) }
        for (i in 0 until rows) {
            for (j in 0 until cols) {
                resultData[i][j] = this.data[i][j] + other.data[i][j]
            }
        }
        return Matrix(resultData)
    }
     operator fun minus(other: Matrix): Matrix {
        val resultData = Array(rows) { DoubleArray(cols) }
        for (i in 0 until rows) {
            for (j in 0 until cols) {
                resultData[i][j] = this.data[i][j] - other.data[i][j]
            }
        }
        return Matrix(resultData)
    }
      operator fun times(other: Matrix): Matrix {
        val resultData = Array(rows) { DoubleArray(other.cols) }
        for (i in 0 until rows) {
            for (j in 0 until other.cols) {
                for (k in 0 until cols) {
                    resultData[i][j] += this.data[i][k] * other.data[k][j]
                }
            }
        }
        return Matrix(resultData)
    }
    override fun toString(): String {
        val sb = StringBuilder()
        sb.append("( $rows x $cols matrix):\n")
        for (i in 0 until rows) {
            for (j in 0 until cols) {
                sb.append(data[i][j])
                sb.append(" ")
            }
            sb.append("\n")
        }
        return sb.toString()
    }
}
fun main() {
    val firstMatrixData = arrayOf(doubleArrayOf(1.0, 2.0, 3.0), doubleArrayOf(4.0, 5.0, 6.0),doubleArrayOf(7.0, 8.0, 9.0))
    val secondMatrixData = arrayOf(doubleArrayOf(-2.0, 5.0, 3.0), doubleArrayOf(-9.0, 0.0, 4.0), doubleArrayOf(3.0, 9.0, 5.0))

    val firstMatrix = Matrix(firstMatrixData)
    val secondMatrix = Matrix(secondMatrixData)

    print("Matrix 1:\t")
    print(firstMatrix)

    print("Matrix 2:\t")
    print(secondMatrix)

    val addMatrix = firstMatrix + secondMatrix
    print("Addition:\t")
    print(addMatrix)

    val subMatrix = firstMatrix - secondMatrix
    print("Subtraction:\t")
    print(subMatrix)

    val multMatrix = firstMatrix * secondMatrix
    print("Multiplication:\t")
    print(multMatrix)
}

