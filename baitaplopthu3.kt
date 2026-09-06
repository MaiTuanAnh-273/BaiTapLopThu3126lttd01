fun main() {
    println("Mai Tuấn Anh")
    println("2415141122125")
    println("126LTTD01")
    println("Nhập số math:")
    val math = readln().toDouble()
    println("Nhập số programming:")
    val programming = readln().toDouble()
    println("Nhập số english:")
    val english = readln().toDouble()
    val tong=math+programming+english
    val dtb=tong/3
    val diemcaonhat=maxOf(math,english,programming)
    println("Tổng điểm là:"+tong)
    println("Điểm trung bình là:"+dtb)
    println("Điểm cao nhất là:"+diemcaonhat)
    if(dtb>=5)
        println("Sinh viên đạt")
    else
        println("Sinh viên không đặt")
}