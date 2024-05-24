package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SignupTwo extends JFrame implements ActionListener{
    
    JTextField pan,aadhar,fnameTextField;
    JRadioButton syes,sno,eyes,eno;
    JComboBox religion,category,occupation,education,income;
    String formno;
    
    SignupTwo(String formno){
        this.formno=formno;
        setLayout(null);
        
        setTitle("NEW ACCOUNT APPLICATION FORM- PAGE 2");
        
        
        JLabel additionalDetails=new JLabel("Page 2: Additional Details ");
        additionalDetails.setFont(new Font("Raleway",Font.BOLD,22));
        additionalDetails.setBounds(290,80,400,40);
        add(additionalDetails);
        
        JLabel rname=new JLabel("Religion:");
        rname.setFont(new Font("Raleway",Font.BOLD,20));
        rname.setBounds(100,140,100,30);
        add(rname);
        
        String valReligion[]={"Hindu","Muslim","Christian","Sikh","Other"};
        religion=new JComboBox(valReligion);
        religion.setBounds(300,140,400,30);
        religion.setBackground(Color.white);
        add(religion);
        
        
        
        String valCategory[]={"General","OBC","SC","ST","Other"};
        category=new JComboBox(valCategory);
        category.setBounds(300,190,400,30);
        category.setBackground(Color.white);
        add(category);
        
        String incomeCategory[]={"Null","<1,50,000","<2,50,000","<5,00,000","upto 10,00,000","above 10,00,000"};
        income=new JComboBox(incomeCategory);
        income.setBounds(300,240,400,30);
        income.setBackground(Color.white);
        add(income);
        
        
        
        JLabel cname=new JLabel("Category:");
        cname.setFont(new Font("Raleway",Font.BOLD,20));
        cname.setBounds(100,190,200,30);
        add(cname);
        
        fnameTextField=new JTextField();
        fnameTextField.setFont(new Font("Raleway",Font.BOLD,14));
        fnameTextField.setBounds(300,190,400,30);
        add(fnameTextField);
        
        JLabel iname=new JLabel("Income:");
        iname.setFont(new Font("Raleway",Font.BOLD,20));
        iname.setBounds(100,240,200,30);
        add(iname);
        
        
        
        JLabel ename=new JLabel("Educational:");
        ename.setFont(new Font("Raleway",Font.BOLD,20));
        ename.setBounds(100,290,200,30);
        add(ename);
        
        JLabel qname=new JLabel("Qualification:");
        qname.setFont(new Font("Raleway",Font.BOLD,20));
        qname.setBounds(100,315,200,30);
        add(qname);
        
        String educationalValues[]={"Non-Graduate","Graduate","Post-Graduate","Doctrate","Others"};
        education=new JComboBox(educationalValues);
        education.setBounds(300,315,400,30);
        education.setBackground(Color.white);
        add(education);
        
        
        
        JLabel oname=new JLabel("Occupation:");
        oname.setFont(new Font("Raleway",Font.BOLD,20));
        oname.setBounds(100,390,200,30);
        add(oname);
        
        String occupationValues[]={"Salaried","Self-Employed","Business","Student","Retired","Others"};
        occupation=new JComboBox(occupationValues);
        occupation.setBounds(300,390,400,30);
        occupation.setBackground(Color.white);
        add(occupation);
        
        
        syes=new JRadioButton("Yes");
        syes.setBounds(300,540,100,30);
        syes.setBackground(Color.white);
        add(syes);
        
        sno=new JRadioButton("No");
        sno.setBounds(450,540,100,30);
        sno.setBackground(Color.white);
        add(sno);
        
        ButtonGroup maritalgroup=new ButtonGroup();
        maritalgroup.add(syes);
        maritalgroup.add(sno);
        
        
        JLabel pname=new JLabel("PAN No:");
        pname.setFont(new Font("Raleway",Font.BOLD,20));
        pname.setBounds(100,440,200,30);
        add(pname);
        
        pan=new JTextField();
        pan.setFont(new Font("Raleway",Font.BOLD,14));
        pan.setBounds(300,440,400,30);
        add(pan);
        
        JLabel aname=new JLabel("Aadhar No:");
        aname.setFont(new Font("Raleway",Font.BOLD,20));
        aname.setBounds(100,490,200,30);
        add(aname);
        
        aadhar=new JTextField();
        aadhar.setFont(new Font("Raleway",Font.BOLD,14));
        aadhar.setBounds(300,490,400,30);
        add(aadhar);
        
        JLabel sname=new JLabel("Senior Citizen:");
        sname.setFont(new Font("Raleway",Font.BOLD,20));
        sname.setBounds(100,540,200,30);
        add(sname);
        
        
        
        JLabel eaname=new JLabel("Existing Account:");
        eaname.setFont(new Font("Raleway",Font.BOLD,20));
        eaname.setBounds(100,590,200,30);
        add(eaname);
        
        eyes=new JRadioButton("Yes");
        eyes.setBounds(300,590,100,30);
        eyes.setBackground(Color.white);
        add(eyes);
        
        eno=new JRadioButton("No");
        eno.setBounds(450,590,100,30);
        eno.setBackground(Color.white);
        add(eno);
        
        ButtonGroup emaritalgroup=new ButtonGroup();
        emaritalgroup.add(eyes);
        emaritalgroup.add(eno);
        
        JButton next=new JButton("Next");
        next.setBackground(Color.black);
        next.setForeground(Color.white);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);
        
        getContentPane().setBackground(Color.WHITE);
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        String formno=""+this.formno;//long
        String sreligion=(String)religion.getSelectedItem();
        String scategory=(String)category.getSelectedItem();
        String sincome=(String)income.getSelectedItem();
        String seducation =(String)education.getSelectedItem();
        String soccupation=(String)occupation.getSelectedItem();
        String seniorcitizen=null;
        if(syes.isSelected()){
            seniorcitizen="Yes";
        }
        else if(sno.isSelected()){
            seniorcitizen="No";
        }
        
        
        String existingaccount=null;
        if(eyes.isSelected()){
            existingaccount="Yes";
    
        }
        else if(eno.isSelected()){
            existingaccount="No";
        }
        
        
        String span=pan.getText();
        String saadhar=aadhar.getText();
        
        
        
        try{
            Conn c=new Conn();
            String query="insert into signuptwo values('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+span+"','"+saadhar+"','"+seniorcitizen+"','"+existingaccount+"')";
            c.s.executeUpdate(query);
                
         //Signup3 object 
         setVisible(false);
         new SignupThree(formno).setVisible(true);
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
}