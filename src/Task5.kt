fun main() {

    print("Nhập kích thước của mảng: ")
    val kichThuoc = readLine()?.toIntOrNull() ?: return


    val mang = IntArray(kichThuoc)

    for (i in mang.indices) {
        print("Nhập phần tử thứ ${i + 1}: ")
        mang[i] = readLine()?.toIntOrNull() ?: 0
    }


    for (i in 0 .. mang.size -1) {
        for (j in 0 until mang.size - 1 ) {
            if (mang[i] < mang[j ]) {
                val temp = mang[j]
                mang[j] = mang[i]
                mang[i] = temp
            }
        }
    }


    println("Mảng sau khi sắp xếp theo thứ tự tăng dần: ${mang.joinToString(", ")}")
}
