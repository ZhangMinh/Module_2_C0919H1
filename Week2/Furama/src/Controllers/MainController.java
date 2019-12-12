package Controllers;

import Commons.NameComperator;
import Models.*;
import Views.Main;

import javax.xml.ws.Service;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.*;

public class MainController {

    public void displayMainMenu() {
        Scanner scanner = new Scanner ( System.in );
        int choiceNumber = -1;
        do {
            displayMainMenuMenu ();
            choiceNumber = getChoiceNumberOfMainMenu ( scanner );
        } while ((choiceNumber < 1) || (choiceNumber > 7));
    }

    public void addNewServices() {
        Scanner scanner = new Scanner ( System.in );
        int choiceNumber = -1;
        do {
            addNewServicesMenu ();
            choiceNumber = getChoiceNumberOfService ( scanner );
        } while ((choiceNumber < 1) || (choiceNumber > 5));
    }

    public void showServices() {
        Scanner scanner = new Scanner ( System.in );
        int choiceNumber = -1;
        do {
            showServicesMenu ();
            choiceNumber = getChoiceNumberOfShowService ( scanner );

        } while ((choiceNumber < 1) || (choiceNumber > 5));
    }

    private int getChoiceNumberOfMainMenu(Scanner scanner) {
        int choiceNumber;
        choiceNumber = scanner.nextInt ();
        switch (choiceNumber) {
            case 1:
                addNewServices ();
                break;
            case 2:
                showServices ();
                break;
            case 3:
                addNewCustomer ();
                break;
            case 4:
                showInfomationCustomers ();
                break;
            case 5:
                addNewBookingResort ();
                break;
            case 6:
//                showBookingResort();
                break;
            case 7:
                System.out.println ( "See u later.." );
                System.exit ( 0 ); // thoát chương trình
                break;
        }
        return choiceNumber;
    }

    private int getChoiceNumberOfService(Scanner scanner) {
        int choiceNumber;
        choiceNumber = scanner.nextInt ();
        switch (choiceNumber) {
            case 1:
                addVilla ();
                break;
            case 2:
                addHouse ();
                break;
            case 3:
                addRoom ();
                break;
            case 4:
                displayMainMenu ();
                break;
            case 5:
                System.out.println ( "See u later.." );
                System.exit ( 0 ); // thoát chương trình
                break;
        }
        return choiceNumber;
    }

    private int getChoiceNumberOfBooking(Scanner scanner) {
        int choiceNumber;
        choiceNumber = scanner.nextInt ();
        switch (choiceNumber) {
            case 1:
                addVilla ();
                break;
            case 2:
                addHouse ();
                break;
            case 3:
                addVilla ();
                break;
            case 4:
                displayMainMenu ();
                break;
            case 5:
                System.out.println ( "See u later.." );
                System.exit ( 0 ); // thoát chương trình
                break;
        }
        return choiceNumber;
    }

    private int getChoiceNumberOfShowService(Scanner scanner) {
        int choiceNumber;
        choiceNumber = scanner.nextInt ();
        switch (choiceNumber) {
            case 1:
                showVillas ();
                break;
            case 2:
                showHouses ();
                break;
            case 3:
                showRooms ();
                break;
            case 4:
                displayMainMenu ();
                break;
            case 5:
                System.out.println ( "See u later.." );
                System.exit ( 0 );
                break;
        }
        return choiceNumber;
    }

