fun main()
{
    val laptops = listOf(
        Laptop("hp", 2000),
        Laptop("lenovo", 3000),
        Laptop("dell", 5000),
        Laptop("hp", 7000),
        Laptop("mac", 10000),
        Laptop("asus", 4500),
        Laptop("acer", 3500),
        Laptop("msi", 8000),
        Laptop("samsung", 6000),
        Laptop("huawei", 5500),
        Laptop("toshiba", 4000),
        Laptop("razer", 12000),
        Laptop("microsoft", 9000),
        Laptop("lg", 6500),
        Laptop("hp", 1000),
        Laptop("lenovo", 18000),
        Laptop("dell", 25000),
        Laptop("asus", 30000),
        Laptop("apple", 45000),
        Laptop("macbook", 60000)
    )


    val mychoice = laptops
        .filter { it.price <= 5000 && it.nameOflaptop == "hp" }
        .map { "I wanna buy this one ${it.nameOflaptop}" }
println(mychoice)

}
