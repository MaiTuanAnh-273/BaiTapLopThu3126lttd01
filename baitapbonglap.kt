fun main(){
    println("Bài 1:")
    for(i in 1..10)
        println(i)
    println("Bài 2:")
    var sum = 0
    for(i in 1..100)
        sum += i
    println("Tổng ="+sum)
    println("Bài 3:")
    for(i in 1.. 20)
        if(i%2==0)
        println("Các số chia hết cho 2 là:"+i)
}