import org.junit.Assert.*
import org.junit.Test
import java.io.ByteArrayOutputStream
import java.io.PrintStream

class MainKtTest {

    @Test
    fun calculateCommission() {
        val MAX_SUM_DAY = 150000.0
        val MAX_SUM_MONTH = 600000.0
        var commission = 0.0
        val selectedCard = 1
        val inputAmount = 4000
        val totalSum = 10000

        val outputStream = ByteArrayOutputStream()
        val printStream = PrintStream(outputStream)
        val originalOut = System.out

        System.setOut(printStream)

        when (selectedCard) {
            1 -> {
                if (inputAmount < MAX_SUM_DAY && (totalSum + inputAmount) < MAX_SUM_MONTH) {
                    commission = 0.0
                    println("Комиссия составляет: ${commission.toInt()}")
                } else {
                    println("Лимит превышен")
                }
            }

            2 -> {
                if (inputAmount < MAX_SUM_DAY && (totalSum + inputAmount) < MAX_SUM_MONTH) {
                    commission = 0.0
                    println("Комиссия составляет: ${commission.toInt()}")
                } else {
                    println("Лимит превышен")
                }
            }

            3 -> {
                if (inputAmount < MAX_SUM_DAY && (totalSum + inputAmount) < MAX_SUM_MONTH) {
                    if (commission < 35.0) {
                        print("Ваша комиссия составляет: ${(commission).toInt()}")
                    }
                } else {
                    println("Лимит превышен")
                }
            }

            4 -> {
                if (inputAmount < MAX_SUM_DAY && totalSum < MAX_SUM_MONTH) {
                    if (commission < 35.0) {
                        print("Ваша комиссия составляет: ${(commission).toInt()}")
                    }
                    print("Комиссия составляет: ${(commission).toInt()}")
                } else {
                    println("Лимит превышен")
                }
            }

            5 -> println("Комиссия отсутствует")
        }
        val expectedOutput = "Комиссия составляет: 0"
        val output = outputStream.toString().trim()

        assertEquals(expectedOutput, output)

        System.setOut(originalOut)
    }
}