    public ArrayList<Villa> addVilla() {
        Scanner scanner = new Scanner ( System.in );
        ArrayList<Villa> listVilla = FuncWriteFileCSV.ReadCsvVilla ();
        Services villa = new Villa ();
        villa.setId ( UUID.randomUUID ().toString ().replace ( "-", "" ) );
        String valueStr;
        int valueInt;
        double valueDb;
        Validator check = new Validator ();

        // Input & check tên dịch vụ
        do {
            System.out.println ( "Tên dịch vụ:" );
            valueStr = scanner.nextLine ();
            if (!check.checkTenDichVu ( valueStr )) {
                System.out.println ( "Vui lòng nhập lại" );
            }
        } while (!check.checkTenDichVu ( valueStr ));
        villa.setTenDichVu ( valueStr );

        // Input & check diện tích sử dụng
        do {
            System.out.println ( "Diện tích sử dụng:" );
            valueDb = scanner.nextDouble ();
            if (!check.checkDienTich ( valueDb )) {
                System.out.println ( "Vui lòng nhập lại" );
            }
        } while (!check.checkDienTich ( valueDb ));
        villa.setDienTichSuDung ( valueDb );

        // Input & check chi phí thuê
        do {
            System.out.println ( "Chi phí thuê:" );
            valueDb = scanner.nextDouble ();
            if (!check.checkChiPhiThue ( valueDb )) {
                System.out.println ( "Vui lòng nhập lại" );
            }
        } while (!check.checkChiPhiThue ( valueDb ));
        villa.setChiPhithue ( valueDb );

        // Input & check số lượng người tối đa
        do {
            System.out.println ( "Số người tối đa:" );
            valueInt = scanner.nextInt ();
            if (!check.checkDienTich ( valueInt )) {
                System.out.println ( "Vui lòng nhập lại" );
            }
        } while (!check.checkSoLuongNguoi ( valueInt ));
        villa.setSoLuongNguoiToiDa ( valueInt );

        scanner.nextLine ();
        System.out.println ( "Kiểu thuê: (năm/tháng/ngày/giờ)" );
        villa.setKieuThue ( scanner.nextLine () );
        System.out.println ( "Tiêu chuẩn phòng:" );
        ((Villa) villa).setTieuChuanPhong ( scanner.nextLine () );
        System.out.println ( "Mô tả tiện nghi:" );
        ((Villa) villa).setMoTaTienNghi ( scanner.nextLine () );
        System.out.println ( "Diện tích hồ bơi:" );
        ((Villa) villa).setDienTichHoBoi ( scanner.nextLine () );

        // Input & check số tầng
        do {
            System.out.println ( "Số tầng:" );
            valueInt = scanner.nextInt ();
            if (!check.checkSoTang ( valueInt )) {
                System.out.println ( "Vui lòng nhập lại" );
            }
        } while (!check.checkSoTang ( valueInt ));
        ((Villa) villa).setSoTang ( valueInt );

        listVilla.add ( (Villa) villa );
        FuncWriteFileCSV.WriteCsvVilla ( listVilla );
        System.out.println ( "\nAdd Villa: " + villa.getTenDichVu () + " Successfully!!!" );
        displayMainMenu ();
        return listVilla;
    }

    public ArrayList<House> addHouse() {
        Scanner scanner = new Scanner ( System.in );
        ArrayList<House> listHouse = FuncWriteFileCSV.ReadCsvHouse ();
        Services house = new House ();
        house.setId ( UUID.randomUUID ().toString ().replace ( "-", "" ) );

        String valueStr;
        int valueInt;
        double valueDb;
        Validator check = new Validator ();

        // Input & check tên dịch vụ
        do {
            System.out.println ( "Tên dịch vụ:" );
            valueStr = scanner.nextLine ();
            if (!check.checkTenDichVu ( valueStr )) {
                System.out.println ( "Vui lòng nhập lại" );
            }
        } while (!check.checkTenDichVu ( valueStr ));
        house.setTenDichVu ( valueStr );

        // Input & check diện tích sử dụng
        do {
            System.out.println ( "Diện tích sử dụng:" );
            valueDb = scanner.nextDouble ();
            if (!check.checkDienTich ( valueDb )) {
                System.out.println ( "Vui lòng nhập lại" );
            }
        } while (!check.checkDienTich ( valueDb ));
        house.setDienTichSuDung ( valueDb );

        // Input & check chi phí thuê
        do {
            System.out.println ( "Chi phí thuê:" );
            valueDb = scanner.nextDouble ();
            if (!check.checkChiPhiThue ( valueDb )) {
                System.out.println ( "Vui lòng nhập lại" );
            }
        } while (!check.checkChiPhiThue ( valueDb ));
        house.setChiPhithue ( valueDb );

        // Input & check số lượng người tối đa
        do {
            System.out.println ( "Số người tối đa:" );
            valueInt = scanner.nextInt ();
            if (!check.checkDienTich ( valueInt )) {
                System.out.println ( "Vui lòng nhập lại" );
            }
        } while (!check.checkSoLuongNguoi ( valueInt ));
        house.setSoLuongNguoiToiDa ( valueInt );

        house.setSoLuongNguoiToiDa ( scanner.nextInt () );
        System.out.println ( "Kiểu thuê: (năm/tháng/ngày/giờ)" );
        house.setKieuThue ( scanner.nextLine () );
        System.out.println ( "Tiêu chuẩn phòng:" );
        ((House) house).setTieuChuanPhong ( scanner.nextLine () );
        System.out.println ( "Mô tả tiện nghi:" );
        ((House) house).setMoTaTienNghi ( scanner.nextLine () );

        // Input & check số tầng
        do {
            System.out.println ( "Số tầng:" );
            valueInt = scanner.nextInt ();
            if (!check.checkSoTang ( valueInt )) {
                System.out.println ( "Vui lòng nhập lại" );
            }
        } while (!check.checkSoTang ( valueInt ));
        ((House) house).setSoTang ( valueInt );

        listHouse.add ( (House) house );
        FuncWriteFileCSV.WriteCsvHouse ( listHouse );
        System.out.println ( "\nAdd Villa: " + house.getTenDichVu () + " Successfully!!!" );
        displayMainMenu ();
        return listHouse;
    }

