// main function
fun main() {
    val officeOpen = 22
    val officeClosed = 16
    val now = 20

    val isOpen = now >= officeOpen && now <= officeClosed

    print("Office is open : $isOpen")
}