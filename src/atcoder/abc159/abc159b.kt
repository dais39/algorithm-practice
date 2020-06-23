package atcoder.abc159

fun main(args: Array<String>) {

    val s = readLine()!!

    if (isPalindrome(s) &&
            isPalindrome(s.substring(0 until ((s.length - 1) / 2))) &&
            isPalindrome(s.substring(((s.length + 3) - 1) / 2 until s.length))) {
        println("Yes")
    } else {
        println("No")
    }

}

fun isPalindrome(s: String) = s == s.reversed()
