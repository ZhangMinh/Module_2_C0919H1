package Controllers;

import Models.*;
import Views.Main;
import com.opencsv.CSVWriter;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FuncWriteFileCSV {
    private static final char DEFAULT_SEPARATOR = ',';

    // the character to use for quoted elements
    private static final char DEFAULT_QUOTE = '"';

    // the line number to skip for start reading 
    private static final int NUM_OF_LINE_SKIP = 1;

    //path file Villa.csv
    private static final String filePathVilla = "C:\\Users\\Admin\\Desktop\\WorkSpace\\C0919H1\\Week2\\Furama\\src\\Data\\villa.csv";
    //path file House.csv
    private static final String filePathHouse = "C:\\Users\\Admin\\Desktop\\WorkSpace\\C0919H1\\Week2\\Furama\\src\\Data\\villa.csv";
    //path file Room.csv
    private static final String filePathRoom = "C:\\Users\\Admin\\Desktop\\WorkSpace\\C0919H1\\Week2\\Furama\\src\\Data\\villa.csv";
    //path file Customer.csv
    private static final String filePathCustomer = "C:\\Users\\Admin\\Desktop\\WorkSpace\\C0919H1\\Week2\\Furama\\src\\Data\\customer.csv";
    //path file Customer.csv
    private static final String filePathBooking = "C:\\Users\\Admin\\Desktop\\WorkSpace\\C0919H1\\Week2\\Furama\\src\\Data\\booking.csv";

    private static String[] headerRecordVilla = new String[]{"id", "tenDichVu", "dienTichSuDUng",
            "chiPhiThue", "soLuongNguoiToiDa", "kieuThue",
            "tieuChuanPhong", "moTaTienNghi", "dienTichHoBoi", "soTang"};
    private static String[] headerRecordHouse = new String[]{"id", "tenDichVu", "dienTichSuDung", "chiPhithue",
            "soLuongNguoiToiDa", "kieuThue", "tieuChuanPhong", "moTaTienNghi", "soTang"};
    private static String[] headerRecordRoom = new String[]{"id", "tenDichVu", "dienTichSuDung", "chiPhithue",
            "soLuongNguoiToiDa", "kieuThue", "dichVuMienPhi"};
    private static String[] headerRecordCustomer = new String[]{"id", "hoVaTen", "ngaySinh", "gioiTinh", "soCMND", "soDienThoai",
            "email", "loaiKhach", "diaChi"};
    private static String[] headerRecordBooking = new String[]{"idCus", "hoVaTen", "ngaySinh", "gioiTinh", "soCMND", "soDienThoai",
            "email", "loaiKhach", "diaChi", "id", "tenDichVu", "dienTichSuDung", "chiPhithue", "soLuongNguoiToiDa", "kieuThue"};

    public static void WriteCsvVilla(ArrayList<Villa> arrayList) {
        try (Writer writer = new FileWriter(filePathVilla)) {
            CSVWriter csvWriter = new CSVWriter(writer,
                    CSVWriter.DEFAULT_SEPARATOR,
                    CSVWriter.NO_QUOTE_CHARACTER,
                    CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                    CSVWriter.DEFAULT_LINE_END);
            csvWriter.writeNext(headerRecordVilla);
            for (Villa villa : arrayList) {
                csvWriter.writeNext(new String[]{
                        villa.getId(), villa.getTenDichVu(),
                        String.valueOf(villa.getDienTichSuDung()),
                        String.valueOf(villa.getChiPhithue()),
                        String.valueOf(villa.getSoLuongNguoiToiDa()),
                        villa.getKieuThue(), villa.getTieuChuanPhong(),
                        villa.getMoTaTienNghi(),
                        String.valueOf(villa.getDienTichHoBoi()),
                        String.valueOf(villa.getSoTang())
                });
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void WriteCsvHouse(ArrayList<House> arrayList) {
        try (Writer writer = new FileWriter(filePathHouse)) {
            CSVWriter csvWriter = new CSVWriter(writer,
                    CSVWriter.DEFAULT_SEPARATOR,
                    CSVWriter.NO_QUOTE_CHARACTER,
                    CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                    CSVWriter.DEFAULT_LINE_END);
            csvWriter.writeNext(headerRecordVilla);
            for (House house : arrayList) {
                csvWriter.writeNext(new String[]{
                        house.getId(), house.getTenDichVu(),
                        String.valueOf(house.getDienTichSuDung()),
                        String.valueOf(house.getChiPhithue()),
                        String.valueOf(house.getSoLuongNguoiToiDa()),
                        house.getKieuThue(), house.getTieuChuanPhong(),
                        house.getMoTaTienNghi(),
                        String.valueOf(house.getSoTang())
                });
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void WriteCsvRoom(ArrayList<Room> arrayList) {
        try (Writer writer = new FileWriter(filePathRoom)) {
            CSVWriter csvWriter = new CSVWriter(writer,
                    CSVWriter.DEFAULT_SEPARATOR,
                    CSVWriter.NO_QUOTE_CHARACTER,
                    CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                    CSVWriter.DEFAULT_LINE_END);
            csvWriter.writeNext(headerRecordVilla);
            for (Room room : arrayList) {
                csvWriter.writeNext(new String[]{
                        room.getId(), room.getTenDichVu(),
                        String.valueOf(room.getDienTichSuDung()),
                        String.valueOf(room.getChiPhithue()),
                        String.valueOf(room.getSoLuongNguoiToiDa()),
                        room.getKieuThue(), room.getDichVuMienPhi()
                });
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void WriteCsvCustomer(ArrayList<Customer> arrayList) {
        try (Writer writer = new FileWriter(filePathCustomer)) {
            CSVWriter csvWriter = new CSVWriter(writer,
                    CSVWriter.DEFAULT_SEPARATOR,
                    CSVWriter.NO_QUOTE_CHARACTER,
                    CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                    CSVWriter.DEFAULT_LINE_END);
            csvWriter.writeNext(headerRecordCustomer);
            for (Customer customer : arrayList) {
                csvWriter.writeNext(new String[]{
                        String.valueOf(customer.getId()),
                        String.valueOf(customer.getHoVaTen()),
                        String.valueOf(customer.getNgaySinh()),
                        String.valueOf(customer.getGioiTinh()),
                        String.valueOf(customer.getSoCMND()),
                        String.valueOf(customer.getSoDienThoai()),
                        String.valueOf(customer.getEmail()),
                        String.valueOf(customer.getLoaiKhach()),
                        String.valueOf(customer.getDiaChi())});
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void WriteCsvBooking(ArrayList<Customer> arrayList) {
        try (Writer writer = new FileWriter(filePathBooking)) {
            CSVWriter csvWriter = new CSVWriter(writer,
                    CSVWriter.DEFAULT_SEPARATOR,
                    CSVWriter.NO_QUOTE_CHARACTER,
                    CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                    CSVWriter.DEFAULT_LINE_END);
            csvWriter.writeNext(headerRecordBooking);
            for (Customer customer : arrayList) {
                csvWriter.writeNext(new String[]{
                        String.valueOf(customer.getId()),
                        String.valueOf(customer.getHoVaTen()),
                        String.valueOf(customer.getNgaySinh()),
                        String.valueOf(customer.getGioiTinh()),
                        String.valueOf(customer.getSoCMND()),
                        String.valueOf(customer.getSoDienThoai()),
                        String.valueOf(customer.getEmail()),
                        String.valueOf(customer.getLoaiKhach()),
                        String.valueOf(customer.getDiaChi()),
                        String.valueOf(customer.getSuDungDichVu().getId()),
                        String.valueOf(customer.getSuDungDichVu().getTenDichVu()),
                        String.valueOf(customer.getSuDungDichVu().getDienTichSuDung()),
                        String.valueOf(customer.getSuDungDichVu().getChiPhithue()),
                        String.valueOf(customer.getSuDungDichVu().getSoLuongNguoiToiDa()),
                        String.valueOf(customer.getSuDungDichVu().getKieuThue())});
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static ArrayList<Villa> ReadCsvVilla() {
        Path path = Paths.get(filePathVilla);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(filePathVilla);
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        ColumnPositionMappingStrategy<Villa> strategy = new ColumnPositionMappingStrategy<>();
        strategy.setType(Villa.class);
        strategy.setColumnMapping(headerRecordVilla);
        CsvToBean<Villa> csvToBean = null;
        try {
            csvToBean = new CsvToBeanBuilder<Villa>(new FileReader(filePathVilla))
                    .withMappingStrategy(strategy)
                    .withSeparator(DEFAULT_SEPARATOR)
                    .withQuoteChar(DEFAULT_QUOTE)
                    .withSkipLines(NUM_OF_LINE_SKIP)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return (ArrayList<Villa>) csvToBean.parse();
    }

    public static ArrayList<House> ReadCsvHouse() {
        Path path = Paths.get(filePathHouse);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(filePathHouse);
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        ColumnPositionMappingStrategy<House> strategy = new ColumnPositionMappingStrategy<>();
        strategy.setType(House.class);
        strategy.setColumnMapping(headerRecordHouse);
        CsvToBean<House> csvToBean = null;
        try {
            csvToBean = new CsvToBeanBuilder<House>(new FileReader(filePathHouse))
                    .withMappingStrategy(strategy)
                    .withSeparator(DEFAULT_SEPARATOR)
                    .withQuoteChar(DEFAULT_QUOTE)
                    .withSkipLines(NUM_OF_LINE_SKIP)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return (ArrayList<House>) csvToBean.parse();
    }

    public static ArrayList<Room> ReadCsvRoom() {
        Path path = Paths.get(filePathRoom);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(filePathRoom);
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        ColumnPositionMappingStrategy<Room> strategy = new ColumnPositionMappingStrategy<>();
        strategy.setType(Room.class);
        strategy.setColumnMapping(headerRecordRoom);
        CsvToBean<Room> csvToBean = null;
        try {
            csvToBean = new CsvToBeanBuilder<Room>(new FileReader(filePathRoom))
                    .withMappingStrategy(strategy)
                    .withSeparator(DEFAULT_SEPARATOR)
                    .withQuoteChar(DEFAULT_QUOTE)
                    .withSkipLines(NUM_OF_LINE_SKIP)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return (ArrayList<Room>) csvToBean.parse();
    }

    public static ArrayList<Customer> ReadCsvCustomer() {
        Path path = Paths.get(filePathCustomer);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(filePathCustomer);
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        ColumnPositionMappingStrategy<Customer> strategy = new ColumnPositionMappingStrategy<>();
        strategy.setType(Customer.class);
        strategy.setColumnMapping(headerRecordCustomer);
        CsvToBean<Customer> csvToBean = null;
        try {
            csvToBean = new CsvToBeanBuilder<Customer>(new FileReader(filePathCustomer))
                    .withMappingStrategy(strategy)
                    .withSeparator(DEFAULT_SEPARATOR)
                    .withQuoteChar(DEFAULT_QUOTE)
                    .withSkipLines(NUM_OF_LINE_SKIP)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return (ArrayList<Customer>) csvToBean.parse();
    }

    public static ArrayList<Customer> ReadCsvBooking() {
        Path path = Paths.get(filePathBooking);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(filePathBooking);
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        ColumnPositionMappingStrategy<Customer> strategy = new ColumnPositionMappingStrategy<>();
        strategy.setType(Customer.class);
        strategy.setColumnMapping(headerRecordCustomer);
        CsvToBean<Customer> csvToBean = null;
        try {
            csvToBean = new CsvToBeanBuilder<Customer>(new FileReader(filePathCustomer))
                    .withMappingStrategy(strategy)
                    .withSeparator(DEFAULT_SEPARATOR)
                    .withQuoteChar(DEFAULT_QUOTE)
                    .withSkipLines(NUM_OF_LINE_SKIP)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return (ArrayList<Customer>) csvToBean.parse();
    }


}
