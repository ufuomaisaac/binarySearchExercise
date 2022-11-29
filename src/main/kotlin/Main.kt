fun main(args: Array<String>) {
    var num = Array(10,{ i -> 1 + i} )
    var input = 9
    val indexOfNum = binarySearch(input, num)

    if (indexOfNum == -1)
        println("ops $input not found in the array")
    else
        println("Eureke! $input is found is in the array ")

}

fun binarySearch(num : Int, arr : Array<Int>) :Int {
    var indexOfNum = -1
    var a = 0
    var b = arr.size - 1

    if (num == arr[a] || num == arr[b]) {
        if (num == arr[a])
            indexOfNum = a
        else if (num == arr[b])
            indexOfNum = b
    } else {
        for (i in 0 .. arr.size - 1) {
            var midIndex = a + (b - a)/2

            if (arr[midIndex] == num)
                indexOfNum = midIndex
            else if (num > arr[midIndex])
                a = midIndex
            else if (num < arr[midIndex]) {
                b = midIndex - 1
            }
        }
    }
    return indexOfNum
}