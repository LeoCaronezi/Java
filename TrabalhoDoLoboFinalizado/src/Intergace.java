
import java.awt.Color;
import javax.swing.JButton;

/**
 *
 * @author rafael caronezi
 */
public class Intergace extends javax.swing.JFrame {
    int contador1; 
    int contador2;
    String jogada,winner;
    int jogo =1;
    int vit;
    public Intergace() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }
   
  
   public void jogada (JButton v){
       if (jogo == 1){
           jogada ="X";
            jogo = 0;  
            turno.setText("Jogador 1. ");

            v.setEnabled(false);
            
       }
       else {
           jogada ="O";
           jogo = 1;
           turno.setText("Jogador 2.");
           v.setEnabled(false);
                  
       }
       v.setText(jogada);
       verifica();
   }
   public void verifica (){
       // verificando a primeira linha x: 
       if(btn1.getText().contains("X") && btn2.getText().contains("X") && btn3.getText().contains("X")){
          btn1.setEnabled(false);
          btn2.setEnabled(false);
          btn3.setEnabled(false);
          btn4.setEnabled(false);
          btn5.setEnabled(false);
          btn6.setEnabled(false);
          btn7.setEnabled(false);
          btn8.setEnabled(false);
          btn9.setEnabled(false);
          vecendor.setText("Jogador 1:");
          btn1.setForeground(Color.red);
          btn2.setForeground(Color.red);
          btn3.setForeground(Color.red);
          
//vitoria();
   } 
       //verifica a segunda linha:
       if(btn4.getText().contains("X") && btn5.getText().contains("X") && btn6.getText().contains("X"))
       { btn1.setEnabled(false);
        btn2.setEnabled(false);
        btn3.setEnabled(false);
        btn4.setEnabled(false);
        btn5.setEnabled(false);
        btn6.setEnabled(false);
        btn7.setEnabled(false);
        btn8.setEnabled(false);
        btn9.setEnabled(false);
        vecendor.setText("Jogoador 1");
        btn4.setForeground(Color.red);
        btn5.setForeground(Color.red);
        btn6.setForeground(Color.red);
       }
       // verifica a terceira linha  x:
       if(btn7.getText().contains("X") && btn8.getText().contains("X") && btn9.getText().contains("X")) {
            btn1.setEnabled(false);
        btn2.setEnabled(false);
        btn3.setEnabled(false);
        btn4.setEnabled(false);
        btn5.setEnabled(false);
        btn6.setEnabled(false);
        btn7.setEnabled(false);
        btn8.setEnabled(false);
        btn9.setEnabled(false);
        vecendor.setText("Jogador 1");
        btn7.setForeground(Color.red);
        btn8.setForeground(Color.red);
        btn9.setForeground(Color.red);
       }
       // verifica a primeira coluna x:
       if(btn1.getText().contains("X") && btn4.getText().contains("X") && btn7.getText().contains("X")){
            btn1.setEnabled(false);
        btn2.setEnabled(false);
        btn3.setEnabled(false);
        btn4.setEnabled(false);
        btn5.setEnabled(false);
        btn6.setEnabled(false);
        btn7.setEnabled(false);
        btn8.setEnabled(false);
        btn9.setEnabled(false);
        vecendor.setText("Jogador 1");
        btn1.setForeground(Color.red);
        btn4.setForeground(Color.red);
        btn7.setForeground(Color.red);
       }
       
       //verifica a  segunda coluna x:
       if(btn2.getText().contains("X") && btn5.getText().contains("X") && btn8.getText().contains("X")){
           btn1.setEnabled(false);
           btn2.setEnabled(false);
           btn3.setEnabled(false);
           btn4.setEnabled(false);
           btn5.setEnabled(false);
           btn6.setEnabled(false);
           btn7.setEnabled(false);
           btn8.setEnabled(false);
           btn9.setEnabled(false);
          vecendor.setText("Jogador 1");
          btn2.setForeground(Color.red);
          btn5.setForeground(Color.red);
          btn8.setForeground(Color.red);
       }
       // verifica a terceira x:
           if(btn3.getText().contains("X") && btn6.getText().contains("X") && btn9.getText().contains("X")){
                btn1.setEnabled(false);
        btn2.setEnabled(false);
        btn3.setEnabled(false);
        btn4.setEnabled(false);
        btn5.setEnabled(false);
        btn6.setEnabled(false);
        btn7.setEnabled(false);
        btn8.setEnabled(false);
        btn9.setEnabled(false);
        vecendor.setText("jogador 1");
        btn3.setForeground(Color.red);
        btn6.setForeground(Color.red);
        btn9.setForeground(Color.red);
           }
           
           // vericiando diagonal 1 :
           if(btn1.getText().contains("X") && btn5.getText().contains("X") && btn9.getText().contains("X")){
                btn1.setEnabled(false);
        btn2.setEnabled(false);
        btn3.setEnabled(false);
        btn4.setEnabled(false);
        btn5.setEnabled(false);
        btn6.setEnabled(false);
        btn7.setEnabled(false);
        btn8.setEnabled(false);
        btn9.setEnabled(false);
        vecendor.setText("Jogador 1");
        btn1.setForeground(Color.red);
        btn5.setForeground(Color.red);
        btn9.setForeground(Color.red);
           }
           //verifica segunda diagonal 2  x:
           if(btn3.getText().contains("X") && btn5.getText().contains("X") && btn9.getText().contains("X")){
              btn1.setEnabled(false);
              btn2.setEnabled(false);
              btn3.setEnabled(false);
              btn4.setEnabled(false);
              btn5.setEnabled(false);
              btn6.setEnabled(false);
              btn7.setEnabled(false);
              btn8.setEnabled(false);
              btn9.setEnabled(false);
              vecendor.setText("jOGADOR 1");
              btn3.setForeground(Color.red);
              btn5.setForeground(Color.red);
              btn9.setForeground(Color.red);
           }
           
           //verificando a primeira linha 1 0 ^:
           if(btn1.getText().contains("O") && btn2.getText().contains("O") && btn3.getText().contains("O")){
             btn1.setEnabled(false);
             btn2.setEnabled(false);
             btn3.setEnabled(false);
             btn4.setEnabled(false);
             btn5.setEnabled(false);
             btn6.setEnabled(false);
             btn7.setEnabled(false);
             btn8.setEnabled(false);
             btn9.setEnabled(false);
             vecendor.setText("jOGADOR 2");
             btn1.setForeground(Color.blue);
             btn2.setForeground(Color.blue);
             btn3.setForeground(Color.blue);
           }
           //verificando a segunda linha 0:
           if(btn4.getText().contains("O") && btn5.getText().contains("O") && btn6.getText().contains("O")){
               btn1.setEnabled(false);
             btn2.setEnabled(false);
             btn3.setEnabled(false);
             btn4.setEnabled(false);
             btn5.setEnabled(false);
             btn6.setEnabled(false);
             btn7.setEnabled(false);
             btn8.setEnabled(false);
            btn9.setEnabled(false);
            vecendor.setText("JOGADOR 2 ");
               btn4.setForeground(Color.blue);
               btn5.setForeground(Color.blue);
               btn6.setForeground(Color.blue);
           }
           //verificando a terceira linha 0:
           if(btn7.getText().contains("O") && btn8.getText().contains("O") && btn9.getText().contains("O")){
                btn1.setEnabled(false);
                btn2.setEnabled(false);
                btn3.setEnabled(false);
                btn4.setEnabled(false);
                btn5.setEnabled(false);
                btn6.setEnabled(false);
                btn7.setEnabled(false);
                btn8.setEnabled(false);
                btn9.setEnabled(false);
             vecendor.setText("jOGADOR 2");
                btn7.setForeground(Color.blue);
                btn8.setForeground(Color.blue);
                btn9.setForeground(Color.blue);
           }
           // verificando a diagonal 
           if(btn3.getText().contains("O") && btn5.getText().contains("O") && btn7.getText().contains("O")){
               btn1.setEnabled(false);
               btn2.setEnabled(false);
               btn3.setEnabled(false);
               btn4.setEnabled(false);
               btn5.setEnabled(false);
               btn6.setEnabled(false);
               btn7.setEnabled(false);
               btn8.setEnabled(false);
               btn9.setEnabled(false);
               vecendor.setText("jOGADOR 2");
                btn7.setForeground(Color.blue);
                btn5.setForeground(Color.blue);
                btn3.setForeground(Color.blue);
           }
           //verificando a diagonal
           if(btn1.getText().contains("O") && btn5.getText().contains("O") && btn9.getText().contains("O")){
              btn1.setEnabled(false);
              btn2.setEnabled(false);
              btn3.setEnabled(false);
              btn4.setEnabled(false);
              btn5.setEnabled(false);
              btn6.setEnabled(false);
              btn7.setEnabled(false);
              btn8.setEnabled(false);
              btn9.setEnabled(false);
              vecendor.setText("jOGADOR 2");
             btn5.setForeground(Color.blue);
             btn9.setForeground(Color.blue);
             btn1.setForeground(Color.blue);
           }
           
   }
   
     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        turno = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        vecendor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("vez do jogador :");

        turno.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        turno.setText("Jogador");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(turno))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn7)
                                .addGap(18, 18, 18)
                                .addComponent(btn8))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn4)
                                .addGap(18, 18, 18)
                                .addComponent(btn5)))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn6)
                            .addComponent(btn3)
                            .addComponent(btn9))))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn4)
                    .addComponent(btn5)
                    .addComponent(btn6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn9)
                    .addComponent(btn8)
                    .addComponent(btn7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(turno))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9});

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informações Do Jogo:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 18))); // NOI18N

        jLabel2.setText("Jogador1:");

        jLabel3.setText("vitorias:");

        vecendor.setText("XXXX");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(vecendor)))
                .addContainerGap(146, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(vecendor)
                .addContainerGap(183, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
      jogada(btn1);
      verifica ();
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
     jogada(btn2);
     verifica ();
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
      jogada(btn3);
      verifica ();
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
     jogada(btn4);
     verifica ();
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
     jogada (btn5);
     verifica ();
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
      jogada (btn6);
      verifica ();
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
       jogada (btn7);
       verifica ();
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
       jogada (btn8);
       verifica ();
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        jogada (btn9);
        verifica ();
    }//GEN-LAST:event_btn9ActionPerformed

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
            java.util.logging.Logger.getLogger(Intergace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Intergace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Intergace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Intergace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Intergace().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel turno;
    private javax.swing.JLabel vecendor;
    // End of variables declaration//GEN-END:variables
}
