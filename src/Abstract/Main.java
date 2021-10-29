package Abstract;

public class Main {
    public static void main(String[] args) {
        ToaDo td1 = new ToaDo(5, 5);
        ToaDo td2 = new ToaDo(10, 12);

        Hinh h1 = new HinhTron(td1, 10);
        Hinh h2 = new HinhChuNhat(td2, 10, 6 );
        System.out.println("Diện tích hình chữ nhật: "+ h2.TinhDienTich());
        System.out.println("Diện tích hình tròn: "+ h1.TinhDienTich());
    }
}
