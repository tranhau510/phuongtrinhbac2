package phuongtrinhbac2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.TitledBorder;

public class Test extends JFrame {
    private JTextField txtA, txtB, txtC, txtKQ;
    private JButton btGiai, btXoa, btThoat;

    private void addControl() {
        Container con = getContentPane();
        con.setLayout(new BorderLayout());

        
        JPanel pnTop = new JPanel();
        JLabel lblTitle = new JLabel("Giải phương trình bậc 2");
        lblTitle.setFont(new Font("Arial", Font.BOLD, 20));
        pnTop.setBackground(Color.GRAY);
        pnTop.add(lblTitle);
        con.add(pnTop, BorderLayout.NORTH);

        
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

        JPanel pnOutput = new JPanel(new FlowLayout(FlowLayout.CENTER));
        txtKQ = new JTextField(20);
        txtKQ.setEnabled(false);
        txtKQ.setHorizontalAlignment(SwingConstants.CENTER);
        pnOutput.add(txtKQ);
        pnCenter.add(pnOutput);

        
        TitledBorder borderCenter = new TitledBorder(BorderFactory.createLineBorder(Color.YELLOW), "Nhập a, b, c");
        pnCenter.setBorder(borderCenter);

        
        JPanel pnBot = new JPanel(new FlowLayout(FlowLayout.CENTER));
        btGiai = new JButton("Giải");
        btXoa = new JButton("Xóa");
        btThoat = new JButton("Thoát");
        pnBot.add(btGiai);
        pnBot.add(btXoa);
        pnBot.add(btThoat);
        TitledBorder borderBot = new TitledBorder(BorderFactory.createLineBorder(Color.BLUE), "Chọn thao tác");
        pnBot.setBorder(borderBot);
        con.add(pnBot, BorderLayout.SOUTH);

        addEvents();
    }

    private void addEvents() {
       
        btThoat.addActionListener(e -> System.exit(0));

        // Nút xóa
        btXoa.addActionListener(e -> {
            txtA.setText("");
            txtB.setText("");
            txtC.setText("");
            txtKQ.setText("");
        });

        
        btGiai.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double a = Double.parseDouble(txtA.getText());
                    double b = Double.parseDouble(txtB.getText());
                    double c = Double.parseDouble(txtC.getText());

                    if (a == 0) {
                        JOptionPane.showMessageDialog(null, "A không thể bằng 0. Đây không phải phương trình bậc 2!");
                        return;
                    }

                    double delta = b * b - 4 * a * c;
                    if (delta > 0) {
                        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                        double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                        txtKQ.setText("x1 = " + x1 + " và x2 = " + x2);
                    } else if (delta == 0) {
                        double x = -b / (2 * a);
                        txtKQ.setText("x1 = x2 = " + x);
                    } else {
                        txtKQ.setText("Phương trình vô nghiệm");
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập số hợp lệ cho a, b, c!");
                }
            }
        });
    }

    public Test() {
        super("Giải phương trình bậc 2");
        addControl();
    }

    public static void main(String[] args) {
        Test mt = new Test();
        mt.setSize(400, 350);
        mt.setLocationRelativeTo(null);
        mt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mt.setVisible(true);
    }
}
