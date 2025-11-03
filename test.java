public class DemoApp {
    public static void main(String[] args) {
        SanPham sp1 = new SanPham("iPhone 7 Plus");
        SanPham sp2 = new SanPham("Galaxy Note 9", 21);
        SanPham sp3 = new SanPham("Lỗi dữ liệu", -5);

        sp1.show();
        sp2.show();
        sp3.show();

        System.out.println("-> Tổng SP: " + SanPham.getDem());
    }
}
