
package bank.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Transactions extends JFrame implements ActionListener{

    JLabel text;
    JButton deposit,withdrawl,fastcash,ministatement,pinchange,balanceEnquiry,exit;
    String pin,formno;
    Transactions(String pin,String formno){
        this.pin = pin;
        this.formno=formno;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);
        
        text = new JLabel("Please Select Your Transaction");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD, 16));
        
       
        deposit = new JButton("DEPOSIT");
        withdrawl = new JButton("CASH WITHDRAWL");
        fastcash = new JButton("FAST CASH");
        ministatement = new JButton("MINI STATEMENT");
        pinchange = new JButton("PIN CHANGE");
        balanceEnquiry = new JButton("BALANCE ENQUIRY");
        exit = new JButton("EXIT");
        
        setLayout(null);
        
        text.setBounds(210,300,700,35);
        image.add(text);
        
        deposit.setBounds(170,415,150,30);
        image.add(deposit);
        
        withdrawl.setBounds(355,415,150,30);
        image.add(withdrawl);
        
        fastcash.setBounds(170,450,150,35);
        image.add(fastcash);
        
        ministatement.setBounds(355,450,150,30);
        image.add(ministatement);
        
        pinchange.setBounds(170,485,150,30);
        image.add(pinchange);
        
        balanceEnquiry.setBounds(355,485,150,30);
        image.add(balanceEnquiry);
        
        exit.setBounds(355,520,150,30);
        image.add(exit);
        
        
        deposit.addActionListener(this);
        withdrawl.addActionListener(this);
        fastcash.addActionListener(this);
        ministatement.addActionListener(this);
        pinchange.addActionListener(this);
        balanceEnquiry.addActionListener(this);
        exit.addActionListener(this);
        
        
        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
        
        
    }
    
        
    
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==deposit){ 
            setVisible(false);
            new Deposit(pin,formno).setVisible(true);
        }else if(ae.getSource()==withdrawl){ 
            setVisible(false);
            new Withdrawl(pin,formno).setVisible(true);
        }else if(ae.getSource()==fastcash ){ 
            setVisible(false);
            new FastCash(pin,formno).setVisible(true);
        }else if(ae.getSource()==ministatement){ 
            new MiniStatement(pin,formno).setVisible(true);
        }else if(ae.getSource()==pinchange){ 
            setVisible(false);
            new PinChange(pin,formno).setVisible(true);
        }else if(ae.getSource()==balanceEnquiry){ 
            this.setVisible(false);
            new BalanceEnquiry(pin,formno).setVisible(true);
        }else if(ae.getSource()==exit){ 
            System.exit(0);
        } 
    } 
    
}    