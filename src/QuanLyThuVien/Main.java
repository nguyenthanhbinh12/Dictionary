package QuanLyThuVien;

import Gui.GuiTrangChu;


public class Main {
    public static void main(String[] args) {
        DictionaryManagement.insertFromFile();
        GuiTrangChu guiTrangChu=new GuiTrangChu();
        guiTrangChu.showWindows();
    }
}
