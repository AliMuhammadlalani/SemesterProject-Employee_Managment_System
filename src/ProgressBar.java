import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ProgressBar  {
    JFrame frame1;
    JProgressBar progress;
    JButton button;
    JPanel panel;
    public ProgressBar(){
        frame1=new JFrame();
        progress=new JProgressBar();
        button=new JButton();
        panel=new JPanel();
        frame1.getContentPane().setBackground(Color.yellow);
        panel.setBounds(0,0,300,300);
        progress.setValue(100);
        progress.setStringPainted(true);
        progress.setBounds(0,100,620,50);

        button.setText("Press to Continue");
        button.setBounds(160,270,300,50);
        button.setFont(new Font("Serif",Font.BOLD,20));
//        button.setBackground(Color.BLUE);
        button.setForeground(Color.BLACK);
        button.setVisible(false);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               System.out.println("hello");
               Login login=new Login();
               login.f.setVisible(true);
               frame1.setVisible(false);
            }
        });

        frame1.add(progress);
        //frame1.add(panel);
        frame1.add(button);
        frame1.setTitle("Loading page");
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setSize(620,420);
        frame1.setLayout(null);
        frame1.setVisible(true);
        fill();
    }
    public void actionperform(ActionEvent e){

    }
    public void fill(){
        try {
            int counter=0;
            while(counter<=100){
                progress.setValue(counter);
                Thread.sleep(50);
                counter+=1;
            }
            progress.setString("Loading Successful!");
            button.setVisible(true);
        }
        catch(Exception e){
            System.out.println("an Error occurred");
        }
    }
}
