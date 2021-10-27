package aplicatii.gui;

import aplicatii.clase.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyGUI {

    private JPanel _mainpanel, _secondpanel, _endPagePanel;
    private JButton _fructe;
    private JButton _legume;
    private ImageIcon _image;
    private JLabel _label;
    private JLabel _soldLabel;
    private JTextField _soldText;
    private JButton _soldButton;


    public  MyGUI(){

        _label = new JLabel();

        try{
            _image = new ImageIcon(this.getClass().getResource("magazin-logo.png"));
        }catch (Exception e){
            e.printStackTrace();
        }
        _label.setIcon(_image);

        _secondpanel = new JPanel();
        _secondpanel.setLayout(new FlowLayout());

        _secondpanel.add(_label);

        _mainpanel = new JPanel();
        _mainpanel.setLayout(new BorderLayout());
        _mainpanel.add(_secondpanel,BorderLayout.CENTER);

        _fructe = new JButton("Fructe");
        _fructe.setBackground(Color.RED);
        _fructe.setForeground(Color.WHITE);
        _fructe.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               Fructe f = new Fructe();

            }
        });
        _secondpanel.add(_fructe);

        _legume= new JButton("Legume");
        _legume .setBackground(Color.BLUE);
        _legume.setForeground(Color.WHITE);
        _legume.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               Legume l = new Legume();
            }
        });
        _secondpanel.add(_legume);


        _endPagePanel = new JPanel();
        _endPagePanel.setLayout(new GridLayout(2,1));

        _soldLabel = new JLabel("Sold");
       //_soldLabel.setBounds(10,20,40,20);
        _endPagePanel.add(_soldLabel);

         _soldText = new JTextField();
       //  _soldText.setBounds(20,30,70,20);
        _endPagePanel.add(_soldText);

        _soldButton = new JButton("Modificare");
        _soldButton.setBackground(Color.YELLOW);
        _soldButton.setForeground(Color.RED);
      //  _soldButton.setBounds(30,40,50,20);
        _soldButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Main.magazin.setSold(Double.valueOf(_soldText.getText()));
                System.out.println(Main.magazin.toString());
            }
        });
        _endPagePanel.add(_soldButton);

        _mainpanel.add(_endPagePanel,BorderLayout.PAGE_END);

    }

    public static void main(String[] args) {

        JFrame _frame = new JFrame("Magazin");
        _frame.setContentPane(new MyGUI()._mainpanel);
        _frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        _frame.setLocation(new Point(500,200));
        _frame.setSize(new Dimension(500,500));
        _frame.setResizable(false);
        _frame.setVisible(true);

    }
}
