package bank.management.system;
import javax.swing.*; //JFrame,JLabel,JTextField,JPasswordField
import java.awt.*; //Image class access
import java.awt.event.*; //ActionListener is here
import java.sql.*;
public class Login extends JFrame implements ActionListener{ //interface and inheritence
    JButton signin, clear, signup;
    JTextField cardTextField; 
    JPasswordField pinPasswordField;
    Login(){ //constructor
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg")); //find path to image in the system
        Image i2=i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT); //Scale the picked image
        ImageIcon i3=new ImageIcon(i2); //JLabel don't recieve Image 
        JLabel label= new JLabel(i3); //JLabel recieve object of ImageIcon not Image
        add(label); //add image on frame
        label.setBounds(50,20,100,100); //set icon in the top left
        
        setLayout(null); //omitt default middle bordar layout to make visible
        setTitle("Automated Teller Machine"); //frame title naming
        setSize(800,480); //make frame and size
        setVisible(true); //default frame was not visible or false
        setLocation(250,150); // move orgin in the middle from top left
        getContentPane().setBackground(Color.white); //change color of the frame
        
        
        JLabel text= new JLabel("Welcome to ATM"); //A message put in text object
        text.setFont(new Font("Osward",Font.BOLD, 38)); //font size shape
        text.setBounds(200, 20, 400, 100); //message position
        add(text); // that message added to frame
        
        JLabel cardno= new JLabel("Card No:"); //A message put in text object
        cardno.setFont(new Font("Raleway",Font.BOLD, 28)); //font size shape
        cardno.setBounds(80, 120, 200, 100); //message position
        add(cardno); // that message added to frame
        
        JLabel pin= new JLabel("PIN:"); //A message put in text object
        pin.setFont(new Font("Raleway",Font.BOLD, 28)); //font size shape
        pin.setBounds(80, 180, 100, 100); //message position
        add(pin); // that message added to frame
        
        cardTextField=new JTextField(); //make blank box of card
        cardTextField.setBounds(250, 160, 250, 28); //size box
        cardTextField.setFont(new Font("Arial", Font.BOLD, 14)); //font size
        add(cardTextField); //added to the frame
        
        pinPasswordField=new JPasswordField(); //make blank box of pin
        pinPasswordField.setBounds(250, 217, 250, 28); //size box
        pinPasswordField.setFont(new Font("Arial", Font.BOLD, 20)); //font size
        add(pinPasswordField); //added to the frame
        
        signin= new JButton("SIGN IN"); //create button
        signin.setBounds(250,300,110,30); //size button 
        signin.setBackground(Color.black); //button color
        signin.setForeground(Color.white); //button text color
        signin.addActionListener(this); //to listen button clicked
        add(signin); // add button to frame
        
        clear= new JButton("CLEAR"); //create clear button
        clear.setBounds(390,300,110,30); //size clear button
        clear.setBackground(Color.black); // button color
        clear.setForeground(Color.white); //button text color
        clear.addActionListener(this); //to listen button clicked
        add(clear); //add button to the frame
        
        signup= new JButton("SIGN UP"); //create signup button
        signup.setBounds(250,350,250,30); //size signup button
        signup.setBackground(Color.black); // button color
        signup.setForeground(Color.white); //button text color
        signup.addActionListener(this); //to listen button clicked
        add(signup); //add button to the frame
        
        revalidate();
        repaint();
 
    }
    @Override
    public void actionPerformed(ActionEvent ae) { //interface of ActionListener
        if(ae.getSource()==clear){   //action on clear button
            cardTextField.setText(""); //clear card no
            pinPasswordField.setText(""); //clear pin
        } 
        else if(ae.getSource()==signin){ //actiob on signin button
            Conn conn=new Conn();
            String cardnumber=cardTextField.getText();
            String pinnumber=pinPasswordField.getText();
            String query="select * from login where card_number='"+cardnumber+"' and pin_number='"+pinnumber+"'";
            try{
                ResultSet rs=conn.s.executeQuery(query);
                if(rs.next()){
                    setVisible(false);
                    new Transactions(pinnumber).setVisible(true);
                }
                else{
                    JOptionPane.showMessageDialog(null,"Incorrect Password or PIN");
                }
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
        else if(ae.getSource()==signup){ //action on signup button
            setVisible(false); //off the current frame
            new SignupOne().setVisible(true); //through obj open the new frame
        }
    }
    public static void main(String[]args){
        new Login(); //object for making frame
    }
}
