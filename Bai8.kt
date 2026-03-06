import kotlin.math.PI

fun main() {
    //Ép kiểu
    var numstr = "1233";
    println(numstr);
    var num = numstr.toInt();
    println(num);
    print(num::class.java.typeName);
    // nhập liệu từ bàn phím
    // cú pháp
    println("mời cụ nhập vào tên");
    var ten : String ? = readLine();
    println("tên cụ vừa nhập là: "+ten);

    println("mời cụ nhập vào số");
    var s : Int = readLine()!!.toInt();
    println(s);


    //
    println("Mời cậu nhập vào bán kính");
    var a : Int = readLine()!!.toInt();
    println(2 * PI * a);
}