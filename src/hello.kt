// Android와 Kotlin 기초붙터 배우기
// https://developer.android.com/kotlin/learn

fun main() {
    println("Hello kotlin\nthis is my first kotlin program !!")

    var count: Int = 10
    println("count = " + count)

    count = 15
    println("count = " + count)

    val langName: String = "Kotlin"
    println("language name is " + langName)

    val langUpper = langName.toUpperCase()
    println("language Upper is " + langUpper)

    val langNull2: String? = null
    println("language null is " + langNull2)

    if(count == 42) {
        println("count is " + 42)
    } else {
        println("count is not " + 42)
    }

    val ansString: String = if(count==42) {
        "I have the answer"
    } else if (count > 35) {
        "The answer is close"
    } else {
        "The answer eludes me."
    }
    println(ansString)

    val ansString2 = when {
        count == 42 -> "I have the answer"
        count > 35 -> "The answer is close"
        else -> "The answer eludes me."
    }
    println(ansString2)
}