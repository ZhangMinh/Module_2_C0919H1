package Models;

public abstract class Services {
    private String id;
    private String tenDichVu;
    private double dienTichSuDung;
    private double chiPhithue;
    private int soLuongNguoiToiDa;
    private String kieuThue;

    public Services() {
    }

    public Services(String id, String tenDichVu, double dienTichSuDung, double chiPhithue, int soLuongNguoiToiDa, String kieuThue) {
        this.id = id;
        this.tenDichVu = tenDichVu;
        this.dienTichSuDung = dienTichSuDung;
        this.chiPhithue = chiPhithue;
        this.soLuongNguoiToiDa = soLuongNguoiToiDa;
        this.kieuThue = kieuThue;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public double getDienTichSuDung() {
        return dienTichSuDung;
    }

    public void setDienTichSuDung(double dienTichSuDung) {
        this.dienTichSuDung = dienTichSuDung;
    }

    public double getChiPhithue() {
        return chiPhithue;
    }

    public void setChiPhithue(double chiPhithue) {
        this.chiPhithue = chiPhithue;
    }

    public int getSoLuongNguoiToiDa() {
        return soLuongNguoiToiDa;
    }

    public void setSoLuongNguoiToiDa(int soLuongNguoiToiDa) {
        this.soLuongNguoiToiDa = soLuongNguoiToiDa;
    }

    public String getKieuThue() {
        return kieuThue;
    }

    public void setKieuThue(String kieuThue) {
        this.kieuThue = kieuThue;
    }

    public abstract String showInfo();

    @Override
    public String toString() {
        return "Services{" +
                "id='" + id + '\'' +
                ", tenDichVu='" + tenDichVu + '\'' +
                ", dienTichSuDung=" + dienTichSuDung +
                ", chiPhithue=" + chiPhithue +
                ", soLuongNguoiToiDa=" + soLuongNguoiToiDa +
                ", kieuThue=" + kieuThue +
                '}';
    }
}
