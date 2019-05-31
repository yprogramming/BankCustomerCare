/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yprogramming.bank_customer_care;

import com.yprogramming.controller.userController;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author yProgramming
 */
public class frmMain extends javax.swing.JFrame {
    userController userCtrl = new userController();
    
    JMenu mnLogin = new JMenu("ເຂົ້າລະບົບ");
    JMenu mnRegister = new JMenu("ລົງທະບຽນ");
    boolean checkExistAdmin = false;
    /**
     * Creates new form frmMain
     */
    public frmMain() {
        initComponents();
        this.setExtendedState(this.getExtendedState() | JFrame.MAXIMIZED_BOTH);
        
        mnbMain.add(Box.createHorizontalGlue());
        pnLogin.setVisible(false);
        mnLogin.setFont(new Font("Phetsarath OT", Font.PLAIN, 18));
            mnLogin.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    pnLogin.setVisible(true);
                    pnLogin.setFocusable(true);
                }

                @Override
                public void mousePressed(MouseEvent e) {

                }

                @Override
                public void mouseReleased(MouseEvent e) {

                }

                @Override
                public void mouseEntered(MouseEvent e) {

                }

                @Override
                public void mouseExited(MouseEvent e) {

                }
            });
            mnbMain.add(mnLogin);
        
            frmMain _this = this;
            mnRegister.setFont(new Font("Phetsarath OT", Font.PLAIN, 18));
            mnRegister.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    dlgRegisterAdmin.setLocationRelativeTo(_this);
                    dlgRegisterAdmin.show();
                }

                @Override
                public void mousePressed(MouseEvent e) {

                }

                @Override
                public void mouseReleased(MouseEvent e) {

                }

                @Override
                public void mouseEntered(MouseEvent e) {

                }

                @Override
                public void mouseExited(MouseEvent e) {

                }
            });
            mnbMain.add(mnRegister);
        
        mnLogin.setVisible(false);
        mnRegister.setVisible(false);
        
        checkExistAdmin = userCtrl.getCheckAdmin();
        if(checkExistAdmin){
            mnLogin.setVisible(true);
        } else {
//            dlgRegisterAdmin.setPreferredSize(new Dimension(516, 295));
//            dlgRegisterAdmin.validate();
            mnFollow.setVisible(false);
            mnRegister.setVisible(true);
        }
        
        mnManage.setVisible(false);
        mnService.setVisible(false);
        mnTransaction.setVisible(false);
        mnReport.setVisible(false);
        mnUser.setVisible(false);
        
        int desktopPaneWidth = dktMain.getWidth();
        int desktopPaneHeight = dktMain.getHeight();
        int pnRegisterWidth = pnRegisterAdmin.getWidth();
        int pnRegisterHeight = pnRegisterAdmin.getHeight();
        pnRegisterAdmin.setLocation(new Point((desktopPaneWidth + pnRegisterWidth)/2, (desktopPaneHeight + pnRegisterHeight)/2));
        System.out.println(desktopPaneWidth);
        //pnRegisterAdmin
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dlgRegisterAdmin = new javax.swing.JDialog();
        pnRegisterAdmin = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtUserName1 = new javax.swing.JTextField();
        txtPassword1 = new javax.swing.JPasswordField();
        btnLogin1 = new javax.swing.JButton();
        btnCancle1 = new javax.swing.JButton();
        txtPassword2 = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        dktMain = new javax.swing.JDesktopPane();
        pnLogin = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        btnCancle = new javax.swing.JButton();
        mnbMain = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnManage = new javax.swing.JMenu();
        mnAddress = new javax.swing.JMenu();
        mniProvince = new javax.swing.JMenuItem();
        mniDistrict = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        mnService = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        mnFollow = new javax.swing.JMenu();
        mnTransaction = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        mnReport = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenuItem22 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();
        jMenu12 = new javax.swing.JMenu();
        jMenu13 = new javax.swing.JMenu();
        mnUser = new javax.swing.JMenu();
        mniPersonalInfo = new javax.swing.JMenuItem();
        mniLogout = new javax.swing.JMenuItem();

        dlgRegisterAdmin.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        dlgRegisterAdmin.setMaximumSize(new java.awt.Dimension(1024, 720));
        dlgRegisterAdmin.setModal(true);
        dlgRegisterAdmin.setPreferredSize(new java.awt.Dimension(530, 450));
        dlgRegisterAdmin.setResizable(false);
        dlgRegisterAdmin.setSize(new java.awt.Dimension(530, 450));
        dlgRegisterAdmin.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnRegisterAdmin.setPreferredSize(new java.awt.Dimension(516, 295));
        pnRegisterAdmin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Phetsarath OT", 1, 18)); // NOI18N
        jLabel4.setText("ລະຫັດຜ່ານ");
        pnRegisterAdmin.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        jLabel5.setFont(new java.awt.Font("Phetsarath OT", 1, 30)); // NOI18N
        jLabel5.setText("ລົງທະບຽນ");
        pnRegisterAdmin.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 13, -1, -1));

        jLabel6.setFont(new java.awt.Font("Phetsarath OT", 1, 18)); // NOI18N
        jLabel6.setText("ຊື່ເຂົ້າໃຊ້ລະບົບ");
        pnRegisterAdmin.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        txtUserName1.setFont(new java.awt.Font("Phetsarath OT", 1, 18)); // NOI18N
        pnRegisterAdmin.add(txtUserName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 450, -1));

        txtPassword1.setFont(new java.awt.Font("Phetsarath OT", 1, 18)); // NOI18N
        pnRegisterAdmin.add(txtPassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 450, -1));

        btnLogin1.setFont(new java.awt.Font("Phetsarath OT", 1, 18)); // NOI18N
        btnLogin1.setText("ລົງທະບຽນ");
        btnLogin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogin1ActionPerformed(evt);
            }
        });
        pnRegisterAdmin.add(btnLogin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, 210, -1));

        btnCancle1.setFont(new java.awt.Font("Phetsarath OT", 1, 18)); // NOI18N
        btnCancle1.setText("ຍົກເລິກ");
        btnCancle1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancle1ActionPerformed(evt);
            }
        });
        pnRegisterAdmin.add(btnCancle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 200, -1));

        txtPassword2.setFont(new java.awt.Font("Phetsarath OT", 1, 18)); // NOI18N
        pnRegisterAdmin.add(txtPassword2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 450, -1));

        jLabel7.setFont(new java.awt.Font("Phetsarath OT", 1, 18)); // NOI18N
        jLabel7.setText("ຢືນຢັນລະຫັດຜ່ານ");
        pnRegisterAdmin.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        jLabel8.setFont(new java.awt.Font("Phetsarath OT", 1, 18)); // NOI18N
        jLabel8.setText("ຊື່ ແລະ ນາມສະກຸນ");
        pnRegisterAdmin.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        txtName.setFont(new java.awt.Font("Phetsarath OT", 1, 18)); // NOI18N
        pnRegisterAdmin.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 450, -1));

        dlgRegisterAdmin.getContentPane().add(pnRegisterAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 2, 530, 410));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnLogin.setPreferredSize(new java.awt.Dimension(516, 295));

        jLabel1.setFont(new java.awt.Font("Phetsarath OT", 1, 18)); // NOI18N
        jLabel1.setText("ລະຫັດຜ່ານ");

        jLabel2.setFont(new java.awt.Font("Phetsarath OT", 1, 30)); // NOI18N
        jLabel2.setText("ເຂົ້າສູ່ລະບົບ");

        jLabel3.setFont(new java.awt.Font("Phetsarath OT", 1, 18)); // NOI18N
        jLabel3.setText("ຊື່ເຂົ້າໃຊ້ລະບົບ");

        txtUserName.setFont(new java.awt.Font("Phetsarath OT", 1, 18)); // NOI18N

        txtPassword.setFont(new java.awt.Font("Phetsarath OT", 1, 18)); // NOI18N

        btnLogin.setFont(new java.awt.Font("Phetsarath OT", 1, 18)); // NOI18N
        btnLogin.setText("ເຂົ້າສູ່ລະບົບ");

        btnCancle.setFont(new java.awt.Font("Phetsarath OT", 1, 18)); // NOI18N
        btnCancle.setText("ຍົກເລິກ");
        btnCancle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnLoginLayout = new javax.swing.GroupLayout(pnLogin);
        pnLogin.setLayout(pnLoginLayout);
        pnLoginLayout.setHorizontalGroup(
            pnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 516, Short.MAX_VALUE)
            .addGroup(pnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnLoginLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(pnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnLoginLayout.createSequentialGroup()
                            .addGap(150, 150, 150)
                            .addComponent(jLabel2))
                        .addComponent(jLabel3)
                        .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(pnLoginLayout.createSequentialGroup()
                            .addComponent(btnCancle, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(40, 40, 40)
                            .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        pnLoginLayout.setVerticalGroup(
            pnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 295, Short.MAX_VALUE)
            .addGroup(pnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnLoginLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addGap(15, 15, 15)
                    .addComponent(jLabel3)
                    .addGap(3, 3, 3)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(7, 7, 7)
                    .addComponent(jLabel1)
                    .addGap(3, 3, 3)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(17, 17, 17)
                    .addGroup(pnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnCancle)
                        .addComponent(btnLogin))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        dktMain.setLayer(pnLogin, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout dktMainLayout = new javax.swing.GroupLayout(dktMain);
        dktMain.setLayout(dktMainLayout);
        dktMainLayout.setHorizontalGroup(
            dktMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dktMainLayout.createSequentialGroup()
                .addContainerGap(568, Short.MAX_VALUE)
                .addComponent(pnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        dktMainLayout.setVerticalGroup(
            dktMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dktMainLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(pnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(138, Short.MAX_VALUE))
        );

        mnbMain.setFont(new java.awt.Font("Phetsarath OT", 0, 18)); // NOI18N

        jMenu1.setText("CS Bank");
        jMenu1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jMenu1.setMargin(new java.awt.Insets(0, 5, 0, 20));
        mnbMain.add(jMenu1);

        mnManage.setText("ຈັດການຂໍ້ມູນ");
        mnManage.setFont(new java.awt.Font("Phetsarath OT", 0, 18)); // NOI18N
        mnManage.setMargin(new java.awt.Insets(0, 5, 0, 5));

        mnAddress.setText("ທີຢູ່");
        mnAddress.setFont(new java.awt.Font("Phetsarath OT", 0, 18)); // NOI18N

        mniProvince.setFont(new java.awt.Font("Phetsarath OT", 0, 16)); // NOI18N
        mniProvince.setText("ແຂວງ");
        mnAddress.add(mniProvince);

        mniDistrict.setFont(new java.awt.Font("Phetsarath OT", 0, 16)); // NOI18N
        mniDistrict.setText("ເມືອງ");
        mnAddress.add(mniDistrict);

        mnManage.add(mnAddress);

        jMenuItem3.setFont(new java.awt.Font("Phetsarath OT", 0, 18)); // NOI18N
        jMenuItem3.setText("ພະນັກງານ");
        mnManage.add(jMenuItem3);

        jMenuItem4.setFont(new java.awt.Font("Phetsarath OT", 0, 18)); // NOI18N
        jMenuItem4.setText("ລູກຄ້າ");
        mnManage.add(jMenuItem4);

        jMenuItem6.setFont(new java.awt.Font("Phetsarath OT", 0, 18)); // NOI18N
        jMenuItem6.setText("ປະເພດບັນຊີ");
        mnManage.add(jMenuItem6);

        jMenuItem5.setFont(new java.awt.Font("Phetsarath OT", 0, 18)); // NOI18N
        jMenuItem5.setText("ປະເພດບັດ");
        mnManage.add(jMenuItem5);

        jMenuItem7.setFont(new java.awt.Font("Phetsarath OT", 0, 18)); // NOI18N
        jMenuItem7.setText("ສະກຸນເງິນ");
        mnManage.add(jMenuItem7);

        jMenuItem8.setFont(new java.awt.Font("Phetsarath OT", 0, 18)); // NOI18N
        jMenuItem8.setText("ອັດຕາດອກເບ້ຍ");
        mnManage.add(jMenuItem8);

        jMenuItem9.setFont(new java.awt.Font("Phetsarath OT", 0, 18)); // NOI18N
        jMenuItem9.setText("ອັດຕາແລກປ່ຽນ");
        mnManage.add(jMenuItem9);

        mnbMain.add(mnManage);

        mnService.setText("ບໍລິການ");
        mnService.setFont(new java.awt.Font("Phetsarath OT", 0, 18)); // NOI18N
        mnService.setMargin(new java.awt.Insets(0, 5, 0, 5));

        jMenuItem10.setFont(new java.awt.Font("Phetsarath OT", 0, 18)); // NOI18N
        jMenuItem10.setText("ເປີດບັນຊີ");
        mnService.add(jMenuItem10);

        jMenuItem11.setFont(new java.awt.Font("Phetsarath OT", 0, 18)); // NOI18N
        jMenuItem11.setText("ຝາກເງິນ");
        mnService.add(jMenuItem11);

        jMenuItem12.setFont(new java.awt.Font("Phetsarath OT", 0, 18)); // NOI18N
        jMenuItem12.setText("ຖອນເງິນ");
        mnService.add(jMenuItem12);

        jMenuItem13.setFont(new java.awt.Font("Phetsarath OT", 0, 18)); // NOI18N
        jMenuItem13.setText("ໂອນເງິນ");
        mnService.add(jMenuItem13);

        jMenuItem14.setFont(new java.awt.Font("Phetsarath OT", 0, 18)); // NOI18N
        jMenuItem14.setText("ແລກປ່ຽນເງິນ");
        mnService.add(jMenuItem14);

        mnbMain.add(mnService);

        mnFollow.setText("ຕິດຕາມ");
        mnFollow.setFont(new java.awt.Font("Phetsarath OT", 0, 18)); // NOI18N
        mnFollow.setMargin(new java.awt.Insets(0, 5, 0, 5));

        mnTransaction.setFont(new java.awt.Font("Phetsarath OT", 0, 18)); // NOI18N
        mnTransaction.setText("ທຸລະກຳ");
        mnFollow.add(mnTransaction);

        jMenuItem16.setFont(new java.awt.Font("Phetsarath OT", 0, 18)); // NOI18N
        jMenuItem16.setText("ອັດຕາແລກປ່ຽນ");
        mnFollow.add(jMenuItem16);

        mnbMain.add(mnFollow);

        mnReport.setText("ລາຍງານ");
        mnReport.setFont(new java.awt.Font("Phetsarath OT", 0, 18)); // NOI18N
        mnReport.setMargin(new java.awt.Insets(0, 5, 0, 5));

        jMenu8.setText("ຂໍ້ມູນພື້ນຖານ");
        jMenu8.setFont(new java.awt.Font("Phetsarath OT", 0, 18)); // NOI18N
        mnReport.add(jMenu8);

        jMenu9.setText("ບໍລິການ");
        jMenu9.setFont(new java.awt.Font("Phetsarath OT", 0, 18)); // NOI18N

        jMenuItem18.setFont(new java.awt.Font("Phetsarath OT", 0, 18)); // NOI18N
        jMenuItem18.setText("ເປີດບັນຊີ");
        jMenu9.add(jMenuItem18);

        jMenuItem19.setFont(new java.awt.Font("Phetsarath OT", 0, 18)); // NOI18N
        jMenuItem19.setText("ຝາກເງິນ");
        jMenu9.add(jMenuItem19);

        jMenuItem20.setFont(new java.awt.Font("Phetsarath OT", 0, 18)); // NOI18N
        jMenuItem20.setText("ຖອນເງິນ");
        jMenu9.add(jMenuItem20);

        jMenuItem21.setFont(new java.awt.Font("Phetsarath OT", 0, 18)); // NOI18N
        jMenuItem21.setText("ໂອນເງິນ");
        jMenu9.add(jMenuItem21);

        jMenuItem22.setFont(new java.awt.Font("Phetsarath OT", 0, 18)); // NOI18N
        jMenuItem22.setText("ແລກປ່ຽນເງິນ");
        jMenu9.add(jMenuItem22);

        mnReport.add(jMenu9);

        jMenuItem17.setFont(new java.awt.Font("Phetsarath OT", 0, 18)); // NOI18N
        jMenuItem17.setText("ທຸລະກຳ");
        mnReport.add(jMenuItem17);

        jMenu10.setText("ສະຫຼູບຍອດ");
        jMenu10.setFont(new java.awt.Font("Phetsarath OT", 0, 18)); // NOI18N

        jMenu11.setText("ຝາກເງິນ");
        jMenu11.setFont(new java.awt.Font("Phetsarath OT", 0, 18)); // NOI18N
        jMenu10.add(jMenu11);

        jMenu12.setText("ຖອນເງິນ");
        jMenu12.setFont(new java.awt.Font("Phetsarath OT", 0, 18)); // NOI18N
        jMenu10.add(jMenu12);

        jMenu13.setText("ໂອນເງິນ");
        jMenu13.setFont(new java.awt.Font("Phetsarath OT", 0, 18)); // NOI18N
        jMenu10.add(jMenu13);

        mnReport.add(jMenu10);

        mnbMain.add(mnReport);

        mnUser.setText("Yourthor Yiaveu");
        mnUser.setFont(new java.awt.Font("Phetsarath OT", 1, 18)); // NOI18N
        mnUser.setMargin(new java.awt.Insets(0, 5, 0, 5));

        mniPersonalInfo.setFont(new java.awt.Font("Phetsarath OT", 0, 18)); // NOI18N
        mniPersonalInfo.setText("ຂໍ້ມູນສ່ວນຕົວ");
        mnUser.add(mniPersonalInfo);

        mniLogout.setFont(new java.awt.Font("Phetsarath OT", 0, 18)); // NOI18N
        mniLogout.setText("ອອກລະບົບ");
        mnUser.add(mniLogout);

        mnbMain.add(mnUser);

        setJMenuBar(mnbMain);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dktMain)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dktMain)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancleActionPerformed
        txtUserName.setText("");
        txtPassword.setText("");
        pnLogin.setVisible(false);
    }//GEN-LAST:event_btnCancleActionPerformed

    private void btnCancle1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancle1ActionPerformed
        //dlgRegisterAdmin.setVisible(false);
        dlgRegisterAdmin.dispose();
        //dlgRegisterAdmin.hide();
    }//GEN-LAST:event_btnCancle1ActionPerformed

    private void btnLogin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogin1ActionPerformed
        
        if(txtUserName1.getText().trim().isEmpty() 
                || 
          txtPassword1.getText().trim().isEmpty()
                || 
          txtName.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "ຊື່-ນາມສະກຸນ, ຊື່ເຂົ້າໃຊ້ລະບົບ ຫຼື ລະຫັດຜ່ານຫ້າມວ່າງ");
            return;
        }
        if(!txtPassword1.getText().equals(txtPassword2.getText())){
            JOptionPane.showMessageDialog(this, "Password is not matched");
            return;
        }
        
        boolean result = userCtrl.registerAdmin(txtName.getText().trim(),txtUserName1.getText(), txtPassword1.getText());
        if(result){
            JOptionPane.showMessageDialog(this, "Register admin succesfully");
            mnRegister.setVisible(false);
            dlgRegisterAdmin.dispose();
            mnLogin.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Register admin failed");
        }
    }//GEN-LAST:event_btnLogin1ActionPerformed
//test test123
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
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
// helllo everyone
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancle;
    private javax.swing.JButton btnCancle1;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnLogin1;
    private javax.swing.JDesktopPane dktMain;
    private javax.swing.JDialog dlgRegisterAdmin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenu mnAddress;
    private javax.swing.JMenu mnFollow;
    private javax.swing.JMenu mnManage;
    private javax.swing.JMenu mnReport;
    private javax.swing.JMenu mnService;
    private javax.swing.JMenuItem mnTransaction;
    private javax.swing.JMenu mnUser;
    private javax.swing.JMenuBar mnbMain;
    private javax.swing.JMenuItem mniDistrict;
    private javax.swing.JMenuItem mniLogout;
    private javax.swing.JMenuItem mniPersonalInfo;
    private javax.swing.JMenuItem mniProvince;
    private javax.swing.JPanel pnLogin;
    private javax.swing.JPanel pnRegisterAdmin;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JPasswordField txtPassword1;
    private javax.swing.JPasswordField txtPassword2;
    private javax.swing.JTextField txtUserName;
    private javax.swing.JTextField txtUserName1;
    // End of variables declaration//GEN-END:variables
}
