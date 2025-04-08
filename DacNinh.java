package phuongtrinbc2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DacNinh extends JFrame {
    private JTextField txtA, txtB, txtC, txtKQ;
    private JButton btGiai, btXoa, btThoat;

    private void addControl() {
        Container con = getContentPane();
        con.setLayout(new BorderLayout());

        // Tiêu đề
        JPanel pnTop = new JPanel();
        JLabel lblTitle = new JLabel("Giải phương trình bậc 2");
        lblTitle.setFont(new Font("Arial", Font.BOLD, 20));
        pnTop.setBackground(Color.GRAY);
        pnTop.add(lblTitle);
        con.add(pnTop, BorderLayout.NORTH);

        // Panel nhập hệ số a, b, c
        JPanel pnCenter = new JPanel();
        pnCenter.setLayout(new BoxLayout(pnCenter, BoxLayout.Y_AXIS));
        con.add(pnCenter, BorderLayout.CENTER);

        Font labelFont = new Font("Arial", Font.BOLD, 14);

        JPanel pnA = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel lblA = new JLabel("A: ");
        lblA.setFont(labelFont);
        txtA = new JTextField(20);
        pnA.add(lblA);
        pnA.add(txtA);
        pnCenter.add(pnA);

        JPanel pnB = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel lblB = new JLabel("B: ");
        lblB.setFont(labelFont);
        txtB = new JTextField(20);
        pnB.add(lblB);
        pnB.add(txtB);
        pnCenter.add(pnB);

        JPanel pnC = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel lblC = new JLabel("C: ");
        lblC.setFont(labelFont);
        txtC = new JTextField(20);
        pnC.add(lblC);
        pnC.add(txtC);
        pnCenter.add(pnC);

        // Kết quả
        JPanel pnKQ = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel lblKQ = new JLabel("Kết quả:");
        lblKQ.setFont(labelFont);
        pnKQ.add(lblKQ);
        pnCenter.add(pnKQ); 
	
 }
}
