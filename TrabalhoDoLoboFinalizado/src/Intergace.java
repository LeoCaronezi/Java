
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
       public Intergace() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        
        //tirando  o dfocus 
        btn1.setFocusable(false);
        btn2.setFocusable(false);
        btn3.setFocusable(false);
        btn4.setFocusable(false);
        btn5.setFocusable(false);
        btn6.setFocusable(false);
        btn7.setFocusable(false);
        btn8.setFocusable(false);
        btn9.setFocusable(false);
        
        
        
    }
  
  
   public void Jogada (JButton v){
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
          contador1++;
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
        contador1++;
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
        contador1++;
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
          contador1++;
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
        contador1++;
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
        contador1++;
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
              contador1++;
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
             contador2++;
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
             contador2++;

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
                         contador2++;

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
                             contador2++;

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
             contador2++;
           }
        if(  btn1.getText()!="" && btn2.getText()!="" && btn3.getText()!=""
                 && btn4.getText()!="" && btn5.getText()!="" && btn6.getText()!=""
                 && btn7.getText()!="" && btn8.getText()!="" && btn9.getText()!=""){
            vecendor.setText("Velha");
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
        Start = new javax.swing.JButton();
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

        Start.setText("Start");
        Start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartActionPerformed(evt);
            }
        });

        vecendor.setText("E o Vencendor E :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(vecendor, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(turno))))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Start)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btn6)
                        .addComponent(btn3)
                        .addComponent(btn9)))
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
                    .addComponent(turno)
                    .addComponent(Start))
                .addGap(18, 18, 18)
                .addComponent(vecendor, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
      Jogada(btn1);
      verifica ();
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
     Jogada(btn2);
     verifica ();
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
      Jogada(btn3);
      verifica ();
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
     Jogada(btn4);
     verifica ();
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
     Jogada (btn5);
     verifica ();
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
      Jogada (btn6);
      verifica ();
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
       Jogada (btn7);
       verifica ();
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
       Jogada (btn8);
       verifica ();
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        Jogada (btn9);
        verifica ();
    }//GEN-LAST:event_btn9ActionPerformed

    private void StartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartActionPerformed
        jogo = 1 ;
              btn1.setEnabled(true);
              btn2.setEnabled(true);
              btn3.setEnabled(true);
              btn4.setEnabled(true);
              btn5.setEnabled(true);
              btn6.setEnabled(true);
              btn7.setEnabled(true);
              btn8.setEnabled(true);
              btn9.setEnabled(true);
              // liberando os botoes 
              btn1.setText("");
              btn2.setText("");   
              btn3.setText("");
              btn4.setText("");
              btn5.setText("");
              btn6.setText("");
              btn7.setText("");
              btn8.setText("");
              btn9.setText("");
              // desabilitando as cores 
            btn1.setForeground(Color.black);
            btn2.setForeground(Color.black);
            btn3.setForeground(Color.black);
            btn4.setForeground(Color.black);
            btn5.setForeground(Color.black);
            btn6.setForeground(Color.black);
            btn7.setForeground(Color.black);
            btn8.setForeground(Color.black);
            btn9.setForeground(Color.black);
    }//GEN-LAST:event_StartActionPerformed

    
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
    private javax.swing.JButton Start;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel turno;
    private javax.swing.JLabel vecendor;
    // End of variables declaration//GEN-END:variables
}
