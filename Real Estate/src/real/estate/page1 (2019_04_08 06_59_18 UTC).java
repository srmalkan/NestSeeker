
package real.estate;

import static com.mysql.cj.conf.BooleanPropertyDefinition.AllowableValues.NO;
import static com.mysql.cj.conf.BooleanPropertyDefinition.AllowableValues.YES;
import java.awt.Color;
import javax.swing.JFrame;
import java.awt.GraphicsEnvironment;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JViewport;
import java.io.File;
import java.io.FileFilter;
import javax.imageio.ImageIO;
import javax.swing.filechooser.FileNameExtensionFilter;
import static jdk.nashorn.tools.ShellFunctions.input;

public class page1 extends javax.swing.JFrame {
    
     sell s = new sell();

    public page1() {
        initComponents();
       
        jPanel9.setBackground(new Color(0,0,51,225));
        jLabel1.setVisible(false);    
        jPanel4.setVisible(false);
        jPanel5.setVisible(false);
        jScrollPane1.setVisible(false);  
        Agents.setVisible(false);
        reg.setVisible(false);
        jPanel2.setVisible(false);
        loginpg.setVisible(true);
        contactus.setVisible(false);
        forgetpass.setVisible(false);
        invalid.setVisible(false);
        sellrentprop.setVisible(false);
         Commerial.setVisible(false);
        commerial1.setVisible(false);
        detail2.setVisible(false);
        detail3.setVisible(false);
        detail4.setVisible(false);
        Filechos.setVisible(false);

         jScrollPane1.getVerticalScrollBar().setUnitIncrement(2);
         jScrollPane1.getViewport().setScrollMode(JViewport.BACKINGSTORE_SCROLL_MODE);
         for (int i=0;i>=1000;i++)
         {   try{
             System.out.print("Run");
             jPanel7.setVisible(true);
             jPanel8.setVisible(false);// NOI18N
             Thread.sleep(500);
              jPanel7.setVisible(false);
             jPanel8.setVisible(true);
            }
             catch(Exception e)
             {}
         }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usertype = new javax.swing.ButtonGroup();
        Transtype = new javax.swing.ButtonGroup();
        propfor = new javax.swing.ButtonGroup();
        Iam = new javax.swing.ButtonGroup();
        propavail = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        srchpg = new javax.swing.JPanel();
        searchpg = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel65 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jPanel8 = new javax.swing.JPanel();
        jLabel69 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        sellrent = new javax.swing.JLabel();
        contact1 = new javax.swing.JLabel();
        contact = new javax.swing.JLabel();
        profile = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        delhi = new javax.swing.JLabel();
        bengalu = new javax.swing.JLabel();
        hyderbd = new javax.swing.JLabel();
        ahmedbd = new javax.swing.JLabel();
        chandi = new javax.swing.JLabel();
        chenn = new javax.swing.JLabel();
        pune = new javax.swing.JLabel();
        mum = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        selectcity = new javax.swing.JTextField();
        beds = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        loginpg = new javax.swing.JPanel();
        login = new javax.swing.JButton();
        register = new javax.swing.JButton();
        reg = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        emailid = new javax.swing.JTextField();
        fullname = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        passreg = new javax.swing.JPasswordField();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        seccodereg = new javax.swing.JPasswordField();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        seller = new javax.swing.JRadioButton();
        Buyer = new javax.swing.JRadioButton();
        jLabel50 = new javax.swing.JLabel();
        ph_no = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        log = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        userid = new javax.swing.JTextField();
        pass = new javax.swing.JPasswordField();
        forgetpas = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        invalid = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        forgetpass = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        passfp = new javax.swing.JTextField();
        seccodefp = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel9 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        contactus = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        Agents = new javax.swing.JPanel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        sellrentprop = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        jLabel105 = new javax.swing.JLabel();
        jSeparator17 = new javax.swing.JSeparator();
        jLabel106 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        detail3 = new javax.swing.JPanel();
        Filechos = new javax.swing.JPanel();
        jFileChooser1 = new javax.swing.JFileChooser();
        jLabel110 = new javax.swing.JLabel();
        newprop = new javax.swing.JRadioButton();
        resale = new javax.swing.JRadioButton();
        resale1 = new javax.swing.JRadioButton();
        newprop1 = new javax.swing.JRadioButton();
        jLabel111 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel114 = new javax.swing.JLabel();
        featnext = new javax.swing.JLabel();
        featprev = new javax.swing.JLabel();
        jSeparator18 = new javax.swing.JSeparator();
        jTextField5 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel115 = new javax.swing.JLabel();
        detail2 = new javax.swing.JPanel();
        jLabel116 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel117 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel118 = new javax.swing.JLabel();
        jLabel119 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel121 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel123 = new javax.swing.JLabel();
        jLabel124 = new javax.swing.JLabel();
        jLabel125 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        jLabel126 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel127 = new javax.swing.JLabel();
        locnext = new javax.swing.JLabel();
        locprev = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel128 = new javax.swing.JLabel();
        jLabel129 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jSeparator19 = new javax.swing.JSeparator();
        detail1 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel130 = new javax.swing.JLabel();
        jLabel131 = new javax.swing.JLabel();
        residential1 = new javax.swing.JLabel();
        commerial1 = new javax.swing.JLabel();
        Commerial = new javax.swing.JLabel();
        Residential = new javax.swing.JLabel();
        commerialB = new javax.swing.JLabel();
        residentialB = new javax.swing.JLabel();
        jLabel132 = new javax.swing.JLabel();
        jLabel133 = new javax.swing.JLabel();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        proptype = new javax.swing.JTextField();
        jLabel134 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        city = new javax.swing.JComboBox<>();
        jLabel135 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        locality = new javax.swing.JTextArea();
        jLabel136 = new javax.swing.JLabel();
        detailnext = new javax.swing.JLabel();
        jSeparator20 = new javax.swing.JSeparator();
        detail4 = new javax.swing.JPanel();
        jLabel137 = new javax.swing.JLabel();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel138 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setAutoscrolls(true);
        jScrollPane1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jScrollPane1.setOpaque(false);

        searchpg.setLayout(null);

        jTextField2.setText("jTextField2");
        searchpg.add(jTextField2);
        jTextField2.setBounds(1120, 380, 130, 40);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel65.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel65.setIcon(new javax.swing.ImageIcon("C:\\Users\\Smit\\Desktop\\mumbai.PNG")); // NOI18N
        jLabel65.setOpaque(true);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel6.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 250));

        jScrollPane2.setViewportView(jTextPane1);

        jPanel6.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 420, 140));

        jLabel69.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel69.setIcon(new javax.swing.ImageIcon("C:\\Users\\Smit\\Desktop\\pune.PNG")); // NOI18N
        jLabel69.setOpaque(true);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel6.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 250));

        searchpg.add(jPanel6);
        jPanel6.setBounds(340, 890, 810, 330);

        jPanel3.setOpaque(false);

        sellrent.setBackground(new java.awt.Color(255, 255, 255));
        sellrent.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        sellrent.setForeground(new java.awt.Color(0, 0, 51));
        sellrent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sellrent.setText("Sell/Rent property ");
        sellrent.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        sellrent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sellrent.setDebugGraphicsOptions(javax.swing.DebugGraphics.FLASH_OPTION);
        sellrent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sellrentMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sellrentMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sellrentMouseExited(evt);
            }
        });

        contact1.setBackground(new java.awt.Color(255, 255, 255));
        contact1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        contact1.setForeground(new java.awt.Color(0, 0, 51));
        contact1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contact1.setText("Agents");
        contact1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        contact1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        contact1.setDebugGraphicsOptions(javax.swing.DebugGraphics.FLASH_OPTION);
        contact1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                contact1FocusGained(evt);
            }
        });
        contact1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contact1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                contact1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                contact1MouseExited(evt);
            }
        });

        contact.setBackground(new java.awt.Color(255, 255, 255));
        contact.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        contact.setForeground(new java.awt.Color(0, 0, 51));
        contact.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contact.setText("Contact us");
        contact.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        contact.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        contact.setDebugGraphicsOptions(javax.swing.DebugGraphics.FLASH_OPTION);
        contact.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contactMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                contactMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                contactMouseExited(evt);
            }
        });

        profile.setBackground(new java.awt.Color(255, 255, 255));
        profile.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        profile.setForeground(new java.awt.Color(0, 0, 51));
        profile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        profile.setText("Profile");
        profile.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        profile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        profile.setDebugGraphicsOptions(javax.swing.DebugGraphics.FLASH_OPTION);
        profile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                profileMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                profileMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(887, Short.MAX_VALUE)
                .addComponent(sellrent, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(contact1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(contact, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(profile, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sellrent, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contact1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contact, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(profile, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );

        searchpg.add(jPanel3);
        jPanel3.setBounds(0, -10, 1480, 140);

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(null);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Rent");
        jLabel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51)));
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });
        jPanel1.add(jLabel2);
        jLabel2.setBounds(380, 40, 80, 40);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Buy");
        jLabel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51)));
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });
        jPanel1.add(jLabel3);
        jLabel3.setBounds(310, 40, 60, 40);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel19);
        jLabel19.setBounds(240, 10, 80, 70);

        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel21);
        jLabel21.setBounds(20, 10, 70, 70);

        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel22);
        jLabel22.setBounds(340, 10, 90, 70);

        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel23);
        jLabel23.setBounds(460, 10, 70, 70);

        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel24);
        jLabel24.setBounds(130, 10, 80, 70);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Smit\\Desktop\\sell\\Capture3.PNG")); // NOI18N
        jPanel2.add(jLabel5);
        jLabel5.setBounds(0, 0, 340, 90);

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Smit\\Desktop\\sell\\Capture7.PNG")); // NOI18N
        jPanel2.add(jLabel6);
        jLabel6.setBounds(340, 0, 200, 90);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(310, 140, 540, 90);

        jTextField1.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(0, 0, 51));
        jTextField1.setText("Property type");
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jTextField1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jTextField1MouseDragged(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(310, 90, 270, 40);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(null);

        delhi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delhiMouseClicked(evt);
            }
        });
        jPanel4.add(delhi);
        delhi.setBounds(120, 10, 60, 90);

        bengalu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bengaluMouseClicked(evt);
            }
        });
        jPanel4.add(bengalu);
        bengalu.setBounds(230, 10, 70, 90);

        hyderbd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hyderbdMouseClicked(evt);
            }
        });
        jPanel4.add(hyderbd);
        hyderbd.setBounds(340, 0, 70, 90);

        ahmedbd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ahmedbdMouseClicked(evt);
            }
        });
        jPanel4.add(ahmedbd);
        ahmedbd.setBounds(450, 10, 80, 90);

        chandi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chandiMouseClicked(evt);
            }
        });
        jPanel4.add(chandi);
        chandi.setBounds(570, 10, 80, 90);

        chenn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chennMouseClicked(evt);
            }
        });
        jPanel4.add(chenn);
        chenn.setBounds(690, 10, 60, 90);

        pune.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                puneMouseClicked(evt);
            }
        });
        jPanel4.add(pune);
        pune.setBounds(800, 10, 60, 90);

        mum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mumMouseClicked(evt);
            }
        });
        jPanel4.add(mum);
        mum.setBounds(10, 10, 60, 90);

        jLabel41.setIcon(new javax.swing.ImageIcon("C:\\Users\\Smit\\Desktop\\cities.PNG")); // NOI18N
        jLabel41.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel4.add(jLabel41);
        jLabel41.setBounds(0, 0, 885, 96);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(590, 140, 880, 90);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel28.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("4 BHK");
        jLabel28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel28MouseClicked(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("2 BHK");
        jLabel29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel29MouseClicked(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("3 BHK");
        jLabel30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel30MouseClicked(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("1 BHK");
        jLabel31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel31MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel31)
                .addGap(0, 0, 0)
                .addComponent(jLabel29)
                .addGap(0, 0, 0)
                .addComponent(jLabel30)
                .addGap(0, 0, 0)
                .addComponent(jLabel28))
        );

        jPanel1.add(jPanel5);
        jPanel5.setBounds(870, 130, 80, 90);

        selectcity.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        selectcity.setForeground(new java.awt.Color(0, 0, 51));
        selectcity.setText("Select City");
        selectcity.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        selectcity.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                selectcityMouseDragged(evt);
            }
        });
        selectcity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectcityActionPerformed(evt);
            }
        });
        selectcity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                selectcityKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                selectcityKeyTyped(evt);
            }
        });
        jPanel1.add(selectcity);
        selectcity.setBounds(590, 90, 270, 40);

        beds.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        beds.setForeground(new java.awt.Color(0, 0, 51));
        beds.setText("Beds");
        beds.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        beds.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                bedsMouseDragged(evt);
            }
        });
        beds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bedsActionPerformed(evt);
            }
        });
        beds.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bedsKeyPressed(evt);
            }
        });
        jPanel1.add(beds);
        beds.setBounds(870, 90, 80, 40);

        jTextField9.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jTextField9.setForeground(new java.awt.Color(0, 0, 51));
        jTextField9.setText("Price range");
        jTextField9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jTextField9.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jTextField9MouseDragged(evt);
            }
        });
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        jTextField9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField9KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField9KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField9);
        jTextField9.setBounds(960, 90, 150, 40);

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Smit\\Desktop\\sell\\search.PNG")); // NOI18N
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 51)));
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel7);
        jLabel7.setBounds(1120, 90, 150, 40);

        searchpg.add(jPanel1);
        jPanel1.setBounds(0, 530, 1480, 240);

        jLabel20.setFont(new java.awt.Font("Segoe Print", 1, 32)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setIcon(new javax.swing.ImageIcon("C:\\Users\\Smit\\Desktop\\logops.png")); // NOI18N
        jLabel20.setText("Nest Seekers");
        jLabel20.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        searchpg.add(jLabel20);
        jLabel20.setBounds(0, 0, 370, 130);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Smit\\Desktop\\sell\\Capture1.png.jpg")); // NOI18N
        searchpg.add(jLabel4);
        jLabel4.setBounds(0, 0, 1480, 840);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Smit\\Desktop\\sell\\2_gydqb1.jpg")); // NOI18N
        searchpg.add(jLabel1);
        jLabel1.setBounds(0, 0, 1480, 840);
        searchpg.add(jSeparator11);
        jSeparator11.setBounds(10, 1330, 1480, 10);

        jLabel15.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 51));
        jLabel15.setText("About us");
        searchpg.add(jLabel15);
        jLabel15.setBounds(140, 1400, 60, 17);

        jLabel16.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 51));
        jLabel16.setText("Privacy Policy");
        searchpg.add(jLabel16);
        jLabel16.setBounds(140, 1430, 80, 17);

        jLabel17.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 51));
        jLabel17.setText("Terms and Conditions");
        searchpg.add(jLabel17);
        jLabel17.setBounds(140, 1460, 120, 17);

        jLabel25.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 51));
        jLabel25.setText("Nest Seekers Credentials");
        searchpg.add(jLabel25);
        jLabel25.setBounds(350, 1350, 170, 20);

        jLabel26.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 51));
        jLabel26.setText("policybazzar.com");
        searchpg.add(jLabel26);
        jLabel26.setBounds(620, 1400, 100, 17);

        jLabel27.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 0, 51));
        jLabel27.setText("99acres.com");
        searchpg.add(jLabel27);
        jLabel27.setBounds(620, 1430, 80, 17);

        jLabel42.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(0, 0, 51));
        jLabel42.setText("magicbricks.com");
        searchpg.add(jLabel42);
        jLabel42.setBounds(620, 1460, 100, 17);

        jLabel45.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(0, 0, 51));
        jLabel45.setText("Company");
        searchpg.add(jLabel45);
        jLabel45.setBounds(140, 1350, 70, 20);

        jLabel46.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(0, 0, 51));
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel46.setText("Contact us");
        searchpg.add(jLabel46);
        jLabel46.setBounds(970, 1350, 80, 20);

        jLabel47.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(0, 0, 51));
        jLabel47.setText("Agents");
        searchpg.add(jLabel47);
        jLabel47.setBounds(350, 1460, 100, 17);

        jLabel48.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(0, 0, 51));
        jLabel48.setText("PropWorth Calculator");
        searchpg.add(jLabel48);
        jLabel48.setBounds(350, 1430, 130, 17);

        jLabel57.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(0, 0, 51));
        jLabel57.setText("Sell/Rent property");
        searchpg.add(jLabel57);
        jLabel57.setBounds(350, 1400, 110, 17);

        jLabel58.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(0, 0, 51));
        jLabel58.setText("Our Partners");
        searchpg.add(jLabel58);
        jLabel58.setBounds(620, 1350, 90, 20);

        jLabel62.setIcon(new javax.swing.ImageIcon("C:\\Users\\Smit\\Desktop\\if_gmail_1220367.png")); // NOI18N
        searchpg.add(jLabel62);
        jLabel62.setBounds(890, 1410, 30, 40);

        jLabel59.setIcon(new javax.swing.ImageIcon("C:\\Users\\Smit\\Desktop\\cnt.PNG")); // NOI18N
        searchpg.add(jLabel59);
        jLabel59.setBounds(890, 1390, 270, 50);
        searchpg.add(jSeparator12);
        jSeparator12.setBounds(970, 1370, 80, 10);

        jLabel60.setIcon(new javax.swing.ImageIcon("C:\\Users\\Smit\\Desktop\\if_whatsapp_386747.png")); // NOI18N
        searchpg.add(jLabel60);
        jLabel60.setBounds(1110, 1450, 50, 50);

        jLabel61.setIcon(new javax.swing.ImageIcon("C:\\Users\\Smit\\Desktop\\if_Twitter_571108.png")); // NOI18N
        searchpg.add(jLabel61);
        jLabel61.setBounds(1000, 1448, 50, 60);

        jLabel63.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel63.setText("Copyright (C) - 2017 Nestseekers.com .All Rights Reserved");
        searchpg.add(jLabel63);
        jLabel63.setBounds(590, 1540, 340, 15);

        jLabel64.setIcon(new javax.swing.ImageIcon("C:\\Users\\Smit\\Desktop\\if_Facebook_571114.png")); // NOI18N
        searchpg.add(jLabel64);
        jLabel64.setBounds(890, 1460, 50, 40);

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setOpaque(true);
        searchpg.add(jLabel11);
        jLabel11.setBounds(0, 840, 1480, 740);

        javax.swing.GroupLayout srchpgLayout = new javax.swing.GroupLayout(srchpg);
        srchpg.setLayout(srchpgLayout);
        srchpgLayout.setHorizontalGroup(
            srchpgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1502, Short.MAX_VALUE)
            .addGroup(srchpgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(srchpgLayout.createSequentialGroup()
                    .addComponent(searchpg, javax.swing.GroupLayout.PREFERRED_SIZE, 1476, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 26, Short.MAX_VALUE)))
        );
        srchpgLayout.setVerticalGroup(
            srchpgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1578, Short.MAX_VALUE)
            .addGroup(srchpgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(searchpg, javax.swing.GroupLayout.DEFAULT_SIZE, 1578, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(srchpg);

        loginpg.setBackground(new java.awt.Color(255, 255, 255));
        loginpg.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 51), 1, true));
        loginpg.setLayout(null);

        login.setFont(new java.awt.Font("Calibri", 0, 22)); // NOI18N
        login.setText("LOGIN");
        login.setBorder(null);
        login.setContentAreaFilled(false);
        login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        login.setFocusPainted(false);
        login.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                loginFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                loginFocusLost(evt);
            }
        });
        login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginMouseClicked(evt);
            }
        });
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        loginpg.add(login);
        login.setBounds(660, 160, 70, 40);

        register.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        register.setText("REGISTER");
        register.setBorder(null);
        register.setContentAreaFilled(false);
        register.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        register.setFocusPainted(false);
        register.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                registerFocusGained(evt);
            }
        });
        register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerMouseClicked(evt);
            }
        });
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });
        loginpg.add(register);
        register.setBounds(730, 160, 130, 40);

        reg.setOpaque(false);
        reg.setLayout(null);

        jLabel13.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\Smit\\Desktop\\sell\\signup.PNG")); // NOI18N
        jLabel13.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        reg.add(jLabel13);
        jLabel13.setBounds(270, 290, 120, 40);

        emailid.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        emailid.setForeground(new java.awt.Color(102, 102, 102));
        emailid.setText("  eg.abcd@gamil.com");
        emailid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        emailid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailidFocusGained(evt);
            }
        });
        emailid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailidActionPerformed(evt);
            }
        });
        reg.add(emailid);
        emailid.setBounds(140, 140, 260, 30);

        fullname.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        fullname.setForeground(new java.awt.Color(102, 102, 102));
        fullname.setText("First Middle Last ");
        fullname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        fullname.setNextFocusableComponent(emailid);
        fullname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fullnameFocusGained(evt);
            }
        });
        fullname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullnameActionPerformed(evt);
            }
        });
        reg.add(fullname);
        fullname.setBounds(140, 40, 260, 30);

        jLabel44.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(0, 0, 51));
        jLabel44.setText("Name:");
        reg.add(jLabel44);
        jLabel44.setBounds(0, 40, 130, 30);

        jLabel49.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(0, 0, 51));
        jLabel49.setText("EmailId:");
        reg.add(jLabel49);
        jLabel49.setBounds(0, 140, 130, 30);

        passreg.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        passreg.setForeground(new java.awt.Color(102, 102, 102));
        passreg.setText("jPasswordF");
        passreg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        passreg.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passregFocusGained(evt);
            }
        });
        passreg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passregActionPerformed(evt);
            }
        });
        reg.add(passreg);
        passreg.setBounds(140, 190, 170, 30);

        jLabel51.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(0, 0, 51));
        jLabel51.setText("Password:");
        reg.add(jLabel51);
        jLabel51.setBounds(0, 190, 130, 30);

        jLabel52.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(0, 0, 51));
        jLabel52.setText("Security code:");
        reg.add(jLabel52);
        jLabel52.setBounds(0, 240, 130, 30);

        seccodereg.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        seccodereg.setForeground(new java.awt.Color(102, 102, 102));
        seccodereg.setText("jkPa");
        seccodereg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        seccodereg.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                seccoderegFocusGained(evt);
            }
        });
        reg.add(seccodereg);
        seccodereg.setBounds(140, 240, 40, 30);
        reg.add(jSeparator4);
        jSeparator4.setBounds(140, 270, 40, 10);
        reg.add(jSeparator5);
        jSeparator5.setBounds(140, 70, 260, 10);
        reg.add(jSeparator6);
        jSeparator6.setBounds(140, 120, 260, 10);
        reg.add(jSeparator7);
        jSeparator7.setBounds(140, 220, 170, 10);

        usertype.add(seller);
        seller.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        seller.setForeground(new java.awt.Color(0, 0, 51));
        seller.setText("Seller");
        seller.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        seller.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellerActionPerformed(evt);
            }
        });
        reg.add(seller);
        seller.setBounds(100, 290, 80, 30);

        usertype.add(Buyer);
        Buyer.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        Buyer.setForeground(new java.awt.Color(0, 0, 51));
        Buyer.setText("Buyer");
        Buyer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Buyer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuyerActionPerformed(evt);
            }
        });
        reg.add(Buyer);
        Buyer.setBounds(0, 290, 90, 30);

        jLabel50.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(0, 0, 51));
        jLabel50.setText("Contact no.");
        reg.add(jLabel50);
        jLabel50.setBounds(0, 90, 130, 30);

        ph_no.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        ph_no.setForeground(new java.awt.Color(102, 102, 102));
        ph_no.setText("+91-");
        ph_no.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        ph_no.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ph_noFocusGained(evt);
            }
        });
        ph_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ph_noActionPerformed(evt);
            }
        });
        reg.add(ph_no);
        ph_no.setBounds(140, 90, 260, 30);
        reg.add(jSeparator10);
        jSeparator10.setBounds(140, 170, 260, 10);

        loginpg.add(reg);
        reg.setBounds(660, 230, 440, 420);

        log.setOpaque(false);
        log.setLayout(null);

        jLabel12.setFont(new java.awt.Font("Gabriola", 2, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 51));
        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\Smit\\Desktop\\unlock.png")); // NOI18N
        log.add(jLabel12);
        jLabel12.setBounds(0, 150, 40, 40);

        userid.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        userid.setForeground(new java.awt.Color(153, 153, 153));
        userid.setText("EmailId");
        userid.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        userid.setHighlighter(null);
        userid.setSelectedTextColor(new java.awt.Color(0, 204, 204));
        userid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                useridFocusGained(evt);
            }
        });
        userid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                useridMouseClicked(evt);
            }
        });
        userid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                useridActionPerformed(evt);
            }
        });
        log.add(userid);
        userid.setBounds(50, 60, 240, 40);

        pass.setForeground(new java.awt.Color(153, 153, 153));
        pass.setText("password");
        pass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        pass.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);
        pass.setDragEnabled(true);
        pass.setName(""); // NOI18N
        pass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passFocusGained(evt);
            }
        });
        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });
        log.add(pass);
        pass.setBounds(50, 150, 240, 40);

        forgetpas.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        forgetpas.setText("Forget Password?");
        forgetpas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forgetpasMouseClicked(evt);
            }
        });
        log.add(forgetpas);
        forgetpas.setBounds(190, 200, 100, 20);

        jLabel56.setFont(new java.awt.Font("Gabriola", 2, 36)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(0, 0, 51));
        jLabel56.setIcon(new javax.swing.ImageIcon("C:\\Users\\Smit\\Desktop\\user.png")); // NOI18N
        log.add(jLabel56);
        jLabel56.setBounds(0, 60, 40, 40);

        jSeparator2.setForeground(new java.awt.Color(0, 0, 51));
        jSeparator2.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        log.add(jSeparator2);
        jSeparator2.setBounds(50, 100, 240, 10);

        jSeparator3.setForeground(new java.awt.Color(0, 0, 51));
        jSeparator3.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        log.add(jSeparator3);
        jSeparator3.setBounds(50, 190, 240, 10);

        invalid.setFont(new java.awt.Font("Calibri Light", 0, 16)); // NOI18N
        invalid.setForeground(new java.awt.Color(255, 0, 0));
        invalid.setText("Invalid EmailId or Password ");
        invalid.setDebugGraphicsOptions(javax.swing.DebugGraphics.FLASH_OPTION);
        log.add(invalid);
        invalid.setBounds(0, 230, 190, 20);

        jButton1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Smit\\Desktop\\sell\\login.PNG")); // NOI18N
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        log.add(jButton1);
        jButton1.setBounds(150, 310, 110, 40);

        loginpg.add(log);
        log.setBounds(660, 230, 330, 420);

        forgetpass.setOpaque(false);
        forgetpass.setLayout(null);

        jLabel53.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(0, 0, 51));
        jLabel53.setText("Your Password");
        forgetpass.add(jLabel53);
        jLabel53.setBounds(0, 160, 180, 40);

        jLabel54.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(0, 0, 51));
        jLabel54.setText("Security code");
        forgetpass.add(jLabel54);
        jLabel54.setBounds(0, 50, 160, 40);

        passfp.setEditable(false);
        passfp.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        passfp.setForeground(new java.awt.Color(153, 153, 153));
        passfp.setText("***********");
        passfp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        passfp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passfpFocusGained(evt);
            }
        });
        passfp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passfpActionPerformed(evt);
            }
        });
        forgetpass.add(passfp);
        passfp.setBounds(0, 220, 170, 30);

        seccodefp.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        seccodefp.setForeground(new java.awt.Color(153, 153, 153));
        seccodefp.setText("0000");
        seccodefp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        seccodefp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                seccodefpFocusGained(evt);
            }
        });
        seccodefp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seccodefpActionPerformed(evt);
            }
        });
        forgetpass.add(seccodefp);
        seccodefp.setBounds(0, 100, 160, 30);
        forgetpass.add(jSeparator8);
        jSeparator8.setBounds(0, 250, 170, 20);
        forgetpass.add(jSeparator9);
        jSeparator9.setBounds(0, 130, 160, 20);

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Smit\\Desktop\\retpass.PNG")); // NOI18N
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        forgetpass.add(jButton2);
        jButton2.setBounds(130, 300, 130, 40);

        loginpg.add(forgetpass);
        forgetpass.setBounds(660, 230, 330, 420);

        jSeparator1.setForeground(new java.awt.Color(0, 0, 51));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        loginpg.add(jSeparator1);
        jSeparator1.setBounds(610, 160, 30, 490);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Gabriola", 0, 20)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(0, 0, 51));
        jTextArea1.setRows(5);
        jTextArea1.setText("Why Login?\n\n-Shortlist properties you like.\n-Contact sellers of properties \nyou are interested in.\n-Advertise your property. \nView responses from interested \nbuyers.\n-Ask property related questions.");
        jTextArea1.setAutoscrolls(false);
        jTextArea1.setBorder(null);
        jTextArea1.setOpaque(false);
        loginpg.add(jTextArea1);
        jTextArea1.setBounds(380, 310, 220, 340);

        jPanel9.setLayout(null);

        jLabel34.setBackground(new java.awt.Color(255, 255, 255));
        jLabel34.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setIcon(new javax.swing.ImageIcon("C:\\Users\\Smit\\Desktop\\logops.png")); // NOI18N
        jLabel34.setText("Nest Seekers");
        jLabel34.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel34.setOpaque(true);
        jPanel9.add(jLabel34);
        jLabel34.setBounds(340, 160, 270, 120);

        jLabel71.setBackground(new java.awt.Color(255, 255, 255));
        jLabel71.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 51), 1, true));
        jLabel71.setOpaque(true);
        jPanel9.add(jLabel71);
        jLabel71.setBounds(337, 136, 772, 527);

        loginpg.add(jPanel9);
        jPanel9.setBounds(0, 0, 1480, 830);

        jLabel70.setIcon(new javax.swing.ImageIcon("C:\\Users\\Smit\\Desktop\\smit\\mini project\\slide3.jpg")); // NOI18N
        loginpg.add(jLabel70);
        jLabel70.setBounds(0, 0, 1480, 830);

        contactus.setBackground(new java.awt.Color(255, 255, 255));
        contactus.setPreferredSize(new java.awt.Dimension(1490, 843));

        jLabel32.setFont(new java.awt.Font("Segoe Print", 1, 32)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(0, 0, 51));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setIcon(new javax.swing.ImageIcon("C:\\Users\\Smit\\Desktop\\logops.png")); // NOI18N
        jLabel32.setText("Nest Seekers");
        jLabel32.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jLabel33.setFont(new java.awt.Font("Gabriola", 1, 40)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(0, 0, 51));
        jLabel33.setText("We would love to hear from you!");

        jLabel35.setFont(new java.awt.Font("Gabriola", 0, 36)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(0, 0, 51));
        jLabel35.setText(" Send us a email and we’ll get right back in touch.");

        jLabel36.setFont(new java.awt.Font("Constantia", 0, 24)); // NOI18N
        jLabel36.setIcon(new javax.swing.ImageIcon("C:\\Users\\Smit\\Desktop\\mail.png")); // NOI18N
        jLabel36.setText("         customercare@nestseekers.com");

        jLabel37.setIcon(new javax.swing.ImageIcon("C:\\Users\\Smit\\Desktop\\loc.png")); // NOI18N

        jLabel38.setFont(new java.awt.Font("Constantia", 0, 24)); // NOI18N
        jLabel38.setText("Juhu Circle,Andheri (W), ");

        jLabel39.setFont(new java.awt.Font("Constantia", 0, 24)); // NOI18N
        jLabel39.setText("Nest Seekers pvt Ltd,");

        jLabel40.setFont(new java.awt.Font("Constantia", 0, 24)); // NOI18N
        jLabel40.setText("Mumbai-400 022.");

        jLabel43.setFont(new java.awt.Font("Constantia", 0, 24)); // NOI18N
        jLabel43.setIcon(new javax.swing.ImageIcon("C:\\Users\\Smit\\Desktop\\phone.png")); // NOI18N
        jLabel43.setText("         1800-293-5678");

        jLabel18.setIcon(new javax.swing.ImageIcon("C:\\Users\\Smit\\Desktop\\if_misc-_Home__1276860.png")); // NOI18N
        jLabel18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout contactusLayout = new javax.swing.GroupLayout(contactus);
        contactus.setLayout(contactusLayout);
        contactusLayout.setHorizontalGroup(
            contactusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contactusLayout.createSequentialGroup()
                .addGroup(contactusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contactusLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contactusLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(contactusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contactusLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(contactusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(contactusLayout.createSequentialGroup()
                                .addComponent(jLabel32)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1065, Short.MAX_VALUE)
                                .addComponent(jLabel18))))
                    .addGroup(contactusLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(contactusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(contactusLayout.createSequentialGroup()
                                .addComponent(jLabel37)
                                .addGap(59, 59, 59)
                                .addGroup(contactusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel38)
                                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(47, 47, 47))
        );
        contactusLayout.setVerticalGroup(
            contactusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contactusLayout.createSequentialGroup()
                .addGroup(contactusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contactusLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel32))
                    .addGroup(contactusLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel18)))
                .addGap(31, 31, 31)
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(178, 178, 178)
                .addComponent(jLabel43)
                .addGap(18, 18, 18)
                .addComponent(jLabel36)
                .addGap(18, 18, 18)
                .addGroup(contactusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel37)
                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel40)
                .addContainerGap(254, Short.MAX_VALUE))
        );

        Agents.setBackground(new java.awt.Color(255, 255, 255));

        jLabel66.setIcon(new javax.swing.ImageIcon("C:\\Users\\Smit\\Desktop\\agent.PNG")); // NOI18N

        jLabel67.setIcon(new javax.swing.ImageIcon("C:\\Users\\Smit\\Desktop\\if_misc-_Home__1276860.png")); // NOI18N
        jLabel67.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel67.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel67MouseClicked(evt);
            }
        });

        jLabel68.setFont(new java.awt.Font("Segoe Print", 1, 32)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(0, 0, 51));
        jLabel68.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel68.setIcon(new javax.swing.ImageIcon("C:\\Users\\Smit\\Desktop\\logops.png")); // NOI18N
        jLabel68.setText("Nest Seekers");
        jLabel68.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout AgentsLayout = new javax.swing.GroupLayout(Agents);
        Agents.setLayout(AgentsLayout);
        AgentsLayout.setHorizontalGroup(
            AgentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AgentsLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 909, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(AgentsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel68)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1096, Short.MAX_VALUE)
                .addComponent(jLabel67)
                .addContainerGap())
        );
        AgentsLayout.setVerticalGroup(
            AgentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AgentsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AgentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel68)
                    .addGroup(AgentsLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel67)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138))
        );

        sellrentprop.setBackground(new java.awt.Color(255, 255, 255));

        header.setBackground(new java.awt.Color(255, 255, 255));
        header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel105.setIcon(new javax.swing.ImageIcon("C:\\Users\\Smit\\Desktop\\if_misc-_Home__1276860.png")); // NOI18N
        jLabel105.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel105.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel105MouseClicked(evt);
            }
        });
        header.add(jLabel105, new org.netbeans.lib.awtextra.AbsoluteConstraints(1407, 22, -1, -1));
        header.add(jSeparator17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 1480, 10));

        jLabel106.setBackground(new java.awt.Color(255, 255, 255));
        jLabel106.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel106.setForeground(new java.awt.Color(54, 164, 255));
        jLabel106.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel106.setText("Step 3");
        jLabel106.setOpaque(true);
        header.add(jLabel106, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 30, 120, 50));

        jLabel107.setBackground(new java.awt.Color(255, 255, 255));
        jLabel107.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel107.setForeground(new java.awt.Color(54, 164, 255));
        jLabel107.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel107.setText("Step 2");
        jLabel107.setOpaque(true);
        header.add(jLabel107, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 30, 130, 50));

        jLabel108.setBackground(new java.awt.Color(54, 164, 255));
        jLabel108.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel108.setForeground(new java.awt.Color(255, 255, 255));
        jLabel108.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel108.setText("Step 1");
        jLabel108.setOpaque(true);
        header.add(jLabel108, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 30, 120, 50));

        jLabel109.setFont(new java.awt.Font("Segoe Print", 1, 32)); // NOI18N
        jLabel109.setForeground(new java.awt.Color(0, 0, 51));
        jLabel109.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel109.setIcon(new javax.swing.ImageIcon("C:\\Users\\Smit\\Desktop\\logops.png")); // NOI18N
        jLabel109.setText("Nest Seekers");
        jLabel109.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        header.add(jLabel109, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 13, -1, -1));

        detail3.setBackground(new java.awt.Color(255, 255, 255));
        detail3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jFileChooser1.setCurrentDirectory(new java.io.File("C:\\Users\\Smit\\Desktop"));
        jFileChooser1.setFileSelectionMode(javax.swing.JFileChooser.FILES_AND_DIRECTORIES);
        jFileChooser1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFileChooser1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FilechosLayout = new javax.swing.GroupLayout(Filechos);
        Filechos.setLayout(FilechosLayout);
        FilechosLayout.setHorizontalGroup(
            FilechosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
            .addGroup(FilechosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jFileChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE))
        );
        FilechosLayout.setVerticalGroup(
            FilechosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 370, Short.MAX_VALUE)
            .addGroup(FilechosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(FilechosLayout.createSequentialGroup()
                    .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 1, Short.MAX_VALUE)))
        );

        detail3.add(Filechos, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 700, 370));

        jLabel110.setFont(new java.awt.Font("Calibri Light", 0, 20)); // NOI18N
        jLabel110.setText("Transaction Type");
        detail3.add(jLabel110, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 140, 70));

        Transtype.add(newprop);
        newprop.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        newprop.setText("New Property");
        newprop.setOpaque(false);
        detail3.add(newprop, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, -1, 50));

        Transtype.add(resale);
        resale.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        resale.setText("Resale");
        resale.setOpaque(false);
        resale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resaleActionPerformed(evt);
            }
        });
        detail3.add(resale, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 100, -1, 50));

        propavail.add(resale1);
        resale1.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        resale1.setText("Ready to Move");
        resale1.setOpaque(false);
        resale1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resale1ActionPerformed(evt);
            }
        });
        detail3.add(resale1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 160, -1, 50));

        propavail.add(newprop1);
        newprop1.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        newprop1.setText("Under construction");
        newprop1.setOpaque(false);
        detail3.add(newprop1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 160, -1, 50));

        jLabel111.setFont(new java.awt.Font("Calibri Light", 0, 20)); // NOI18N
        jLabel111.setText("Property Availability");
        detail3.add(jLabel111, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, 160, 70));

        jLabel112.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Transaction Type , Property Availability", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 22), new java.awt.Color(51, 51, 51))); // NOI18N
        detail3.add(jLabel112, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 970, 170));

        jLabel113.setFont(new java.awt.Font("Calibri Light", 0, 20)); // NOI18N
        jLabel113.setText("Expected Price");
        detail3.add(jLabel113, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, 160, 60));

        jTextField4.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jTextField4.setText("Type here");
        detail3.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 300, 260, 40));

        jLabel114.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Price Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 22), new java.awt.Color(51, 51, 51))); // NOI18N
        detail3.add(jLabel114, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 970, 130));

        featnext.setIcon(new javax.swing.ImageIcon("C:\\Users\\Smit\\Desktop\\sell\\Capture13.PNG")); // NOI18N
        featnext.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        featnext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                featnextMouseClicked(evt);
            }
        });
        detail3.add(featnext, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 670, -1, -1));

        featprev.setIcon(new javax.swing.ImageIcon("C:\\Users\\Smit\\Desktop\\sell\\Capture12.PNG")); // NOI18N
        featprev.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        featprev.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                featprevMouseClicked(evt);
            }
        });
        detail3.add(featprev, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 670, -1, -1));

        jSeparator18.setOrientation(javax.swing.SwingConstants.VERTICAL);
        detail3.add(jSeparator18, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 2, 10, 710));

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        detail3.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 490, 540, 40));

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton5.setText("Browrse");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        detail3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 490, 130, 40));

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton6.setText("Attach");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        detail3.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 490, 140, 40));

        jLabel115.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add Photo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 22), new java.awt.Color(51, 51, 51))); // NOI18N
        detail3.add(jLabel115, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 400, 970, 220));

        detail2.setBackground(new java.awt.Color(255, 255, 255));
        detail2.setPreferredSize(new java.awt.Dimension(1455, 853));
        detail2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel116.setFont(new java.awt.Font("Calibri Light", 0, 20)); // NOI18N
        jLabel116.setText("Covered Area");
        detail2.add(jLabel116, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 490, -1, 70));

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel9.setText("sq ft.");
        detail2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 570, 40, 40));

        jTextField8.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jTextField8.setText("Type here");
        detail2.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 570, 260, 40));

        jLabel117.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jLabel117.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 4, true));
        jLabel117.setEnabled(false);
        detail2.add(jLabel117, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 160, 260, 40));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0" }));
        jComboBox2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jComboBox2.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jComboBox2.setLightWeightPopupEnabled(false);
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        detail2.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 160, 260, 40));

        jLabel118.setFont(new java.awt.Font("Calibri Light", 0, 20)); // NOI18N
        jLabel118.setText("City");
        detail2.add(jLabel118, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 150, 40, 70));

        jLabel119.setFont(new java.awt.Font("Calibri Light", 0, 20)); // NOI18N
        jLabel119.setText("Carpet Area");
        detail2.add(jLabel119, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 560, 110, 60));

        jLabel120.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jLabel120.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 4, true));
        jLabel120.setEnabled(false);
        detail2.add(jLabel120, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 260, 40));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0" }));
        jComboBox3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jComboBox3.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jComboBox3.setLightWeightPopupEnabled(false);
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        detail2.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 260, 40));

        jLabel121.setFont(new java.awt.Font("Calibri Light", 0, 20)); // NOI18N
        jLabel121.setText("Bedrooms");
        detail2.add(jLabel121, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 100, 60));

        jLabel122.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jLabel122.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 4, true));
        jLabel122.setEnabled(false);
        detail2.add(jLabel122, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 90, 260, 40));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3" }));
        jComboBox4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jComboBox4.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jComboBox4.setLightWeightPopupEnabled(false);
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });
        detail2.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 90, 260, 40));

        jLabel123.setFont(new java.awt.Font("Calibri Light", 0, 20)); // NOI18N
        jLabel123.setText("Balconies");
        detail2.add(jLabel123, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 80, 80, 60));

        jLabel124.setFont(new java.awt.Font("Calibri Light", 0, 20)); // NOI18N
        jLabel124.setText("Floor no.");
        detail2.add(jLabel124, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 80, 60));

        jLabel125.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jLabel125.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 4, true));
        jLabel125.setEnabled(false);
        detail2.add(jLabel125, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, 260, 40));

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0" }));
        jComboBox5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jComboBox5.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jComboBox5.setLightWeightPopupEnabled(false);
        jComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox5ActionPerformed(evt);
            }
        });
        detail2.add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, 260, 40));

        jLabel126.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel126.setText("sq ft.");
        detail2.add(jLabel126, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 500, 40, 40));

        jTextField3.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jTextField3.setText("Type here");
        detail2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 500, 260, 40));

        jLabel127.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Area", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 22), new java.awt.Color(51, 51, 51))); // NOI18N
        detail2.add(jLabel127, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 450, 970, 190));

        locnext.setIcon(new javax.swing.ImageIcon("C:\\Users\\Smit\\Desktop\\sell\\Capture13.PNG")); // NOI18N
        locnext.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        locnext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                locnextMouseClicked(evt);
            }
        });
        detail2.add(locnext, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 670, -1, 40));

        locprev.setIcon(new javax.swing.ImageIcon("C:\\Users\\Smit\\Desktop\\sell\\Capture12.PNG")); // NOI18N
        locprev.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        locprev.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                locprevMouseClicked(evt);
            }
        });
        detail2.add(locprev, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 670, -1, 40));

        jTextField6.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jTextField6.setText("jTextField6");
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        detail2.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 380, 840, 30));

        jLabel128.setIcon(new javax.swing.ImageIcon("C:\\Users\\Smit\\Desktop\\amennities 1.png")); // NOI18N
        detail2.add(jLabel128, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, -1, -1));

        jLabel129.setIcon(new javax.swing.ImageIcon("C:\\Users\\Smit\\Desktop\\amennities 2.png")); // NOI18N
        detail2.add(jLabel129, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 250, 210, 130));

        jLabel14.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Property  Features", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 22), new java.awt.Color(51, 51, 51))); // NOI18N
        detail2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 970, 390));

        jSeparator19.setOrientation(javax.swing.SwingConstants.VERTICAL);
        detail2.add(jSeparator19, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 2, 10, 710));

        detail1.setBackground(new java.awt.Color(255, 255, 255));
        detail1.setPreferredSize(new java.awt.Dimension(1455, 853));
        detail1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Iam.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jRadioButton1.setText("Owner");
        jRadioButton1.setOpaque(false);
        detail1.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, -1, 50));

        Iam.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jRadioButton2.setText("Builder");
        jRadioButton2.setOpaque(false);
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        detail1.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 80, -1, 50));

        Iam.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jRadioButton3.setText("Agent");
        jRadioButton3.setOpaque(false);
        detail1.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 80, -1, 50));

        jLabel130.setFont(new java.awt.Font("Calibri Light", 0, 20)); // NOI18N
        jLabel130.setText("I am");
        detail1.add(jLabel130, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 50, 70));

        jLabel131.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "User Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 22), new java.awt.Color(51, 51, 51))); // NOI18N
        detail1.add(jLabel131, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 970, 90));

        residential1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/real/estate/Capture3.PNG"))); // NOI18N
        detail1.add(residential1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 270, -1, -1));

        commerial1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Smit\\Desktop\\sell\\Capture7.PNG")); // NOI18N
        detail1.add(commerial1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 280, 190, 80));

        Commerial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/real/estate/Capture5.PNG"))); // NOI18N
        detail1.add(Commerial, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 220, -1, 40));

        Residential.setIcon(new javax.swing.ImageIcon(getClass().getResource("/real/estate/Capture4.PNG"))); // NOI18N
        detail1.add(Residential, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 220, 190, 40));

        commerialB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                commerialBMouseClicked(evt);
            }
        });
        detail1.add(commerialB, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 230, 90, 20));

        residentialB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                residentialBMouseClicked(evt);
            }
        });
        detail1.add(residentialB, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 230, 80, 20));

        jLabel132.setFont(new java.awt.Font("Calibri Light", 0, 20)); // NOI18N
        jLabel132.setText("Property Type");
        detail1.add(jLabel132, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, 120, 60));

        jLabel133.setFont(new java.awt.Font("Calibri Light", 0, 20)); // NOI18N
        jLabel133.setText("Property For");
        detail1.add(jLabel133, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 120, 70));

        propfor.add(jRadioButton4);
        jRadioButton4.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jRadioButton4.setText("Sale");
        jRadioButton4.setOpaque(false);
        detail1.add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, -1, 50));

        propfor.add(jRadioButton5);
        jRadioButton5.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jRadioButton5.setText("Rent");
        jRadioButton5.setOpaque(false);
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });
        detail1.add(jRadioButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 210, -1, 50));

        propfor.add(jRadioButton6);
        jRadioButton6.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jRadioButton6.setText("PG");
        jRadioButton6.setOpaque(false);
        detail1.add(jRadioButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 210, -1, 50));

        proptype.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        proptype.setText("Type here");
        detail1.add(proptype, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, 260, 40));

        jLabel134.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Property Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 22), new java.awt.Color(51, 51, 51))); // NOI18N
        detail1.add(jLabel134, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 970, 230));

        jLabel8.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jLabel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 4, true));
        jLabel8.setEnabled(false);
        detail1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 440, 260, 40));

        city.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mumbai", "Delhi", "Pune", "Chennai", "Ahmedabad", "Bengluru", "Hyderabad", "Chandigarh" }));
        city.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        city.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        city.setLightWeightPopupEnabled(false);
        city.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityActionPerformed(evt);
            }
        });
        detail1.add(city, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 440, 260, 40));

        jLabel135.setFont(new java.awt.Font("Calibri Light", 0, 20)); // NOI18N
        jLabel135.setText("City");
        detail1.add(jLabel135, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 430, 40, 60));

        jLabel10.setFont(new java.awt.Font("Calibri Light", 0, 20)); // NOI18N
        jLabel10.setText("locality");
        detail1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 500, 90, 40));

        locality.setColumns(20);
        locality.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        locality.setRows(5);
        locality.setText("Address");
        detail1.add(locality, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 504, 260, 80));

        jLabel136.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Location", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 22), new java.awt.Color(51, 51, 51))); // NOI18N
        detail1.add(jLabel136, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 394, 970, 230));

        detailnext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/real/estate/Capture6.PNG"))); // NOI18N
        detailnext.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        detailnext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                detailnextMouseClicked(evt);
            }
        });
        detail1.add(detailnext, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 650, -1, -1));

        jSeparator20.setOrientation(javax.swing.SwingConstants.VERTICAL);
        detail1.add(jSeparator20, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 2, 10, 710));

        detail4.setBackground(new java.awt.Color(255, 255, 255));
        detail4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel137.setIcon(new javax.swing.ImageIcon("C:\\Users\\Smit\\Desktop\\sell\\Capture28.PNG")); // NOI18N
        jLabel137.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel137.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel137MouseClicked(evt);
            }
        });
        detail4.add(jLabel137, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 570, -1, -1));

        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jTextArea3.setRows(5);
        jTextArea3.setText("Type here");
        detail4.add(jTextArea3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 840, 310));

        jLabel138.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Description", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 22), new java.awt.Color(51, 51, 51))); // NOI18N
        detail4.add(jLabel138, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 970, 410));

        javax.swing.GroupLayout sellrentpropLayout = new javax.swing.GroupLayout(sellrentprop);
        sellrentprop.setLayout(sellrentpropLayout);
        sellrentpropLayout.setHorizontalGroup(
            sellrentpropLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1490, Short.MAX_VALUE)
            .addGroup(sellrentpropLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(sellrentpropLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(sellrentpropLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 1490, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(detail4, javax.swing.GroupLayout.PREFERRED_SIZE, 1490, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(detail3, javax.swing.GroupLayout.PREFERRED_SIZE, 1490, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(detail1, javax.swing.GroupLayout.PREFERRED_SIZE, 1490, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(detail2, javax.swing.GroupLayout.PREFERRED_SIZE, 1490, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        sellrentpropLayout.setVerticalGroup(
            sellrentpropLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 870, Short.MAX_VALUE)
            .addGroup(sellrentpropLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(sellrentpropLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(sellrentpropLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(detail4, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(detail3, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(detail1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(detail2, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1490, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1490, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(loginpg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1490, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(contactus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Agents, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(sellrentprop, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 870, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 870, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(loginpg, javax.swing.GroupLayout.DEFAULT_SIZE, 870, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(contactus, javax.swing.GroupLayout.DEFAULT_SIZE, 870, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Agents, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(sellrentprop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1500, 874));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bedsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bedsKeyPressed
        jPanel2.setVisible(false);
        jPanel4.setVisible(false);
        jPanel5.setVisible(true);   
    }//GEN-LAST:event_bedsKeyPressed

    private void bedsMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bedsMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_bedsMouseDragged

    private void selectcityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_selectcityKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_selectcityKeyTyped

    private void selectcityKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_selectcityKeyPressed
        jPanel4.setVisible(true);
        jPanel2.setVisible(false);
        jPanel5.setVisible(false);
    }//GEN-LAST:event_selectcityKeyPressed

    private void selectcityMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectcityMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_selectcityMouseDragged

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        jPanel2.setVisible(true);
        jPanel4.setVisible(false);
        jPanel5.setVisible(false);
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1MouseDragged

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        jLabel4.setVisible(true);
        jLabel1.setVisible(false);      
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        jLabel4.setVisible(false);
        jLabel1.setVisible(true); 
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
    jTextField1.setText("Residential Apartment");       
    }//GEN-LAST:event_jLabel21MouseClicked

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
    jTextField1.setText("Residential Land");   
    }//GEN-LAST:event_jLabel24MouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
    jTextField1.setText("Independent House/Villa");       
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
    jTextField1.setText("Commerial Office/space");     
    }//GEN-LAST:event_jLabel22MouseClicked

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
    jTextField1.setText("Commercial Shops");       
    }//GEN-LAST:event_jLabel23MouseClicked

    private void selectcityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectcityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectcityActionPerformed

    private void bedsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bedsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bedsActionPerformed

    private void jTextField9MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField9MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9MouseDragged

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jTextField9KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField9KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9KeyPressed

    private void jTextField9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField9KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9KeyTyped

    private void jLabel31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel31MouseClicked
       beds.setText("1 BHK");        
    }//GEN-LAST:event_jLabel31MouseClicked

    private void jLabel29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel29MouseClicked
       beds.setText("2 BHK");              
    }//GEN-LAST:event_jLabel29MouseClicked

    private void jLabel30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel30MouseClicked
       beds.setText("3 BHK");              
    }//GEN-LAST:event_jLabel30MouseClicked

    private void jLabel28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseClicked
       beds.setText("4 BHK");            
    }//GEN-LAST:event_jLabel28MouseClicked

    private void contactMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contactMouseClicked
        jScrollPane1.setVisible(false);
        loginpg.setVisible(false);
         contactus.setVisible(true); 
    }//GEN-LAST:event_contactMouseClicked

    private void mumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mumMouseClicked
    selectcity.setText("Mumbai");        
    }//GEN-LAST:event_mumMouseClicked

    private void delhiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delhiMouseClicked
    selectcity.setText("Delhi");        
    }//GEN-LAST:event_delhiMouseClicked

    private void bengaluMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bengaluMouseClicked
    selectcity.setText("Bengaluru");        
    }//GEN-LAST:event_bengaluMouseClicked

    private void hyderbdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hyderbdMouseClicked
    selectcity.setText("Hyderabad");        
    }//GEN-LAST:event_hyderbdMouseClicked

    private void ahmedbdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ahmedbdMouseClicked
    selectcity.setText("Ahmedabad");        
    }//GEN-LAST:event_ahmedbdMouseClicked

    private void chandiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chandiMouseClicked
    selectcity.setText("Chandigarh");      
    }//GEN-LAST:event_chandiMouseClicked

    private void chennMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chennMouseClicked
    selectcity.setText("Chennai");        
    }//GEN-LAST:event_chennMouseClicked

    private void puneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_puneMouseClicked
    selectcity.setText("Pune");        
    }//GEN-LAST:event_puneMouseClicked

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        jScrollPane1.setVisible(true);
        loginpg.setVisible(false);
        contactus.setVisible(false);    
    }//GEN-LAST:event_jLabel18MouseClicked

    private void seccodefpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seccodefpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seccodefpActionPerformed

    private void seccodefpFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_seccodefpFocusGained
        seccodefp.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_seccodefpFocusGained

    private void passfpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passfpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passfpActionPerformed

    private void passfpFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passfpFocusGained
        passfp.setText("");        
    }//GEN-LAST:event_passfpFocusGained

    private void forgetpasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgetpasMouseClicked
        log.setVisible(false);
        reg.setVisible(false);
        forgetpass.setVisible(true);    
    }//GEN-LAST:event_forgetpasMouseClicked

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passActionPerformed

    private void passFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passFocusGained
        pass.setText("");        
    }//GEN-LAST:event_passFocusGained

    private void seccoderegFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_seccoderegFocusGained
        seccodereg.setText("");       
    }//GEN-LAST:event_seccoderegFocusGained

    private void passregActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passregActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passregActionPerformed

    private void passregFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passregFocusGained
        passreg.setText("");        
    }//GEN-LAST:event_passregFocusGained

    private void fullnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fullnameActionPerformed

    private void fullnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fullnameFocusGained
            // TODO add your handling code here:
    }//GEN-LAST:event_fullnameFocusGained

    private void emailidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailidActionPerformed

    private void emailidFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailidFocusGained
        emailid.setText("");       
    }//GEN-LAST:event_emailidFocusGained

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
       
        String Name = fullname.getText();
        String Email_id = emailid.getText();
        String Phone_no = ph_no.getText();
        String Password = String.valueOf(passreg.getPassword());
        String Security_code = String.valueOf(seccodereg.getPassword());
        
        if("".equals(Password) || "".equals(Email_id) || "".equals(Phone_no) || "".equals(Name) || "".equals(Security_code))
            JOptionPane.showMessageDialog(null, "Please Reccheck Credentials");
        else{
            PreparedStatement ps;
        String query="INSERT INTO `customer`(`email_id`, `password`, `ph_no`, `Name`, `Security_code`) VALUES (?,?,?,?,?)";
        
        try {
            ps = connector.getConnnection().prepareStatement(query);
            
            ps.setString(1, Email_id);
            ps.setString(2, Password);
            ps.setString(3,Phone_no);
            ps.setString(4, Name);
            ps.setString(5, Security_code);
            
            if(ps.executeUpdate()>0)
            {
                JOptionPane.showMessageDialog(null,"New User Add");
                log.setVisible(true);
                userid.setText(Email_id);
                reg.setVisible(false);
                forgetpass.setVisible(false);
            }
        } catch (SQLException ex) {
            Logger.getLogger(page1.class.getName()).log(Level.SEVERE, null, ex);
        }
        }

           /* String gender;
            if("Male".equals(gen))
                gender="1";
            else
                gender="0";*/

        
        PreparedStatement ps;
        String query="INSERT INTO `customer`(`email_id`, `password`, `ph_no`, `Name`, `Security_code`) VALUES (?,?,?,?,?)";
        
        try {
            ps = connector.getConnnection().prepareStatement(query);
            
            ps.setString(1, Email_id);
            ps.setString(2, Password);
            ps.setString(3,Phone_no);
            ps.setString(4, Name);
            ps.setString(5, Security_code);
            
            if(ps.executeUpdate()>0)
            {
                JOptionPane.showMessageDialog(null,"New User Add");
            }
        } catch (SQLException ex) {
            Logger.getLogger(page1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jLabel13MouseClicked

    private void ph_noFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ph_noFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_ph_noFocusGained

    private void ph_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ph_noActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ph_noActionPerformed

    private void BuyerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuyerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BuyerActionPerformed

    private void sellerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sellerActionPerformed

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
    jLabel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
    jLabel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51)));
    }//GEN-LAST:event_jLabel3MouseExited

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
    jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255,255), 1, true));    
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
    jLabel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51))); 
    }//GEN-LAST:event_jLabel2MouseExited

    private void contactMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contactMouseEntered
   contact.setFont(new java.awt.Font("Calibri", 1, 26));      
         //contact.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,0,51), 1, true));   
    }//GEN-LAST:event_contactMouseEntered

    private void contactMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contactMouseExited
    contact.setFont(new java.awt.Font("Calibri", 1, 24));         
    }//GEN-LAST:event_contactMouseExited

    private void sellrentMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellrentMouseEntered
      sellrent.setFont(new java.awt.Font("Calibri", 1, 26));        
    }//GEN-LAST:event_sellrentMouseEntered

    private void sellrentMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellrentMouseExited
      sellrent.setFont(new java.awt.Font("Calibri", 1, 24));         
    }//GEN-LAST:event_sellrentMouseExited

    private void profileMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileMouseEntered
      profile.setFont(new java.awt.Font("Calibri", 1, 26));         
    }//GEN-LAST:event_profileMouseEntered

    private void profileMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileMouseExited
      profile.setFont(new java.awt.Font("Calibri", 1, 24));         
    }//GEN-LAST:event_profileMouseExited

    private void contact1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contact1MouseClicked
     jScrollPane1.setVisible(false);
      loginpg.setVisible(false);
      contactus.setVisible(false);
      Agents.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_contact1MouseClicked

    private void contact1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contact1MouseEntered
      contact1.setFont(new java.awt.Font("Calibri", 1, 26));   // TODO add your handling code here:
    }//GEN-LAST:event_contact1MouseEntered

    private void contact1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contact1MouseExited
      contact1.setFont(new java.awt.Font("Calibri", 1, 24));    // TODO add your handling code here:
    }//GEN-LAST:event_contact1MouseExited

    private void contact1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_contact1FocusGained
 
    }//GEN-LAST:event_contact1FocusGained

    private void sellrentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellrentMouseClicked
   jScrollPane1.setVisible(false);
    sellrentprop.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_sellrentMouseClicked

    private void jLabel67MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel67MouseClicked
     jScrollPane1.setVisible(true);
        loginpg.setVisible(false);
        contactus.setVisible(false);
        Agents.setVisible(false);
        page1.this.setExtendedState(JFrame.NORMAL);       // TODO add your handling code here:
    }//GEN-LAST:event_jLabel67MouseClicked

    private void useridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_useridActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_useridActionPerformed

    private void useridFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_useridFocusGained
       userid.setText("");
    }//GEN-LAST:event_useridFocusGained

    private void useridMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_useridMouseClicked
     // TODO add your handling code here:
    }//GEN-LAST:event_useridMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        PreparedStatement ps ;
        ResultSet rs;
        String Email_id = userid.getText();
        String Password = String.valueOf(pass.getPassword());
        
        String query = "SELECT * FROM `customer` WHERE `email_id`= ? AND `password`= ?";
        
        try {
            ps=connector.getConnnection().prepareStatement(query);
            
            ps.setString(1, Email_id);
            ps.setString(2, Password);
            rs = ps.executeQuery();
            
            if(rs.next())
            {
              //  JOptionPane.showMessageDialog(null,"YES");
                invalid.setVisible(false);
                jScrollPane1.setVisible(true);
                loginpg.setVisible(false);
                contactus.setVisible(false);
                page1.this.setExtendedState(JFrame.NORMAL);
            }
            else
            {
                //JOptionPane.showMessageDialog(null, "NO");
                invalid.setVisible(true);
            }
        } catch (SQLException ex) {
            Logger.getLogger(page1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
                  // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseClicked
    log.setVisible(true);
    reg.setVisible(false);
    forgetpass.setVisible(false);
    }//GEN-LAST:event_loginMouseClicked

    private void registerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerMouseClicked
    log.setVisible(false);
    reg.setVisible(true);
    forgetpass.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_registerMouseClicked

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registerActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginActionPerformed

    private void loginFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_loginFocusGained
    login.setFont(new java.awt.Font("Calibri", 0, 24));
    register.setFont(new java.awt.Font("Calibri", 0, 18));
    }//GEN-LAST:event_loginFocusGained

    private void loginFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_loginFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_loginFocusLost

    private void registerFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_registerFocusGained
    login.setFont(new java.awt.Font("Calibri", 0, 18));
    register.setFont(new java.awt.Font("Calibri", 0, 24));
    }//GEN-LAST:event_registerFocusGained

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     PreparedStatement ps ;
        ResultSet rs;
        String Security_code = seccodefp.getText();
        
        
        String query = "SELECT `password` FROM `customer` WHERE `Security_code`= ?";
        
        try {
            ps=connector.getConnnection().prepareStatement(query);
            
            ps.setString(1, Security_code);
            rs = ps.executeQuery();
            
            if(rs.next())
            {   String retpass;
                retpass = rs.getString(1);
                passfp.setText(retpass);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "NO");
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(page1.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel105MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel105MouseClicked
    jScrollPane1.setVisible(true);
    sellrentprop.setVisible(false);

    }//GEN-LAST:event_jLabel105MouseClicked

    private void jFileChooser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFileChooser1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFileChooser1ActionPerformed

    private void resaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resaleActionPerformed

    private void resale1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resale1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resale1ActionPerformed

    private void featnextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_featnextMouseClicked

        detail2.setVisible(false);
        detail1.setVisible(false);
        detail3.setVisible(false);
        detail4.setVisible(true);
        jLabel107.setVisible(false);
        jLabel108.setVisible(false);
        jLabel106.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_featnextMouseClicked

    private void featprevMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_featprevMouseClicked

        detail1.setVisible(false);
        detail3.setVisible(false);
        detail2.setVisible(true);
        jLabel106.setForeground(new java.awt.Color(54, 164, 255));
        jLabel106.setBackground(new java.awt.Color(255, 255, 255));
        //features1.setVisible(false); // TODO add your handling code here:
    }//GEN-LAST:event_featprevMouseClicked

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        Filechos.setVisible(true);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Image files" , ImageIO.getReaderFileSuffixes());
        jFileChooser1.setAcceptAllFileFilterUsed(false);
        jFileChooser1.setFileFilter(filter);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        File f = jFileChooser1.getSelectedFile();
        String phot = f.getAbsolutePath();
        jTextField5.setText(phot);
        Filechos.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox5ActionPerformed

    private void locnextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locnextMouseClicked

        detail2.setVisible(false);
        detail1.setVisible(false);
        detail3.setVisible(true);
        jLabel106.setBackground(new java.awt.Color(54, 164, 255));
        jLabel106.setForeground(new java.awt.Color(255, 255, 255));
        //pricing1.setVisible(false);
        //features1.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_locnextMouseClicked

    private void locprevMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locprevMouseClicked

        detail2.setVisible(false);
        detail1.setVisible(true);
        detail3.setVisible(false);
        jLabel107.setForeground(new java.awt.Color(54, 164, 255));
        jLabel107.setBackground(new java.awt.Color(255, 255, 255));
        // pricing1.setVisible(false);
        //features1.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_locprevMouseClicked

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void commerialBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_commerialBMouseClicked
        Commerial.setVisible(true);
        Residential.setVisible(false);
        commerial1.setVisible(true);
        residential1.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_commerialBMouseClicked

    private void residentialBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_residentialBMouseClicked
        Residential.setVisible(true);
        Commerial.setVisible(false);
        residential1.setVisible(true);
        commerial1.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_residentialBMouseClicked

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void cityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityActionPerformed

    private void detailnextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_detailnextMouseClicked

        detail2.setVisible(true);
        detail1.setVisible(false);
        jLabel107.setBackground(new java.awt.Color(54, 164, 255));
        jLabel107.setForeground(new java.awt.Color(255, 255, 255));

        // propdetail1.setVisible(false);
        //pricing1.setVisible(false);
        //features1.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_detailnextMouseClicked

    private void jLabel137MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel137MouseClicked
    jRadioButton1.setActionCommand("Owner");
    jRadioButton2.setActionCommand("Builder");
    jRadioButton3.setActionCommand("Agent");
    
    String A01 = Iam.getSelection().getActionCommand();
    
    jRadioButton4.setActionCommand("Sale");
    jRadioButton5.setActionCommand("Rent");
    jRadioButton6.setActionCommand("PG");
    
    String A02 = propfor.getSelection().getActionCommand();
    
    String A03 = proptype.getText();
    
    String A04 = city.getSelectedItem().toString();
 
    String A05 = locality.getText();
    
    String A06 = jComboBox3.getSelectedItem().toString();
    
    String A07 = jComboBox4.getSelectedItem().toString();
    
    String A08 = jComboBox5.getSelectedItem().toString();
    
    String A09 = jComboBox2.getSelectedItem().toString();
    
    String A10 = jTextField6.getText();
    
    String A11 = jTextField3.getText();
    
    String A12 = jTextField8.getText();
    
    resale.setActionCommand("Resale");
    newprop.setActionCommand("New Property");
    
    String A13 = Transtype.getSelection().getActionCommand();
   
     
     resale1.setActionCommand("Ready To Move");
        newprop1.setActionCommand("Under Construction");

        String A18 = propavail.getSelection().getActionCommand();

        String A14 = jTextField4.getText();

        String A15 = jTextField5.getText();
        
        String A16 = jTextArea3.getText();
        
        String A17 = "smit";
        
        PreparedStatement ps;
            String query="INSERT INTO `property`(`Customer_Is`, `Property_Purpose`, `Property_Type`, `City`, `Location`, `Bedrooms`, `Bathromms`, `Floor_no.`, `Total_floor`, `Amenities`, `Covered_area`, `Carpet_area`, `Transaction_Type`, `Expected Price`, `Add_photo`, `Description`, `Email_id`, `Property_status`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

            try {
                ps = connector.getConnnection().prepareStatement(query);

                ps.setString(1, A01);
                ps.setString(2, A02);
                ps.setString(3, A03);
                ps.setString(4, A04);
                ps.setString(5, A05);
                ps.setString(6, A06);
                ps.setString(7, A07);
                ps.setString(8, A08);
                ps.setString(9, A09);
                ps.setString(10, A10);
                ps.setString(11, A11);
                ps.setString(12, A12);
                ps.setString(13, A13);
                ps.setString(14, A14);
                ps.setString(15, A15);
                ps.setString(16, A16);
                ps.setString(17, A17);
                ps.setString(18, A18);

                if(ps.executeUpdate()>0)
                {
                    JOptionPane.showMessageDialog(null,"New Property Added");
                    sellrentprop.setVisible(false);
                    jScrollPane1.setVisible(true);
                    
                }
            } catch (SQLException ex) {
                Logger.getLogger(page1.class.getName()).log(Level.SEVERE, null, ex);
            }
     
     
    
    
           // TODO add your handling code here:
    }//GEN-LAST:event_jLabel137MouseClicked

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try 
                {
                    Thread.sleep(700);
                }
                catch(InterruptedException e)
                {
                    
                }
                new page1().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Agents;
    private javax.swing.JRadioButton Buyer;
    private javax.swing.JLabel Commerial;
    private javax.swing.JPanel Filechos;
    private javax.swing.ButtonGroup Iam;
    private javax.swing.JLabel Residential;
    private javax.swing.ButtonGroup Transtype;
    private javax.swing.JLabel ahmedbd;
    private javax.swing.JTextField beds;
    private javax.swing.JLabel bengalu;
    private javax.swing.JLabel chandi;
    private javax.swing.JLabel chenn;
    private javax.swing.JComboBox<String> city;
    private javax.swing.JLabel commerial1;
    private javax.swing.JLabel commerialB;
    private javax.swing.JLabel contact;
    private javax.swing.JLabel contact1;
    private javax.swing.JPanel contactus;
    private javax.swing.JLabel delhi;
    private javax.swing.JPanel detail1;
    private javax.swing.JPanel detail2;
    private javax.swing.JPanel detail3;
    private javax.swing.JPanel detail4;
    private javax.swing.JLabel detailnext;
    private javax.swing.JTextField emailid;
    private javax.swing.JLabel featnext;
    private javax.swing.JLabel featprev;
    private javax.swing.JLabel forgetpas;
    private javax.swing.JPanel forgetpass;
    private javax.swing.JTextField fullname;
    private javax.swing.JPanel header;
    private javax.swing.JLabel hyderbd;
    private javax.swing.JLabel invalid;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    public javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextArea locality;
    private javax.swing.JLabel locnext;
    private javax.swing.JLabel locprev;
    private javax.swing.JPanel log;
    private javax.swing.JButton login;
    public javax.swing.JPanel loginpg;
    private javax.swing.JLabel mum;
    private javax.swing.JRadioButton newprop;
    private javax.swing.JRadioButton newprop1;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField passfp;
    private javax.swing.JPasswordField passreg;
    private javax.swing.JTextField ph_no;
    private javax.swing.JLabel profile;
    private javax.swing.ButtonGroup propavail;
    private javax.swing.ButtonGroup propfor;
    private javax.swing.JTextField proptype;
    private javax.swing.JLabel pune;
    private javax.swing.JPanel reg;
    private javax.swing.JButton register;
    private javax.swing.JRadioButton resale;
    private javax.swing.JRadioButton resale1;
    private javax.swing.JLabel residential1;
    private javax.swing.JLabel residentialB;
    public javax.swing.JPanel searchpg;
    private javax.swing.JTextField seccodefp;
    private javax.swing.JPasswordField seccodereg;
    private javax.swing.JTextField selectcity;
    private javax.swing.JRadioButton seller;
    private javax.swing.JLabel sellrent;
    private javax.swing.JPanel sellrentprop;
    public javax.swing.JPanel srchpg;
    private javax.swing.JTextField userid;
    private javax.swing.ButtonGroup usertype;
    // End of variables declaration//GEN-END:variables
}
