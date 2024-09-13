package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class PinChange extends JFrame implements ActionListener{
    JTextField pin, repin;
    JButton change,back;
    String pinnumber;
    PinChange(String pinnumber){
        this.pinnumber=pinnumber;
        setLayout(null);
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/ATM.jpg"));
        Image i2=i1.getImage().getScaledInstance(750,750,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image= new JLabel(i3);
        add(image);
        image.setBounds(0,0,750,750);
        
        JLabel text=new JLabel("Change your PIN");
        text.setFont(new Font("System", Font.BOLD, 16));
        text.setForeground(Color.white);
        text.setBounds(200,250,300,20);
        image.add(text);
        
        JLabel t1=new JLabel("New PIN:");
        t1.setFont(new Font("System", Font.BOLD, 16));
        t1.setForeground(Color.white);
        t1.setBounds(130,300,70,30);
        image.add(t1);
        pin=new JTextField();
        pin.setBounds(280,300,150,20);
        image.add(pin);
        
        JLabel t2=new JLabel("Re-enter new PIN:");
        t2.setFont(new Font("System", Font.BOLD, 16));
        t2.setForeground(Color.white);
        t2.setBounds(130,330,150,20);
        image.add(t2);
        repin=new JTextField();
        repin.setBounds(280,330,150,20);
        image.add(repin);
        
        change=new JButton("Change");
        change.setFont(new Font("System", Font.BOLD, 14));
        change.setBounds(290,435,145,27);
        change.addActionListener(this);
        image.add(change);
        
        back=new JButton("Back");
        back.setFont(new Font("System", Font.BOLD, 14));
        back.setBounds(290,465,145,27);
        back.addActionListener(this);
        image.add(back);
        
        setSize(750,750);
        setLocation(280,0);
        //setUndecorated(true);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        try{        
            String npin = pin.getText();
            String rpin = repin.getText();
            
            if(!npin.equals(rpin)){
                JOptionPane.showMessageDialog(null, "Entered PIN does not match");
                return;
            }
            
            if(ae.getSource()==change){
                if (pin.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Enter New PIN");
                }
                if (repin.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Re-Enter new PIN");
                }
                
                Conn c1 = new Conn();
                String q1 = "update bank set pin = '"+rpin+"' where pin = '"+pin+"' ";
                String q2 = "update login set pin = '"+rpin+"' where pin = '"+pin+"' ";
                String q3 = "update signupthree set pin = '"+rpin+"' where pin = '"+pin+"' ";

                c1.s.executeUpdate(q1);
                c1.s.executeUpdate(q2);
                c1.s.executeUpdate(q3);

                JOptionPane.showMessageDialog(null, "PIN changed successfully");
                setVisible(false);
                new Transactions(rpin).setVisible(true);
            
            }else if(ae.getSource()==back){
                new Transactions(npin).setVisible(true);
                setVisible(false);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[]args){
        new PinChange("").setVisible(true);
    }
}