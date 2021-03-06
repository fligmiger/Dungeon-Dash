/*
2022-06-13
Jason
leaderboard window class
 */
package GUIs;

import java.util.ArrayList;

/**
 *
 * @author mayu0918
 */
public class LeaderboardWindow extends javax.swing.JFrame {
    // create a new menu window menu
    private MenuWindow menu;


    public LeaderboardWindow(MenuWindow m) {
        initComponents();
        this.setLocationRelativeTo(null);
        txtAreaLeaderboard.setEditable(false);
        menu = m; //save menu window
        
    }
    
    /**
     * 
     */
    public void orderUsers() {        
        sortScores(LoginWindow.registeredUsers, 0, LoginWindow.registeredUsers.size() - 1); //sort the scores
        
        //format sorted arraylist in nice table
        String spacingRank = "\t", spacingUsername = "\t\t\t\t";
        // formating for theleaderboad scores 
        String leaderboardRes = "Rank:" + spacingRank + "Username:" + spacingUsername + "High Score:";
        // create a new user caller current user
        Users currentUser;
        // use a for loop to sort throught eh users and odrer them
        for (int i = 1; i <= LoginWindow.registeredUsers.size(); i++) {
            currentUser = LoginWindow.registeredUsers.get(i - 1);
            leaderboardRes += "\n" + i + spacingRank + currentUser.getUsername() + spacingUsername + currentUser.getHighScore();

        }
        txtAreaLeaderboard.setText(leaderboardRes); //outpout to user
        
    }
    
    /**
     * quick sort to order users in descending order by score
     * @param usersByScore - array of users
     * @param left - left index of search
     * @param right - right index of search
     */
    public void sortScores(ArrayList<Users> usersByScore, int left, int right) {
        if (left >= right) { //if left scanner higher than right scanner, nothign else to sort
            return;
        }

        int i = left; //save left and right scanner start positions
        int j = right;
        int referenceScore = usersByScore.get((left + right) / 2).getHighScore(); //choose a reference score
        
        //if score of index to left of score bigger, in right position so move scanner to check next one
        while (usersByScore.get(i).getHighScore() > referenceScore) {
            i++;
        }

        //if score of index to right of score smaller, in right position so move scanner to check next one
        while (usersByScore.get(j).getHighScore() < referenceScore) {
            j--;
        }
        
        //once escape, we have 2 scores in wrong spot
        
        if (i <= j) { //make sure swap is supposed to happen
            swap(usersByScore, i, j); //swap users at each index
            i++; //move to next users
            j--;
        }
        
        
        //recursive call, split arraylist at wherever scanners end to sort arraylist by smaller sections
        sortScores(usersByScore, left, j);
        sortScores(usersByScore, i, right);
    }
    
    /**
     * swap elements of arraylist
     * @param usersByScore - arraylist to make swap
     * @param firstIndex - first index to swap
     * @param secondIndex - next index to swap
     */
    public void swap(ArrayList<Users> usersByScore, int firstIndex, int secondIndex) {
        Users hold = usersByScore.set(firstIndex, usersByScore.get(secondIndex)); //set first index and save its original value
        usersByScore.set(secondIndex, hold); //set second index to original of first
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnMenu = new javax.swing.JButton();
        lblLeaderboard = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaLeaderboard = new javax.swing.JTextArea();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnMenu.setFont(new java.awt.Font("Poor Richard", 0, 24)); // NOI18N
        btnMenu.setText("Menu");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        lblLeaderboard.setFont(new java.awt.Font("Ravie", 0, 48)); // NOI18N
        lblLeaderboard.setForeground(new java.awt.Color(51, 255, 0));
        lblLeaderboard.setText("Leaderboard Scores");

        txtAreaLeaderboard.setColumns(20);
        txtAreaLeaderboard.setFont(new java.awt.Font("Poor Richard", 0, 24)); // NOI18N
        txtAreaLeaderboard.setRows(5);
        jScrollPane1.setViewportView(txtAreaLeaderboard);

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIs/ICS4UBackgroundDungeon.jpg"))); // NOI18N
        lblBackground.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(293, 293, 293)
                .addComponent(lblLeaderboard, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 882, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(1053, 1053, 1053)
                .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(lblBackground)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblLeaderboard)
                .addGap(13, 13, 13)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106)
                .addComponent(btnMenu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(lblBackground, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        this.setVisible(false); //set this panel to invisible
        menu.setVisible(true); //set menu panel to visible
    }//GEN-LAST:event_btnMenuActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMenu;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblLeaderboard;
    private javax.swing.JTextArea txtAreaLeaderboard;
    // End of variables declaration//GEN-END:variables
}
