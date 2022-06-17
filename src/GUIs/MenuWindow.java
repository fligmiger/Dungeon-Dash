/*
2022-06-13
Jason
menu window
 */
package GUIs;

import finalproject_dungeondash.DrawingSurface;

import javax.swing.JFrame;


/**
 *
 * @author mayu0918
 */
public class MenuWindow extends javax.swing.JFrame {
// initialise all variables
    private static LoginWindow login;
    private InstructionsWindow instructions;
    public static LeaderboardWindow leaderboard;
    public static DrawingSurface gamePanel;
    public static JFrame window;
    public MenuWindow(LoginWindow l) {
        initComponents();
        login = l;
        

    }
/**
 * displays the walcome messsage
 */
    public void displayWelcome() {
        lblUserName.setText("Welcome " + LoginWindow.currentUser.getUsername() + "!");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle1 = new javax.swing.JLabel();
        btnStart = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        btnLeaderboard = new javax.swing.JButton();
        lblUserName = new javax.swing.JLabel();
        btnInstructions = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitle1.setFont(new java.awt.Font("Ravie", 0, 48)); // NOI18N
        lblTitle1.setForeground(new java.awt.Color(0, 255, 0));
        lblTitle1.setText("Dungeon Dash");
        lblTitle1.setToolTipText("");

        btnStart.setFont(new java.awt.Font("Poor Richard", 0, 24)); // NOI18N
        btnStart.setText("Start Your Adventure");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        btnLogout.setFont(new java.awt.Font("Poor Richard", 0, 24)); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        btnLeaderboard.setFont(new java.awt.Font("Poor Richard", 0, 24)); // NOI18N
        btnLeaderboard.setText("Leaderboard");
        btnLeaderboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeaderboardActionPerformed(evt);
            }
        });

        lblUserName.setFont(new java.awt.Font("Ravie", 0, 36)); // NOI18N
        lblUserName.setForeground(new java.awt.Color(0, 255, 0));
        lblUserName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUserName.setText("Welcome Username!");
        lblUserName.setToolTipText("");

        btnInstructions.setFont(new java.awt.Font("Poor Richard", 0, 24)); // NOI18N
        btnInstructions.setText("Instructions");
        btnInstructions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInstructionsActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/InstructionsBackground.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(370, 370, 370)
                .addComponent(lblTitle1))
            .addComponent(lblUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 1200, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(483, 483, 483)
                .addComponent(btnStart))
            .addGroup(layout.createSequentialGroup()
                .addGap(483, 483, 483)
                .addComponent(btnInstructions, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(1063, 1063, 1063)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(483, 483, 483)
                .addComponent(btnLeaderboard, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lblTitle1)
                .addGap(13, 13, 13)
                .addComponent(lblUserName)
                .addGap(116, 116, 116)
                .addComponent(btnStart)
                .addGap(21, 21, 21)
                .addComponent(btnInstructions)
                .addGap(257, 257, 257)
                .addComponent(btnLogout))
            .addGroup(layout.createSequentialGroup()
                .addGap(391, 391, 391)
                .addComponent(btnLeaderboard))
            .addComponent(jLabel1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLeaderboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeaderboardActionPerformed
        // if the leaderboard is null create a new leaderboard 
        if (leaderboard == null) {
            leaderboard = new LeaderboardWindow(this);
        }
        //sett the current window to invisible 
        this.setVisible(false);
// order the users on the leaderboard and make it visible
        leaderboard.orderUsers();
        leaderboard.setVisible(true);


    }//GEN-LAST:event_btnLeaderboardActionPerformed

    private void btnInstructionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInstructionsActionPerformed
        // if the isntraction window is null, create a new one
        if (instructions == null) {
            instructions = new InstructionsWindow(this);
        }
        // make the current window invisibleand make the inastructions window visible 
        this.setVisible(false);
        instructions.setVisible(true);
    }//GEN-LAST:event_btnInstructionsActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // make the current window invisible and the login window fvisible 
        this.setVisible(false);
        login.setVisible(true);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        // set the current window incisible and set the game panel to visible 
        this.setVisible(false);
        
        //code taken from main method
        gamePanel = new DrawingSurface();
        window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// set the jframe to exit when closed 
        window.setResizable(false);// make the jframe in resizable 
        window.setTitle("Dungeon Dash");//reset the title
        window.add(gamePanel);
        window.pack();
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        gamePanel.gameState = 0;
        gamePanel.setupGame();

        gamePanel.startGameThread();
    }//GEN-LAST:event_btnStartActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInstructions;
    public javax.swing.JButton btnLeaderboard;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnStart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblTitle1;
    private javax.swing.JLabel lblUserName;
    // End of variables declaration//GEN-END:variables
}
