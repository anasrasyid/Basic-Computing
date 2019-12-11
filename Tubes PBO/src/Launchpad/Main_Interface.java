package Launchpad;

import Game.*;
import java.io.*;
import javax.swing.*;
import java.util.*;

public class Main_Interface extends javax.swing.JFrame {

    /**
     * Creates new form Main_Interface
     */
    DefaultListModel<String> listModel = new DefaultListModel<String>();
    private GameManager manager;
    
    
    public Main_Interface() {
        initComponents();
        setSize(950,760);
        randompict();
        manager = GameManager.getInstance();
        int comp = 3*(manager.getLevel()- 1);
        manager.setEnemy(new NPC("Goblin", 40 + comp, 2 + comp, 2 + comp, 90, 50+comp));
        manager.getEnemy().changeTurn();
        Player_Name.setText(manager.getPlayer().getName());
        
        jLabel2.setText("Level - " + Integer.toString(manager.getLevel()));
        SetUpPlayer();
        SetUpEnemy();
    }
    
    public void randompict(){
        Random random = new Random();
        int xint = random.nextInt(3);
        if (xint == 1){
            ImageIcon monster = new ImageIcon(getClass().getResource("Goblin.png"));
            Monster_Potrait.setIcon(monster);
            Monster_Name.setText("Anas - The Goblin Militia");
            Monster_Dialog.setText("Nice helmet, i believe it would be good on me");
            Hero_Dialog.setText("Try it, greenheads!");
        }else if (xint == 2){
            ImageIcon monster = new ImageIcon(getClass().getResource("goblin2.png"));
            Monster_Potrait.setIcon(monster); 
            Monster_Name.setText("Ravli - The Goblin Knight");
            Monster_Dialog.setText("It will be an honor "+'\n'
                    + "to decapitate you with my ax");
            Hero_Dialog.setText("Likewise.");
        } else {
            ImageIcon monster = new ImageIcon(getClass().getResource("goblin3.png"));
            Monster_Potrait.setIcon(monster); 
            Monster_Name.setText("Hiki - The Goblin Ninja");
            Monster_Dialog.setText("I cant beat the crap " + '\n'
                    + "of you without getting closer");
            Hero_Dialog.setText("Oh you're approaching me ?!");
        }        
    }


    public void SetUpPlayer(){
        Player_HPvalue.setText(Integer.toString(manager.getPlayer().getHp()));
        Player_APvalue.setText(Integer.toString(manager.getPlayer().getAp()));
    }
    
    public void SetUpEnemy(){
        Monster_HPvalue.setText(Integer.toString(manager.getEnemy().getHp()));
        Monster_APvalue.setText(Integer.toString(manager.getEnemy().getAp()));
    }
    
    public void Next(){
        if(manager.isGameOver()){
            manager.SaveData(manager.getLevel(),Player_Name.getText());
            for(int i = 0; i < 5;i++)
                WaitPanel(1000000000);
            new Start_Interface().setVisible(true);
            this.dispose();
        }else if(manager.canNextLevel()){
            new Main_Interface().setVisible(true);
            this.dispose();
        }
    }
    
    public void ChangeTurn(){
        manager.getPlayer().changeTurn();
    }
    
