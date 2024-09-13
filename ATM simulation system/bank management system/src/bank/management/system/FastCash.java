package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Date;
public class FastCash extends JFrame implements ActionListener{
    JButton r1,r2,r3,r4,r5,r6,back;
    String pinnumber;
    FastCash(String pinnumber){
        this.pinnumber=pinnumber;
        setLayout(null);
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/ATM.jpg"));
        Image i2=i1.getImage().getScaledInstance(750,750, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        add(image);
        image.setBounds(0,0,750,750);
        JLabel text= new JLabel("Select withdrawl amount");
        text.setFont(new Font("System",Font.BOLD, 16));
        text.setForeground(Color.white);
        text.setBounds(190,270,200,30);
        image.add(text);
        
        r1=new JButton("BDT 100");
        r1.setFont(new Font("System", Font.BOLD, 14));
        r1.setBounds(130,375,145,27);
        r1.addActionListener(this);
        image.add(r1);
        r2=new JButton("BDT 500");
        r2.setFont(new Font("System", Font.BOLD, 14));
        r2.setBounds(290,375,145,27);
        r2.addActionListener(this);
        image.add(r2);
        r3=new JButton("BDT 1000");
        r3.setFont(new Font("System", Font.BOLD, 14));
        r3.setBounds(130,405,145,27);
        r3.addActionListener(this);
        image.add(r3);
        r4=new JButton("BDT 2500");
        r4.setFont(new Font("System", Font.BOLD, 14));
        r4.setBounds(290,405,145,27);
        r4.addActionListener(this);
        image.add(r4);
        r5=new JButton("BDT 5000");
        r5.setFont(new Font("System", Font.BOLD, 14));
        r5.setBounds(130,435,145,27);
        r5.addActionListener(this);
        image.add(r5);
        r6=new JButton("BDT 10000");
        r6.setFont(new Font("System", Font.BOLD, 14));
        r6.setBounds(290,435,145,27);
        r6.addActionListener(this);
        image.add(r6);
        back=new JButton("Back");
        back.setFont(new Font("System", Font.BOLD, 14));
        back.setBounds(290,465,145,27);
        back.addActionListener(this);
        image.add(back);
        setSize(750,750);
        setLocation(280,0);
        setUndecorated(true);
        setVisible(true); //this should be last line always
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==back){
            setVisible(false);
            new Transactions(pinnumber).setVisible(true);
        }
        else {
            String amount= ((JButton)ae.getSource()).getText().substring(4);
            Conn c=new Conn();
            try{
                ResultSet rs= c.s.executeQuery("select * from bank where pin='"+pinnumber+"'");
                int balance=0;
                while(rs.next()){
                    if(rs.getString("type").equals("deposit")){
                        balance += Integer.parseInt(rs.getString("amount"));
                    }
                    else{
                        balance -= Integer.parseInt(rs.getString("amount"));
                    }
                }
                if (balance < Integer.parseInt(amount)) {
                    JOptionPane.showMessageDialog(null, "Insufficient Balance");
                    return;
                }
                Date date=new Date();
                String query=("insert into bank values('"+pinnumber+"','"+date+"','withdraw','"+amount+"')");
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"BDT"+amount+"Debited Successfully");
                setVisible(false);
                new Transactions(amount).setVisible(true);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
        
    }
    public static void main(String[]args){
        new FastCash("");
    }
}

