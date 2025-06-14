package gui;

import javax.swing.JOptionPane;
import java.io.*;
import java.text.SimpleDateFormat;
import java.text.ParseException;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


/**
 *
 * @author jp
 */
public class issue_book extends javax.swing.JFrame {

    /**
     * Creates new form issue_book
     */
    public issue_book() {
        initComponents();
        setLocationRelativeTo(null);
        
    }
    private boolean isBookAvailable(String bookId) {
    File file = new File("books.txt");
    if (!file.exists()) return false;
    
    try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split("\\|");
            if (parts.length >= 4 && parts[0].trim().equals(bookId)) {
                int quantity = Integer.parseInt(parts[3].trim());
                return quantity > 0;
            }
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error checking book availability");
    }
    return false;
}
    private boolean bookExists(String bookId) {
    try (BufferedReader reader = new BufferedReader(new FileReader("books.txt"))) {
        String line;
        while ((line = reader.readLine()) != null) {
            String[] data = line.split("\\|");
            if (data.length > 0 && data[0].trim().equals(bookId)) {
                return true;
            }
        }
    } catch (IOException e) {
        JOptionPane.showMessageDialog(null, "Error reading books.txt");
    }
    return false;
}
    private boolean studentExists(String studentId) {
    try (BufferedReader reader = new BufferedReader(new FileReader("students.txt"))) {
        String line;
        while ((line = reader.readLine()) != null) {
            String[] data = line.split("\\|");
            if (data.length > 0 && data[0].trim().equals(studentId)) {
                return true;
            }
        }
    } catch (IOException e) {
        JOptionPane.showMessageDialog(null, "Error reading students.txt");
    }
    return false;
}
    private boolean isValidDate(String date) {
    try {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        format.setLenient(false);
        format.parse(date);
        return true;
    } catch (Exception e) {
        return false;
    }
}



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Book Id :");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Student Id :");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Issue Date :");

        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Close");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextField2.setText(" ");

        jTextField3.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jButton1)
                        .addGap(51, 51, 51)
                        .addComponent(jButton2)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel1))
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel2))
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel3))
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    String bookId = jTextField1.getText().trim();
    String studentId = jTextField2.getText().trim();
    String issueDate = jTextField3.getText().trim();

    if (bookId.isEmpty() || studentId.isEmpty() || issueDate.isEmpty()) {
        JOptionPane.showMessageDialog(this, "All fields required");
        return;
    }
    
    if (!isValidDate(issueDate)) {
        JOptionPane.showMessageDialog(this, "Invalid date format. Use yyyy-MM-dd");
        return;
    }
    
     if (!isBookAvailable(bookId)) {
        JOptionPane.showMessageDialog(this, "Book is not available");
        return;
    }
     
    if (!studentExists(studentId)) {
        JOptionPane.showMessageDialog(this, "Student ID not found");
        return;
    }
     
    File bookFile = new File("books.txt");
    File tempFile = new File("books_temp.txt");

    boolean found = false;
    boolean updated = false;

    try (
        BufferedReader reader = new BufferedReader(new FileReader(bookFile));
        BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));
    ) {
        String line;

        while ((line = reader.readLine()) != null) {
            String[] parts = line.split("\\|");

            if (parts.length < 4) continue;

            String id = parts[0].trim();
            String name = parts[1].trim();
            String author = parts[2].trim();
            int quantity = Integer.parseInt(parts[3].trim());

            if (id.equals(bookId)) {
                found = true;

                if (quantity > 0) {
                    quantity--;
                    updated = true;

                    BufferedWriter Writer = new BufferedWriter(new FileWriter("records.txt", true));
                    Writer.write(bookId + "|" + studentId + "|" + issueDate + "|ISSUED");
                    Writer.newLine();
                    Writer.close();

                    JOptionPane.showMessageDialog(this, "Book issued successfully");
                } else {
                    JOptionPane.showMessageDialog(this, "No more copies available");
                }
            }

            writer.write(id + "|" + name + "|" + author + "|" + quantity);
            writer.newLine();
        }

        reader.close();
        writer.close();

        if (!found) {
            JOptionPane.showMessageDialog(this, "Book ID not found");
            tempFile.delete();
        } else {
            bookFile.delete();
            tempFile.renameTo(bookFile);
        }

    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(issue_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(issue_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(issue_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(issue_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new issue_book().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
