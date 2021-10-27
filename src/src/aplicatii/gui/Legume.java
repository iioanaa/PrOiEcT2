package aplicatii.gui;

import aplicatii.clase.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Legume {

    private JPanel _panel;
    private JFrame _frame;
    private JButton _modificare;
    private JLabel _pretRosii, _pretCastraveti, _pretCeapa,_pretArdei;
    private JTextField _rosii,_castraveti,_ceapa,_ardei;

    public Legume(){
        _panel = new JPanel();
        _panel.setLayout(null);
        _panel.setBackground(Color.WHITE);


        _pretRosii = new JLabel("Pret Rosii");
        _pretRosii.setBounds(100,150,100,25);
        _pretRosii.setForeground(Color.RED);
        _panel.add(_pretRosii);

        _rosii = new JTextField();
        _rosii.setBounds(100,170,150,25);
        _rosii.setForeground(Color.RED);
        _panel.add(_rosii);

        _pretCastraveti = new JLabel("Pret Castraveti");
        _pretCastraveti.setBounds(100,200,100,25);
        _pretCastraveti.setForeground(Color.RED);
        _panel.add(_pretCastraveti);

        _castraveti = new JTextField();
        _castraveti.setBounds(100,220,150,25);
        _castraveti.setForeground(Color.RED);
        _panel.add(_castraveti);

        _pretCeapa = new JLabel("Pret Ceapa");
        _pretCeapa.setBounds(100,250,100,25);
        _pretCeapa.setForeground(Color.RED);
        _panel.add( _pretCeapa);

        _ceapa = new JTextField();
        _ceapa.setBounds(100,270,150,25);
        _ceapa.setForeground(Color.RED);
        _panel.add(_ceapa);

        _pretArdei = new JLabel("Pret Ardei");
        _pretArdei.setBounds(100,300,100,25);
        _pretArdei.setForeground(Color.RED);
        _panel.add(_pretArdei);

        _ardei = new JTextField();
        _ardei.setBounds(100,320,150,25);
        _ardei.setForeground(Color.RED);
        _panel.add(_ardei);


        _modificare = new JButton("modificare");
        _modificare.setBounds(100,450, 150,30 );
        _modificare.setBackground(Color.BLUE);
        _modificare.setForeground(Color.WHITE);
        _modificare.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Main.legume.setPretRosii(Double.valueOf(_rosii.getText()));
                Main.legume.setPretCastraveti(Double.valueOf(_castraveti.getText()));
                Main.legume.setPrettCeapa(Double.valueOf(_ceapa.getText()));
                Main.legume.setPrettArdei(Double.valueOf(_ardei.getText()));

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
        Legume l = new Legume();
    }
}
