package Controllers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
    boolean valid = false;

    public boolean checkTenDichVu(String str) {
        for (int i = 0; i < str.length (); i++) {
            if ((str.charAt ( 0 ) != ' ' && str.charAt ( 0 ) < 91) && (str.charAt ( i ) == ' ' && str.charAt ( i + 1 ) != ' ' && str.charAt ( i + 1 ) < 91)) {
                valid = true;
            }
        }
        return valid;
    }

    public boolean checkDienTich(double dientich) {
        if (dientich >= 30) {
            valid = true;
        }
        return valid;
    }

    public boolean checkChiPhiThue(double chiPhiThue) {
        if (chiPhiThue > 0) {
            valid = true;
        }
        return valid;
    }

    public boolean checkSoLuongNguoi(double soLuongNguoi) {
        if (soLuongNguoi > 0 && soLuongNguoi < 20) {
            valid = true;
        }
        return valid;
    }

    public boolean checkDichVuDiKem(String dichVuDiKem) {
        String[] dichVu = new String[5];
        dichVu[0] = "massage";
        dichVu[1] = "karaoke";
        dichVu[2] = "food";
        dichVu[3] = "drink";
        dichVu[4] = "car";
        for (int i = 0; i < 5; i++) {
            if (dichVuDiKem.equals ( dichVu[i] )) {
                valid = true;
            }
        }
        return valid;
    }

    public boolean checkSoTang(int soTang) {
        if (soTang > 0 && soTang % 1 == 0) {
            valid = true;
        }
        return valid;
    }

    public boolean checkHoVaTen(String str) {
        String NAME_PATTERN = "^[a-zA-Z]+(([',. -][a-zA-Z ])?[a-zA-Z]*)*$";
        if (Pattern.matches ( NAME_PATTERN, str )) {
            valid = true;
        }
        return valid;
    }

    public boolean checkEmail(String str) {
        String EMAIL_PATTERN = "^[a-zA-Z][\\\\w-]+@([\\\\w]+\\\\.[\\\\w]+|[\\\\w]+\\\\.[\\\\w]{2,}\\\\.[\\\\w]{2,})$";
        if (Pattern.matches ( EMAIL_PATTERN, str )) {
            valid = true;
        }
        return valid;
    }

    public boolean checkSoDT(String str) {
        String PHONE_PATTERN = "(09|01[2|6|8|9])+([0-9]{8})\\b";
        if (Pattern.matches ( PHONE_PATTERN, str )) {
            valid = true;
        }
        return valid;
    }

    public boolean checkGioiTinh(String str) {
        String GENDER_PATTERN = "^Male$|^Female$|^Unknow$\n";
//        Pattern mypattern = Pattern.compile(GENDER_PATTERN, Pattern.CASE_INSENSITIVE);
//        Matcher mymatcher =mypattern.matcher(str);
//        String.valueOf ( mypattern )
        if (Pattern.matches ( GENDER_PATTERN,str )) {
            valid = true;
        }
        return valid;
    }

    public boolean checkNgaySinh(String str) {
        String BIRTHDAY_PATTERN = "^([0-2][0-9]|(3)[0-1])(\\/)(((0)[0-9])|((1)[0-2]))(\\/)\\d{4}$";
        if (Pattern.matches ( BIRTHDAY_PATTERN, str )) {
            valid = true;
        }
        return valid;
    }
}
