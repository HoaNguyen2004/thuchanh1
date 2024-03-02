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

        super("Giao diện môn application ");//a
        setSize(300, 200);

        nut = new JButton("Nhấn vào đây");
        nut1 = new JButton("Máy tính");
        label = new JLabel("    ");//a

        add(nut, BorderLayout.CENTER);
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
        String inputText = JOptionPane.showInputDialog(this, "Nhập bản văn:");
        if (inputText != null) {
            label.setText("Chào " + inputText + " buổi sáng!");
        }
    } else if (source == nut1) {
        JOptionPane.showMessageDialog(this, "Không thể thực hiện điều kiện này !");
    }
}

    public static void main(String[] args) {
        baithucHANHAPPLication thuchanh = new baithucHANHAPPLication();
    }
}
