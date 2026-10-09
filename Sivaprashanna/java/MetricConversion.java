import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MetricConversion extends JFrame {

    JTextField input;
    JLabel result;

    MetricConversion() {
        setTitle("Metric Conversion");
        setSize(400, 250);
        setLayout(new FlowLayout());

        JLabel label = new JLabel("Enter Value:");
        input = new JTextField(10);

        JButton kmMiles = new JButton("KM to Miles");
        JButton milesKm = new JButton("Miles to KM");
        JButton cF = new JButton("C to F");
        JButton fC = new JButton("F to C");

        result = new JLabel("Result: ");

        add(label);
        add(input);
        add(kmMiles);
        add(milesKm);
        add(cF);
        add(fC);
        add(result);

        kmMiles.addActionListener(e -> {
            double km = Double.parseDouble(input.getText());
            result.setText("Result: " + (km * 0.621371) + " Miles");
        });

        milesKm.addActionListener(e -> {
            double miles = Double.parseDouble(input.getText());
            result.setText("Result: " + (miles * 1.60934) + " KM");
        });

        cF.addActionListener(e -> {
            double c = Double.parseDouble(input.getText());
            result.setText("Result: " + ((c * 9 / 5) + 32) + " F");
        });

        fC.addActionListener(e -> {
            double f = Double.parseDouble(input.getText());
            result.setText("Result: " + ((f - 32) * 5 / 9) + " C");
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MetricConversion();
    }
}