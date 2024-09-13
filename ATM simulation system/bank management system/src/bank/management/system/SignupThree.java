package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class SignupThree extends JFrame implements ActionListener {

    JRadioButton savingacc, fixdepositeacc, currentacc, recurringdepositeacc;
    JCheckBox c1, c2, c3, c4, c5, c6, c7;
    JButton submit, cancel;
    String formno;

    SignupThree(String formno) {
        this.formno = formno;
        setLayout(null); //to activate setBounds
        //heading
        JLabel l1 = new JLabel("Page 3: Account Details");
        l1.setFont(new Font("Raleway", Font.BOLD, 22));
        l1.setBounds(220, 15, 400, 40);
        add(l1);
        //sub heading
        setLayout(null);
        JLabel type = new JLabel("Account Type");
        type.setFont(new Font("Raleway", Font.BOLD, 20));
        type.setBounds(80, 80, 200, 40);
        add(type);
        //add radio buttons
        savingacc = new JRadioButton(" Saving Account");
        savingacc.setFont(new Font("Raleway", Font.BOLD, 15));
        savingacc.setBounds(80, 120, 200, 20);
        savingacc.setBackground(Color.white);
        add(savingacc);
        fixdepositeacc = new JRadioButton(" Fixed Deposit Account");
        fixdepositeacc.setFont(new Font("Raleway", Font.BOLD, 15));
        fixdepositeacc.setBounds(300, 120, 300, 20);
        fixdepositeacc.setBackground(Color.white);
        add(fixdepositeacc);
        currentacc = new JRadioButton(" Current Account");
        currentacc.setFont(new Font("Raleway", Font.BOLD, 15));
        currentacc.setBounds(80, 150, 200, 20);
        currentacc.setBackground(Color.white);
        add(currentacc);
        recurringdepositeacc = new JRadioButton(" Recurring Deposite Account");
        recurringdepositeacc.setFont(new Font("Raleway", Font.BOLD, 15));
        recurringdepositeacc.setBounds(300, 150, 300, 20);
        recurringdepositeacc.setBackground(Color.white);
        add(recurringdepositeacc);
        //to make select anyone
        ButtonGroup typegroup = new ButtonGroup();
        typegroup.add(savingacc);
        typegroup.add(fixdepositeacc);
        typegroup.add(currentacc);
        typegroup.add(recurringdepositeacc);

        JLabel cardno = new JLabel("Card Number");
        cardno.setFont(new Font("Raleway", Font.BOLD, 20));
        cardno.setBounds(80, 210, 150, 40);
        add(cardno);

        JLabel card = new JLabel("Your 14 digit card number");
        card.setFont(new Font("Raleway", Font.BOLD, 12));
        card.setBounds(80, 230, 170, 40);
        add(card);

        JLabel cnumber = new JLabel("XXXX-XXXX-XXXX-8134");
        cnumber.setFont(new Font("Raleway", Font.BOLD, 20));
        cnumber.setBounds(300, 210, 280, 40);
        add(cnumber);

        JLabel pin = new JLabel("PIN:");
        pin.setFont(new Font("Raleway", Font.BOLD, 20));
        pin.setBounds(80, 290, 150, 40);
        add(pin);

        JLabel cpass = new JLabel("XXXX");
        cpass.setFont(new Font("Raleway", Font.BOLD, 20));
        cpass.setBounds(300, 280, 290, 40);
        add(cpass);

        JLabel pass = new JLabel("Your 4 digit password");
        pass.setFont(new Font("Raleway", Font.BOLD, 12));
        pass.setBounds(80, 310, 170, 40);
        add(pass);

        JLabel service = new JLabel("Services Required");
        service.setFont(new Font("Raleway", Font.BOLD, 20));
        service.setBounds(80, 360, 200, 40);
        add(service);

        c1 = new JCheckBox("ATM Card");
        c1.setFont(new Font("Raleway", Font.BOLD, 12));
        c1.setBounds(80, 400, 150, 30);
        c1.setBackground(Color.white);
        add(c1);
        c2 = new JCheckBox("Mobile Banking");
        c2.setFont(new Font("Raleway", Font.BOLD, 12));
        c2.setBounds(80, 440, 150, 30);
        c2.setBackground(Color.white);
        add(c2);
        c3 = new JCheckBox("Cheque Book");
        c3.setFont(new Font("Raleway", Font.BOLD, 12));
        c3.setBounds(80, 480, 150, 30);
        c3.setBackground(Color.white);
        add(c3);
        c4 = new JCheckBox("Internet Banking");
        c4.setFont(new Font("Raleway", Font.BOLD, 12));
        c4.setBounds(300, 400, 150, 30);
        c4.setBackground(Color.white);
        add(c4);
        c5 = new JCheckBox("Email & SMS Alerts");
        c5.setFont(new Font("Raleway", Font.BOLD, 12));
        c5.setBounds(300, 440, 150, 30);
        c5.setBackground(Color.white);
        add(c5);
        c6 = new JCheckBox("E-Statement");
        c6.setFont(new Font("Raleway", Font.BOLD, 12));
        c6.setBounds(300, 480, 150, 30);
        c6.setBackground(Color.white);
        add(c6);

        c7 = new JCheckBox("I hereby declare that above entered details are correct to the best of my knowledge.");
        c7.setFont(new Font("Raleway", Font.BOLD, 12));
        c7.setBounds(80, 560, 550, 30);
        c7.setBackground(Color.white);
        add(c7);

        submit = new JButton("Submit");
        submit.setBackground(Color.black);
        submit.setForeground(Color.white);
        submit.setFont(new Font("Raleway", Font.BOLD, 14));
        submit.setBounds(190, 610, 100, 30);
        submit.addActionListener(this);
        add(submit);
        cancel = new JButton("Cancel");
        cancel.setBackground(Color.black);
        cancel.setForeground(Color.white);
        cancel.setFont(new Font("Raleway", Font.BOLD, 14));
        cancel.setBounds(330, 610, 100, 30);
        cancel.addActionListener(this);
        add(cancel);

        getContentPane().setBackground(Color.white);
        setSize(700, 750);
        setLocation(250, 0);
        setVisible(true);
        setTitle("ACCOUNT DETAILS: PAGE3");
        //getContentPane().setBackground(Color.white);
    }

    public void actionPerformed(ActionEvent ae) {
        String accountType = null;
        String facilities = "";

        if (ae.getSource() == submit) {
            if (savingacc.isSelected()) {
                accountType = "Saving Account";
            } else if (fixdepositeacc.isSelected()) {
                accountType = "Fixed Deposite Account";
            } else if (currentacc.isSelected()) {
                accountType = "Current Account";
            } else if (recurringdepositeacc.isSelected()) {
                accountType = "Recurring Deposite Account";
            }

            // Generate card number and PIN
            Random random = new Random();
            String cardnumber = "" + Math.abs((random.nextLong() % 90000000L) + 5040936700000000L);
            String pinnumber = "" + Math.abs((random.nextLong() % 9000L) + 1000L);

            if (c7.isSelected()) {
                if (c1.isSelected()) {
                    facilities += " ATM Card";
                }
                if (c2.isSelected()) {
                    facilities += " Mobile Banking";
                }
                if (c3.isSelected()) {
                    facilities += " Cheque Book";
                }
                if (c4.isSelected()) {
                    facilities += " Internet Banking";
                }
                if (c5.isSelected()) {
                    facilities += " Email & SMS Alerts";
                }
                if (c6.isSelected()) {
                    facilities += " E-Statement";
                }

                try {
                    if (accountType == null) {
                        JOptionPane.showMessageDialog(null, "Account type is required");
                    } else if (facilities.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "At least select 1 facility");
                    } else {
                        Conn conn = new Conn();
                        String query1 = "INSERT INTO signupthree VALUES('" + formno + "','" + accountType + "','" + cardnumber + "','" + pinnumber + "','" + facilities + "')";
                        String query2 = "INSERT INTO login VALUES('" + formno + "','" + cardnumber + "','" + pinnumber + "')";
                        conn.s.executeUpdate(query1);
                        conn.s.executeUpdate(query2); // Ensure the second query is executed

                        JOptionPane.showMessageDialog(null, "Card Number: " + cardnumber + "\nPIN: " + pinnumber);
                        setVisible(false);
                        new Deposit(pinnumber).setVisible(true);
                    }
                } catch (Exception e) {
                    System.out.println(e);
                }
            } else {
                JOptionPane.showMessageDialog(null, "You have to agree with terms and conditions");
            }
        } else if (ae.getSource() == cancel) {
            setVisible(false);
            new Login().setVisible(true);
        }
    }

    public static void main(String[] args) {
        new SignupThree("");
    }
}
