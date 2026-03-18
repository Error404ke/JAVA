import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ScientificCalculator implements ActionListener {
    JFrame f;
    JTextField display;
    JTextField resultDisplay;
    JButton bSin, bCos, bTan, bLog, bLn;
    JButton bSqrt, bPower, bSquare, bFact, bPi;
    JButton b7, b8, b9, bDiv, bClear;
    JButton b4, b5, b6, bMul, bDel;
    JButton b1, b2, b3, bSub, bEq;
    JButton b0, bDot, bPlus, bNeg;
    public double num1 = 0;

    private String operator = "";
    private boolean startNewNumber = true;

    public ScientificCalculator() {
        f = new JFrame("FX82ms");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setSize(400, 550);
        f.setResizable(false);
        f.getContentPane().setBackground(new Color(240, 240, 240));

        display = new JTextField("0");
        display.setBounds(20, 20, 350, 50);
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setFont(new Font("Monospaced", Font.BOLD, 24));
        display.setEditable(false);
        display.setBackground(Color.BLACK);
        display.setForeground(new Color(0, 255, 0));
        display.setBorder(BorderFactory.createLineBorder(Color.GRAY, 2));

        resultDisplay = new JTextField("RESULT");
        resultDisplay.setBounds(20, 75, 350, 30);
        resultDisplay.setHorizontalAlignment(JTextField.RIGHT);
        resultDisplay.setFont(new Font("Arial", Font.PLAIN, 14));
        resultDisplay.setEditable(false);
        resultDisplay.setBackground(new Color(230, 230, 230));
        resultDisplay.setForeground(Color.BLUE);

        bSin = new JButton("sin");
        bSin.setBounds(20, 120, 65, 40);
        bSin.setBackground(new Color(255, 200, 150));
        bCos = new JButton("cos");
        bCos.setBounds(90, 120, 65, 40);
        bCos.setBackground(new Color(255, 200, 150));
        bTan = new JButton("tan");
        bTan.setBounds(160, 120, 65, 40);
        bTan.setBackground(new Color(255, 200, 150));
        bLog = new JButton("log");
        bLog.setBounds(230, 120, 65, 40);
        bLog.setBackground(new Color(255, 200, 150));
        bLn = new JButton("ln");
        bLn.setBounds(300, 120, 65, 40);
        bLn.setBackground(new Color(255, 200, 150));

        bSqrt = new JButton("√");
        bSqrt.setBounds(20, 165, 65, 40);
        bSqrt.setBackground(new Color(255, 200, 150));

        bPower = new JButton("xʸ");
        bPower.setBounds(90, 165, 65, 40);
        bPower.setBackground(new Color(255, 200, 150));
        bSquare = new JButton("x²");
        bSquare.setBounds(160, 165, 65, 40);
        bSquare.setBackground(new Color(255, 200, 150));
        bFact = new JButton("n!");
        bFact.setBounds(230, 165, 65, 40);
        bFact.setBackground(new Color(255, 200, 150));
        bPi = new JButton("π");
        bPi.setBounds(300, 165, 65, 40);
        bPi.setBackground(new Color(255, 200, 150));

        b7 = new JButton("7");
        b7.setBounds(20, 220, 65, 50);
        b7.setBackground(Color.WHITE);
        b8 = new JButton("8");
        b8.setBounds(90, 220, 65, 50);
        b8.setBackground(Color.WHITE);
        b9 = new JButton("9");
        b9.setBounds(160, 220, 65, 50);
        b9.setBackground(Color.WHITE);
        bDiv = new JButton("÷");
        bDiv.setBounds(230, 220, 65, 50);
        bDiv.setBackground(new Color(255, 200, 200));
        bClear = new JButton("C");
        bClear.setBounds(300, 220, 65, 50);
        bClear.setBackground(new Color(255, 150, 150));

        b4 = new JButton("4");
        b4.setBounds(20, 275, 65, 50);
        b4.setBackground(Color.WHITE);

        b5 = new JButton("5");
        b5.setBounds(90, 275, 65, 50);
        b5.setBackground(Color.WHITE);
        b6 = new JButton("6");
        b6.setBounds(160, 275, 65, 50);
        b6.setBackground(Color.WHITE);
        bMul = new JButton("×");
        bMul.setBounds(230, 275, 65, 50);
        bMul.setBackground(new Color(255, 200, 200));
        bDel = new JButton("DEL");
        bDel.setBounds(300, 275, 65, 50);
        bDel.setBackground(new Color(255, 200, 150));

        b1 = new JButton("1");
        b1.setBounds(20, 330, 65, 50);
        b1.setBackground(Color.WHITE);
        b2 = new JButton("2");
        b2.setBounds(90, 330, 65, 50);
        b2.setBackground(Color.WHITE);

        b3 = new JButton("3");
        b3.setBounds(160, 330, 65, 50);
        b3.setBackground(Color.WHITE);
        bSub = new JButton("-");
        bSub.setBounds(230, 330, 65, 50);
        bSub.setBackground(new Color(255, 200, 200));
        bNeg = new JButton("±");
        bNeg.setBounds(300, 330, 65, 50);
        bNeg.setBackground(new Color(255, 200, 150));

        b0 = new JButton("0");
        b0.setBounds(20, 385, 135, 50);
        b0.setBackground(Color.WHITE);
        bDot = new JButton(".");
        bDot.setBounds(160, 385, 65, 50);
        bDot.setBackground(Color.WHITE);
        bPlus = new JButton("+");
        bPlus.setBounds(230, 385, 65, 50);
        bPlus.setBackground(new Color(255, 200, 200));

        bEq = new JButton("=");
        bEq.setBounds(300, 385, 65, 50);
        bEq.setBackground(new Color(255, 150, 150));

        f.add(display);
        f.add(resultDisplay);

        JButton[] buttons = { bSin, bCos, bTan, bLog, bLn, bSqrt, bPower, bSquare, bFact, bPi,
                b7, b8, b9, bDiv, bClear, b4, b5, b6, bMul, bDel,
                b1, b2, b3, bSub, bNeg, b0, bDot, bPlus, bEq };

        for (JButton btn : buttons) {
            btn.addActionListener(this);
            btn.setFont(new Font("Arial", Font.BOLD, 14));
            btn.setFocusPainted(false);
            btn.setBorder(BorderFactory.createRaisedBevelBorder());
            f.add(btn);
        }

        f.setVisible(true);
        f.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        try {
            if (command.matches("[0-9]")) {
                if (startNewNumber) {
                    display.setText(command);
                    startNewNumber = false;
                } else {
                    display.setText(display.getText() + command);
                }
                resultDisplay.setText("number: " + display.getText());
            }

            else if (command.equals(".")) {
                if (!display.getText().contains(".")) {
                    if (startNewNumber) {
                        display.setText("0.");
                        startNewNumber = false;
                    } else {
                        display.setText(display.getText() + ".");
                    }
                }
            }

            else if (command.equals("C")) {
                display.setText("0");
                resultDisplay.setText("Cleared");
                num1 = 0;
                operator = "";
                startNewNumber = true;
            }

            else if (command.equals("DEL")) {
                String text = display.getText();
                if (text.length() > 1) {
                    display.setText(text.substring(0, text.length() - 1));
                } else {
                    display.setText("0");
                    startNewNumber = true;
                }
            }

            else if (command.equals("±")) {
                double value = Double.parseDouble(display.getText());
                display.setText(String.valueOf(-value));
            }

            else if (command.matches("[÷×+\\-]")) {
                if (!operator.isEmpty()) {
                    calculate();
                }
                num1 = Double.parseDouble(display.getText());
                operator = command;
                resultDisplay.setText(num1 + " " + operator + " ?");
                startNewNumber = true;
            }

            else if (command.equals("xʸ")) {
                if (!operator.isEmpty()) {
                    calculate();
                }
                num1 = Double.parseDouble(display.getText());
                operator = "^";
                resultDisplay.setText(num1 + " ^ ?");
                startNewNumber = true;
            }

            else if (command.equals("=")) {
                if (!operator.isEmpty()) {
                    calculate();
                }
            }

            else if (command.equals("√")) {
                double value = Double.parseDouble(display.getText());
                if (value >= 0) {
                    double result = Math.sqrt(value);
                    display.setText(formatResult(result));
                    resultDisplay.setText("√(" + value + ") = " + formatResult(result));
                } else {
                    resultDisplay.setText("syntax error");
                }
                startNewNumber = true;
            }

            else if (command.equals("x²")) {
                double value = Double.parseDouble(display.getText());
                double result = value * value;
                display.setText(formatResult(result));
                resultDisplay.setText(value + "² = " + formatResult(result));
                startNewNumber = true;
            }

            else if (command.equals("n!")) {
                int value = Integer.parseInt(display.getText().split("\\.")[0]);
                if (value >= 0 && value <= 20) {
                    long result = factorial(value);
                    display.setText(String.valueOf(result));
                    resultDisplay.setText(value + "! = " + result);
                } else {
                    resultDisplay.setText("syntax error ");
                }
                startNewNumber = true;
            }

            else if (command.equals("π")) {
                display.setText(String.valueOf(Math.PI));
                resultDisplay.setText("π = " + Math.PI);
                startNewNumber = true;
            }

            else if (command.equals("sin")) {
                double value = Double.parseDouble(display.getText());
                double rad = Math.toRadians(value);
                double result = Math.sin(rad);
                display.setText(formatResult(result));
                resultDisplay.setText("sin(" + value + "°) = " + formatResult(result));
                startNewNumber = true;
            }

            else if (command.equals("cos")) {
                double value = Double.parseDouble(display.getText());
                double rad = Math.toRadians(value);
                double result = Math.cos(rad);
                display.setText(formatResult(result));
                resultDisplay.setText("cos(" + value + "°) = " + formatResult(result));
                startNewNumber = true;
            }

            else if (command.equals("tan")) {
                double value = Double.parseDouble(display.getText());
                double rad = Math.toRadians(value);
                double result = Math.tan(rad);
                display.setText(formatResult(result));
                resultDisplay.setText("tan(" + value + "°) = " + formatResult(result));
                startNewNumber = true;
            }

            else if (command.equals("log")) {
                double value = Double.parseDouble(display.getText());
                if (value > 0) {
                    double result = Math.log10(value);
                    display.setText(formatResult(result));
                    resultDisplay.setText("log₁₀(" + value + ") = " + formatResult(result));
                } else {
                    resultDisplay.setText("syntax error");
                }
                startNewNumber = true;
            }

            else if (command.equals("ln")) {
                double value = Double.parseDouble(display.getText());
                if (value > 0) {
                    double result = Math.log(value);
                    display.setText(formatResult(result));
                    resultDisplay.setText("ln(" + value + ") = " + formatResult(result));
                } else {
                    resultDisplay.setText("syntax error");
                }
                startNewNumber = true;
            }

        } catch (NumberFormatException ex) {
            resultDisplay.setText(" Invalid input");
        }
    }

    private void calculate() {
        double num2 = Double.parseDouble(display.getText());
        double result = 0;
        String operation = "";

        switch (operator) {
            case "+":
                result = num1 + num2;
                operation = " + ";
                break;
            case "-":
                result = num1 - num2;
                operation = " - ";
                break;
            case "×":
                result = num1 * num2;
                operation = " × ";
                break;
            case "÷":
                if (num2 != 0) {
                    result = num1 / num2;
                    operation = " ÷ ";
                } else {
                    resultDisplay.setText("syntax error");
                    return;
                }
                break;
            case "^":
                result = Math.pow(num1, num2);
                operation = " ^ ";
                break;
        }

        display.setText(formatResult(result));
        resultDisplay.setText(num1 + operation + num2 + " = " + formatResult(result));
        num1 = result;
        operator = "";
        startNewNumber = true;
    }

    private String formatResult(double value) {
        if (value == (long) value) {
            return String.valueOf((long) value);
        } else {
            return String.format("%.10f", value).replaceAll("0*$", "").replaceAll("\\.$", "");
        }
    }

    private long factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ScientificCalculator());
    }
}