    public ArrayList<Room> addRoom() {
        Scanner scanner = new Scanner ( System.in );
        ArrayList<Room> listRoom = FuncWriteFileCSV.ReadCsvRoom ();
        Services room = new Room ();
        room.setId ( UUID.randomUUID ().toString ().replace ( "-", "" ) );

        String valueStr;
        int valueInt;
        double valueDb;
        Validator check = new Validator ();

        // Input & check tên dịch vụ
        do {
            System.out.println ( "Tên dịch vụ:" );
            valueStr = scanner.nextLine ();
            if (!check.checkTenDichVu ( valueStr )) {
                System.out.println ( "Vui lòng nhập lại" );
            }
        } while (!check.checkTenDichVu ( valueStr ));
        room.setTenDichVu ( valueStr );

        // Input & check diện tích sử dụng
        do {
            System.out.println ( "Diện tích sử dụng:" );
            valueDb = scanner.nextDouble ();
            if (!check.checkDienTich ( valueDb )) {
                System.out.println ( "Vui lòng nhập lại" );
            }
        } while (!check.checkDienTich ( valueDb ));
        room.setDienTichSuDung ( valueDb );

        // Input & check chi phí thuê
        do {
            System.out.println ( "Chi phí thuê:" );
            valueDb = scanner.nextDouble ();
            if (!check.checkChiPhiThue ( valueDb )) {
                System.out.println ( "Vui lòng nhập lại" );
            }
        } while (!check.checkChiPhiThue ( valueDb ));
        room.setChiPhithue ( valueDb );

        // Input & check số lượng người tối đa
        do {
            System.out.println ( "Số người tối đa:" );
            valueInt = scanner.nextInt ();
            if (!check.checkDienTich ( valueInt )) {
                System.out.println ( "Vui lòng nhập lại" );
            }
        } while (!check.checkSoLuongNguoi ( valueInt ));
        room.setSoLuongNguoiToiDa ( valueInt );

        scanner.nextLine ();
        System.out.println ( "Kiểu thuê: (năm/tháng/ngày/giờ)" );
        room.setKieuThue ( scanner.nextLine () );
        System.out.println ( "Dịch vụ miễn phí" );
        ((Room) room).setDichVuMienPhi ( scanner.nextLine () );

        listRoom.add ( (Room) room );
        FuncWriteFileCSV.WriteCsvRoom ( listRoom );
        System.out.println ( "\nAdd Room: " + room.getTenDichVu () + " Successfully!!!" );
        displayMainMenu ();
        return listRoom;
    }

    public ArrayList<Customer> addNewCustomer() {
        Scanner scanner = new Scanner ( System.in );
        ArrayList<Customer> listCustomer = FuncWriteFileCSV.ReadCsvCustomer ();
        Customer customer = new Customer ();
        customer.setId ( UUID.randomUUID ().toString ().replace ( "-", "" ) );

        String valueStr;
        int valueInt;
        double valueDb;
        Validator check = new Validator ();

        // Input & check họ và tên
        do {
            System.out.println ( "Họ & tên nhân viên:" );
            valueStr = scanner.nextLine ();
            if (!check.checkHoVaTen ( valueStr )) {
                System.out.println ( "Họ và tên phải có định dạng in hoa ký tự đầu tiên và không cho phép kí tự khoảng trống thừa" );
            }
        } while (!check.checkHoVaTen ( valueStr ));
        customer.setHoVaTen ( valueStr );

        // Input & check Ngày sinh
        do {
            System.out.println ( "Ngày sinh:" );
            valueStr = scanner.nextLine ();
            if (!check.checkNgaySinh ( valueStr )) {
                System.out.println ( "Vui lòng nhập lại" );
            }
        } while (!check.checkNgaySinh ( valueStr ));
        customer.setNgaySinh ( valueStr );

        // Input & check giới tính
        do {
            System.out.println ( "Giới tính: (Male/Female/Unknow)" );
            valueStr = scanner.nextLine ();
            if (!check.checkGioiTinh ( valueStr )) {
                System.out.println ( "Vui lòng nhập lại" );
            }
        } while (!check.checkGioiTinh ( valueStr ));
        valueStr = chuanHoaGender ( valueStr );
        customer.setGioiTinh ( valueStr );

        // Input & check email
        do {
            System.out.println ( "Email: " );
            valueStr = scanner.nextLine ();
            if (!check.checkEmail ( valueStr )) {
                System.out.println ( "Vui lòng nhập lại" );
            }
        } while (!check.checkEmail ( valueStr ));
        customer.setEmail ( valueStr );

        System.out.println ( "Số CMND: " );
        customer.setSoCMND ( scanner.nextLine () );
        System.out.println ( "Số điện thoại: " );
        customer.setSoDienThoai ( scanner.nextLine () );
        System.out.println ( "Loại khách: " );
        customer.setLoaiKhach ( scanner.nextLine () );
        System.out.println ( "Địa chỉ: " );
        customer.setDiaChi ( scanner.nextLine () );


        listCustomer.add ( (Customer) customer );
        FuncWriteFileCSV.WriteCsvCustomer ( listCustomer );
        System.out.println ( "\nAdd Customer: " + customer.getHoVaTen () + " Successfully!!!" );
        displayMainMenu ();
        return listCustomer;
    }

