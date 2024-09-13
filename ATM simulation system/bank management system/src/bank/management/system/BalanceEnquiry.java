package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class BalanceEnquiry extends JFrame implements ActionListener{
    JButton back;
    String pinnumber;
    BalanceEnquiry(String pinnumber){
        this.pinnumber=pinnumber;
        setLayout(null);
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/ATM.jpg"));
        Image i2=i1.getImage().getScaledInstance(750,750,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image= new JLabel(i3);
        add(image);
        image.setBounds(0,0,750,750);
        
        back=new JButton("Back");
        back.setFont(new Font("System", Font.BOLD, 14));
        back.setBounds(290,465,145,27);
        back.addActionListener(this);
        image.add(back);
        
        int balance = 0;
        try{
            Conn c1 = new Conn();
            ResultSet rs = c1.s.executeQuery("select * from bank where pin = '"+pinnumber+"'");
            while (rs.next()) {
                if (rs.getString("type").equals("deposit")) {
                    balance += Integer.parseInt(rs.getString("amount"));
                } else {
                    balance -= Integer.parseInt(rs.getString("amount"));
                }
            }
        }catch(Exception e){
            System.out.println(e);
        }
        
        JLabel text=new JLabel();
        text.setFont(new Font("System", Font.BOLD, 14));
        text.setForeground(Color.white);
        text.setBounds(140,280,300,20);
        image.add(text);
        text.setText("Your Current Account Balance is BDT "+balance);
        
        setSize(750,750);
        setLocation(280,0);
        setUndecorated(true);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Transactions(pinnumber).setVisible(true);
    }
    public static void main(String[]args){
        new BalanceEnquiry("").setVisible(true);
    }
}    