import java.awt.*;
import java.awt.event.*;

public class login extends Frame implements ActionListener {
    Button b1 = new Button("Login");
    Button b2 = new Button("Reset");
    Label l1 = new Label("User Name");
    Label l2 = new Label("Password");
    TextField t1 = new TextField(20);
    TextField t2 = new TextField(20);

    public login() {
        setSize(500, 500);
        setVisible(true);
        setTitle("Login Form");
        setLayout(null);

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b1);
        add(b2);

        l1.setBounds(100, 100, 100, 20);
        t1.setBounds(220, 100, 100, 20);
        l2.setBounds(100, 120, 100, 20);
        t2.setBounds(220, 120, 100, 20);
        b1.setBounds(120, 150, 100, 20);
        b2.setBounds(240, 150, 100, 20);

        b1.addActionListener(this);
        b2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            if (t1.getText().equals("apple") && t2.getText().equals("1234")) {

                loginsuccess ls = new loginsuccess();

            } else {

                loginfailure fs = new loginfailure();

            }
        } else if (ae.getSource() == b2) {
            t1.setText(" ");
            t2.setText(" ");
        }

    }

    public static void main(String[] args) {
        login ob = new login();
    }

}

class loginsuccess extends Frame implements ActionListener {
    Label sl = new Label("SUCCESS FRAME");
    Label sl1 = new Label("wanna go to login page and try wrong credentials");
    Button bs = new Button("click me");

    public loginsuccess() {
        setLayout(new FlowLayout());
        setSize(500, 500);
        setVisible(true);
        setTitle("Login Success");
        add(sl);
        add(sl1);
        add(bs);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == bs) {
            login ob = new login();
        }
    }
}

class loginfailure extends Frame implements ActionListener {
    Label fl = new Label("FAILURE FRAME");
    Label fl1 = new Label("wanna go to login page and try again");
    Button bf = new Button("click me");

    public loginfailure() {
        setLayout(new FlowLayout());
        setSize(500, 500);
        setVisible(true);
        setTitle("Login Failure");
        add(fl);
        add(fl1);
        add(bf);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == bf) {
            login ob = new login();
        }
    }
}
