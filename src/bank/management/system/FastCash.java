
package bank.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.Date;

public class FastCash extends JFrame implements ActionListener {

    JLabel l1;
    JButton b1, b2, b3, b4, b5, b6, b7;
    String pin,formno;

    FastCash(String pin,String formno) {
        this.pin = pin;
        this.formno=formno;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0, 0, 900, 900);
        add(l3);

        l1 = new JLabel("SELECT WITHDRAWL AMOUNT");
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("System", Font.BOLD, 16));

        b1 = new JButton("Rs 100");
        b2 = new JButton("Rs 500");
        b3 = new JButton("Rs 1000");
        b4 = new JButton("Rs 2000");
        b5 = new JButton("Rs 5000");
        b6 = new JButton("Rs 10000");
        b7 = new JButton("BACK");

        setLayout(null);

        l1.setBounds(210, 300, 700, 35);
        l3.add(l1);

        b1.setBounds(170, 415, 150, 30);
        l3.add(b1);

        b2.setBounds(355, 415, 150, 30);
        l3.add(b2);

        b3.setBounds(170, 450, 150, 30);
        l3.add(b3);

        b4.setBounds(355, 450, 150, 30);
        l3.add(b4);

        b5.setBounds(170, 485, 150, 30);
        l3.add(b5);

        b6.setBounds(355, 485, 150, 30);
        l3.add(b6);

        b7.setBounds(355, 520, 150, 30);
        l3.add(b7);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);

        setSize(900, 1080);
        setLocation(300, 0);
        setUndecorated(true);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b7) {
                this.setVisible(false);
                new Transactions(pin,formno).setVisible(true);
        }else{
             String amount = ((JButton)ae.getSource()).getText().substring(3); 
             Conn c = new Conn();
             try{
                ResultSet rs = c.s.executeQuery("select * from bank where formno = '"+formno+"'");
                int balance = 0;
                while (rs.next()) {
                    if (rs.getString("type").equals("Deposit")) {
                    balance += Integer.parseInt(rs.getString("amount"));
                    } else {
                        balance -= Integer.parseInt(rs.getString("amount"));
                    }
                }
                
                if (ae.getSource() != b7 && balance < Integer.parseInt(amount)) {
                    JOptionPane.showMessageDialog(null, "Insuffient Balance");
                    return;
                }
                
                Date date = new Date();
                String query="insert into bank values('"+formno+"','"+pin+"','"+date+"', 'Withdrawl', '"+amount+"')";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Rs. "+amount+" Debited Successfully");
                
                setVisible(false);
                new Transactions(pin,formno).setVisible(true);
             }catch(Exception e){
                 System.out.println(e);
             }    
            
        
        }

    }
    

   
}
