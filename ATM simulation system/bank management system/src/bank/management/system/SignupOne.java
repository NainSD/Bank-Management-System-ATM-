package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.util.*; //obj and random numbers
import com.toedter.calendar.JDateChooser; //import calendar from library jar (downloaded file)
import java.awt.event.*; //to access ActionListener

public class SignupOne extends JFrame implements ActionListener{
    long random;
    JTextField nameTextField, fathersNameTextField, emailAddressTextField, addressTextField, cityTextField, stateTextField, pinTextField;
    JDateChooser dateChooser;
    JButton next;
    JRadioButton married, unmarried, others, male, female;
    SignupOne(){
        setLayout(null); //default layout omitt
        Random ran=new Random(); //object for taking random number
        random=Math.abs((ran.nextLong()%9000L)+1000L); //avoid negative value
        
        JLabel formno=new JLabel("APPLICATION NO. "+ random); //info form title and no
        formno.setFont(new Font("Raleway",Font.BOLD, 38));//form font
        formno.setBounds(100,20,600,35); // font positions
        add(formno); // add to the frame
        
        JLabel personalDetails= new JLabel("Page 1: Personal Details"); //label personal details
        personalDetails.setFont(new Font("Raleway",Font.BOLD,22)); //set font size
        personalDetails.setBounds(180, 70, 400, 35); //text size
        add(personalDetails); // add to frame
        
        JLabel name= new JLabel("Name:"); //label for name
        name.setFont(new Font("Raleway",Font.BOLD, 20)); //set name font
        name.setBounds(65, 150, 100, 30); //font size and position
        add(name); //add to the frame
        
        nameTextField=new JTextField(""); //create block for name
        nameTextField.setFont(new Font("Raleway", Font.BOLD, 14)); //block font
        nameTextField.setBounds(220, 150, 350, 30); //size and positions
        add(nameTextField); // add to the frame
        
        JLabel fathersName= new JLabel("Father's Name:"); //label fathers Name
        fathersName.setFont(new Font("Raleway", Font.BOLD, 20)); //set font
        fathersName.setBounds(65, 190, 200, 30); //set size and positions
        add(fathersName); //add to the frame 
        
        fathersNameTextField=new JTextField(""); //create block for fname
        fathersNameTextField.setFont(new Font("Raleway", Font.BOLD, 14)); //block font
        fathersNameTextField.setBounds(220, 190, 350, 30); //size and positions
        add(fathersNameTextField); // add to the frame
        
        JLabel dateofBirth= new JLabel("Date of Birth:"); //label birth date
        dateofBirth.setFont(new Font("Raleway", Font.BOLD, 20)); //set font
        dateofBirth.setBounds(65, 230, 200, 30); //set size and positions 
        add(dateofBirth); //add to the frame
        
        dateChooser= new JDateChooser(); //create calendar
        dateChooser.setBounds(220, 230, 350, 30); //size positions
        dateChooser.setForeground(new Color(105, 105, 105)); //change font color RGB
        add(dateChooser); //add to the frame
        
        JLabel gender=new JLabel("Gender:"); //label gender
        gender.setFont(new Font("Raleway", Font.BOLD, 20)); //set font size
        gender.setBounds(65, 270, 200, 30); //size and positions
        add(gender); //add to the frame
        
        male= new JRadioButton(" Male"); //make radio m button
        male.setBounds(220, 270, 100, 30); //positioning 
        male.setBackground(Color.white); // change background to white
        add(male); //add to frame
        female= new JRadioButton(" Female"); // create radio f button
        female.setBounds(320, 270, 100, 30); //positioning 
        female.setBackground(Color.white); // change white to background 
        add(female); //add to frame
        ButtonGroup genderGroup= new ButtonGroup(); // to make select any one each time
        genderGroup.add(male);
        genderGroup.add(female);
        
        JLabel emailAddress= new JLabel("Email Address:"); //label email
        emailAddress.setFont(new Font("Raleway", Font.BOLD, 20)); //font size
        emailAddress.setBounds(65, 310, 200, 30); //size and positions
        add(emailAddress); //add to the frame
        
        emailAddressTextField=new JTextField(""); //create block for email
        emailAddressTextField.setFont(new Font("Raleway", Font.BOLD, 14)); //block font
        emailAddressTextField.setBounds(220, 310, 350, 30); //size and positions
        add(emailAddressTextField); // add to the frame
        
        JLabel maritalStatus= new JLabel("Marital Status:"); //label marital status
        maritalStatus.setFont(new Font("Raleway", Font.BOLD, 20)); //set font of marital status
        maritalStatus.setBounds(65, 350, 200, 30); //size and positions
        add(maritalStatus); //add to the frame
        
        married= new JRadioButton(" Married"); //make radio m button
        married.setBounds(220, 350, 100, 30); //positioning 
        married.setBackground(Color.white); // change background to white
        add(married); //add to frame
        unmarried= new JRadioButton(" Unmarried"); // create radio un button
        unmarried.setBounds(320, 350, 100, 30); //positioning 
        unmarried.setBackground(Color.white); // change white to background 
        add(unmarried); //add to frame
        others= new JRadioButton(" Others"); // create radio others button
        others.setBounds(430, 350, 100, 30); //positioning 
        others.setBackground(Color.white); // change white to background 
        add(others); //add to frame
        ButtonGroup maritalGroup= new ButtonGroup(); // to make select any one each time
        maritalGroup.add(married);
        maritalGroup.add(unmarried);
        maritalGroup.add(others);
        
        JLabel address=new JLabel("Address:"); //lebel address
        address.setFont(new Font("Raleway", Font.BOLD, 20)); //set fonts of address
        address.setBounds(65, 390, 200, 30); //size and positions
        add(address);
        
        addressTextField=new JTextField(""); //create block for address
        addressTextField.setFont(new Font("Raleway", Font.BOLD, 14)); //block font
        addressTextField.setBounds(220, 390, 350, 30); //size and positions
        add(addressTextField); // add to the frame
        
        JLabel city= new JLabel("City:"); //label city
        city.setFont(new Font("Raleway", Font.BOLD, 20)); //font size of the city
        city.setBounds(65, 430, 200, 30); //size and positions
        add(city); //add to the frame 
        
        cityTextField=new JTextField(""); //create block for city
        cityTextField.setFont(new Font("Raleway", Font.BOLD, 14)); //block font
        cityTextField.setBounds(220, 430, 350, 30); //size and positions
        add(cityTextField); // add to the frame
        
        JLabel state= new JLabel("State:"); //label state
        state.setFont(new Font("Raleway", Font.BOLD, 20)); //set font
        state.setBounds(65, 470, 200, 30); //size and positions
        add(state); //add to the frame
        
        stateTextField=new JTextField(""); //create block for state
        stateTextField.setFont(new Font("Raleway", Font.BOLD, 14)); //block font
        stateTextField.setBounds(220, 470, 350, 30); //size and positions
        add(stateTextField); // add to the frame
        
        JLabel pincode= new JLabel("PIN Code:"); //label pincodes
        pincode.setFont(new Font("Raleway", Font.BOLD, 20)); //set fonts
        pincode.setBounds(65, 510, 200, 30); //set size and positions
        add(pincode); //add to the frame
        
        pinTextField=new JTextField(""); //create block for state
        pinTextField.setFont(new Font("Raleway", Font.BOLD, 14)); //block font
        pinTextField.setBounds(220, 510, 350, 30); //size and positions
        add(pinTextField); // add to the frame
        
        next=new JButton("Next"); //create button
        next.setBackground(Color.BLACK); //set color of background button
        next.setForeground(Color.WHITE); //set color to text
        next.setFont(new Font("Raleway", Font.BOLD, 14)); // font size
        next.setBounds(470, 570, 100, 30); //positioning
        next.addActionListener(this); //active the next button
        add(next); //add to frame
        
        getContentPane().setBackground(Color.white); //frame color
        setSize(650,700);//make frame
        setLocation(320,20);//origin of frame
        setVisible(true);// make visible
        setTitle("PERSONAL DETAILS: PAGE1");
        //make sure all the things apppears on frame
        revalidate();
        repaint();
    }
    public void actionPerformed(ActionEvent ae){
        String formno= ""+random; //long converted to String
        String name=nameTextField.getText(); //string data convert
        String fathersName=fathersNameTextField.getText(); //data convert
        String dateofBirth= ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText(); //textfield to string data
        String gender=null; //default value before check
        if(male.isSelected()){
            gender= "Male";
        }
        else if(female.isSelected()){
            gender= "Female";
        }
        String emailAddress=emailAddressTextField.getText();//email string
        String marital=null; //default to check
        if(unmarried.isSelected()){
            marital="Unmarried";
        }
        else if(married.isSelected()){
            marital= "Married";
        }
        else if(others.isSelected()){
            marital="Others";
        }
        String address=addressTextField.getText();
        String city=cityTextField.getText();
        String state=stateTextField.getText();
        String pin=pinTextField.getText();
        
        //Validate and access sql server with conn class
        try{
            //validation part
            if(name.equals("")){
                JOptionPane.showMessageDialog(null, "Please enter a name!");
            }
            else if(fathersName.equals("")){
                JOptionPane.showMessageDialog(null, "Please enter the father's name!");
            }
            else if(dateofBirth.equals("")){
                JOptionPane.showMessageDialog(null, "Please select the date of birth!");
            }
            else if(!(male.isSelected()==true || female.isSelected()==true)){
                JOptionPane.showMessageDialog(null, "Please select gender!");
            }
            else if(emailAddress.equals("")){
                JOptionPane.showMessageDialog(null, "Please enter an email address!");
            }
            else if(!(unmarried.isSelected()==true || married.isSelected()==true || others.isSelected()==true)){
                JOptionPane.showMessageDialog(null, "Please select marital status!");
            }
            else if(address.equals("")){
                JOptionPane.showMessageDialog(null, "Please enter the address!");
            }
            else if(city.equals("")){
                JOptionPane.showMessageDialog(null, "Please enter city name!");
            }
            else if(state.equals("")){
                JOptionPane.showMessageDialog(null, "Please enter the state!");
            }
            else if(pin.equals("")){
                JOptionPane.showMessageDialog(null, "Please enter a PIN!");
            }
            else{
                Conn c= new Conn();
                String query="insert into signup values('"+formno+"','"+name+"','"+fathersName+"','"+dateofBirth+"','"+gender+"','"+emailAddress+"','"+marital+"','"+address+"','"+city+"','"+state+"','"+pin+"')";
                c.s.executeUpdate(query); //query will be run in mysql
                setVisible(false);//close current frame
                new SignupTwo(formno).setVisible(true);//create a formno way to SignupTwo class
            }
        }
        catch(Exception e){ //database is external entity that can give runtime error
            System.out.println(e);
        }
        
    }
    public static void main(String[] args){
        new SignupOne();
    }
}
