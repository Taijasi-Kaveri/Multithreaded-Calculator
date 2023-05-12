
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame {
    private JTextField numberField1;
    private JTextField numberField2;
    private JTextField resultField1;
    private JTextField resultField2;
    private JTextField resultField3;
    private JTextField resultField4;
    private JButton calculateButton;

    public GUI() {
        setTitle("Threaded Calculator");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create components
        numberField1 = new JTextField(10);
        numberField2 = new JTextField(10);
        resultField1 = new JTextField(10);
        resultField1.setEditable(false);
        resultField2 = new JTextField(10);
        resultField2.setEditable(false);
        resultField3 = new JTextField(10);
        resultField3.setEditable(false);
        resultField4 = new JTextField(10);
        resultField4.setEditable(false);
        calculateButton = new JButton("Calculate");

        // Create panel
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));
        panel.add(new JLabel("Number 1:"));
        panel.add(numberField1);
        panel.add(new JLabel("Number 2:"));
        panel.add(numberField2);
        panel.add(new JLabel("Result 1:"));
        panel.add(resultField1);
        panel.add(new JLabel("Result 2:"));
        panel.add(resultField2);
        panel.add(new JLabel("Result 3:"));
        panel.add(resultField3);
        panel.add(new JLabel("Result 4:"));
        panel.add(resultField4);
        panel.add(calculateButton);

        // Add panel to the frame
        add(panel);

        // Register event listener
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculate();
            }
        });
    }

    private void calculate() {
        int number1 = Integer.parseInt(numberField1.getText());
        int number2 = Integer.parseInt(numberField2.getText());

        ThreadedCalculator calculator1 = new ThreadedCalculator(number1, number2, "+");
        ThreadedCalculator calculator2 = new ThreadedCalculator(number1, number2, "-");
        ThreadedCalculator calculator3 = new ThreadedCalculator(number1, number2, "*");
        ThreadedCalculator calculator4 = new ThreadedCalculator(number1, number2, "/");
        calculator1.start();
        calculator2.start();
        calculator3.start();
        calculator4.start();

        try {
            calculator1.join();
            calculator2.join();
            calculator3.join();
            calculator4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        resultField1.setText(String.valueOf(calculator1.getResult()));
        resultField2.setText(String.valueOf(calculator2.getResult()));
        resultField3.setText(String.valueOf(calculator3.getResult()));
        resultField4.setText(String.valueOf(calculator4.getResult()));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                GUI calculatorGUI = new GUI();
                calculatorGUI.setVisible(true);
            }
        });
    }
}
