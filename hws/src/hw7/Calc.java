package hw7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

    class Calc extends JFrame{
       JTextField variable1, variable2, resultTextField;
       JButton btnSum, btnSubstraction, btnMultiplication, btnDivison, btnPower, btnClearing;
        public Calc(){

            variable1 = new JTextField(10);
            variable2 = new JTextField(10);
            resultTextField = new JTextField(10);

            btnSum = new JButton("+");
            btnSubstraction = new JButton("-");
            btnMultiplication = new JButton("*");
            btnDivison = new JButton("/");
            btnPower = new JButton("^");
            btnClearing = new JButton("clear");

            add(variable1);
            add(variable2);
            add(resultTextField);
            add(btnSum);
            add(btnSubstraction);
            add(btnMultiplication);
            add(btnDivison);
            add(btnPower);
            add(btnClearing);
            setTitle("Top Calculator 2k18");
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            setSize(170, 250);
            setLayout(new FlowLayout());

            btnSum.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    double i1 = Double.parseDouble(variable1.getText());
                    double i2 = Double.parseDouble(variable2.getText());
                    double result = i1 + i2;
                    resultTextField.setText(String.valueOf(result));
                }
            });

            btnSubstraction.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    double i1 = Double.parseDouble(variable1.getText());
                    double i2 = Double.parseDouble(variable2.getText());
                    double result = i1 - i2;
                    resultTextField.setText(String.valueOf(result));
                }
            });

            btnMultiplication.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    double i1 = Double.parseDouble(variable1.getText());
                    double i2 = Double.parseDouble(variable2.getText());
                    double result = i1 * i2;
                    resultTextField.setText(String.valueOf(result));
                }
            });

            btnDivison.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    double i1 = Double.parseDouble(variable1.getText());
                    double i2 = Double.parseDouble(variable2.getText());
                    double result = i1 / i2;
                    resultTextField.setText(String.valueOf(result));
                    }
            });

            btnPower.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    double i1 = Double.parseDouble(variable1.getText());
                    double i2 = Double.parseDouble(variable2.getText());
                    double result = Math.pow(i1, i2);
                    resultTextField.setText(String.valueOf(result));
                }
            });

            btnClearing.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                variable1.setText("");
                variable2.setText("");
                resultTextField.setText("");
                }
            });
        }
    }
