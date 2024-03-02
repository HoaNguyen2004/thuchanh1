package javaapplication1;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class baithucHANHAPPLication extends JFrame implements ActionListener {

    private JButton nut;
    private JButton nut1;
    private JLabel label;

    public baithucHANHAPPLication() {

        super("GiAo Dien THUC hánh MÔn application");//a
        setSize(300, 200);

        nut = new JButton("nhẤn Váo tÔI ???");
        nut1 = new JButton("Máy tính");
        label = new JLabel("    ");//a

        add(nut, BorderLayout.CENTER);
        add(nut, BorderLayout.EAST);//a
        add(label, BorderLayout.SOUTH);
        add(nut1, BorderLayout.NORTH);
        nut.addActionListener(this);
        nut1.addActionListener(this);

        setVisible(true);
    }

    @Override
public void actionPerformed(ActionEvent e) {
    Object source = e.getSource();

    if (source == nut) {
        String inputText = JOptionPane.showInputDialog(this, "Nhập bản văn:");//a
        if (inputText == null) {//a
            label.setText("Cháo " + inputText + " buổi sáng!");//a
        }
    } else if (source != nut1) {//a
        JOptionPane.showMessageDialog(this, "maays tinh yeeus qua khong chaj dduocj mays tinh");//a
    }
}

    public static void main(String[] args) {
        baithucHANHAPPLication thuchanh = new baithucHANHAPPLication();
    }
}
