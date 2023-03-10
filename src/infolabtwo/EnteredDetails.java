/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package infolabtwo;
import data.User;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author gunjitarora
 */
public class EnteredDetails extends javax.swing.JPanel {

    /**
     * Creates new form viewDetailsPanel
     * @param addedUser
     */
    
    
  

    public EnteredDetails(User addedUser) throws IOException {
        initComponents();
        Image img = ImageIO.read(new File(addedUser.getProfilePicturePath()));
        jButton1.setIcon(new ImageIcon(img));
        firstNameLabel.setText(addedUser.getFirstName());
        lastNameLabel.setText(addedUser.getLastName());
        majorLabel.setText(addedUser.getMajor());
        ageLabel.setText(addedUser.getAge());
        telephoneLabel.setText(addedUser.getTelephoneNumber());
        emailLabel.setText(addedUser.getEmail());
        addressLabel.setText(addedUser.getAddress());
        countryLabel.setText(addedUser.getCountry());
        cityLabel.setText(addedUser.getCity());
        
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
        firstName = new javax.swing.JLabel();
        lastName = new javax.swing.JLabel();
        major = new javax.swing.JLabel();
        firstNameLabel = new javax.swing.JLabel();
        lastNameLabel = new javax.swing.JLabel();
        majorLabel = new javax.swing.JLabel();
        age = new javax.swing.JLabel();
        telephoneNumber = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        ageLabel = new javax.swing.JLabel();
        telephoneLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        address = new javax.swing.JLabel();
        city = new javax.swing.JLabel();
        country = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();
        cityLabel = new javax.swing.JLabel();
        countryLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 255, 204));

        titleLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Information Entered");

        firstName.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        firstName.setText("First Name");

        lastName.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lastName.setText("Last Name");

        major.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        major.setText("Major");

        age.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        age.setText("Age");

        telephoneNumber.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        telephoneNumber.setText("Telephone Number");

        email.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        email.setText("Email");

        address.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        address.setText("Address");

        city.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        city.setText("City");

        country.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        country.setText("Country");

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(firstName)
                            .addComponent(lastName)
                            .addComponent(major)
                            .addComponent(age)
                            .addComponent(telephoneNumber)
                            .addComponent(email)
                            .addComponent(address)
                            .addComponent(city)
                            .addComponent(country))
                        .addGap(133, 133, 133)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(telephoneLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addressLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cityLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(firstNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lastNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(majorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(countryLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(emailLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(833, 833, 833))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(firstName)
                            .addComponent(firstNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lastName)
                            .addComponent(lastNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(major)
                            .addComponent(majorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(age)
                            .addComponent(ageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(telephoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(telephoneLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(country, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(countryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1712, 1712, 1712))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel address;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JLabel age;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JLabel city;
    private javax.swing.JLabel cityLabel;
    private javax.swing.JLabel country;
    private javax.swing.JLabel countryLabel;
    private javax.swing.JLabel email;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel firstName;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lastName;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JLabel major;
    private javax.swing.JLabel majorLabel;
    private javax.swing.JLabel telephoneLabel;
    private javax.swing.JLabel telephoneNumber;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
