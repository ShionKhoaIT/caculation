/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caculation;

/**
 *
 * @author DELL
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;

/**
 *
 * @author USER
 */
public class frm_CALCULATOR extends Frame implements ActionListener, ItemListener{
    private Label lblA;
    private Label lblB;
    private Label lblKq;
    private TextField txtA;
    private TextField txtB;
    private TextField txtKq;
    private Button btn_Tinh;
    private Button btn_Xoa;
    private Checkbox ckb_Cong;
    private Checkbox ckb_Tru;
    private Checkbox ckb_Nhan;
    private Checkbox ckb_Chia;
    private CheckboxGroup group;
    
    public frm_CALCULATOR(){
        setLayout(null);
        setTitle("CALCULATOR");
        setSize(500, 300);
        setVisible(true);

        lblA = new Label("Nhap A");
        this.add(lblA);
        txtA = new TextField(10);
        txtA.addActionListener(this);
        this.add(txtA);
        
        lblB = new Label("Nhap B");
        this.add(lblB);
        txtB = new TextField(10);
        txtB.addActionListener(this);
        this.add(txtB);
        
        lblKq = new Label("Ket qua");
        this.add(lblKq);
        txtKq = new TextField(10);
        txtKq.addActionListener(this);
        this.add(txtKq);
        
        lblA.setBounds(50, 50, 80, 20);
        lblB.setBounds(50, 80, 80, 20);
        lblKq.setBounds(50, 110, 80, 20);

        txtA.setBounds(180, 50, 80, 20);
        txtB.setBounds(180, 80, 80, 20);
        txtKq.setBounds(180, 110, 80, 20);

        btn_Tinh = new Button("Tinh");
        btn_Tinh.setBounds(30, 260, 100, 20);
        this.add(btn_Tinh);
        btn_Tinh.addActionListener(this);

        btn_Xoa = new Button("Xoa");
        btn_Xoa.setBounds(250, 260, 100, 20);
        this.add(btn_Xoa);
        btn_Xoa.addActionListener(this);
        
        JPanel pnPhepToan = new JPanel ();
        pnPhepToan.setBounds(350, 50, 105, 105);
        pnPhepToan.setLayout(new GridLayout(2, 2));
        this.add(pnPhepToan);
        group = new CheckboxGroup();
        ckb_Cong = new Checkbox("Cong", group, true);
        ckb_Tru = new Checkbox("Tru", group, false);
        ckb_Nhan = new Checkbox("Nhan", group, false);
        ckb_Chia = new Checkbox("Chia", group, false);

        this.add(ckb_Cong);
        this.add(ckb_Tru);
        this.add(ckb_Nhan);
        this.add(ckb_Chia);
        
        pnPhepToan.add(ckb_Cong);
        pnPhepToan.add(ckb_Tru);
        pnPhepToan.add(ckb_Nhan);
        pnPhepToan.add(ckb_Chia);
        
        this.addWindowListener(new MyWindowListener());
            
           
    }
    public void Cong(){
        int a = Integer.parseInt(txtA.getText());
        int b = Integer.parseInt(txtB.getText());
        int Tong = a+b;
        txtKq.setText(Tong+"");
        
        
    }
    public void Tru(){
        int a = Integer.parseInt(txtA.getText());
        int b = Integer.parseInt(txtB.getText());
        int Hieu = a-b;
        txtKq.setText(Hieu+"");
    }
    public void Nhan(){
        int a = Integer.parseInt(txtA.getText());
        int b = Integer.parseInt(txtB.getText());
        int Tich = a*b;
        txtKq.setText(Tich+"");
    }
    public void Chia(){
        double a = (double) Double.parseDouble(txtA.getText());
        double b = (double) Double.parseDouble(txtB.getText());
        double Thuong = a/b;
        txtKq.setText(Thuong+"");
    }
    public void setvaluenull(){
        this.txtA.setText("");
        this.txtB.setText("");
        this.txtKq.setText("");
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.btn_Tinh){
            ItemEvent ex = null;
            itemStateChanged(ex);
        }
        if(e.getSource() == this.btn_Xoa){
            setvaluenull();
        }
    }

    @Override
    public void itemStateChanged(ItemEvent ex) {
        if(ckb_Cong.getState() == true){
            Cong();
        }
        if(ckb_Tru.getState() == true){
            Tru();
        }
        if(ckb_Nhan.getState() == true){
            Nhan();
        }
        if(ckb_Chia.getState() == true){
            Chia();
        }
    }

    
    
}