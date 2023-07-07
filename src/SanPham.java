import java.util.Scanner;

public class SanPham {
    private String tenSp;
    private Double donGia;

    private Double giamGia;

    public SanPham() {
    }

    public SanPham(String tenSp, Double donGia, Double giamGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    public SanPham(String tenSp, Double donGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
    }

    public double getThueNhapKhau(){
        return donGia*0.1;
    }

    public void xuat(){
        System.out.println("Tên sản phẩm là: "+ tenSp);
        System.out.println("Giá sản phẩm là: "+ donGia);
        System.out.println("Sản phẩm giảm giá: "+ giamGia);
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập tên sản phẩm: ");
        tenSp = sc.nextLine();

        System.out.print("Nhập đơn giá: ");
        donGia = sc.nextDouble();

        System.out.print("Nhập giảm giá: ");
        giamGia = sc.nextDouble();
    }

    public void nhapKoGiamGia(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập tên sản phẩm: ");
        tenSp = sc.nextLine();

        System.out.print("Nhập đơn giá: ");
        donGia = sc.nextDouble();
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public Double getDonGia() {
        return donGia;
    }

    public void setDonGia(Double donGia) {
        this.donGia = donGia;
    }

    public Double getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(Double giamGia) {
        this.giamGia = giamGia;
    }
}
