package Models;

public class House extends Services {
    private String tieuChuanPhong;
    private String moTaTienNghi;
    private int soTang;

    public House() {

    }

    public House(String tieuChuanPhong, String moTaTienNghi, int soTang) {
        this.tieuChuanPhong = tieuChuanPhong;
        this.moTaTienNghi = moTaTienNghi;
        this.soTang = soTang;
    }

    public House(String id, String tenDichVu, double dienTichSuDung, double chiPhithue, int soLuongNguoiToiDa, String kieuThue, String tieuChuanPhong, String moTaTienNghi, int soTang) {
        super ( id, tenDichVu, dienTichSuDung, chiPhithue, soLuongNguoiToiDa, kieuThue );
        this.tieuChuanPhong = tieuChuanPhong;
        this.moTaTienNghi = moTaTienNghi;
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

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    @Override
    public String showInfo() {
        return  "Service: Villa" +
                "\n-------------" +
                "\nID: " + super.getId () +
                "\nTên dịch vụ: " + super.getTenDichVu () +
                "\nDiện tích sử dụng: " + super.getDienTichSuDung () +
                "\nChi phí thuê: " + super.getChiPhithue () +
                "\nSố lượng người tối đa: " + super.getSoLuongNguoiToiDa () +
                "\nKiểu thuê: " + super.getKieuThue () +
                "\nTiêu chuẩn phòng: " + this.getTieuChuanPhong () +
                "\nMô tả tiện nghi: "+this.getMoTaTienNghi ()+
                "\nSố tầng: "+this.getSoTang ()+
                "\n-------------" ;
    }

}
