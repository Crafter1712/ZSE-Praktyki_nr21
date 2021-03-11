package pl.Skalinski;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main {


        public static void main(String[] args) {
            JFrame window = new JFrame("Zamiana temp.");
            window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            window.setSize(400, 225);
            window.setLocationRelativeTo(null);
            window.setLayout(null);

            JLabel num1 = new JLabel("Celcjusze");
            num1.setBounds(130, 20, 100, 30);
            window.add(num1);

            JLabel add = new JLabel("Wynik");
            add.setBounds(20, 120, 400, 30);
            window.add(add);

            JTextField textNum1 = new JTextField();
            textNum1.setBounds(20, 20, 100, 25);
            window.add(textNum1);

            JButton button = new JButton("Oblicz");
            button.setBounds(20, 90, 100, 30);
            window.add(button);

            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    String num1 = textNum1.getText();
                       Integer.parseInt(num1);
                    int wynik = ((Integer.parseInt(num1) * 9) / 5) + 32;
                    add.setText(num1 + " w Cejcjuszach to:  " + wynik + " w Fahrenheita");

                }
            });
            window.setVisible(true);
        }
    }