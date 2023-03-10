/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package infolab4;

import java.awt.Image;
import static java.awt.image.ImageObserver.HEIGHT;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.RowFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.Employee;
import model.EmployeeDirectory;

/**
 *
 * @author ASUS
 */
public class EmployeeDetails extends javax.swing.JPanel {

    JPanel bottomPanel;
    EmployeeDirectory allEmployees;
    String selectedPhotoPath = "";
    
    public EmployeeDetails(JPanel bottomPanel, EmployeeDirectory allEmployees) {
        initComponents();
        this.bottomPanel = bottomPanel;
        this.allEmployees = allEmployees;
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        jScrollPane = new javax.swing.JScrollPane();
        employeeListTable = new javax.swing.JTable();
        searchField = new javax.swing.JTextField();
        mailField = new javax.swing.JTextField();
        ageLabel = new javax.swing.JLabel();
        browsePhotoButton = new javax.swing.JButton();
        genderLabel = new javax.swing.JLabel();
        photoDisplayLabel = new javax.swing.JLabel();
        genderField = new javax.swing.JTextField();
        startDateLabel = new javax.swing.JLabel();
        ageField = new javax.swing.JTextField();
        startDateField = new javax.swing.JTextField();
        levelLabel = new javax.swing.JLabel();
        levelField = new javax.swing.JTextField();
        phoneField = new javax.swing.JTextField();
        nameLabel = new javax.swing.JLabel();
        phoneLabel = new javax.swing.JLabel();
        mailLabel = new javax.swing.JLabel();
        deleteButton = new javax.swing.JButton();
        viewButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        searchLabel = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        employeeIDLabel = new javax.swing.JLabel();
        employeeIDField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(102, 255, 204));
        setForeground(new java.awt.Color(102, 255, 0));

        titleLabel.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        titleLabel.setText("Employees List:");

