//JButton JLabel JtextField kullanildi
public class BasitHesapMakinesi extends javax.swing.JFrame {

    private int say=0;
    
    public BasitHesapMakinesi() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        toplama = new javax.swing.JButton();
        cikarma = new javax.swing.JButton();
        carpma = new javax.swing.JButton();
        bolme = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        birinciSayi = new javax.swing.JTextField();
        ikinciSayi = new javax.swing.JTextField();
        sonuc = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        toplama.setText("+");
        toplama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toplamaActionPerformed(evt);
            }
        });

        cikarma.setText("-");
        cikarma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cikarmaActionPerformed(evt);
            }
        });

        carpma.setText("x");
        carpma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carpmaActionPerformed(evt);
            }
        });

        bolme.setText("/");
        bolme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bolmeActionPerformed(evt);
            }
        });

        jLabel1.setText("Birinci Sayı :");

        jLabel2.setText("İkinci Sayı :");

        jLabel3.setText("Sonuç :");

        ikinciSayi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ikinciSayiActionPerformed(evt);
            }
        });

        sonuc.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(carpma)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bolme))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(toplama)
                                .addGap(46, 46, 46)
                                .addComponent(cikarma))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ikinciSayi, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(birinciSayi, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sonuc, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(birinciSayi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ikinciSayi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sonuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cikarma, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(toplama))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(carpma)
                    .addComponent(bolme))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ikinciSayiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ikinciSayiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ikinciSayiActionPerformed

    private void toplamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toplamaActionPerformed
        int birinci_sayi=Integer.valueOf(this.birinciSayi.getText());
        int ikinci_sayi=Integer.valueOf(this.ikinciSayi.getText());
        
        sonuc.setText(String.valueOf(birinci_sayi+ikinci_sayi));
    }//GEN-LAST:event_toplamaActionPerformed

    private void cikarmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cikarmaActionPerformed
        int birinci_sayi=Integer.valueOf(this.birinciSayi.getText());
        int ikinci_sayi=Integer.valueOf(this.ikinciSayi.getText());
        
        sonuc.setText(String.valueOf(birinci_sayi-ikinci_sayi));
    }//GEN-LAST:event_cikarmaActionPerformed

    private void carpmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carpmaActionPerformed
        int birinci_sayi=Integer.valueOf(this.birinciSayi.getText());
        int ikinci_sayi=Integer.valueOf(this.ikinciSayi.getText());
        
        sonuc.setText(String.valueOf(birinci_sayi*ikinci_sayi));
    }//GEN-LAST:event_carpmaActionPerformed

    private void bolmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bolmeActionPerformed
        int birinci_sayi=Integer.valueOf(this.birinciSayi.getText());
        int ikinci_sayi=Integer.valueOf(this.ikinciSayi.getText());
        
        sonuc.setText(String.valueOf((float)birinci_sayi/ikinci_sayi));
    }//GEN-LAST:event_bolmeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BasitHesapMakinesi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField birinciSayi;
    private javax.swing.JButton bolme;
    private javax.swing.JButton carpma;
    private javax.swing.JButton cikarma;
    private javax.swing.JTextField ikinciSayi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField sonuc;
    private javax.swing.JButton toplama;
    // End of variables declaration//GEN-END:variables
}
