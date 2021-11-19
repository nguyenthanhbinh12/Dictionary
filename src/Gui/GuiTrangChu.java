package Gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiTrangChu extends Gui{

    Container container;
    JButton btnTuDien,btnApiGoogle,btnThemTu,btnSuaTu,btnXoaTu,btnExit;


    public GuiTrangChu(){
        super("Từ điển");
        addControls();
        addEvents();
    }

    @Override
    public void addEvents() {
        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                thoatKhoiChuongTrinh();
            }
        });
        btnTuDien.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vaoGuiTuDien();
            }
        });
        btnThemTu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vaoGuiThemTu();
            }
        });
        btnXoaTu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vaoGuiXoaTu();
            }
        });
        btnSuaTu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vaoGuiSuaTu();
            }
        });
        btnApiGoogle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                apiGoogle();
            }
        });
    }

    private void apiGoogle() {
        this.dispose();
        GuiApi guiApi=new GuiApi();
        guiApi.showWindows();
    }

    private void vaoGuiSuaTu() {
        this.dispose();
        GuiSuaTu guiSuaTu=new GuiSuaTu();
        guiSuaTu.showWindows();
    }

    private void vaoGuiXoaTu() {
        this.dispose();;
        GuiXoaTu guiXoaTu=new GuiXoaTu();
        guiXoaTu.showWindows();
    }

    private void vaoGuiThemTu() {
        this.dispose();
        GuiThemTu guiThemTu=new GuiThemTu();
        guiThemTu.showWindows();
    }

    private void vaoGuiTuDien() {
        this.dispose();
        GuiTraCuuTuDien guiTraCuuTuDien=new GuiTraCuuTuDien();
        guiTraCuuTuDien.showWindows();
    }

    private void thoatKhoiChuongTrinh() {
        this.dispose();
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


        JPanel pnTuDien=new JPanel();
        pnTuDien.setLayout(new FlowLayout(FlowLayout.CENTER));
        btnTuDien=new JButton("Từ điển");
        btnTuDien.setFont(FontFormat.generalFont);
        pnTuDien.add(btnTuDien);

        JPanel pnApi=new JPanel();
        pnApi.setLayout(new FlowLayout(FlowLayout.CENTER));
        btnApiGoogle=new JButton("Api Google");
        btnApiGoogle.setFont(FontFormat.generalFont);
        pnApi.add(btnApiGoogle);


        JPanel pnThemTu=new JPanel();
        pnThemTu.setLayout(new FlowLayout(FlowLayout.CENTER));
        btnThemTu=new JButton("Thêm từ");
        btnThemTu.setFont(FontFormat.generalFont);
        pnThemTu.add(btnThemTu);

        JPanel pnXoaTu=new JPanel();
        pnXoaTu.setLayout(new FlowLayout(FlowLayout.CENTER));
        btnXoaTu=new JButton("Xóa Từ");
        btnXoaTu.setFont(FontFormat.generalFont);
        pnXoaTu.add(btnXoaTu);

        JPanel pnSuaTu=new JPanel();
        pnSuaTu.setLayout(new FlowLayout(FlowLayout.CENTER));
        btnSuaTu=new JButton("Sửa Từ");
        btnSuaTu.setFont(FontFormat.generalFont);
        pnSuaTu.add(btnSuaTu);


        JPanel pnExit=new JPanel();
        pnExit.setLayout(new FlowLayout(FlowLayout.CENTER));
        btnExit=new JButton("Exit");
        btnExit.setFont(FontFormat.generalFont);
        pnExit.add(btnExit);



        pnMain.add(pnTitle);
        pnMain.add(pnTuDien);
        pnMain.add(pnApi);
        pnMain.add(pnThemTu);
        pnMain.add(pnXoaTu);
        pnMain.add(pnSuaTu);
        pnMain.add(pnExit);

        return pnMain;

    }

    @Override
    public void showWindows() {
        super.showWindows();
    }
}
