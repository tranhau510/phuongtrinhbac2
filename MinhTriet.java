package phuongtrinbc2;
import java.awt.*;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;


public class MinhTriet extends JFrame {
	JPanel pnOutput = new JPanel(new FlowLayout(FlowLayout.CENTER));
    txtKQ = new JTextField(20);
    txtKQ.setEnabled(false);
    txtKQ.setHorizontalAlignment(SwingConstants.CENTER);
    pnOutput.add(txtKQ);
    pnCenter.add(pnOutput);

    // Đường viền cho vùng nhập liệu
    TitledBorder borderCenter = new TitledBorder(BorderFactory.createLineBorder(Color.YELLOW), "Nhập a, b, c");
    pnCenter.setBorder(borderCenter);

    // Panel chứa nút chức năng
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
}
