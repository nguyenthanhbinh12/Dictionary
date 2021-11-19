package Gui;

import QuanLyThuVien.Dictionary;
import QuanLyThuVien.DictionaryManagement;
import QuanLyThuVien.Pronounce;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiTraCuuTuDien extends Gui{
    Container container;
    JTextField txtEnglish,txtVietnamese;
    JButton btnTraCuu,btnExit,btnPhatAm;
    public GuiTraCuuTuDien(){
        super("Từ điển");
        addControls();
        addEvents();
    }

    @Override
    public void addEvents() {
        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                xuLyTroVe();
            }
        });
        btnTraCuu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                xuLyTraCuu();
            }
        });
        btnPhatAm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                xuLyPhatAm();
            }
        });

    }

    private void xuLyPhatAm() {
        Pronounce.read(txtEnglish.getText());
    }

    private void xuLyTraCuu() {
        String english=txtEnglish.getText();
        if (Dictionary.hoTroTraCuu.containsKey(english)==true) {
            String vietnamese = DictionaryManagement.dictionaryLookUp(english);
            txtVietnamese.setText(vietnamese);
        }
        else
            JOptionPane.showMessageDialog(null,"Không thấy từ này trong từ điển");
    }

    private void xuLyTroVe() {
        this.dispose();
        GuiTrangChu guiTrangChu=new GuiTrangChu();
        guiTrangChu.showWindows();
    }

    @Override
    public void addControls() {
        container=getContentPane();
        container.add(pnMain());
    }

    @Override
    public JPanel pnMain() {

        JPanel pnMain=new JPanel();
        pnMain.setLayout(new BoxLayout(pnMain,BoxLayout.Y_AXIS));


        JPanel pnTitle=new JPanel();
        pnTitle.setLayout(new FlowLayout(FlowLayout.CENTER));
        JLabel lblTitle=new JLabel("Từ điển");
        lblTitle.setFont(FontFormat.titleFont);
        pnTitle.add(lblTitle);


        JPanel pnTiengAnh=new JPanel();
        pnTiengAnh.setLayout(new FlowLayout(FlowLayout.CENTER));
        JLabel lblEnglish=new JLabel("English:");
        lblEnglish.setFont(FontFormat.generalFont);
        txtEnglish=new JTextField(20);
        txtEnglish.setFont(FontFormat.fontInText);
        pnTiengAnh.add(lblEnglish);
        pnTiengAnh.add(txtEnglish);


        JPanel pnTiengViet=new JPanel();
        pnTiengViet.setLayout(new FlowLayout(FlowLayout.CENTER));
        JLabel lblVietnamese=new JLabel("Vietnamese:");
        lblVietnamese.setFont(FontFormat.generalFont);
        txtVietnamese=new JTextField(20);
        txtVietnamese.setFont(FontFormat.fontInText);;
        pnTiengViet.add(lblVietnamese);
        pnTiengViet.add(txtVietnamese);


        JPanel pnChucNang=new JPanel();
        pnChucNang.setLayout(new FlowLayout(FlowLayout.CENTER));
        btnPhatAm=new JButton("Phát Âm");
        btnPhatAm.setFont(FontFormat.generalFont);
        btnTraCuu=new JButton("Tra Cứu");
        btnTraCuu.setFont(FontFormat.generalFont);
        pnChucNang.add(btnPhatAm);
        pnChucNang.add(btnTraCuu);


        JPanel pnExit=new JPanel();
        pnExit.setLayout(new FlowLayout(FlowLayout.RIGHT));
        btnExit=new JButton("Back");
        btnExit.setFont(FontFormat.generalFont);
        pnExit.add(btnExit);


        pnMain.add(pnTitle);
        pnMain.add(pnTiengAnh);
        pnMain.add(pnTiengViet);
        pnMain.add(pnChucNang);
        pnMain.add(pnExit);
        lblEnglish.setPreferredSize(lblVietnamese.getPreferredSize());
        return pnMain;
    }
}
