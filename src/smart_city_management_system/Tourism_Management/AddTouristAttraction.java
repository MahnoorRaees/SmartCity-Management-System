package smart_city_management_system.Tourism_Management;

import java.awt.Color;
import java.io.FileWriter;
import java.io.IOException;
public class AddTouristAttraction extends javax.swing.JFrame {
    public AddTouristAttraction() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        title2 = new javax.swing.JLabel();
        Add = new javax.swing.JButton();
        back = new javax.swing.JButton();
        NameTitle = new javax.swing.JLabel();
        NameInput = new javax.swing.JTextField();
        CategoryTitle = new javax.swing.JLabel();
        CategoryInput = new javax.swing.JTextField();
        DetailsTitle = new javax.swing.JLabel();
        message = new javax.swing.JLabel();
        DetailsInput = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(102, 0, 0));

        title2.setBackground(new java.awt.Color(255, 255, 255));
        title2.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        title2.setForeground(new java.awt.Color(255, 255, 204));
        title2.setText("ADD TOURIST ATTRACTION");

        Add.setBackground(new java.awt.Color(255, 255, 204));
        Add.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        Add.setForeground(new java.awt.Color(102, 0, 0));
        Add.setText("ADD");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        back.setBackground(new java.awt.Color(255, 255, 204));
        back.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        back.setForeground(new java.awt.Color(102, 0, 0));
        back.setText("back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        NameTitle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        NameTitle.setForeground(new java.awt.Color(255, 255, 204));
        NameTitle.setText("Enter Tourist Attraction Name :");

        NameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameInputActionPerformed(evt);
            }
        });

        CategoryTitle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CategoryTitle.setForeground(new java.awt.Color(255, 255, 204));
        CategoryTitle.setText("Enter Tourist Attraction Category :");

        CategoryInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoryInputActionPerformed(evt);
            }
        });

        DetailsTitle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        DetailsTitle.setForeground(new java.awt.Color(255, 255, 204));
        DetailsTitle.setText("Enter Tourist Attraction Details :");

        DetailsInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DetailsInputActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(back)
                        .addGap(229, 229, 229)
                        .addComponent(title2))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(294, 294, 294)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(message, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 162, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(CategoryTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CategoryInput, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(NameTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(NameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(DetailsTitle)
                        .addGap(18, 18, 18)
                        .addComponent(DetailsInput, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(170, 170, 170))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(back)
                    .addComponent(title2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(70, 70, 70)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameTitle)
                    .addComponent(NameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CategoryTitle)
                    .addComponent(CategoryInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DetailsTitle)
                    .addComponent(DetailsInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(105, 105, 105)
                .addComponent(Add)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(message)
                .addGap(182, 182, 182))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        if (NameInput.getText().equals("")) {
            message.setForeground(Color.white);
            message.setText("Tourist Attraction Name Required !!");
        } else if (CategoryInput.getText().equals("")) {
            message.setText("Tourist Attraction Category Required !!");
            message.setForeground(Color.white);
        } else if (DetailsInput.getText().equals("")) {
            message.setText("Tourist Attraction Details Required !!");
            message.setForeground(Color.white);
        } else {
            message.setForeground(Color.green);
            message.setText("Success");
            FileWriter importWriter = null;

            try {
                importWriter = new FileWriter("Tourism.txt", true);
                importWriter.write(NameInput.getText() + ",");
                importWriter.write(CategoryInput.getText() + ",");
                importWriter.write(DetailsInput.getText() + "\n");
                importWriter.close();
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
            NameInput.setText("");
            CategoryInput.setText("");
            DetailsInput.setText("");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_AddActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Tourism_Management_System().setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void NameInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameInputActionPerformed

    private void CategoryInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoryInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CategoryInputActionPerformed

    private void DetailsInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DetailsInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DetailsInputActionPerformed

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
            java.util.logging.Logger.getLogger(AddTouristAttraction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddTouristAttraction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddTouristAttraction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddTouristAttraction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddTouristAttraction().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JTextField CategoryInput;
    private javax.swing.JLabel CategoryTitle;
    private javax.swing.JTextField DetailsInput;
    private javax.swing.JLabel DetailsTitle;
    private javax.swing.JTextField NameInput;
    private javax.swing.JLabel NameTitle;
    private javax.swing.JButton back;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel message;
    private javax.swing.JLabel title2;
    // End of variables declaration//GEN-END:variables
}
