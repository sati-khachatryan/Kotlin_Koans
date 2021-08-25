class PropertyExample() {
    var counter = 0
    var propertyWithCounter: Int? = null
        set (a) {
            field = a
            counter++
        }
}
