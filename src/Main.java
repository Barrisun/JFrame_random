import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("sd");
        JLabel label = new JLabel("");
        JTextArea textArea = new JTextArea();
        JLabel label_text = new JLabel();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(new Dimension(500,500));
        frame.setVisible(true);
        JButton button = new JButton("Подтверждение");
        button.setBounds(125,120,200,20);
        frame.getContentPane().add(button);
        frame.setLocationRelativeTo(null);
        textArea.setBounds(125,100,200,20);
        frame.getContentPane().add(textArea);
frame.getContentPane().add(label);
frame.getContentPane().add(label_text);
label_text.setText("Введите число");
label_text.setBounds(125, -10,200,200);

button.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        Random random = new Random();
        int ss = random.nextInt(10);
        System.out.println(ss);

        int a = Integer.parseInt(textArea.getText());
        System.out.println(a);
        if (ss == a){
        label.setText("Вы победили");
            label.setBounds(125,50,200,200);
        }
        else {
            label.setText("Анлак, число было: " + ss + ", а вы ввели " + a);
            label.setBounds(125,50,200,200);
        }
    }
});

    }
}