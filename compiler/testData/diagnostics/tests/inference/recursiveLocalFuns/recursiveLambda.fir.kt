// !WITH_NEW_INFERENCE
fun foo() {
    fun bar() = {
        bar()
    }
}