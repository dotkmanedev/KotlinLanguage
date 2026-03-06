fun main(args: Array<String>) {
    var a = """
tôi chăm học
tôi học giỏi
tôi ăn nhanh
 """;
    var dem =  0;

    var lst = a.split(" ");
    for (i in lst) {
        print(i);
        if (i.contains("tôi")) {
            dem++;
        }
    }
    print(dem);
}