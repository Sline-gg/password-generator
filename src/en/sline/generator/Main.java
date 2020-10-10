package en.sline.generator;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Main extends JFrame{
    JPanel panel;
    JLabel label;

    public static void main(String[] args) {
        int length = 32;
        JFrame jf = new JFrame();
        System.out.println(generatePassword(length));
    }

    // constructor
    Main(String title ) {
        super( title );                      // invoke the JFrame constructor
        setSize( 150, 100 );
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

        setLayout( new FlowLayout() );       // set the layout manager
        label = new JLabel("Hello Swing!");  // construct a JLabel
        add( label );                        // add the label to the JFrame
    }


    public static char[] generatePassword(int len){
        System.out.println("Your Password:");
        String charsCaps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String chars = "abcdefghijklmnopqrstuvwxyz";
        String nums = "0123456789";
        String symbols = "!#$%&'()*+,-./:;<=>?@[]^_`{|}~";

        String passwordSymbols = charsCaps + chars + nums + symbols;
        Random rdn = new Random();

        char[] password = new char[len];
        int index = 0;
        for (int i = 0; i < len; i++){
            password[i] = passwordSymbols.charAt(rdn.nextInt(passwordSymbols.length()));
        }
        return password;
    }
}
