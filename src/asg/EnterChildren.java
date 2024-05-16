/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package asg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JTextField;

/**
 *
 * @author linna
 */
public class EnterChildren extends javax.swing.JFrame {

    private JFrame previousFrame;
    private String parentUsername; // Add a field to store the student's username
    private boolean accountCreatedSuccessfully = false; 
    
    public EnterChildren(JFrame previousFrame) {
        initComponents();
        this.setLocationRelativeTo(null);
        jComboBox1.setSelectedItem(null);
        this.previousFrame = previousFrame;
        
        // Add a window listener to the JFrame
        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                if (!accountCreatedSuccessfully) {
                    try {
                        // Establish database connection
                        String SUrl = "jdbc:MySQL://localhost:3306/DsAssSql";
                        String SUser = "root";
                        String Spass = "host@123";
                        
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection con = DriverManager.getConnection(SUrl, SUser, Spass);
                        
                        // Delete the user from the database
                        String query = "DELETE FROM user WHERE Username = ?";
                        PreparedStatement pstmt = con.prepareStatement(query);
                        pstmt.setString(1, parentUsername);
                        
                        int rowsAffected = pstmt.executeUpdate();
                        
//                        if (rowsAffected > 0) {
//                            System.out.println("User account deleted successfully.");
//                        } else {
//                            System.out.println("Failed to delete user account.");
//                        }
                        
                        con.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        
    }
    
    // Method to set the username
    public void setUser(String username) {
        this.parentUsername = username;
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
        c1 = new javax.swing.JTextField();
        button2 = new java.awt.Button();
        label1 = new java.awt.Label();
        jComboBox1 = new javax.swing.JComboBox<>();
        c2 = new javax.swing.JTextField();
        c3 = new javax.swing.JTextField();
        c4 = new javax.swing.JTextField();
        c5 = new javax.swing.JTextField();
        c6 = new javax.swing.JTextField();
        c7 = new javax.swing.JTextField();
        c8 = new javax.swing.JTextField();
        c9 = new javax.swing.JTextField();
        c10 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        jLabel1.setText("Parent-Child Relationship");

        c1.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N

        button2.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        button2.setLabel("Confirm");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        label1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        label1.setText("Number of child: ");

        jComboBox1.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        c2.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N

        c3.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N

        c4.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N

        c5.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N

        c6.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N

        c7.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N

        c8.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N

        c9.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N

        c10.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(c1)
                            .addComponent(c2)
                            .addComponent(c3)
                            .addComponent(c4)
                            .addComponent(c5)
                            .addComponent(c6)
                            .addComponent(c7)
                            .addComponent(c8)
                            .addComponent(c9)
                            .addComponent(c10)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel1)))
                .addContainerGap(226, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(c3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(c4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(c5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(c6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(c7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(c8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(c9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(c10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
    // Get the selected number from the combo box
    String selectedNumber = (String) jComboBox1.getSelectedItem();
    String parentUsername = this.parentUsername; 
    
    // Create an array to store the text fields
    JTextField[] textFields = {c1, c2, c3, c4, c5, c6, c7, c8, c9, c10};
    ArrayList<String> childNamesList = new ArrayList<>();
    boolean allFieldsFilled = true;
    
    if(selectedNumber==null){
        JOptionPane.showMessageDialog(new JFrame(), "Please choose your number of children","Error", JOptionPane.ERROR_MESSAGE);
    }else if(selectedNumber!=null){
        // Convert the selected number to an integer
        int numberOfChildren = Integer.parseInt(selectedNumber);
        // Iterate through the text fields and process only the visible ones
        for (int i = 0; i < numberOfChildren; i++) {
            JTextField textField = textFields[i];
            if (textField.isVisible()) {
                // Get the username from the text field
                String username = textField.getText().trim();

                // Check if the username is empty
                if (username.isEmpty()) {
                    allFieldsFilled = false;
                   break; // Exit the loop if any text field is empty
                } else {
                    childNamesList.add(username); // Add the child's name to the list
                }
                
            }
        }
        
        // Check if all visible text fields are filled
        if (!allFieldsFilled) {
            JOptionPane.showMessageDialog(new JFrame(), "Please enter usernames", "Error", JOptionPane.ERROR_MESSAGE);
           return; // Exit the method
        }

boolean allUsernamesExist = true;

    // Proceed to check if the entered usernames exist in the database
    for (String username : childNamesList) {
        // Check if the username exists in the database
        if (!usernameAlreadyExists(username)) {
            Confirm c = new Confirm();
            c.setVisible(true);
            allUsernamesExist = false;
            break; // Exit the loop if any username does not exist
        }
    }

        if (allUsernamesExist) {
            // Successfully saved parent usernames to the database
            // Generate the text file using ParentChildTxtGenerator
            ParentChildTxtGenerator.main(new String[0]); // Call the main method of ParentChildTxtGenerator to generate the file
            
            // Convert the ArrayList of child names to an array
            String[] childNamesArray = childNamesList.toArray(new String[0]);
            // Save all the valid child names to the database
            saveChildNameToDatabase(parentUsername, childNamesArray);
            
            // Check the type of the previous frame
            if (previousFrame instanceof signupforparent) {
                // If previous frame was SignUpForParent, open EnterParent frame
                showMessageDialog(null, "Account has been created successfully!");

            } else {
                // If previous frame was SignUp, open Login frame
                showMessageDialog(null, "Account has been created successfully!");
                accountCreatedSuccessfully = true; // Set flag to true after successful account creation
                login login = new login();
                login.setVisible(true);
            }
            dispose(); 
        }
    }
    
    }//GEN-LAST:event_button2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
                                     
    Object selectedItem = jComboBox1.getSelectedItem();
    
    // Hide all text fields first
    c1.setVisible(false);
    c2.setVisible(false);
    c3.setVisible(false);
    c4.setVisible(false);
    c5.setVisible(false);
    c6.setVisible(false);
    c7.setVisible(false);
    c8.setVisible(false);
    c9.setVisible(false);
    c10.setVisible(false);
    
    if (selectedItem != null) {
        int numberOfChildren = Integer.parseInt(selectedItem.toString());
        for (int i = 0; i < numberOfChildren; i++) {
            // Set the visibility of the text fields up to the selected number
            switch (i) {
                case 0:
                    c1.setVisible(true);
                    break;
                case 1:
                    c2.setVisible(true);
                    break;
                case 2:
                    c3.setVisible(true);
                    break;
                case 3:
                    c4.setVisible(true);
                    break;
                case 4:
                    c5.setVisible(true);
                    break;
                case 5:
                    c6.setVisible(true);
                    break;
                case 6:
                    c7.setVisible(true);
                    break;
                case 7:
                    c8.setVisible(true);
                    break;
                case 8:
                    c9.setVisible(true);
                    break;
                case 9:
                    c10.setVisible(true);
                    break;
                default:
                    break;
            }
        }
    }

    }//GEN-LAST:event_jComboBox1ActionPerformed

     //method to check if the username already exists in database
    private boolean usernameAlreadyExists(String username) {
        String SUrl, SUser, Spass;
        SUrl = "jdbc:MySQL://localhost:3306/DsAssSql";
        SUser = "root";
        Spass="host@123";

        String query = "SELECT Username FROM user WHERE Role = 'Student' AND Username = ?";
    
        try (Connection con = DriverManager.getConnection(SUrl, SUser, Spass);
            PreparedStatement pstmt = con.prepareStatement(query)) {
        
            pstmt.setString(1, username);
            ResultSet rs = pstmt.executeQuery();
        
            return rs.next(); // Return true if the username exists in the database
        } catch (Exception e) {
            System.out.println("Error checking username existence: " + e.getMessage());
            return false; // Return false in case of any exception
        }
    }
    
// Method to save the child's name to the database
private void saveChildNameToDatabase(String parentUsername, String[] childNames) {
    String SUrl = "jdbc:MySQL://localhost:3306/DsAssSql";
    String SUser = "root";
    String Spass = "host@123";

    String query = "UPDATE user SET ";

    // Get the selected number of children
    String selectedNumber = (String) jComboBox1.getSelectedItem();
    int numberOfChildren = Integer.parseInt(selectedNumber);

    // Append the appropriate columns based on the number of children
    for (int i = 0; i < numberOfChildren; i++) {
        query += "Child" + (i + 1) + " = ?";
        if (i < numberOfChildren - 1) {
            query += ", ";
        }
    }

    query += " WHERE Username = ? AND Role = 'Parent' ";

    try (Connection con = DriverManager.getConnection(SUrl, SUser, Spass);
         PreparedStatement pstmt = con.prepareStatement(query)) {

        // Set the child names and the parent's username
        for (int i = 0; i < numberOfChildren; i++) {
            pstmt.setString(i + 1, childNames[i]);
        }
        pstmt.setString(numberOfChildren + 1, parentUsername);

        pstmt.executeUpdate();
    } catch (Exception e) {
        System.out.println("Error saving child's names to the database: " + e.getMessage());
    }
}
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

    try {
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
                javax.swing.UIManager.setLookAndFeel(info.getClassName());
                break;
            }
        }
    } catch (ClassNotFoundException ex) {
        java.util.logging.Logger.getLogger(EnterChildren.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
        java.util.logging.Logger.getLogger(EnterChildren.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
        java.util.logging.Logger.getLogger(EnterChildren.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
        java.util.logging.Logger.getLogger(EnterChildren.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button2;
    private javax.swing.JTextField c1;
    private javax.swing.JTextField c10;
    private javax.swing.JTextField c2;
    private javax.swing.JTextField c3;
    private javax.swing.JTextField c4;
    private javax.swing.JTextField c5;
    private javax.swing.JTextField c6;
    private javax.swing.JTextField c7;
    private javax.swing.JTextField c8;
    private javax.swing.JTextField c9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private java.awt.Label label1;
    // End of variables declaration//GEN-END:variables
}
