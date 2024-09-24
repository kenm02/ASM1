fun main() {
    // Nhập kích thước mảng từ người dùng
    print("Nhập kích thước của mảng: ")
    val kichThuoc = readLine()?.toIntOrNull() ?: return

    // Khởi tạo mảng
    val mang = IntArray(kichThuoc)

    // Nhập các phần tử của mảng
    for (i in mang.indices) {
        print("Nhập phần tử thứ ${i + 1}: ")
        mang[i] = readLine()?.toIntOrNull() ?: 0
    }

    // Sắp xếp mảng theo thứ tự tăng dần bằng thuật toán nổi bọt
    for (i in 0 .. mang.size -1) {
        for (j in 0 until mang.size - 1 ) {
            if (mang[i] < mang[j ]) {
                val temp = mang[j]
                mang[j] = mang[i]
                mang[i] = temp
            }
        }
    }

    // In ra mảng đã sắp xếp
    println("Mảng sau khi sắp xếp theo thứ tự tăng dần: ${mang.joinToString(", ")}")
}
