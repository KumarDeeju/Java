import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculatorApp implements ActionListener {
    private JFrame frame;
    private JTextField inputField;
    private double num1 = 0, num2 = 0, result = 0;
    private char operator;

    public CalculatorApp() {
        // Create the main frame
        frame = new JFrame("Calculator App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setLayout(new BorderLayout());

        // Create the input field
        inputField = new JTextField();
        inputField.setHorizontalAlignment(JTextField.RIGHT);
        inputField.setEditable(false);
        frame.add(inputField, BorderLayout.NORTH);

        // Create the button panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4));

        // Add the buttons
        addButton(buttonPanel, "7");
        addButton(buttonPanel, "8");
        addButton(buttonPanel, "9");
        addButton(buttonPanel, "/");
        addButton(buttonPanel, "4");
        addButton(buttonPanel, "5");
        addButton(buttonPanel, "6");
        addButton(buttonPanel, "*");
        addButton(buttonPanel, "1");
        addButton(buttonPanel, "2");
        addButton(buttonPanel, "3");
        addButton(buttonPanel, "-");
        addButton(buttonPanel, "0");
        addButton(buttonPanel, ".");
        addButton(buttonPanel, "C");
        addButton(buttonPanel, "+");
	addButton(buttonPanel, "=");

        // Add the button panel to the frame
        frame.add(buttonPanel, BorderLayout.CENTER);

        // Show the frame
        frame.setVisible(true);
    }

    private void addButton(Container container, String text) {
        JButton button = new JButton(text);
        button.addActionListener(this);
        container.add(button);
    }

    public void actionPerformed(ActionEvent e) {
        String buttonPressed = e.getActionCommand();

        if (buttonPressed.equals("C")) {
            // Clear the input field
            inputField.setText("");
            num1 = 0;
            num2 = 0;
            result = 0;
            operator = ' ';
        } else if (buttonPressed.equals("+") || buttonPressed.equals("-") || buttonPressed.equals("*") || buttonPressed.equals("/")) {
            // Set the operator and save the first number
            operator = buttonPressed.charAt(0);
            num1 = Double.parseDouble(inputField.getText());
            inputField.setText("");
        } else if (buttonPressed.equals("=")) {
            // Calculate the result and display it in the input field
            num2 = Double.parseDouble(inputField.getText());
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
            }
            inputField.setText(Double.toString(result));
            num1 = 0;
            num2 = 0;
            result = 0;
            operator = ' ';
        } else {
            // Append the button's text to the input field
            inputField.setText(inputField.getText() + buttonPressed);
        }
    }

    public static void main(String[] args) {
        // Create a new instance of the calculator application
        new CalculatorApp();
    }
}
