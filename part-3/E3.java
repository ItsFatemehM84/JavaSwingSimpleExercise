import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class E3 extends JFrame implements ActionListener {
    private JPanel mainPanel;
    private JButton redButton, greenButton, blueButton;

    public E3() {
        setTitle("Theme Color Selector");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);  // نمایش پنجره در مرکز صفحه

        // ایجاد پنل اصلی
        mainPanel = new JPanel();

        // ایجاد دکمه‌های رنگ
        redButton = new JButton("Red");
        greenButton = new JButton("Green");
        blueButton = new JButton("Blue");

        // تنظیم Action Command برای دکمه‌ها
        redButton.setActionCommand("RED");
        greenButton.setActionCommand("GREEN");
        blueButton.setActionCommand("BLUE");

        // اضافه کردن ActionListener به دکمه‌ها
        redButton.addActionListener(this);
        greenButton.addActionListener(this);
        blueButton.addActionListener(this);

        // پنل دکمه‌ها
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(redButton);
        buttonPanel.add(greenButton);
        buttonPanel.add(blueButton);

        // تنظیم لایه‌بندی پنجره
        setLayout(new BorderLayout());
        add(buttonPanel, BorderLayout.NORTH);
        add(mainPanel, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "RED":
                mainPanel.setBackground(Color.RED);
                break;
            case "GREEN":
                mainPanel.setBackground(Color.GREEN);
                break;
            case "BLUE":
                mainPanel.setBackground(Color.BLUE);
                break;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new E3().setVisible(true));
    }
}
