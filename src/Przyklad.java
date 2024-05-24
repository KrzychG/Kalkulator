import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Przyklad extends JFrame{
    private JPanel JPanel1;
    private JTextField textField1;
    private JTextField textField2;
    private JButton sumaButton;
    private JButton roznicaButton;
    private JButton iloczynButton;
    private JButton ilorazButton;
    private JButton wyczyscButton;
    private JButton wyjscieButton;
    private JLabel lableWynik;
    private JLabel icon;
    private int width = 400, height = 400;

    private double valueA, valueB, score;

    public static void main(String[] args) {
        Przyklad przyklad = new Przyklad();
        przyklad.setVisible(true);
        przyklad.setLocation(500,300);
    }

    public Przyklad(){
        super("Kalkulator");
        this.setContentPane(this.JPanel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(width,height);
        //this.pack();


        wyjscieButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });


        wyczyscButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
                textField2.setText("");
                lableWynik.setText("Tu pojawi się wynik działania");
            }
        });


        sumaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valueA = Double.parseDouble(textField1.getText());
                valueB = Double.parseDouble(textField2.getText());
                score = valueA + valueB;
                lableWynik.setText("Suma: "+ String.valueOf(valueA)+" + "+
                        String.valueOf(valueB) + " = "+ String.valueOf(score));
            }
        });
        roznicaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valueA = Double.parseDouble(textField1.getText());
                valueB = Double.parseDouble(textField2.getText());
                score = valueA - valueB;
                lableWynik.setText("Różnica: "+ String.valueOf(valueA)+" - "+
                        String.valueOf(valueB) + " = "+ String.valueOf(score));
            }
        });

        iloczynButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valueA = Double.parseDouble(textField1.getText());
                valueB = Double.parseDouble(textField2.getText());
                score = valueA * valueB;
                lableWynik.setText("Iloczyn: "+ String.valueOf(valueA)+" * "+
                        String.valueOf(valueB) + " = "+ String.valueOf(score));


            }
        });
        ilorazButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valueA = Double.parseDouble(textField1.getText());
                valueB = Double.parseDouble(textField2.getText());
                if(valueB == 0){
                    JOptionPane.showMessageDialog(null, "Error: Nie mozna dzielic przez zero.",
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
                else{
                score = valueA / valueB;
                lableWynik.setText("Iloraz "+ String.valueOf(valueA)+" / "+
                        String.valueOf(valueB) + " = "+ String.valueOf(score));
                }

            }
        });
    }

}