    public void WaitPanel(long n){
        long tmp = 0;
        for(long i =0 ; i < n;i++)
            tmp += 0;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SkillsActions = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        Monster_Tab = new javax.swing.JPanel();
        Monster_Potrait = new javax.swing.JLabel();
        MonsterStatus = new javax.swing.JPanel();
        HpText = new javax.swing.JLabel();
        ApText = new javax.swing.JLabel();
        Monster_HPvalue = new javax.swing.JLabel();
        Monster_APvalue = new javax.swing.JLabel();
        Monster_Name = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Monster_Dialog = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        Battle_Log = new javax.swing.JList<>();
        Player_Tab = new javax.swing.JPanel();
        Player_Potrait = new javax.swing.JLabel();
        HeroStatus = new javax.swing.JPanel();
        Player_Name = new javax.swing.JLabel();
        HPText2 = new javax.swing.JLabel();
        APText = new javax.swing.JLabel();
        Player_HPvalue = new javax.swing.JLabel();
        Player_APvalue = new javax.swing.JLabel();
        SkillsnActions = new javax.swing.JPanel();
        Normal_Slash = new javax.swing.JRadioButton();
        Solar_Fist = new javax.swing.JRadioButton();
        Defend = new javax.swing.JRadioButton();
        Arcspear = new javax.swing.JRadioButton();
        Execute = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Hero_Dialog = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1000, 1000));
        setPreferredSize(new java.awt.Dimension(815, 675));

        jLabel2.setFont(new java.awt.Font("Pixelade", 0, 36)); // NOI18N
        jLabel2.setText("Level - XX");

        Monster_Tab.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Monster_Potrait.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Launchpad/Goblin.png"))); // NOI18N

        MonsterStatus.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Monster's Status", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Pixelade", 0, 18))); // NOI18N
        MonsterStatus.setAlignmentX(LEFT_ALIGNMENT);
        MonsterStatus.setMinimumSize(new java.awt.Dimension(284, 201));
        MonsterStatus.setName(""); // NOI18N

        HpText.setFont(new java.awt.Font("Pixelade", 0, 36)); // NOI18N
        HpText.setText("HP :");

        ApText.setFont(new java.awt.Font("Pixelade", 0, 36)); // NOI18N
        ApText.setText("AP :");

        Monster_HPvalue.setFont(new java.awt.Font("Pixelade", 0, 36)); // NOI18N
        Monster_HPvalue.setText("XX");

        Monster_APvalue.setFont(new java.awt.Font("Pixelade", 0, 36)); // NOI18N
        Monster_APvalue.setText("XX");

        Monster_Name.setFont(new java.awt.Font("Pixelade", 0, 36)); // NOI18N
        Monster_Name.setText("Monster's Name");
        Monster_Name.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Monster_Name.setFocusable(false);
        Monster_Name.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout MonsterStatusLayout = new javax.swing.GroupLayout(MonsterStatus);
        MonsterStatus.setLayout(MonsterStatusLayout);
        MonsterStatusLayout.setHorizontalGroup(
            MonsterStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MonsterStatusLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MonsterStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MonsterStatusLayout.createSequentialGroup()
                        .addComponent(ApText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Monster_APvalue))
                    .addGroup(MonsterStatusLayout.createSequentialGroup()
                        .addComponent(HpText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Monster_HPvalue))
                    .addComponent(Monster_Name))
                .addGap(0, 0, 0))
        );
        MonsterStatusLayout.setVerticalGroup(
            MonsterStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MonsterStatusLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Monster_Name)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MonsterStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HpText)
                    .addComponent(Monster_HPvalue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MonsterStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ApText)
                    .addComponent(Monster_APvalue))
                .addGap(0, 0, 0))
        );

        Monster_Dialog.setEditable(false);
        Monster_Dialog.setColumns(20);
        Monster_Dialog.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        Monster_Dialog.setRows(5);
        jScrollPane1.setViewportView(Monster_Dialog);

        Battle_Log.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane3.setViewportView(Battle_Log);

        javax.swing.GroupLayout Monster_TabLayout = new javax.swing.GroupLayout(Monster_Tab);
        Monster_Tab.setLayout(Monster_TabLayout);
        Monster_TabLayout.setHorizontalGroup(
            Monster_TabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Monster_TabLayout.createSequentialGroup()
                .addComponent(Monster_Potrait)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Monster_TabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(MonsterStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        Monster_TabLayout.setVerticalGroup(
            Monster_TabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Monster_TabLayout.createSequentialGroup()
                .addGroup(Monster_TabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Monster_Potrait)
                    .addGroup(Monster_TabLayout.createSequentialGroup()
                        .addComponent(MonsterStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Monster_TabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );

        Player_Tab.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Player_Potrait.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Launchpad/Hero.png"))); // NOI18N

        HeroStatus.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Hero's Status", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Pixelade", 0, 18))); // NOI18N
        HeroStatus.setMinimumSize(new java.awt.Dimension(274, 201));

        Player_Name.setFont(new java.awt.Font("Pixelade", 0, 36)); // NOI18N
        Player_Name.setText("Hero's Name");

        HPText2.setFont(new java.awt.Font("Pixelade", 0, 36)); // NOI18N
        HPText2.setText("HP :");

        APText.setFont(new java.awt.Font("Pixelade", 0, 36)); // NOI18N
        APText.setText("AP :");

        Player_HPvalue.setFont(new java.awt.Font("Pixelade", 0, 36)); // NOI18N
        Player_HPvalue.setText("XX");

        Player_APvalue.setFont(new java.awt.Font("Pixelade", 0, 36)); // NOI18N
        Player_APvalue.setText("XX");

        javax.swing.GroupLayout HeroStatusLayout = new javax.swing.GroupLayout(HeroStatus);
        HeroStatus.setLayout(HeroStatusLayout);
        HeroStatusLayout.setHorizontalGroup(
            HeroStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeroStatusLayout.createSequentialGroup()
                .addContainerGap(105, Short.MAX_VALUE)
                .addGroup(HeroStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Player_Name, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeroStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(HeroStatusLayout.createSequentialGroup()
                            .addComponent(APText)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Player_APvalue))
                        .addGroup(HeroStatusLayout.createSequentialGroup()
                            .addComponent(HPText2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Player_HPvalue))))
                .addContainerGap())
        );
        HeroStatusLayout.setVerticalGroup(
            HeroStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeroStatusLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Player_Name)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(HeroStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HPText2)
                    .addComponent(Player_HPvalue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(HeroStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(APText)
                    .addComponent(Player_APvalue)))
        );

        SkillsnActions.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Skills & Actions", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Pixelade", 0, 18))); // NOI18N

        SkillsActions.add(Normal_Slash);
        Normal_Slash.setFont(new java.awt.Font("Pixelade", 0, 30)); // NOI18N
        Normal_Slash.setText("Normal Slash");

        SkillsActions.add(Solar_Fist);
        Solar_Fist.setFont(new java.awt.Font("Pixelade", 0, 30)); // NOI18N
        Solar_Fist.setText("Solar Fist");
        Solar_Fist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Solar_FistActionPerformed(evt);
            }
        });

        SkillsActions.add(Defend);
        Defend.setFont(new java.awt.Font("Pixelade", 0, 30)); // NOI18N
        Defend.setText("Defend");

        SkillsActions.add(Arcspear);
        Arcspear.setFont(new java.awt.Font("Pixelade", 0, 30)); // NOI18N
        Arcspear.setText("Arcspear");

        javax.swing.GroupLayout SkillsnActionsLayout = new javax.swing.GroupLayout(SkillsnActions);
        SkillsnActions.setLayout(SkillsnActionsLayout);
        SkillsnActionsLayout.setHorizontalGroup(
            SkillsnActionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SkillsnActionsLayout.createSequentialGroup()
                .addGroup(SkillsnActionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Normal_Slash)
                    .addComponent(Solar_Fist)
                    .addComponent(Defend))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(SkillsnActionsLayout.createSequentialGroup()
                .addComponent(Arcspear)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SkillsnActionsLayout.setVerticalGroup(
            SkillsnActionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SkillsnActionsLayout.createSequentialGroup()
                .addComponent(Normal_Slash)
                .addGap(0, 0, 0)
                .addComponent(Solar_Fist)
                .addGap(0, 0, 0)
                .addComponent(Arcspear)
                .addGap(0, 0, 0)
                .addComponent(Defend)
                .addGap(0, 0, 0))
        );

        Execute.setFont(new java.awt.Font("Pixelade", 0, 48)); // NOI18N
        Execute.setText("EXECUTE");
        Execute.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExecuteMouseClicked(evt);
            }
        });
        Execute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExecuteActionPerformed(evt);
            }
        });

        Hero_Dialog.setColumns(20);
        Hero_Dialog.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        Hero_Dialog.setRows(5);
        jScrollPane2.setViewportView(Hero_Dialog);

        javax.swing.GroupLayout Player_TabLayout = new javax.swing.GroupLayout(Player_Tab);
        Player_Tab.setLayout(Player_TabLayout);
        Player_TabLayout.setHorizontalGroup(
            Player_TabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Player_TabLayout.createSequentialGroup()
                .addGroup(Player_TabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Player_TabLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(SkillsnActions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(Execute, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Player_TabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(HeroStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Player_Potrait))
        );
        Player_TabLayout.setVerticalGroup(
            Player_TabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Player_TabLayout.createSequentialGroup()
                .addGroup(Player_TabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Player_TabLayout.createSequentialGroup()
                        .addComponent(SkillsnActions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Execute, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(Player_TabLayout.createSequentialGroup()
                        .addComponent(HeroStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Player_TabLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Player_Potrait)))
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Monster_Tab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Player_Tab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(352, 352, 352)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Monster_Tab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Player_Tab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Solar_FistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Solar_FistActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Solar_FistActionPerformed

    private void ExecuteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExecuteMouseClicked
        // TODO add your handling code here:
        if(!manager.getPlayer().isTurn())
            return;
        String txt = "Player ";
        int prev = 0;
        if(this.Normal_Slash.isSelected()){
        //kalau Aksi normal_slash dipilih
            prev = manager.Attack();
            txt += this.Normal_Slash.getText()+ " ";
            listModel.add(0, txt + prev);
            ChangeTurn();
        }
        if(this.Solar_Fist.isSelected()){
        //kalau Skill solar_fist dipilih
            prev = manager.SkillAttack(2, 60);
            txt += this.Solar_Fist.getText() + " ";
            listModel.add(0, txt + prev);
            ChangeTurn();
        }
        if(this.Arcspear.isSelected()){
        //kalau Skill arcspear dipilih
            prev = manager.SkillAttack(5, 30);
            txt += this.Arcspear.getText();
            listModel.add(0, txt + prev);
            ChangeTurn();
        }
        if(this.Defend.isSelected()){
        //kalau Aksi Defend dipilih
            txt += this.Defend.getText()+ " ";
            manager.Defend();
            listModel.add(0, txt + "+1 AP");
            ChangeTurn();
        }
        if(manager.getPlayer().isTurn())
            return;
        manager.ColiderNPC(prev);
        listModel.add(0, manager.AIEnemy());
        SetUpEnemy();
        SetUpPlayer();
        Next();
    }//GEN-LAST:event_ExecuteMouseClicked

    private void ExecuteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExecuteActionPerformed
        // TODO add your handling code here:
        Battle_Log.setModel(listModel);
    }//GEN-LAST:event_ExecuteActionPerformed

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
                if ("CDE/Motif".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel APText;
    private javax.swing.JLabel ApText;
    private javax.swing.JRadioButton Arcspear;
    private javax.swing.JList<String> Battle_Log;
    private javax.swing.JRadioButton Defend;
    private javax.swing.JButton Execute;
    private javax.swing.JLabel HPText2;
    private javax.swing.JPanel HeroStatus;
    private javax.swing.JTextArea Hero_Dialog;
    private javax.swing.JLabel HpText;
    private javax.swing.JPanel MonsterStatus;
    private javax.swing.JLabel Monster_APvalue;
    private javax.swing.JTextArea Monster_Dialog;
    private javax.swing.JLabel Monster_HPvalue;
    private javax.swing.JLabel Monster_Name;
    private javax.swing.JLabel Monster_Potrait;
    private javax.swing.JPanel Monster_Tab;
    private javax.swing.JRadioButton Normal_Slash;
    private javax.swing.JLabel Player_APvalue;
    private javax.swing.JLabel Player_HPvalue;
    private javax.swing.JLabel Player_Name;
    private javax.swing.JLabel Player_Potrait;
    private javax.swing.JPanel Player_Tab;
    private javax.swing.ButtonGroup SkillsActions;
    private javax.swing.JPanel SkillsnActions;
    private javax.swing.JRadioButton Solar_Fist;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}