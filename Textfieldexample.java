import javax.swing.*;

class Textfieldexample {
    public static void main(String[] args) {
        JFrame f = new JFrame("TextFieldExample.");
        JTextField t1, t2;
        t1 = new JTextField("welcome to ");
        t1.setBounds(50, 100, 200, 30);
        t2 = new JTextField("i hate me");
        t2.setBounds(50, 150, 200, 30);

        f.add(t2);
        f.add(t1);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);

    }
}