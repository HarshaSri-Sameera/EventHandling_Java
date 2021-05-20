import java.awt.*;
import java.awt.event.*;

public class buttonevent extends Frame implements ActionListener {
    int num;
    Button b1;
    TextField t1;

    public buttonevent() {
        setLayout(new FlowLayout());

        b1 = new Button("click me");
        t1 = new TextField(20);

        add(b1);
        add(t1);

        b1.addActionListener(this);

    }

    public void actionPerformed(ActionEvent ae) {
        String cmd = ae.getActionCommand();
        if (num == 0) {
            System.out.println(cmd);
        }

        System.out.println(num);
        if (cmd.equals("click me")) {
            num++;
        }
        if ((num % 2) != 0) {
            t1.setText("Hello Buddy!");
        }
        if ((num % 2) == 0) {
            t1.setText(" ");
            System.out.println(num);
        }
    }

    public static void main(String args[]) {
        buttonevent ob = new buttonevent();
        ob.setSize(500, 500);
        ob.setVisible(true);
        ob.setTitle("button Event Handling");
    }

}
