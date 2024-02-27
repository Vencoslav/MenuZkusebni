import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class MenuZkusebni extends JFrame {

    private JPanel panelMain;

    public MenuZkusebni (){
        initComponent();
    }
    public void initComponent(){
        setTitle("Menu");
        setContentPane(panelMain);
        setSize(300,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();

        JMenu file = new JMenu("File");
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem exitItem = new JMenuItem("Exit");

        JMenu welcome = new JMenu("Welcome");

        JMenuItem welcomeItem = new JMenuItem("Welcome");

        welcomeItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(MenuZkusebni.this, "Welcome");
                }
        });

        exitItem.addActionListener(e -> System.exit(0));

        menuBar.add(file);
        menuBar.add(welcome);
        welcome.add(welcomeItem);
        file.add(openItem);
        file.add(saveItem);
        file.add(exitItem);



        setJMenuBar(menuBar);

    }
}
