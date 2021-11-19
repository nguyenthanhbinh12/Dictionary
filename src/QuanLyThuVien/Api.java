package QuanLyThuVien;

import com.darkprograms.speech.translator.GoogleTranslate;

public class Api {
    public static String traCuu(String s)
    {
        String a =new String();
        try {
            String detect=GoogleTranslate.detectLanguage(s);
            a=GoogleTranslate.translate(detect,"vi",s);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return a;
    }
}
