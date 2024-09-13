package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class Deposit extends JFrame implements ActionListener{
    JTextField amount;
    JButton deposit,back;
    String pinnumber;
    Deposit(String pinnumber){
        this.pinnumber=pinnumber;
        setLayout(null);
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/ATM.jpg"));
        Image i2=i1.getImage().getScaledInstance(750,750,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image= new JLabel(i3);
        add(image);
        image.setBounds(0,0,750,750);
        
        JLabel text=new JLabel("Enter the amount you want to deposit");
        text.setFont(new Font("System", Font.BOLD, 16));
        text.setForeground(Color.white);
        text.setBounds(145,270,300,30);
        image.add(text);
        
        amount=new JTextField();
        amount.setBounds(130,320,300,30);
        image.add(amount);
        
        deposit=new JButton("Deposit");
        deposit.setFont(new Font("System", Font.BOLD, 14));
        deposit.setBounds(290,435,145,27);
        deposit.addActionListener(this);
        image.add(deposit);
        
        back=new JButton("Back");
        back.setFont(new Font("System", Font.BOLD, 14));
        back.setBounds(290,465,145,27);
        back.addActionListener(this);
        image.add(back);
        
        setSize(750,750);
        setLocation(280,0);
        setUndecorated(true);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==deposit){
            Date date=new Date();
            String depositmoney=amount.getText();
            if(deposit.equals("")){
                JOptionPane.showMessageDialog(null, "Please Enter the deposit amount");
            }
            else{
                try{
                    Conn conn=new Conn();
                    String query="insert into bank values('"+pinnumber+"','"+date+"','deposit','"+depositmoney+"')";
                    conn.s.executeUpdate(query);
                    JOptionPane.showMessageDialog(null, "BDT "+depositmoney+" deposited successfully.");
                    setVisible(false);
                    new Transactions(pinnumber).setVisible(true);
                }
                catch(Exception e){
                    System.out.println(e);
                }
            }
        }
        else if(ae.getSource()==back){
            setVisible(false);
            new Transactions(pinnumber).setVisible(true);
        }
    }
    public static void main(String[]args){
        new Deposit("");
    }
}
