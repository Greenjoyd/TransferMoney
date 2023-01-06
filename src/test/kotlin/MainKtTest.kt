import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun calculation_VK_PAY() {
        val amount = 10000
        val typeOfCard = "VK Pay"

        val result = calculation(typeOfCard, amount)

        assertEquals(10000, result)
    }
    @Test
    fun calculation_Visa() {
        val amount = 20000
        val typeOfCard = "Visa"

        val result = calculation(typeOfCard, amount)

        assertEquals(20000, result)
    }
    @Test
    fun calculation_Mir() {
        val amount = 30000
        val typeOfCard = "Мир"

        val result = calculation(typeOfCard, amount)

        assertEquals(30000, result)
    }
    @Test
    fun calculation_MasterCard() {
        val amount = 30000
        val typeOfCard = "Mastercard"

        val result = calculation(typeOfCard, amount)

        assertEquals(30000, result)
    }    @Test
    fun calculation_Maestro() {
        val amount = 40000
        val typeOfCard = "Maestro"

        val result = calculation(typeOfCard, amount)

        assertEquals(40000, result)
    }

}
