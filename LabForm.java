package lab13;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LabForm extends JFrame {
    
    
    private JPanel p1;
    private JLabel titl;
    private JLabel lb1;
    private JLabel lb2;
    private JLabel lb3;
    private JLabel lb4;
    private JLabel lb5;
    private JLabel rst;
    private JTextField txt1;
    private JTextField txt2;
    private JTextField txt3;
    private JTextField txt4;
    private JTextField txt5;
    private JTextField results;
    private JButton btncalculate;
    private JButton btnclear;
    private JMenuBar mb;
    private JMenu fl;
    private JMenu ed;
    private JMenuItem cal;
    private JMenuItem clr;
    
    private CalcTrip calc = new CalcTrip();
    
    public LabForm  ()
    {
        super();
        CreatePanel();
        SetFrame();
        
    }
    
    private void CreatePanel()
    {
        p1 = new JPanel();
        p1.setLayout(null);
        
        titl = new JLabel ("TRAVEL COST APP");
        titl.setBounds(115, 40, 200, 15);
        titl.setForeground(Color.blue);
        titl.setFont(new Font("Times New Roman", Font.BOLD, 20));
        
        mb = new JMenuBar();
        fl = new JMenu("File");
        ed = new JMenu("Edit");
        cal = new JMenuItem("Calculate");
        cal.addActionListener(new calculate());
        clr = new JMenuItem("Clear");
        clr.addActionListener(new clear());
        ed.add(cal);
        ed.add(clr);
        mb.add(fl);
        mb.add(ed);
       
        
        //label 1
        lb1 = new JLabel("Miles to Drive : ");
        txt1 = new JTextField(25);
        lb1.setBounds(50, 60, 100, 30);
        txt1.setBounds(150, 60, 100, 30);
        
        //label 2
        lb2 = new JLabel("Miles per gallon : ");
        txt2 = new JTextField(25);
        lb2.setBounds(50, 100, 100, 30);
        txt2.setBounds(150, 100, 100, 30);
        
        //label 3
        lb3 = new JLabel("Gasoline Price : ");
        txt3 = new JTextField(25);
        lb3.setBounds(50, 140, 100, 30);
        txt3.setBounds(150, 140, 100, 30);
        
        //label 4
        lb4 = new JLabel("Parking Cost : ");
        txt4 = new JTextField(25);
        lb4.setBounds(50, 180, 100, 30);
        txt4.setBounds(150, 180, 100, 30);
        
        //label 5
        lb5 = new JLabel("Tolls Cost : ");
        txt5 = new JTextField(25);
        lb5.setBounds(50, 220, 100, 30);
        txt5.setBounds(150, 220, 100, 30);
        
        
        //calculate button
        btncalculate = new JButton("Calculate");
        btncalculate.addActionListener(new calculate());
        btncalculate.setBounds(30, 260, 100, 30);
        
        //clear button
        btnclear = new JButton("Clear");
        btnclear.addActionListener(new clear());
        btnclear.setBounds(150, 260, 100, 30);
        btnclear.setEnabled(false);
        
        //result
        rst = new JLabel("Result: ");
        results = new JTextField(25);
        results.setEditable(false);
        results.setBackground(Color.green);
        rst.setBounds(20, 300, 100, 30);
        results.setBounds(150, 300, 100, 30);
        
        //adding to panel
        p1.add(titl);
        p1.add(lb1);
        p1.add(txt1);
        p1.add(lb2);
        p1.add(txt2);
        p1.add(lb3);
        p1.add(txt3);
        p1.add(lb4);
        p1.add(txt4);
        p1.add(lb5);
        p1.add(txt5);
        p1.add(rst);
        p1.add(results);
        p1.add(btncalculate);
        p1.add(btnclear);
        super.setJMenuBar(mb);
        super.add(p1);
    }
    
    private void SetFrame()
    {
     Image icon=Toolkit.getDefaultToolkit().getImage("Calculator.png"); 
     super.setIconImage(icon);
     super.setTitle("Calculation App");
     super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     super.setLocation(200, 100); //x ,y
     super.setSize(400, 420);
     super.setVisible(true);       
    }
    
    private class calculate implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
           double num1=Double.parseDouble(txt1.getText());
           double num2=Double.parseDouble(txt2.getText());
           double num3=Double.parseDouble(txt3.getText());
           double num4=Double.parseDouble(txt4.getText());
           double num5=Double.parseDouble(txt5.getText());
           double result = calc.Travel(num1, num2, num3, num4, num5);
           results.setText(""+String.format("%.2f", result));
           btncalculate.setEnabled(false);
           btnclear.setEnabled(true);
        }

    }
    
private class clear implements ActionListener
{

        @Override
        public void actionPerformed(ActionEvent e) {
           txt1.setText("");
           txt2.setText("");
           txt3.setText("");
           txt4.setText("");
           txt5.setText("");
           results.setText("");
           btncalculate.setEnabled(true);
           btnclear.setEnabled(false);
        }
    
}
}

