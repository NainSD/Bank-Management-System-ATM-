package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Transactions extends JFrame implements ActionListener{
    JButton deposit,withdrawl,fastcash,ministatement,pinchange,balanceenquiry,exit;
    String pinnumber;
    Transactions(String pinnumber){
        this.pinnumber=pinnumber;
        setLayout(null);
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/ATM.jpg"));
        Image i2=i1.getImage().getScaledInstance(750,750, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        add(image);
        image.setBounds(0,0,750,750);
        JLabel text= new JLabel("Select your transaction");
        text.setFont(new Font("System",Font.BOLD, 16));
        text.setForeground(Color.white);
        text.setBounds(190,270,200,30);
        image.add(text);
        
        deposit=new JButton("Deposit");
        deposit.setFont(new Font("System", Font.BOLD, 14));
        deposit.setBounds(130,375,145,27);
        deposit.addActionListener(this);
        image.add(deposit);
        withdrawl=new JButton("Cash Withdrawl");
        withdrawl.setFont(new Font("System", Font.BOLD, 14));
        withdrawl.setBounds(290,375,145,27);
        withdrawl.addActionListener(this);
        image.add(withdrawl);
        fastcash=new JButton("Fast Cash");
        fastcash.setFont(new Font("System", Font.BOLD, 14));
        fastcash.setBounds(130,405,145,27);
        fastcash.addActionListener(this);
        image.add(fastcash);
        ministatement=new JButton("Mini Statement");
        ministatement.setFont(new Font("System", Font.BOLD, 14));
        ministatement.setBounds(290,405,145,27);
        ministatement.addActionListener(this);
        image.add(ministatement);
        pinchange=new JButton("PIN Change");
        pinchange.setFont(new Font("System", Font.BOLD, 14));
        pinchange.setBounds(130,435,145,27);
        pinchange.addActionListener(this);
        image.add(pinchange);
        balanceenquiry=new JButton("Balance Enquiry");
        balanceenquiry.setFont(new Font("System", Font.BOLD, 14));
        balanceenquiry.setBounds(290,435,145,27);
        balanceenquiry.addActionListener(this);
        image.add(balanceenquiry);
        exit=new JButton("Exit");
        exit.setFont(new Font("System", Font.BOLD, 14));
        exit.setBounds(290,465,145,27);
        exit.addActionListener(this);
        image.add(exit);
        setSize(750,750);
        setLocation(280,0);
        setUndecorated(true);
        setVisible(true); //this should be last line always
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==exit){
            System.exit(0);
        }
        else if(ae.getSource()==deposit){
            setVisible(false);
            new Deposit(pinnumber).setVisible(true);
        }
        else if(ae.getSource()==withdrawl){
            setVisible(false);
            new Withdrawl(pinnumber).setVisible(true);
        }
        else if(ae.getSource()==fastcash){
            setVisible(false);
            new FastCash(pinnumber).setVisible(true);
        }
        else if(ae.getSource()==pinchange){
            setVisible(false);
            new PinChange(pinnumber).setVisible(true);
        }
        else if(ae.getSource()==balanceenquiry){
            setVisible(false);
            new BalanceEnquiry(pinnumber).setVisible(true);
        }
        
    }
    public static void main(String[]args){
        new Transactions("");
    }
}
