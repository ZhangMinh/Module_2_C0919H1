package services;

import java.util.HashMap;
import java.util.Map;

public class LibraryService {
    static Map<String, String> map1 = new HashMap<String, String> ();

    static {
        map1.put ( "một", "one" );
        map1.put ( "hai", "two" );
        map1.put ( "ba", "three" );
        map1.put ( "bốn", "four" );
        map1.put ( "năm", "five" );
        map1.put ( "sáu", "six" );
        map1.put ( "bảy", "seven" );
        map1.put ( "tám", "eigh" );
        map1.put ( "chín", "nine" );
        map1.put ( "mười", "ten" );
    }

    static Map<String, String> map2 = new HashMap<String, String> ();

    static {
        map2.put ( "one", "một" );
        map2.put ( "two", "hai" );
        map2.put ( "three", "ba" );
        map2.put ( "four", "bốn" );
        map2.put ( "five", "năm" );
        map2.put ( "six", "sáu" );
        map2.put ( "seven", "bảy" );
        map2.put ( "eigh", "tám" );
        map2.put ( "nine", "chín" );
        map2.put ( "ten", "mười" );
    }

    public String translateViToEng(String value) {
        return map1.get ( value );
    }

    public String translateEngToVi(String value) {
        return map2.get ( value );
    }

    public String showResult(String choice,String value) {
        String result = "";
        if (choice.equals ( "engToVi" )) {
            result = translateEngToVi ( value );
        } else if (choice.equals ( "viToEng" )) {
            result = translateViToEng ( value );
        }
        return result;
    }

}
