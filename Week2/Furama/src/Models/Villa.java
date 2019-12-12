package Models;

public class Villa extends Services {
    private String tieuChuanPhong;
    private String moTaTienNghi;
    private String dienTichHoBoi;
    private int soTang;

    public Villa() {

    }

    public Villa(String tieuChuanPhong, String moTaTienNghi, String dienTichHoBoi, int soTang) {
        this.tieuChuanPhong = tieuChuanPhong;
        this.moTaTienNghi = moTaTienNghi;
        this.dienTichHoBoi = dienTichHoBoi;
        this.soTang = soTang;
    }

    public Villa(String id, String tenDichVu, double dienTichSuDung, double chiPhithue, int soLuongNguoiToiDa, String kieuThue, String tieuChuanPhong, String moTaTienNghi, String dienTichHoBoi, int soTang) {
        super ( id, tenDichVu, dienTichSuDung, chiPhithue, soLuongNguoiToiDa, kieuThue );
        this.tieuChuanPhong = tieuChuanPhong;
        this.moTaTienNghi = moTaTienNghi;
        this.dienTichHoBoi = dienTichHoBoi;
        this.soTang = soTang;
    }

    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public String getMoTaTienNghi() {
        return moTaTienNghi;
    }

    public void setMoTaTienNghi(String moTaTienNghi) {
        this.moTaTienNghi = moTaTienNghi;
    }

    public String getDienTichHoBoi() {
        return dienTichHoBoi;
    }

    public void setDienTichHoBoi(String dienTichHoBoi) {
        this.dienTichHoBoi = dienTichHoBoi;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    @Override
    public String showInfo() {
        return "Service: Villa" +
                "\n-------------" +
                "\nID: " + super.getId () +
                "\nTên dịch vụ: " + super.getTenDichVu () +
                "\nDiện tích sử dụng: " + super.getDienTichSuDung () +
                "\nChi phí thuê: " + super.getChiPhithue () +
                "\nSố lượng người tối đa: " + super.getSoLuongNguoiToiDa () +
                "\nKiểu thuê: " + super.getKieuThue () +
                "\nTiêu chuẩn phòng: " + this.getTieuChuanPhong () +
                "\nMô tả tiện nghi: "+this.getMoTaTienNghi ()+
                "\nDiện tích hồ bơi: "+this.getDienTichHoBoi ()+
                "\nSố tầng: "+this.getSoTang ()+
                "\n-------------" ;
    }

}
