package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*; //to access ActionListener

public class SignupTwo extends JFrame implements ActionListener{
    JTextField nidTextField, tinTextField;
    JButton next;
    String formno;
    JRadioButton syes,sno,eyes,eno;
    JComboBox religionbox,bloodbox,edubox,occubox,incomebox;
    SignupTwo(String formno){
        this.formno=formno;
        setLayout(null); //default layout omitt
        setTitle("NEW ACCOUNT APPLICATION-PAGE 2"); // set title to bar
        
        JLabel additionalDetails= new JLabel("Page 2: Additional Details "); //label additional details
        additionalDetails.setFont(new Font("Raleway",Font.BOLD,22)); //set font size
        additionalDetails.setBounds(210, 70, 400, 35); //text size
        add(additionalDetails); // add to frame
        
        JLabel religion= new JLabel("Religion:"); //label for religion
        religion.setFont(new Font("Raleway",Font.BOLD, 20)); //set name font
        religion.setBounds(65, 150, 100, 30); //font size and position
        add(religion); //add to the frame
        
        String []religionVal={"Select", "Islam", "Hinduism", "Buddhism", "Christanity", "Judaism", "Others"}; //regligions options
        religionbox= new JComboBox(religionVal); //select options
        religionbox.setFont(new Font("Raleway", Font.BOLD, 14)); //font size
        religionbox.setBackground(Color.white); //color selected options
        religionbox.setBounds(240,150,350,30); //positions
        add(religionbox); //add to frame
        
        JLabel bloodGroup= new JLabel("Blood Group:"); //label blood group
        bloodGroup.setFont(new Font("Raleway", Font.BOLD, 20)); //set font
        bloodGroup.setBounds(65, 190, 200, 30); //set size and positions
        add(bloodGroup); //add to the frame 
        
        String []bloodVal={"Select", "AB+", "AB-", "A+", "A-", "B+", "B-", "O+", "O-"}; //blood group options
        bloodbox= new JComboBox(bloodVal); //select options
        bloodbox.setFont(new Font("Raleway", Font.BOLD, 14)); //font size
        bloodbox.setBackground(Color.white); //color selected options
        bloodbox.setBounds(240, 190, 350, 30); //positions
        add(bloodbox); //add to frame
        
        JLabel educational= new JLabel("Educational"); //label educational
        educational.setFont(new Font("Raleway", Font.BOLD, 20)); //set font
        educational.setBounds(65, 220, 200, 30); //set size and positions 
        add(educational); //add to the frame
        
        String []eduVal={"Select", "Non-graduate", "Graduate", "Post-graduate", "Others"}; //income options
        edubox= new JComboBox(eduVal); //select options
        edubox.setFont(new Font("Raleway", Font.BOLD, 14)); //font size
        edubox.setBackground(Color.white); //color selected options
        edubox.setBounds(240, 230, 350, 30); //positions
        add(edubox); //add to frame
        
        JLabel qualifications=new JLabel("Qualifications:"); //label qualifications
        qualifications.setFont(new Font("Raleway", Font.BOLD, 20)); //set font size
        qualifications.setBounds(65, 236, 200, 30); //size and positions
        add(qualifications); //add to the frame
        
        JLabel occupations= new JLabel("Occupation:"); //label occupations
        occupations.setFont(new Font("Raleway", Font.BOLD, 20)); //font size
        occupations.setBounds(65, 280, 200, 30); //size and positions
        add(occupations); //add to the frame
        
        String []occuVal={"Select", "Salaried", "Self-employed", "Unemployed", "Student", "Business", "Others"}; //occupation options
        occubox= new JComboBox(occuVal); //select options
        occubox.setFont(new Font("Raleway", Font.BOLD, 14)); //font size
        occubox.setBackground(Color.white); //color selected options
        occubox.setBounds(240, 280, 350, 30); //positions
        add(occubox); //add to frame
        
        JLabel income= new JLabel("Income:"); //label income
        income.setFont(new Font("Raleway", Font.BOLD, 20)); //set font of marital status
        income.setBounds(65, 320, 200, 30); //size and positions
        add(income); //add to the frame
        
        String []incomeVal={"null", "<1,50,000", "<2,50,000", "<5,00,000", "Upto 10,00,000"}; //income options
        incomebox= new JComboBox(incomeVal); //select options
        incomebox.setFont(new Font("Raleway", Font.BOLD, 14)); //font size
        incomebox.setBackground(Color.white); //color selected options
        incomebox.setBounds(240, 320, 350, 30); //positions
        add(incomebox); //add to frame
        
        JLabel nid=new JLabel("NID number:"); //lebel nid
        nid.setFont(new Font("Raleway", Font.BOLD, 20)); //set fonts of address
        nid.setBounds(65, 360, 200, 30); //size and positions
        add(nid);
        
        nidTextField=new JTextField(""); //create block for nid
        nidTextField.setFont(new Font("Raleway", Font.BOLD, 14)); //block font
        nidTextField.setBounds(240, 360, 350, 30); //size and positions
        add(nidTextField); // add to the frame
        
        JLabel tin= new JLabel("TIN:"); //label TIN
        tin.setFont(new Font("Raleway", Font.BOLD, 20)); //font size of the city
        tin.setBounds(65, 400, 200, 30); //size and positions
        add(tin); //add to the frame 
        
        tinTextField=new JTextField(""); //create block for city
        tinTextField.setFont(new Font("Raleway", Font.BOLD, 14)); //block font
        tinTextField.setBounds(240, 400, 350, 30); //size and positions
        add(tinTextField); // add to the frame
        
        JLabel senior= new JLabel("Senior Citizen:"); //label senior citizen
        senior.setFont(new Font("Raleway", Font.BOLD, 20)); //set font
        senior.setBounds(65, 440, 200, 30); //size and positions
        add(senior); //add to the frame
        
        syes= new JRadioButton(" Yes"); //make radio y button
        syes.setBounds(240, 440, 100, 30); //positioning 
        syes.setBackground(Color.white); // change background to white
        add(syes); //add to frame
        sno= new JRadioButton(" No"); // create radio n button
        sno.setBounds(400, 440, 100, 30); //positioning 
        sno.setBackground(Color.white); // change white to background 
        add(sno); //add to frame
        ButtonGroup seniorc= new ButtonGroup(); // to make select any one each time
        seniorc.add(syes);
        seniorc.add(sno);
        
        JLabel existAccount= new JLabel("Existing Account:"); //label existing account
        existAccount.setFont(new Font("Raleway", Font.BOLD, 20)); //set fonts
        existAccount.setBounds(65, 480, 200, 30); //set size and positions
        add(existAccount); //add to the frame
        
        eyes= new JRadioButton(" Yes"); //make radio y button
        eyes.setBounds(240, 480, 100, 30); //positioning 
        eyes.setBackground(Color.white); // change background to white
        add(eyes); //add to frame
        
        eno= new JRadioButton(" No"); // create radio n button
        eno.setBounds(400, 480, 100, 30); //positioning 
        eno.setBackground(Color.white); // change white to background 
        add(eno); //add to frame
        
        ButtonGroup exGroup= new ButtonGroup(); // to make select any one each time
        exGroup.add(eyes);
        exGroup.add(eno);
        
        next=new JButton("Next"); //create button
        next.setBackground(Color.BLACK); //set color of background button
        next.setForeground(Color.WHITE); //set color to text
        next.setFont(new Font("Raleway", Font.BOLD, 14)); // font size
        next.setBounds(470, 520, 100, 30); //positioning
        next.addActionListener(this); //active the next button
        add(next); //add to frame
        
        getContentPane().setBackground(Color.white); //frame color
        setSize(650,700);//make frame
        setLocation(320,20);//origin of frame
        setVisible(true);// make visibl
    }
    public void actionPerformed(ActionEvent ae){
        String formno= this.formno; //long converted to String
        String sreligion=(String)religionbox.getSelectedItem(); //string data convert by type casting
        String sblood=(String)bloodbox.getSelectedItem(); //data convert
        String sedubox= (String)edubox.getSelectedItem();
        String soccubox= (String)occubox.getSelectedItem();
        String sincome= (String)incomebox.getSelectedItem();
        String snid=nidTextField.getText();
        String stin= tinTextField.getText();
        String seniorc=null; //default value before check
        if(syes.isSelected()){
            seniorc= "Yes";
        }
        else if(sno.isSelected()){
            seniorc= "No";
        }
        String exGroup=null; //default to check
        if(eyes.isSelected()){
            exGroup="Yes";
        }
        else if(eno.isSelected()){
            exGroup= "No";
        }
        
        //Validate and access sql server with conn class
        try{
            //validation part
            if(sreligion.equals("")){
                JOptionPane.showMessageDialog(null, "Please select religion");
            }
            else if(sblood.equals("")){
                JOptionPane.showMessageDialog(null, "Please select blood group");
            }
            else if(sedubox.equals("")){
                JOptionPane.showMessageDialog(null, "Please select educational qualifications");
            }
            else if(soccubox.equals("")){
                JOptionPane.showMessageDialog(null, "Please select an occupation");
            }
            else if(sincome.equals("")){
                JOptionPane.showMessageDialog(null, "Please select income range");
            }
            else if(snid.equals("")){
                JOptionPane.showMessageDialog(null, "Please enter the NID number");
            }
            else if(stin.equals("")){
                JOptionPane.showMessageDialog(null, "Please enter TIN number");
            }
            else if(!(syes.isSelected()==true || sno.isSelected()==true)){
                JOptionPane.showMessageDialog(null, "Please select senior citiziens options!");
            }
            else if(!(eyes.isSelected()==true || eno.isSelected()==true)){
                JOptionPane.showMessageDialog(null, "Please select existing account options");
            }
            else{
                Conn c= new Conn();
                String query="insert into signuptwo values('"+formno+"','"+sreligion+"','"+sblood+"','"+sedubox+"','"+soccubox+"','"+sincome+"','"+snid+"','"+stin+"','"+seniorc+"','"+exGroup+"')";
                c.s.executeUpdate(query); //query will be run in mysql
                setVisible(false);
                new SignupThree(formno).setVisible(true);
            }
        }
        catch(Exception e){ //database is external entity that can give runtime error
            System.out.println(e);
        }
        
    }
    public static void main(String[] args){
        new SignupTwo("");
    }
}
