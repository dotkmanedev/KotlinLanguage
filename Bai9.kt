fun main() {
    var dtb = 0.0f;
    print("nhap vao diem dtb");
    dtb = readLine()!!.toFloat();
    print("$dtb");
    if (dtb > 8 && dtb < 10) {
        print("Gioi");
    }
    else if (dtb < 8 && dtb > 6) {
        print("kha qua");
    }
    else if (dtb < 6 && dtb > 5) {
        print("cung duoc")
    };

// check

    var a : Int ?= readLine()!!.toInt();
    if (a != null) {
        if (a % 2 == 0) {
            print("so chan");
        }
        else {
            print("so le");
        }
    }



}