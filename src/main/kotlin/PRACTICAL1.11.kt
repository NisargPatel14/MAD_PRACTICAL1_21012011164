class Matrix(private val data: Array<DoubleArray>) {
    val rows: Int = data.size
    val cols: Int = if (rows > 0) data[0].size else 0
    operator fun plus(other: Matrix): Matrix {
        if (rows != other.rows || cols != other.cols)
            throw IllegalArgumentException("Matrix dimensions do not match for addition")

        val resultData = Array(rows) { DoubleArray(cols) }
        for (i in 0 until rows) {
            for (j in 0 until cols) {
                resultData[i][j] = this.data[i][j] + other.data[i][j]
            }
        }
        return Matrix(resultData)
    }
    operator fun minus(other: Matrix): Matrix {
        if (rows != other.rows || cols != other.cols)
            throw IllegalArgumentException("Matrix dimensions do not match for subtraction")

        val resultData = Array(rows) { DoubleArray(cols) }
        for (i in 0 until rows) {
            for (j in 0 until cols) {
                resultData[i][j] = this.data[i][j] - other.data[i][j]
            }
        }
        return Matrix(resultData)
    }
    operator fun times(other: Matrix): Matrix {
        if (cols != other.rows)
            throw IllegalArgumentException("Matrix dimensions do not match for multiplication")

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
    val firstMatrixData = arrayOf(doubleArrayOf(1.0, 2.0, 3.0), doubleArrayOf(4.0, 5.0, 6.0))
    val secondMatrixData = arrayOf(doubleArrayOf(-2.0, 5.0, 3.0), doubleArrayOf(-9.0, 0.0, 4.0), doubleArrayOf(3.0, 9.0, 5.0))
    val secondMatrix1Data = arrayOf(doubleArrayOf(-9.0, 0.0, 3.0), doubleArrayOf(0.0, 4.0, 9.0), doubleArrayOf(9.0, 5.0, 4.0))

    val firstMatrix = Matrix(firstMatrixData)
    val secondMatrix = Matrix(secondMatrixData)
    val secondMatrix1 = Matrix(secondMatrix1Data)

    println("Matrix 1:")
    println(firstMatrix)

    println("Matrix 2:")
    println(secondMatrix)

    val thirdMatrix = secondMatrix1 + secondMatrix
    println("Addition:")
    println(thirdMatrix)

    println("Matrix 2:")
    println(secondMatrix)

    val subtractMatrix = secondMatrix1 - secondMatrix
    println("Subtraction:")
    println(subtractMatrix)

    println("Matrix 1:")
    println(firstMatrix)

    println("Matrix 2:")
    println(secondMatrix)

    val multiplication = firstMatrix * secondMatrix
    println("Multiplication:")
    println(multiplication)
}

