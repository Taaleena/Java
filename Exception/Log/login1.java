package Exception.Log;

import Exception.Exc.Login;
import Exception.Exc.Pass;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class login1 extends JFrame implements ActionListener {

    private JButton submit;
    private JPanel rootPanel;
    private JLabel loginLabel;
    private JLabel passwordLabel;
    private JLabel confirmPasswordLabel;
    private JTextField login;
    private JTextField password;
    private JTextField confirmPassword;

    public login1 () {

        createLabels();
        createTextFields();
        createButton();
        createPanel();
        add(rootPanel, BorderLayout.CENTER);
        add(submit, BorderLayout.SOUTH);
        submit.addActionListener(this);
        createFrame();
    }

    private void createFrame() {
        setTitle("LOGIN FORM");
        setSize(300, 130);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    

    private void createLabels() {
        loginLabel = new JLabel("  Login:");
        passwordLabel = new JLabel("  Password:");
        confirmPasswordLabel = new JLabel("  Confirm password:");
    }

    private void createTextFields() {
        login = new JTextField(15);
        password = new JPasswordField(15);
        confirmPassword = new JPasswordField(15);
        textFieldsAlignment (CENTER_ALIGNMENT, login, password, confirmPassword);
    }

    private void textFieldsAlignment (final float alignment, JTextField... fields) {
        for (JTextField field : fields) {
            field.setHorizontalAlignment((int) alignment);
        }
    }

    private void createButton() {
        submit = new JButton("submit");
    }

    private void createPanel() {
        rootPanel = new JPanel(new GridLayout(3, 1));
        rootPanel.add(loginLabel);
        rootPanel.add(login);
        rootPanel.add(passwordLabel);
        rootPanel.add(password);
        rootPanel.add(confirmPasswordLabel);
        rootPanel.add(confirmPassword);
    }

    public void actionPerformed(ActionEvent ae) {
        try {
            checkLogInInfo(login.getText(), password.getText(), confirmPassword.getText(), "[\\w]{1,20}");
            JOptionPane.showMessageDialog(this, "Login and password are correct!",
                    "User login&password confirmation", JOptionPane.PLAIN_MESSAGE);
        } 
        catch (Login | Pass e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),
                    "UserException", JOptionPane.ERROR_MESSAGE);
        }
    }

    private boolean checkLogInInfo(String login, String password, String confirmPassword, String regex)
    throws Login, Pass {
        if (!login.matches(regex)) {
            throw new Login("Incorrect login");
        } 
        else if (!password.matches(regex) ||
            !confirmPassword.matches(regex) ||
            !password.equals(confirmPassword)) {
    throw new Pass("Incorrect password");
}
return true;
}


}
