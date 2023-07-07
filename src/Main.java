// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

//        SanPham sp1 = new SanPham();
//        SanPham sp2 = new SanPham();
//
//        System.out.println("Nhập thông tin sản phẩm 1:");
//        sp1.nhap();
//        System.out.println("Nhập thông tin sản phẩm 2:");
//        sp2.nhap();
//
//        System.out.println("Thông tin của sản phẩm 1: ");
//        sp1.xuat();
//        System.out.println("Thông tin của sản phẩm 2: ");
//        sp2.xuat();


        //BÀI 3: Viết chương trình tạo 2 sản phẩm có giảm giá và không giảm giá
        //sau đó xuất  thông tin 2 sản phẩm ra màn hình
        SanPham sp3 = new SanPham();
        SanPham sp4 = new SanPham(sp3.getTenSp(), sp3.getDonGia());
        System.out.println("Nhập thông tin sản phẩm 3:");
        sp3.nhap();
        System.out.println("Nhập thông tin sản phẩm 4:");
        sp4.nhapKoGiamGia();

        System.out.println("Thông tin của sản phẩm 3: ");
        sp3.xuat();
        System.out.println("Thông tin của sản phẩm 4: ");
        sp4.xuat();
    }
}
