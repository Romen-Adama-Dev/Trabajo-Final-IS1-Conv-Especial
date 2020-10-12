package gui.users;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;

public class TimetableGUI extends javax.swing.JFrame {

    private final File ruta = new File("D:\\OneDrive\\Escritorio\\IS1 trabajo\\Especial\\GymAppEsp\\src\\backup");
    
    public TimetableGUI() {
        initComponents();
        File arch = null;
        FileReader FileR = null;
        BufferedReader BufferedR = null;
        
        try {
            arch = new File(ruta+"//Exercise.txt");
            FileR = new FileReader(arch);
            BufferedR = new BufferedReader(FileR);
            String information;
            DefaultTableModel table = new DefaultTableModel();
            
            table.addColumn("Show Exercises");
            
            while((information = BufferedR.readLine()) != null) {
                System.out.println(information);
                table.addRow(new String[]{information});
        }
            exerciseTable.setModel(table);
        } catch (Exception e){} finally{try{if (null!=FileR) {FileR.close();}}catch(IOException e2){}
                
            }
        
        try {
            arch = new File(ruta+"//Routine.txt");
            FileR = new FileReader(arch);
            BufferedR = new BufferedReader(FileR);
            String information;
            DefaultTableModel table = new DefaultTableModel();
            
            table.addColumn("Show Routines");
            
            while((information = BufferedR.readLine()) != null) {
                System.out.println(information);
                table.addRow(new String[]{information});
        }
            routineTable.setModel(table);
        } catch (Exception e){} finally{try{if (null!=FileR) {FileR.close();}}catch(IOException e2){}
                
        }
        
        try {
            arch = new File(ruta+"//Lessons.txt");
            FileR = new FileReader(arch);
            BufferedR = new BufferedReader(FileR);
            String information;
            DefaultTableModel table = new DefaultTableModel();
            
            table.addColumn("Show Lessons");
            
            while((information = BufferedR.readLine()) != null) {
                System.out.println(information);
                table.addRow(new String[]{information});
        }
            lessonTable.setModel(table);
        } catch (Exception e){} finally{try{if (null!=FileR) {FileR.close();}}catch(IOException e2){}
                
            }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        timeTableContent = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        exerciseTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        routineTable = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        lessonTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        exerciseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(exerciseTable);

        timeTableContent.addTab("Exercises", jScrollPane2);

        routineTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(routineTable);

        timeTableContent.addTab("Routines", jScrollPane3);

        lessonTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(lessonTable);

        timeTableContent.addTab("Lessons", jScrollPane4);

        jTabbedPane1.addTab("TImeTable", timeTableContent);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jButton1.setText("EXIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jTabbedPane1.addTab("Exit", jButton1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 783, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(TimetableGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TimetableGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TimetableGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TimetableGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TimetableGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable exerciseTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable lessonTable;
    private javax.swing.JTable routineTable;
    private javax.swing.JTabbedPane timeTableContent;
    // End of variables declaration//GEN-END:variables
}
