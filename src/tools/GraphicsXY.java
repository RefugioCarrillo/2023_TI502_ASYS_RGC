/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tools;

import java.awt.Color;
import java.awt.Graphics2D;

/**
 *
 * @author TI211
 */
public class GraphicsXY extends javax.swing.JFrame {

    /**
     * Creates new form GraphicsXY
     */
    public GraphicsXY() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnDRAW = new javax.swing.JButton();
        PnlDRAW = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnDRAW.setText("Draw");
        BtnDRAW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDRAWActionPerformed(evt);
            }
        });
        getContentPane().add(BtnDRAW, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, -1, -1));

        PnlDRAW.setPreferredSize(new java.awt.Dimension(300, 300));
        PnlDRAW.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PnlDRAWMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PnlDRAWLayout = new javax.swing.GroupLayout(PnlDRAW);
        PnlDRAW.setLayout(PnlDRAWLayout);
        PnlDRAWLayout.setHorizontalGroup(
            PnlDRAWLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        PnlDRAWLayout.setVerticalGroup(
            PnlDRAWLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        getContentPane().add(PnlDRAW, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 300, 300));

        setBounds(0, 0, 654, 487);
    }// </editor-fold>//GEN-END:initComponents

    private void drawaxis(){
        
        Graphics2D g= (Graphics2D) PnlDRAW.getGraphics();
        //dibujando el plano
        g.setColor(Color.gray);
       g.fillRect(0, 0, coordenate.WIDTH, coordenate.HEIGHT);
        
       //DIBUJANDO EL EJE X
       g.setColor(Color.white);
       g.drawLine(
                    coordenate.ToScreenX(coordenate.XMIN),
                    coordenate.ToScreenY(0),
                    coordenate.ToScreenX(coordenate.XMAX),
                    coordenate.ToScreenY(0));
       
       //DIBUJANDO  EL EJE Y
              g.drawLine(
                    coordenate.ToScreenX(0),
                    coordenate.ToScreenY(coordenate.YMIN),
                    coordenate.ToScreenX(0),
                    coordenate.ToScreenY(coordenate.YMAX));
       
              //PARA LINEAS
              for(float dx=coordenate.XMIN;dx<=coordenate.XMAX;dx+=1.0f){
                  g.drawLine(
                          coordenate.ToScreenX(dx),
                    coordenate.ToScreenY(-0.25f),
                    coordenate.ToScreenX(dx),
                    coordenate.ToScreenY(0.25f));
              }
                    
              for(float dy=coordenate.YMIN;dy<=coordenate.YMAX;dy+=1.0f){
                  g.drawLine(
                          coordenate.ToScreenX(-0.25f),
                    coordenate.ToScreenY(dy),
                    coordenate.ToScreenX(0.25f),
                    coordenate.ToScreenY(dy));
              }
                            
                
    }
    
    private void DrawFunction(){
        int nPoints  = 100;
        float X [] =new float(nPoints);
        float y [] =new float(nPoints);
        float dy [] =new float(nPoints);
        float IY [] =new float(nPoints);
        
        float dx=(coordenate).XMAX-coordenate.XMIN)/nnPoints;
        for(int i=0;i<nPoints;i++){
            X[i]= coordenate.XMIN+i*dx;
            Y[i]= 0.1f*x[i]*x[i];
            dy[i]=0.25f*x[i];
            IY[i]=0.033333f*x[i]*x[i]*x[i];
        }
        
    }
    
    private void BtnDRAWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDRAWActionPerformed
        // TODO add your handling code here:
        drawaxis();
    }//GEN-LAST:event_BtnDRAWActionPerformed

    private void PnlDRAWMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PnlDRAWMouseClicked
        // TODO add your handling code here:
        drawaxis();
    }//GEN-LAST:event_PnlDRAWMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GraphicsXY.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GraphicsXY.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GraphicsXY.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GraphicsXY.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GraphicsXY().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnDRAW;
    private javax.swing.JPanel PnlDRAW;
    // End of variables declaration//GEN-END:variables
}
