/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.imbochfckyeah.projects.calculatorphysical;

import static java.lang.Math.sqrt;
import javax.swing.*;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import java.text.DecimalFormat;

/**
 *
 * @author joshu
 */
public class MOVproyectiles extends javax.swing.JInternalFrame {

    double vi, ang, x, g = 9.8;
    int resulParse;

    /**
     * Creates new form MOVproyectiles
     */
    public MOVproyectiles() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
        setcombo();
        hideelements();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        selectoption = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btcalcular = new com.imbochfckyeah.projects.calculatorphysical.PanelRound();
        calcular = new javax.swing.JLabel();
        btcalcular2 = new com.imbochfckyeah.projects.calculatorphysical.PanelRound();
        clean = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(144, 224, 239));

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MOVIMIENTO DE PROYECTILES");

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Elige una opción a ejecutar");

        selectoption.setBackground(new java.awt.Color(0, 180, 216));
        selectoption.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        selectoption.setForeground(new java.awt.Color(255, 255, 255));
        selectoption.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elige una opcion" }));
        selectoption.setBorder(null);
        selectoption.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                selectoptionItemStateChanged(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("jLabel3");

        jTextField1.setBackground(new java.awt.Color(0, 180, 216));
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setBorder(null);

        jTextField3.setBackground(new java.awt.Color(0, 180, 216));
        jTextField3.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setBorder(null);

        jLabel7.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("jLabel3");

        jTextField4.setBackground(new java.awt.Color(0, 180, 216));
        jTextField4.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(255, 255, 255));
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setBorder(null);

        jLabel8.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("jLabel3");

        btcalcular.setBackground(new java.awt.Color(0, 180, 216));
        btcalcular.setRoundBottomLeft(20);
        btcalcular.setRoundBottomRight(20);
        btcalcular.setRoundTopLeft(20);
        btcalcular.setRoundTopRight(20);

        calcular.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        calcular.setForeground(new java.awt.Color(255, 255, 255));
        calcular.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        calcular.setText("CALCULAR");
        calcular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                calcularMousePressed(evt);
            }
        });

        javax.swing.GroupLayout btcalcularLayout = new javax.swing.GroupLayout(btcalcular);
        btcalcular.setLayout(btcalcularLayout);
        btcalcularLayout.setHorizontalGroup(
            btcalcularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btcalcularLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(calcular, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap())
        );
        btcalcularLayout.setVerticalGroup(
            btcalcularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(calcular, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        btcalcular2.setBackground(new java.awt.Color(0, 180, 216));
        btcalcular2.setRoundBottomLeft(20);
        btcalcular2.setRoundBottomRight(20);
        btcalcular2.setRoundTopLeft(20);
        btcalcular2.setRoundTopRight(20);

        clean.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        clean.setForeground(new java.awt.Color(255, 255, 255));
        clean.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clean.setText("LIMPIAR");
        clean.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cleanMousePressed(evt);
            }
        });

        javax.swing.GroupLayout btcalcular2Layout = new javax.swing.GroupLayout(btcalcular2);
        btcalcular2.setLayout(btcalcular2Layout);
        btcalcular2Layout.setHorizontalGroup(
            btcalcular2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btcalcular2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(clean, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap())
        );
        btcalcular2Layout.setVerticalGroup(
            btcalcular2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(clean, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(selectoption, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(225, 225, 225))
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addContainerGap(125, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btcalcular2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btcalcular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(371, 371, 371))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(30, 30, 30)
                .addComponent(selectoption, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btcalcular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btcalcular2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setBounds(0, 0, 1010, 589);
    }// </editor-fold>//GEN-END:initComponents

    private void calcularMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calcularMousePressed
        // TODO add your handling code here:
        resulParse = parse();

        switch (selectoption.getSelectedIndex()){
            case 1:
            xMax();
            break;
            case 2:
            hMax();
            break;
            case 3:
            tMax();
            break;
        }
    }//GEN-LAST:event_calcularMousePressed

    private void selectoptionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_selectoptionItemStateChanged
        // TODO add your handling code here:
        switch (selectoption.getSelectedIndex()) {
            case 1:
            jLabel8.setText("Alcance máximo");
            showelements();
            break;
            case 2:
            jLabel8.setText("Altura máxima");
            showelements();
            break;
            case 3:
            jLabel8.setText("Tiempo de vielo");
            showelements();
            break;
        }
    }//GEN-LAST:event_selectoptionItemStateChanged

    private void cleanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cleanMousePressed
        // TODO add your handling code here:
        jTextField1.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
    }//GEN-LAST:event_cleanMousePressed

    private void xMax(){

        String pattern = "###,###.###";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);

        switch (resulParse){
            case 1:
                ang = ang * 2;
                ang = Math.toRadians(ang);
                vi = sqrt((x*g) / Math.sin(ang));

                jTextField1.setText(decimalFormat.format(vi)+" mt/s");
                break;
            case 2:
                vi = Math.pow(vi,2);
                ang = (Math.asin(x*g/vi)) / 2;
                ang = Math.toDegrees(ang);

                jTextField3.setText(decimalFormat.format(ang)+" °");
                break;
            case 3:
                ang = ang * 2;
                ang = Math.toRadians(ang);
                x = (Math.pow(vi,2) * Math.sin(ang)) / g;

                jTextField4.setText(decimalFormat.format(x)+" mt");
                break;
        }

    }
    
    private void hMax(){
        String pattern = "###,###.###";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);

        switch (resulParse){
            case 1:
                ang = Math.toRadians(ang);
                ang = Math.sin(ang);
                vi = (sqrt(2)*sqrt(x * g)) / ang;

                jTextField1.setText(decimalFormat.format(vi)+" mt/s");
                break;
            case 2:
                ang = sqrt((x*(2*g)) / Math.pow(vi,2));
                System.out.println(ang);
                ang = Math.asin(ang);
                ang = Math.toDegrees(ang);
                
                jTextField3.setText(decimalFormat.format(ang)+" °");
                break;
            case 3:

                ang = Math.toRadians(ang);
                ang = Math.sin(ang);
                ang = Math.pow(ang,2);
                x = (Math.pow(vi,2) * ang) / (2 * g);


                jTextField4.setText(decimalFormat.format(x)+" mt");
                break;
        }

    }
    
    private void tMax(){
        String pattern = "###,###.###";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);

        switch (resulParse){
            case 1:
                ang = Math.toRadians(ang);
                ang = Math.sin(ang);
                vi = (x*g) / (2*ang);

                jTextField1.setText(decimalFormat.format(vi)+" mt/s");
                break;
            case 2:
                ang = ((x*g)/(2*vi));
                ang = Math.asin(ang);
                ang = Math.toDegrees(ang);
                
                jTextField3.setText(decimalFormat.format(ang)+" °");
                break;
            case 3:
                ang = Math.toRadians(ang);
                ang = Math.sin(ang);
                x = (2*((vi*(ang)/g)));

                jTextField4.setText(decimalFormat.format(x)+" sg");
                break;
        }

    }

    private Integer parse(){
        if(jTextField1.getText().isEmpty()){
            ang = Double.parseDouble(jTextField3.getText());
            x = Double.parseDouble(jTextField4.getText());
            return(1);
        }else if(jTextField3.getText().isEmpty()){
            vi = Double.parseDouble(jTextField1.getText());
            x = Double.parseDouble(jTextField4.getText());
            return(2);
        }else if(jTextField4.getText().isEmpty()){
            vi = Double.parseDouble(jTextField1.getText());
            ang = Double.parseDouble(jTextField3.getText());
            return(3);
        }else{
            JOptionPane.showMessageDialog(this, "Para realizar la operación se necesitan conocer al menos 2 variables.");
        }
        return(0);

    }

    public void setcombo() {
        selectoption.addItem("Calcular alcance máximo");
        selectoption.addItem("Calcular altura máxima");
        selectoption.addItem("Calcular tiempo de vuelo");
    }

    public void hideelements() {
        jLabel3.setVisible(false);
        jLabel7.setVisible(false);
        jLabel8.setVisible(false);
        jTextField1.setVisible(false);
        jTextField3.setVisible(false);
        jTextField4.setVisible(false);
        btcalcular.setVisible(false);
        clean.setVisible(false);
    }

    public void showelements() {
        jLabel3.setVisible(true);
        jLabel7.setVisible(true);
        jLabel8.setVisible(true);
        jTextField1.setVisible(true);
        jTextField3.setVisible(true);
        jTextField4.setVisible(true);
        btcalcular.setVisible(true);
        clean.setVisible(true);
        jLabel3.setText("Velocidad inicial");
        jLabel7.setText("Ángulo");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.imbochfckyeah.projects.calculatorphysical.PanelRound btcalcular;
    private com.imbochfckyeah.projects.calculatorphysical.PanelRound btcalcular1;
    private com.imbochfckyeah.projects.calculatorphysical.PanelRound btcalcular2;
    private javax.swing.JLabel calcular;
    private javax.swing.JLabel calcular1;
    private javax.swing.JLabel clean;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JComboBox<String> selectoption;
    // End of variables declaration//GEN-END:variables
}
