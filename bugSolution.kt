fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    val toRemove = mutableListOf<Int>()
    for (element in list) {
        if (element > 2) {
            toRemove.add(element)
        }
    }
    list.removeAll(toRemove)
    println(list) // Output: [1, 2]

    val map = mutableMapOf("a" to 1, "b" to 2, "c" to 3)
    val entriesToRemove = mutableListOf<Map.Entry<String, Int>>()
    for (entry in map.entries) {
        if (entry.value > 2) {
            entriesToRemove.add(entry)
        }
    }
    map.entries.removeAll(entriesToRemove)
    println(map) // Output: {a=1, b=2}
}
