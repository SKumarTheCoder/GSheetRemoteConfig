import com.github.theapache64.fig.Fig

suspend fun main() {
    val fig = Fig()
    try {
        fig.init(
            sheetUrl = "https://docs.google.com/spreadsheets/d/1LD1Su7HVzAxPlbRp9MO7lni2E5SOqfAsLMCd1FC9A8s/edit?usp=sharing"
        )
    }catch (e : Exception) {
        e.printStackTrace()
    }

    println("Fruit is '${fig.getValue("fruit", null)}'")
}