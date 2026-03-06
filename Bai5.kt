fun main() {
    //toan tu logic
    var i = 7;
    //kiem tra so i co thoa man lon hon 0 va nho hon 10 hay kh
    println(i > 0 && i < 10);
    //
    println(i > 7 || i < 10);
    // phep dao
    println(!(i > 7 || i < 10));

    //phương thức
    println((i > 0).and(i < 10));
    // tăng, giảm
//   var x =  i.inc();
    //
    var x = 1;
    var y = 2;
    var z = x++ - ++y + 1;
    println("x= " +x);
    println("y= " +y);
    println("z= " +z);
}