import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JohnnyGUI extends JFrame{
    private JTextArea textTest;
    private JPanel oof;
    private JButton PLAYHANDButton;
    private JLabel yourFormulaLabel;
    private JLabel TIMERLabel;
    private JLabel messageBoxLabel;
    private JButton multiplyButton;
    private JButton divideButton;
    private JButton subtractButton;
    private JButton plusButton;
    private JButton card1Button;
    private JButton card2Button;
    private JButton card3Button;
    private JButton card4Button;
    private JButton CLEARButton;

    public JohnnyGUI()
    {
        add(oof);
        setSize(500,500);
        setTitle("Johnny");

        PLAYHANDButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
/*
Put code here to run when PLAYHAND BUTTON clicked
 */
            }

        });
        CLEARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /*
Put code here to run when Clear BUTTON clicked
 */
            }
        });
        plusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /*
Put code here to run when + BUTTON clicked
 */
            }
        });
        subtractButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /*
Put code here to run when - BUTTON clicked
 */
            }
        });
        divideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /*
Put code here to run when / BUTTON clicked
 */
            }
        });
        multiplyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /*
Put code here to run when * BUTTON clicked
 */
            }
        });
        card1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /*
Put code here to run when Card1 BUTTON clicked
 */
            }
        });
        card2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /*
Put code here to run when card2 BUTTON clicked
 */
            }
        });
        card3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /*
Put code here to run when card3 BUTTON clicked
 */
            }
        });
        card4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /*
Put code here to run when card4 BUTTON clicked
 */
            }
        });
    }

}
