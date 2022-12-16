/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author USUARIO
 */
public class ventanaPersona extends JFrame {

    public List<JPanel> jPanelList;
    public List<JLabel> jLabelList;
    public List<JTextField> jTextFieldList;
    public List<JButton> jButtonList;

    public ventanaPersona(String title) throws HeadlessException {
        super(title);
        this.setSize(500, 500);
        this.setLocation(100, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarPanels();
        this.iniciarJButtons();
        this.iniciarJTextFields();
        this.setVisible(true);
    }

    public void iniciarPanels() {
        this.jPanelList = new ArrayList<>();
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());

        this.jPanelList.get(0).setLayout(new GridLayout(10, 1));

        this.jPanelList.get(0).add(this.jPanelList.get(1));
        this.jPanelList.get(0).add(this.jPanelList.get(2));
        this.jPanelList.get(0).add(this.jPanelList.get(3));
        this.jPanelList.get(0).add(this.jPanelList.get(4));
        this.jPanelList.get(0).add(this.jPanelList.get(5));
    }

    public void iniciarJTextFields() {
        this.jLabelList = new ArrayList<>();

        this.jLabelList.add(new JLabel("Ingrese El nombre: "));
        this.jLabelList.add(new JLabel("Ingrese la edad: "));
        this.jLabelList.add(new JLabel("Ingrese el estado civil: "));
        this.jLabelList.add(new JLabel("Sigue vivo "));

        this.jTextFieldList = new ArrayList<>();

        this.jTextFieldList.add(new JTextField(20));
        this.jTextFieldList.add(new JTextField(5));
        this.jTextFieldList.add(new JTextField(10));
        this.jTextFieldList.add(new JTextField(5));

        this.jPanelList.get(1).add(this.jLabelList.get(0));
        this.jPanelList.get(1).add(this.jTextFieldList.get(0));
        this.jPanelList.get(2).add(this.jLabelList.get(1));
        this.jPanelList.get(2).add(this.jTextFieldList.get(1));
        this.jPanelList.get(3).add(this.jLabelList.get(2));
        this.jPanelList.get(3).add(this.jTextFieldList.get(2));
        this.jPanelList.get(4).add(this.jLabelList.get(3));
        this.jPanelList.get(4).add(this.jTextFieldList.get(3));
    }

    public void iniciarJButtons() {
        this.jButtonList = new ArrayList<>();

        this.jButtonList.add(new JButton("Guardar"));
        this.jPanelList.get(5).add(this.jButtonList.get(0));
    }

}
