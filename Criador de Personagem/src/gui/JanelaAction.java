/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Wagner
 */
public class JanelaAction extends JFrame implements ActionListener {
  
    private JTextField tfActionTitle;
    private JFileChooser caminhoSprite;
    private JButton btnEscolherSprite;
    private JButton btnNext;
    private String enderecoSprite;
    private JComboBox cbActionClass;
    private JComboBox cbActionSubclass1;
    private JComboBox cbActionSubclass2;
    private JLabel txtSelectedActionClass1;
    private JLabel txtSelectedActionClass2;
    
    public JanelaAction () {
        initGUI();
    }
    
    private void initGUI() {
        setTitle("Criador de Personagem");
        setSize(1024, 720);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setResizable(false);
        
        JLabel txtAction = new JLabel ("Action");
        JLabel txtActionTitle = new JLabel ("Action Title");
        JLabel txtSprite = new JLabel ("Sprite");
        JLabel txtActionClass = new JLabel ("Action Class");
        JLabel txtActionSubclass1 = new JLabel ("Action Subclass 1");
        JLabel txtActionSubclass2 = new JLabel ("Action Subclass 2");
        
        btnNext = new JButton ("Next");
        btnEscolherSprite = new JButton ("Escolher arquivo");  
        txtSelectedActionClass1 = new JLabel ("");
        txtSelectedActionClass2 = new JLabel ("");
        tfActionTitle = new JTextField();
        cbActionClass = new JComboBox();
        cbActionClass.addItem("");
        cbActionClass.addItem("Ability");
        cbActionClass.addItem("Attack");
        cbActionClass.addItem("Technique");
        cbActionSubclass1 = new JComboBox();
        cbActionSubclass2 = new JComboBox();
        
        // Listener para 'fazer algo' sempre que for selecionada uma opção no JComboBox
        cbActionClass.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange() == ItemEvent.SELECTED) // para evitar duplicações
                    txtSelectedActionClass1.setText(e.getItem().toString());
                    txtSelectedActionClass2.setText(e.getItem().toString());
                    System.out.println("Você escolheu a opção " + e.getItem());
            }
        });
        
        txtAction.setBounds(400, 40, 100, 50);
        txtActionTitle.setBounds(200, 150, 150, 25);
        tfActionTitle.setBounds(350, 150, 350, 25);
        txtSprite.setBounds(200, 250, 150, 25);
        btnEscolherSprite.setBounds(350, 250, 150, 25);
        txtActionClass.setBounds(200, 350, 150, 25);
        cbActionClass.setBounds(350, 350, 350, 25);
        txtActionSubclass1.setBounds(200, 450, 150, 25);
        cbActionSubclass1.setBounds(350, 450, 350, 25);
        txtSelectedActionClass1.setBounds(350, 480, 100, 25);
        txtActionSubclass2.setBounds(200, 550, 150, 25);
        cbActionSubclass2.setBounds(350, 550, 350, 25);
        txtSelectedActionClass2.setBounds(350, 580, 100, 25);
        btnNext.setBounds (860, 600, 100, 50);
        
        
        
        txtAction.setFont(new Font("Dialog", Font.BOLD, 20));
        txtAction.setForeground(Color.gray);
        add(txtAction);
        add(txtActionTitle);
        add(txtSprite);
        add(txtActionClass);
        add(txtActionSubclass1);
        add(txtActionSubclass2);
        add(btnNext);
        add(tfActionTitle);
        add(btnEscolherSprite);
        add(cbActionClass);
        add(cbActionSubclass1);
        add(txtSelectedActionClass1);
        add(txtSelectedActionClass2);
        add(cbActionSubclass2);
        
        btnEscolherSprite.addActionListener(this);
        btnNext.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == btnEscolherSprite) {
            System.out.println("CARREGAR SPRITE");
        }
    }
}
