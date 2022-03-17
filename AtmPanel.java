import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class AtmPanel extends JPanel  {
    final int WIDTH = 825, HEIGHT = 850;
    JButton English,Hindi,ok,cancel,FS,CW,tr,saving,current,bE;
    JPasswordField J1;
    int page =1;
    int pin = 1234;
    int Amount=5000;
    

    AtmPanel(){
        setSize(WIDTH,HEIGHT);
        setFocusable(true);
        setBackground(Color.gray);
    }

    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        if(page==1){

            welcome(g);
        }else if(page ==2){
            pin(g);
        }else if(page ==2_1){
               wrongpin(g);
               pin(g);

               
            }else if(page==3){
                Saving(g);
            }else if(page==3_3){
                BalanceEnquiry(g);
            }else if(page==4){
                Account(g);
            }
               
    }

    
    public void welcome(Graphics g){

        g.setFont(new Font("TimesRoman",Font.PLAIN,30));
        g.drawString("************Welcome to we are one ATM************", WIDTH/4-150, HEIGHT/4-120);
        g.drawString("Choose your Language", WIDTH/4, HEIGHT/2-30);

        English = new JButton("ENGLISH");
        Hindi = new JButton("Hindi");
        English.setBounds(WIDTH-220,HEIGHT/3,200,50);
        Hindi.setBounds(WIDTH-220,HEIGHT/3+150,200,50);
        English.setFont(new Font("TimesRoman",Font.BOLD,15));
        Hindi.setFont(new Font("TimesRoman",Font.BOLD,15));
        add(English);
        add(Hindi);
        English.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                page=2;
                removeAll();
                repaint();
        
            }   
            
        });
        
        
    
    }
   
    public void pin(Graphics g){

        g.setFont(new Font("TimesRoman",Font.PLAIN,25));
        g.drawString("please Insert your ATM card and wait till Transcation....", WIDTH/4-75, HEIGHT/5-10);
        g.drawString("Insert Your 4 digit Pin ", WIDTH/4+30, HEIGHT/2-35);
        J1 = new JPasswordField(3);
        J1.setBounds(WIDTH/4+80, HEIGHT/2+25,90,40);
        J1.setFont(new Font("TimesRoman",Font.PLAIN,50));
        ok = new JButton("ok");
        ok.setBounds(WIDTH-220,HEIGHT/3,200,50);
        ok.setFont(new Font("TimesRoman",Font.PLAIN,25));
        cancel = new JButton("Cancel");
        cancel.setBounds(WIDTH-220,HEIGHT/2,200,50);
        cancel.setFont(new Font("TimesRoman",Font.PLAIN,25));
        add(J1);
        add(ok);
        add(cancel);
        ok.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                int Pass=Integer.parseInt(String.valueOf(J1.getPassword()));
                // System.out.println(pin == Pass);
                if(pin == Pass){
                    page=3;
                    removeAll();
                    repaint();
                }else{
                    page=2_1;
                    removeAll();
                    repaint();
                }
            }   
            
        });
        cancel.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                page=1;
                removeAll();
                repaint();
        
            }   
            
        });

        
    }
    public void Account(Graphics g){
        saving = new JButton("Saving");
        saving.setBounds(WIDTH-220,HEIGHT/3,200,50);
        saving.setFont(new Font("TimesRoman",Font.BOLD,17));
        add(saving);

        current = new JButton("Current");
        current.setBounds(WIDTH-220,HEIGHT/3+100,200,50);
        current.setFont(new Font("TimesRoman",Font.BOLD,15));
        add(current);

        bE = new JButton("Balance Enquiry");
        bE.setBounds(WIDTH-220,HEIGHT/3+200,200,50);
        bE.setFont(new Font("TimesRoman",Font.BOLD,15));
        add(bE);
        bE.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                page=3_3;
                removeAll();
                repaint();
        
            }   
            
        });

        cancel = new JButton("cancel");
        cancel.setBounds(WIDTH-220,HEIGHT/3+300,200,50);
        cancel.setFont(new Font("TimesRoman",Font.PLAIN,20));
        add(cancel);
        cancel.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                page=1;
                removeAll();
                repaint();
        
            }   
            
        });


       

    }
    public void Saving(Graphics g){
        FS = new JButton("FAST CASH");
        FS.setBounds(WIDTH-220,HEIGHT/3,200,50);
        FS.setFont(new Font("TimesRoman",Font.BOLD,17));
        add(FS);

        CW = new JButton("ACCOUNT");
        CW.setBounds(WIDTH-220,HEIGHT/3+100,200,50);
        CW.setFont(new Font("TimesRoman",Font.BOLD,15));
        add(CW);
        CW.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                page=4;
                removeAll();
                repaint();
            }   
            
        });

        tr = new JButton("ok");
        tr.setBounds(WIDTH-220,HEIGHT/3+200,200,50);
        tr.setFont(new Font("TimesRoman",Font.PLAIN,25));
        add(tr);
        // BI.addActionListener(new ActionListener(){
        //     @Override
        //     public void actionPerformed(ActionEvent e){
        //         pin(g);
        //     }   
            
        // });

        cancel = new JButton("cancel");
        cancel.setBounds(WIDTH-220,HEIGHT/3+300,200,50);
        cancel.setFont(new Font("TimesRoman",Font.PLAIN,25));
        add(cancel);
        cancel.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                page=1;
                removeAll();
                repaint();
        
            }   
            
        });


        
    }
    public void BalanceEnquiry(Graphics g){
        g.setFont(new Font("TimesRoman",Font.PLAIN,25));
        g.drawString("your Balance is " + Amount , WIDTH/4-20, HEIGHT/4+40);
        g.drawString("Thank you for using ATM...........", WIDTH/4-30, HEIGHT/3+40);
    }
    public void wrongpin(Graphics g){
        g.setFont(new Font("TimesRoman",Font.PLAIN,25));
        g.drawString("Wrong password please try again.........", WIDTH/4-20, HEIGHT/4+40);

    }


}




