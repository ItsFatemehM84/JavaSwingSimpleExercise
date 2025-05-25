import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class E4 extends JFrame implements ActionListener {
    private JTextField txtName, txtEmail;
    private JPasswordField txtPassword;
    private JRadioButton rbMale, rbFemale;
    private JCheckBox cbJava, cbPython, cbCpp;
    private JButton btnSubmit;
    private GridBagConstraints gbc;

    public E4() {
        setTitle("User Registration");
        setSize(500, 350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // نمایش وسط صفحه
        setLayout(new GridBagLayout());

        gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        addComponents();
    }

    private void addComponents() {
        // نام
        gbc.gridx = 0; gbc.gridy = 0;
        add(new JLabel("Name:"), gbc);
        gbc.gridx = 1;
        txtName = new JTextField(20);
        add(txtName, gbc);

        // ایمیل
        gbc.gridx = 0; gbc.gridy = 1;
        add(new JLabel("Email:"), gbc);
        gbc.gridx = 1;
        txtEmail = new JTextField(20);
        add(txtEmail, gbc);

        // رمز عبور
        gbc.gridx = 0; gbc.gridy = 2;
        add(new JLabel("Password:"), gbc);
        gbc.gridx = 1;
        txtPassword = new JPasswordField(20);
        add(txtPassword, gbc);

        // جنسیت
        gbc.gridx = 0; gbc.gridy = 3;
        add(new JLabel("Gender:"), gbc);
        gbc.gridx = 1;
        rbMale = new JRadioButton("Male");
        rbFemale = new JRadioButton("Female");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(rbMale);
        genderGroup.add(rbFemale);
        JPanel genderPanel = new JPanel();
        genderPanel.add(rbMale);
        genderPanel.add(rbFemale);
        add(genderPanel, gbc);

        // علایق
        gbc.gridx = 0; gbc.gridy = 4;
        add(new JLabel("Interests:"), gbc);
        gbc.gridx = 1;
        cbJava = new JCheckBox("Java");
        cbPython = new JCheckBox("Python");
        cbCpp = new JCheckBox("C++");
        JPanel interestPanel = new JPanel();
        interestPanel.add(cbJava);
        interestPanel.add(cbPython);
        interestPanel.add(cbCpp);
        add(interestPanel, gbc);

        // دکمه ارسال
        gbc.gridx = 1; gbc.gridy = 5;
        gbc.anchor = GridBagConstraints.CENTER;
        btnSubmit = new JButton("Submit");
        btnSubmit.addActionListener(this);
        add(btnSubmit, gbc);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String name = txtName.getText();
        String email = txtEmail.getText();
        String gender = rbMale.isSelected() ? "Male" : rbFemale.isSelected() ? "Female" : "Unspecified";
        String interests = "";
        if (cbJava.isSelected()) interests += "Java ";
        if (cbPython.isSelected()) interests += "Python ";
        if (cbCpp.isSelected()) interests += "C++ ";

        JOptionPane.showMessageDialog(this,
                "Name: " + name + "\n" +
                        "Email: " + email + "\n" +
                        "Gender: " + gender + "\n" +
                        "Interests: " + interests,
                "Registration Details", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new E4().setVisible(true));
    }
}
