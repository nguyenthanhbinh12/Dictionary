package Gui;

import QuanLyThuVien.Api;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiApi extends Gui{

    JTextArea txtEnglish,txtVietnamese;
    JButton btnTraCuu,btnPhatAm,btnBack;
    Container container;

    public GuiApi(){
        super("API Google");
        addControls();
        addEvents();
    }

    @Override
    public void addEvents() {
        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                troVe();
            }
        });
        btnTraCuu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                traCuu();
            }
        });
    }

    private void traCuu() {
        txtVietnamese.setText(Api.traCuu(txtEnglish.getText()));
    }

    private void troVe() {
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
        JLabel lblTitle=new JLabel("Api Google");
        lblTitle.setFont(FontFormat.titleFont);;
        pnTitle.add(lblTitle);


        JPanel pnEnglish=new JPanel();
        pnEnglish.setLayout(new FlowLayout(FlowLayout.CENTER));
        JLabel lblEnglish=new JLabel("Ngôn ngữ bất kỳ");
        pnEnglish.add(lblEnglish);
        txtEnglish=new JTextArea(10,20);
        pnEnglish.add(txtEnglish);
        

        JPanel pnVietnamese=new JPanel();
        pnVietnamese.setLayout(new FlowLayout(FlowLayout.CENTER));
        JLabel lblVietnamese=new JLabel("Vietnamese");
        pnVietnamese.add(lblVietnamese);
        txtVietnamese=new JTextArea(10,20);
        pnVietnamese.add(txtVietnamese);


        JPanel pnTraCuu=new JPanel();
        pnTraCuu.setLayout(new FlowLayout(FlowLayout.CENTER));
        btnTraCuu=new JButton("Dịch");
        btnTraCuu.setFont(FontFormat.generalFont);
        pnTraCuu.add(btnTraCuu);


//        JLabel pnBack=new JLabel();
//        pnBack.setLayout(new FlowLayout(FlowLayout.CENTER));
        btnBack=new JButton("Trở về");
        btnBack.setFont(FontFormat.generalFont);
        pnTraCuu.add(btnBack);


        lblEnglish.setFont(FontFormat.generalFont);
        lblVietnamese.setFont(FontFormat.generalFont);
        lblVietnamese.setPreferredSize(lblEnglish.getPreferredSize());
        txtVietnamese.setFont(FontFormat.fontInText);
        txtEnglish.setFont(FontFormat.fontInText);


        pnMain.add(pnTitle);
        pnMain.add(pnEnglish);
        pnMain.add(pnVietnamese);
        pnMain.add(pnTraCuu);
       // pnMain.add(pnBack);
        return pnMain;
    }
}