        employeeListTable.setBackground(new java.awt.Color(102, 255, 204));
        employeeListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee ID", "Name", "Level"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane.setViewportView(employeeListTable);
        if (employeeListTable.getColumnModel().getColumnCount() > 0) {
            employeeListTable.getColumnModel().getColumn(0).setResizable(false);
            employeeListTable.getColumnModel().getColumn(1).setResizable(false);
            employeeListTable.getColumnModel().getColumn(2).setResizable(false);
        }

        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });
        searchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchFieldKeyReleased(evt);
            }
        });

        mailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mailFieldActionPerformed(evt);
            }
        });

        ageLabel.setText("Age:");

        browsePhotoButton.setText("Browse Photo:");
        browsePhotoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browsePhotoButtonActionPerformed(evt);
            }
        });

        genderLabel.setText("Level:");

        genderField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderFieldActionPerformed(evt);
            }
        });

        startDateLabel.setText("Start Date(dd/MM/YYYY): ");

        ageField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageFieldActionPerformed(evt);
            }
        });

        startDateField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startDateFieldActionPerformed(evt);
            }
        });

        levelLabel.setText("Gender");

        levelField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                levelFieldActionPerformed(evt);
            }
        });

        phoneField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneFieldActionPerformed(evt);
            }
        });

        nameLabel.setText("Name:");

        phoneLabel.setText("Phone Number:");

        mailLabel.setText("Email Address:");

        deleteButton.setText("Delete Entry");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        viewButton.setText("View Details");
        viewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewButtonActionPerformed(evt);
            }
        });

        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        searchLabel.setText("Search:");

        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });

        employeeIDLabel.setText("Employee ID:");

        employeeIDField.setEditable(false);
        employeeIDField.setBackground(new java.awt.Color(204, 204, 204));
        employeeIDField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeIDFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(viewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(156, 156, 156))
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(searchLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(genderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(startDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(levelLabel)
                                    .addComponent(phoneLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(employeeIDLabel))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(levelField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(startDateField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(genderField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ageField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(phoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nameField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(employeeIDField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mailField, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(42, 42, 42))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(mailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(79, 79, 79)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(browsePhotoButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addComponent(photoDisplayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(173, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteButton)
                    .addComponent(viewButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchLabel)
                    .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(employeeIDLabel)
                            .addComponent(employeeIDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameLabel)
                            .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ageLabel)
                            .addComponent(ageField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(genderLabel)
                            .addComponent(genderField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(startDateLabel)
                            .addComponent(startDateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(levelLabel)
                            .addComponent(levelField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(phoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phoneLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mailLabel))
                        .addGap(18, 18, 18)
                        .addComponent(browsePhotoButton))
                    .addComponent(photoDisplayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addComponent(updateButton))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchFieldActionPerformed

    private void mailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mailFieldActionPerformed

    private void browsePhotoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browsePhotoButtonActionPerformed
        JFileChooser browseImageFile = new JFileChooser();

        FileNameExtensionFilter fnef = new FileNameExtensionFilter("Images", "png", "jpg", "jpeg");
        browseImageFile.addChoosableFileFilter(fnef);
        int showOpenDialogue = browseImageFile.showOpenDialog(null);
        if(showOpenDialogue == JFileChooser.APPROVE_OPTION) {
            File selectedPhoto = browseImageFile.getSelectedFile();
            selectedPhotoPath = selectedPhoto.getAbsolutePath();
            ImageIcon imagePreview = new ImageIcon(selectedPhotoPath);

            Image image = imagePreview.getImage().getScaledInstance(photoDisplayLabel.getWidth(), photoDisplayLabel.getHeight(), Image.SCALE_SMOOTH);
                    
            photoDisplayLabel.setIcon(new ImageIcon(image));
        }
    }//GEN-LAST:event_browsePhotoButtonActionPerformed

    private void genderFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderFieldActionPerformed

    private void ageFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageFieldActionPerformed

    private void startDateFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startDateFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_startDateFieldActionPerformed

    private void levelFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_levelFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_levelFieldActionPerformed

    private void phoneFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneFieldActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        int selectedIndex = employeeListTable.getSelectedRow();
        if(selectedIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select an entry to be deleted", "Error", HEIGHT);
        } else {
            DefaultTableModel model = (DefaultTableModel) employeeListTable.getModel();
            Employee employee = (Employee) model.getValueAt(selectedIndex, 1);
            
            boolean isUpdated = updateUserDetails(employee);
            
            if(isUpdated) {
               JOptionPane.showMessageDialog(this, "The selected entry is successfully updated", "Updated", HEIGHT);
               populateTable();
               emptyTextFields();
            }
        }
                
    }//GEN-LAST:event_updateButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        int selectedIndex = employeeListTable.getSelectedRow();
        if(selectedIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select an entry to be deleted", "Error", HEIGHT);
        } else {
            DefaultTableModel model = (DefaultTableModel) employeeListTable.getModel();
            Employee employee = (Employee) model.getValueAt(selectedIndex, 1);
            allEmployees.removeEmployee(employee);
            JOptionPane.showMessageDialog(this, "The selected entry is successfully deleted", "Deleted", HEIGHT);
            populateTable();
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void viewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewButtonActionPerformed
        // TODO add your handling code here:
        int selectedIndex = employeeListTable.getSelectedRow();
        if (selectedIndex <0){
            JOptionPane.showMessageDialog(this, "Please select an entry to view", "Error", HEIGHT);
            return;
        }
      
        DefaultTableModel model = (DefaultTableModel) employeeListTable.getModel();
        Employee selectedEmployee = (Employee) model.getValueAt(selectedIndex, 1);
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String date = sdf.format(selectedEmployee.getStartDate());
        selectedPhotoPath = selectedEmployee.getPhoto();
        
        employeeIDField.setText(Integer.toString(selectedEmployee.getEmployeeId()));
        nameField.setText(selectedEmployee.getName());
        ageField.setText(Integer.toString(selectedEmployee.getAge()));
        genderField.setText(selectedEmployee.getGender());
        levelField.setText(selectedEmployee.getLevel());
        mailField.setText(selectedEmployee.getEmail());
        phoneField.setText(Long.toString(selectedEmployee.getPhoneNumber()));
        startDateField.setText(date);
        
        ImageIcon imagePreview = new ImageIcon(selectedEmployee.getPhoto());
        Image image = imagePreview.getImage().getScaledInstance(photoDisplayLabel.getWidth(), photoDisplayLabel.getHeight(), Image.SCALE_SMOOTH);
        photoDisplayLabel.setIcon(new ImageIcon(image));
    }//GEN-LAST:event_viewButtonActionPerformed

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed

    private void searchFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldKeyReleased
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) employeeListTable.getModel();
        TableRowSorter<DefaultTableModel> ts = new TableRowSorter<DefaultTableModel>(model);
        employeeListTable.setRowSorter(ts);
        ts.setRowFilter(RowFilter.regexFilter(searchField.getText().trim()));
    }//GEN-LAST:event_searchFieldKeyReleased

    private void employeeIDFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeIDFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_employeeIDFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ageField;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JButton browsePhotoButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextField employeeIDField;
    private javax.swing.JLabel employeeIDLabel;
    private javax.swing.JTable employeeListTable;
    private javax.swing.JTextField genderField;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JTextField levelField;
    private javax.swing.JLabel levelLabel;
    private javax.swing.JTextField mailField;
    private javax.swing.JLabel mailLabel;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField phoneField;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JLabel photoDisplayLabel;
    private javax.swing.JTextField searchField;
    private javax.swing.JLabel searchLabel;
    private javax.swing.JTextField startDateField;
    private javax.swing.JLabel startDateLabel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JButton updateButton;
    private javax.swing.JButton viewButton;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) employeeListTable.getModel();
        model.setRowCount(0);
        for(Employee emp : allEmployees.getAllEmployees()) {
            Object[] row = new Object[3];
            row[0] = emp.getEmployeeId();
            row[1] = emp;
            row[2] = emp.getLevel();
            model.addRow(row);
        }
    }
    
    private boolean updateUserDetails(Employee employee) {
        Date startDate = new Date();
       
        employee.setName(nameField.getText());
        employee.setAge(Integer.parseInt(ageField.getText()));
        employee.setGender(genderField.getText());
        employee.setLevel(levelField.getText());
        employee.setEmail(mailField.getText());
        
        if(phoneField.getText().length() != 10) {
            JOptionPane.showMessageDialog(this, "Phone number should be 10 digits long", "Error", HEIGHT);
            return false;
        } else {
            employee.setPhoneNumber(Long.parseLong(phoneField.getText()));
        }
        
        try {
            startDate = new SimpleDateFormat("dd/MM/yyyy").parse(startDateField.getText());
            employee.setStartDate(startDate);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(this, "Please enter the date in the dd/MM/yyyy format", "Error", HEIGHT);
            return false;
        }
        
        employee.setPhoto(selectedPhotoPath);
        return true;
    }
    
    private void emptyTextFields() {
        nameField.setText("");
        ageField.setText("");
        genderField.setText("");
        levelField.setText("");
        mailField.setText("");
        phoneField.setText("");
        startDateField.setText("");
        photoDisplayLabel.setIcon(new ImageIcon());
    }
}