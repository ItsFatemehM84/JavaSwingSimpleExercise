import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class E1 extends JFrame implements ActionListener {
    private JLabel counterLabel;    // نمایش تعداد کلیک‌ها
    private JButton clickButton;    // دکمه برای ثبت کلیک‌ها
    private int count = 0;          // شمارنده کلیک‌ها

    public E1() {
        setTitle("Click Counter");
        counterLabel = new JLabel("Clicks: 0", SwingConstants.CENTER);
        clickButton = new JButton("Click Me");
        clickButton.addActionListener(this);

        setLayout(new BorderLayout());
        add(counterLabel, BorderLayout.CENTER);
        add(clickButton, BorderLayout.SOUTH);

        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // تنظیم پنجره در وسط مانیتور
        setLocationRelativeTo(null);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;  // افزایش شمارنده کلیک
        counterLabel.setText("Clicks: " + count);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new E1());
    }
}
