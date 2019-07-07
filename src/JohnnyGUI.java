import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JohnnyGUI extends JFrame{
    private JTextArea textTest;
    private JPanel oof;
    private JButton testButton;

    public JohnnyGUI()
    {
        add(oof);
        setSize(500,500);
        setTitle("Johnny");

        testButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textTest.setText("Hello World");
            }
        });
    }


}
