package QuanLyThuVien;
import com.sun.speech.freetts.*;

public class Pronounce {
    private static final String voiceName="kevin16";

    public static void read(String s){
        Voice voice ;
        VoiceManager vm=VoiceManager.getInstance();
        voice=vm.getVoice(voiceName);
        voice.allocate();
        try
        {
            voice.speak(s);
        }
        catch (Exception exception){
            exception.printStackTrace();
        }
    }
}