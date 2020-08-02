fun main() {
    println("Hello kotlin\nthis is my first kotlin program !!")

    var count: Int = 10
    println("count = " + count)

    count = 15
    println("count = " + count)

    var langName: String = "Kotlin"
    println("language name is " + langName)

    var langUpper = langName.toUpperCase()
    println("language Upper is " + langUpper)

    var langNull2: String? = null
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
}