package aplicatii.gui;

import aplicatii.clase.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Fructe {
    private JPanel _panel;
    private JFrame _frame;
    private JButton _modificare;
    private JLabel _pretMere, _pretBanane, _pretStruguri,_pretCapsuni;
    private JTextField _mere,_banane,_struguri,_capsuni;


    public Fructe(){
       _panel = new JPanel();
       _panel.setLayout(null);
        _panel.setBackground(Color.WHITE);


        _pretMere = new JLabel("Pret Mere");
        _pretMere.setBounds(100,150,100,25);
        _pretMere.setForeground(Color.RED);
        _panel.add(_pretMere);

        _mere = new JTextField();
        _mere.setBounds(100,170,150,25);
        _mere.setForeground(Color.RED);
        _panel.add(_mere);

        _pretBanane = new JLabel("Pret Banane");
        _pretBanane.setBounds(100,200,100,25);
        _pretBanane.setForeground(Color.RED);
        _panel.add(_pretBanane);

        _banane = new JTextField();
        _banane.setBounds(100,220,150,25);
        _banane.setForeground(Color.RED);
        _panel.add(_banane);

        _pretStruguri = new JLabel("Pret Struguri");
        _pretStruguri.setBounds(100,250,100,25);
        _pretStruguri.setForeground(Color.RED);
        _panel.add( _pretStruguri);

        _struguri = new JTextField();
        _struguri.setBounds(100,270,150,25);
        _struguri.setForeground(Color.RED);
        _panel.add(_struguri);

        _pretCapsuni = new JLabel("Pret Capsuni");
        _pretCapsuni.setBounds(100,300,100,25);
        _pretCapsuni.setForeground(Color.RED);
        _panel.add(_pretCapsuni);

        _capsuni = new JTextField();
        _capsuni.setBounds(100,320,150,25);
        _capsuni.setForeground(Color.RED);
        _panel.add(_capsuni);


        _modificare = new JButton("modificare");
        _modificare.setBounds(100,450, 150,30 );
        _modificare.setBackground(Color.BLUE);
        _modificare.setForeground(Color.WHITE);
        _modificare.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Main.fructe.sePrettCapsuni(Double.valueOf(_capsuni.getText()));
                Main.fructe.sePrettBanane(Double.valueOf(_banane.getText()));
                Main.fructe.sePrettMere(Double.valueOf(_mere.getText()));
                Main.fructe.sePrettStruguri(Double.valueOf(_struguri.getText()));

            }
        });
        _panel.add( _modificare);



        _frame = new JFrame("Legume");
        _frame.setLocation(00,10);
        _frame.setContentPane(_panel);
        _frame.setSize(new Dimension(1200,800));
        _frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        _frame.setVisible(true);

    }

    public static void main(String[] args) {
       Fructe l = new Fructe();
    }
}
