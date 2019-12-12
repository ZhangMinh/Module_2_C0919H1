package Models;

public class Room extends Services {
    private String dichVuMienPhi;

    public Room() {

    }

    public Room(String dichVuMienPhi) {
        this.dichVuMienPhi = dichVuMienPhi;
    }

    public Room(String id, String tenDichVu, double dienTichSuDung, double chiPhithue, int soLuongNguoiToiDa, String kieuThue, String dichVuMienPhi) {
        super ( id, tenDichVu, dienTichSuDung, chiPhithue, soLuongNguoiToiDa, kieuThue );
        this.dichVuMienPhi = dichVuMienPhi;
    }

    public String getDichVuMienPhi() {
        return dichVuMienPhi;
    }

    public void setDichVuMienPhi(String dichVuMienPhi) {
        this.dichVuMienPhi = dichVuMienPhi;
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
                "\nDịch vụ miễn phí: " + this.getDichVuMienPhi () +
                "\n-------------" ;
    }

}
