public class SanPham {
    private String ma;
    private String ten;
    private double gia;

    private static int dem = 0;

    // ⚡ Khối khởi tạo — chạy mỗi khi tạo đối tượng
    {
        dem++;
        ma = String.format("SP%05d", dem);
    }

    // Constructor 1: chỉ tên
    public SanPham(String ten) {
        this.ten = ten;
        this.gia = 0.0;
    }

    // Constructor 2: tên + giá
    public SanPham(String ten, double gia) {
        this.ten = ten;
        this.gia = gia;
    }

    // In thông tin sản phẩm
    public void show() {
        System.out.println("Mã sản phẩm: " + ma);
        System.out.println("Tên sản phẩm: " + ten);

        // ✅ Nếu giá <= 0 thì coi như không hợp lệ hoặc chưa có giá
        if (gia <= 0.0)
            System.out.println("Giá sản phẩm: (chưa có hoặc không hợp lệ)");
        else
            System.out.println("Giá sản phẩm: " + gia + " triệu");

        System.out.println();
    }

    // Trả tổng số sản phẩm
    public static int getDem() {
        return dem;
    }
}