    private String chuanHoaGender(String valueStr) {
        String strFormat = "";
        String str = valueStr;
        str = str.trim(); // TruoNG         mINH
        str = str.toLowerCase(); // truong         minh
        for(int i =0;i<str.length ();i++){
            //viet hoa chu cai dau tien
            if (i == 0) {
                strFormat+=Character.toUpperCase(str.charAt(i));
                continue;
            }
            strFormat+=str.charAt(i);
            valueStr=strFormat;
        }
        return valueStr;
    }


    //menu
    private void displayMainMenuMenu() {
        System.out.println ( "************" );
        System.out.println ( "Main Menu:" );
        System.out.println ( "1. Add New Services" );
        System.out.println ( "2. Show Services" );
        System.out.println ( "3. Add New Customer" );
        System.out.println ( "4. Show Customers" );
        System.out.println ( "5. Add New Booking Resort" );
        System.out.println ( "6. Show Booking Resort" );
        System.out.println ( "7. Exit" );
        System.out.println ( "Choose number (1/2/3/4/5/6/7): " );
    }

    private void addNewServicesMenu() {
        System.out.println ( "Add New Service:" );
        System.out.println ( "1. Villa" );
        System.out.println ( "2. House" );
        System.out.println ( "3. Room" );
        System.out.println ( "4. Back to Menu" );
        System.out.println ( "5. Exit" );
        System.out.println ( "Choose number (1/2/3/4/5): " );
    }

    private void showServicesMenu() {
        System.out.println ( "Show services:" );
        System.out.println ( "1. Show all Villa" );
        System.out.println ( "2. Show all House" );
        System.out.println ( "3. Show all Room" );
        System.out.println ( "4. Back to Menu" );
        System.out.println ( "5. Exit" );
        System.out.println ( "Choose number (1/2/3/4/5): " );
    }

    private static void showVillas() {
        ArrayList<Villa> listVilla = FuncWriteFileCSV.ReadCsvVilla ();
        for (Villa villa : listVilla) {
            System.out.println ( "\n--------------------" );
            System.out.println ( villa.showInfo () );
            System.out.println ( "\n--------------------" );
        }
        MainController mainController = new MainController ();
        mainController.displayMainMenu ();
    }

    private static void showHouses() {
        ArrayList<House> listHouse = FuncWriteFileCSV.ReadCsvHouse ();
        for (House House : listHouse) {
            System.out.println ( "\n--------------------" );
            System.out.println ( House.showInfo () );
            System.out.println ( "\n--------------------" );
        }
        MainController mainController = new MainController ();
        mainController.displayMainMenu ();
    }

    private static void showRooms() {
        ArrayList<Room> listRoom = FuncWriteFileCSV.ReadCsvRoom ();
        for (Room Room : listRoom) {
            System.out.println ( "\n--------------------" );
            System.out.println ( Room.showInfo () );
            System.out.println ( "\n--------------------" );
        }
        MainController mainController = new MainController ();
        mainController.displayMainMenu ();
    }

    private static void showInfomationCustomers() {
        ArrayList<Customer> listCustomer = FuncWriteFileCSV.ReadCsvCustomer ();
        // sắp xếp list nhân viên theo Name alphabet
        Collections.sort ( listCustomer,new NameComperator () );

        for (Customer customer : listCustomer) {
            System.out.println ( "\n--------------------" );
            System.out.println ( customer.showInfo () );
            System.out.println ( "\n--------------------" );
        }
        MainController mainController = new MainController ();
        mainController.displayMainMenu ();
    }

    private void addNewBookingResortMenu() {
        System.out.println ( "Add New Booking:" );
        System.out.println ( "1. Booking Villa" );
        System.out.println ( "2. Booking House" );
        System.out.println ( "3. Booking Room" );
        System.out.println ( "4. Back to Menu" );
        System.out.println ( "5. Exit" );
        System.out.println ( "Choose number (1/2/3/4/5): " );
    }

    private void addNewBookingResort() {
        ArrayList<Customer> listCustomers = FuncWriteFileCSV.ReadCsvCustomer();
        //sap xep
        listCustomers.sort(new SortName());
    }
}
