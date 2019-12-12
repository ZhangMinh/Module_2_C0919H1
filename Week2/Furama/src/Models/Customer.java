package Models;

public class Customer {
    private String idCus;
    private String hoVaTen;
    private String ngaySinh;
    private String gioiTinh;
    private String soCMND;
    private String soDienThoai;
    private String email;
    private String loaiKhach;
    private String diaChi;
    private Services suDungDichVu;

    public Customer() {
    }

    public Customer(String id, String hoVaTen, String ngaySinh, String gioiTinh, String soCMND,
                    String soDienThoai, String email, String loaiKhach, String diaChi, Services suDungDichVu) {
        this.idCus = id;
        this.hoVaTen = hoVaTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.soCMND = soCMND;
        this.soDienThoai = soDienThoai;
        this.email = email;
        this.loaiKhach = loaiKhach;
        this.diaChi = diaChi;
        this.suDungDichVu = suDungDichVu;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getId() {
        return idCus;
    }

    public void setId(String id) {
        this.idCus = id;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getSoCMND() {
        return soCMND;
    }

    public void setSoCMND(String soCMND) {
        this.soCMND = soCMND;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLoaiKhach() {
        return loaiKhach;
    }

    public void setLoaiKhach(String loaiKhach) {
        this.loaiKhach = loaiKhach;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public Services getSuDungDichVu() {
        return suDungDichVu;
    }

    public void setSuDungDichVu(Services suDungDichVu) {
        this.suDungDichVu = suDungDichVu;
    }

    public String showInfo() {
        return "Customer: Info" +
                "\n-------------" +
                "\nID: " + this.getId () +
                "\nHọ và tên: " + this.getHoVaTen () +
                "\nNgày sinh: " + this.getNgaySinh () +
                "\nGiới tính: " + this.getGioiTinh () +
                "\nSố CMND: " + this.getSoCMND () +
                "\nSố điện thoại: " + this.soDienThoai +
                "\nEmail: " + this.email +
                "\nLoại khách: " + this.loaiKhach +
                "\nĐịa chỉ: " + this.diaChi +
                "\nSử dụng dịch vụ: " + this.suDungDichVu +
                "\n-------------";
    }
}
