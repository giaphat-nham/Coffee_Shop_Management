/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import BUS.Account_BUS;
import BUS.Staff_BUS;
import DTO.Account_DTO;
import DTO.Staff_DTO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Josie
 */
public class Account_GUI extends javax.swing.JPanel {

    Account_BUS accountBUS = new Account_BUS();
    ArrayList<Account_DTO> listAccount = new ArrayList();
    ArrayList<Account_DTO> listSearch = new ArrayList();
    String selectedAcc = "";

    public Account_GUI() {
        initComponents();
        listAccount = accountBUS.loadDataAccount();
        loadList(listAccount);
        loadCombobox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        scrAccountList = new javax.swing.JScrollPane();
        tblAccountList = new javax.swing.JTable();
        pnlAccountDetails = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        lblIsAdmin = new javax.swing.JLabel();
        lblStaffID = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        pnlAccountConfiguration = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        cbAdmin = new javax.swing.JCheckBox();
        jLabel11 = new javax.swing.JLabel();
        cbbStaffID = new javax.swing.JComboBox<>();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnUpdateStaffID = new javax.swing.JButton();
        cbbFilter = new javax.swing.JComboBox<>();
        btnRefresh = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(94, 84, 142));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(951, 676));

        scrAccountList.setBackground(new java.awt.Color(255, 255, 255));
        scrAccountList.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));
        scrAccountList.setForeground(new java.awt.Color(255, 255, 255));

        tblAccountList.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        tblAccountList.setForeground(new java.awt.Color(94, 84, 142));
        tblAccountList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "T??n t??i kho???n", "M???t kh???u"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAccountList.setGridColor(new java.awt.Color(204, 153, 255));
        tblAccountList.setSelectionBackground(new java.awt.Color(204, 153, 255));
        tblAccountList.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tblAccountList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAccountListMouseClicked(evt);
            }
        });
        scrAccountList.setViewportView(tblAccountList);

        pnlAccountDetails.setBackground(new java.awt.Color(255, 255, 255));
        pnlAccountDetails.setForeground(new java.awt.Color(153, 102, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(94, 84, 142));
        jLabel1.setText("Chi ti???t t??i kho???n:");

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(94, 84, 142));
        jLabel12.setText("T??n t??i kho???n:");

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(94, 84, 142));
        jLabel21.setText("M???t kh???u:");

        lblName.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblName.setForeground(new java.awt.Color(94, 84, 142));

        lblPassword.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(94, 84, 142));

        jLabel30.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(94, 84, 142));
        jLabel30.setText("Admin:");

        lblIsAdmin.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblIsAdmin.setForeground(new java.awt.Color(94, 84, 142));

        lblStaffID.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblStaffID.setForeground(new java.awt.Color(94, 84, 142));

        jLabel31.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(94, 84, 142));
        jLabel31.setText("M?? nh??n vi??n:");

        javax.swing.GroupLayout pnlAccountDetailsLayout = new javax.swing.GroupLayout(pnlAccountDetails);
        pnlAccountDetails.setLayout(pnlAccountDetailsLayout);
        pnlAccountDetailsLayout.setHorizontalGroup(
            pnlAccountDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAccountDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAccountDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
                    .addGroup(pnlAccountDetailsLayout.createSequentialGroup()
                        .addGroup(pnlAccountDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(jLabel12)
                            .addComponent(jLabel30)
                            .addComponent(jLabel31))
                        .addGap(45, 45, 45)
                        .addGroup(pnlAccountDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblIsAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblStaffID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        pnlAccountDetailsLayout.setVerticalGroup(
            pnlAccountDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAccountDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAccountDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAccountDetailsLayout.createSequentialGroup()
                        .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblIsAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblStaffID, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlAccountDetailsLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel30)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel31)))
                .addContainerGap())
        );

        txtSearch.setForeground(new java.awt.Color(153, 102, 255));
        txtSearch.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 102, 255)), javax.swing.BorderFactory.createEmptyBorder(1, 4, 1, 4)));
        txtSearch.setPreferredSize(new java.awt.Dimension(64, 22));
        txtSearch.setSelectionColor(new java.awt.Color(204, 153, 255));

        btnSearch.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(94, 84, 142));
        btnSearch.setText("T??m ki???m");
        btnSearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 102, 255)));
        btnSearch.setPreferredSize(new java.awt.Dimension(54, 22));
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        pnlAccountConfiguration.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(94, 84, 142));
        jLabel7.setText("Ch???nh s???a danh s??ch t??i kho???n:");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(94, 84, 142));
        jLabel9.setText("T??n t??i kho???n:");

        txtName.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtName.setForeground(new java.awt.Color(94, 84, 142));
        txtName.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(94, 84, 142)), javax.swing.BorderFactory.createEmptyBorder(1, 4, 1, 4)));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(94, 84, 142));
        jLabel10.setText("M???t kh???u:");

        txtPassword.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(94, 84, 142));
        txtPassword.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(94, 84, 142)), javax.swing.BorderFactory.createEmptyBorder(1, 4, 1, 4)));

        cbAdmin.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cbAdmin.setForeground(new java.awt.Color(94, 84, 142));
        cbAdmin.setText("Admin");
        cbAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAdminActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(94, 84, 142));
        jLabel11.setText("M?? nh??n vi??n:");

        javax.swing.GroupLayout pnlAccountConfigurationLayout = new javax.swing.GroupLayout(pnlAccountConfiguration);
        pnlAccountConfiguration.setLayout(pnlAccountConfigurationLayout);
        pnlAccountConfigurationLayout.setHorizontalGroup(
            pnlAccountConfigurationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAccountConfigurationLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAccountConfigurationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlAccountConfigurationLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 158, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlAccountConfigurationLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(pnlAccountConfigurationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlAccountConfigurationLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(53, 53, 53)
                                .addComponent(txtName))
                            .addGroup(pnlAccountConfigurationLayout.createSequentialGroup()
                                .addGroup(pnlAccountConfigurationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11))
                                .addGap(52, 52, 52)
                                .addGroup(pnlAccountConfigurationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlAccountConfigurationLayout.createSequentialGroup()
                                        .addComponent(cbAdmin)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(txtPassword)
                                    .addComponent(cbbStaffID, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap())
        );
        pnlAccountConfigurationLayout.setVerticalGroup(
            pnlAccountConfigurationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAccountConfigurationLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(pnlAccountConfigurationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlAccountConfigurationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlAccountConfigurationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(cbbStaffID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(cbAdmin)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        btnAdd.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(94, 84, 142));
        btnAdd.setText("Th??m t??i kho???n");
        btnAdd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 102, 255)));
        btnAdd.setMaximumSize(new java.awt.Dimension(91, 32));
        btnAdd.setPreferredSize(new java.awt.Dimension(91, 32));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(94, 84, 142));
        btnDelete.setText("X??a t??i kho???n");
        btnDelete.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 102, 255)));
        btnDelete.setMaximumSize(new java.awt.Dimension(81, 32));
        btnDelete.setPreferredSize(new java.awt.Dimension(81, 32));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(94, 84, 142));
        btnUpdate.setText("C???p nh???t");
        btnUpdate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 102, 255)));
        btnUpdate.setMaximumSize(new java.awt.Dimension(109, 32));
        btnUpdate.setMinimumSize(new java.awt.Dimension(109, 32));
        btnUpdate.setPreferredSize(new java.awt.Dimension(109, 32));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnUpdateStaffID.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnUpdateStaffID.setForeground(new java.awt.Color(94, 84, 142));
        btnUpdateStaffID.setText("C???p nh???t m?? nh??n vi??n");
        btnUpdateStaffID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 102, 255)));
        btnUpdateStaffID.setMaximumSize(new java.awt.Dimension(91, 32));
        btnUpdateStaffID.setPreferredSize(new java.awt.Dimension(91, 32));
        btnUpdateStaffID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateStaffIDActionPerformed(evt);
            }
        });

        cbbFilter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "T??n t??i kho???n", "M???t kh???u", "M?? nh??n vi??n" }));

        btnRefresh.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnRefresh.setForeground(new java.awt.Color(94, 84, 142));
        btnRefresh.setText("L??m m???i danh s??ch");
        btnRefresh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 102, 255)));
        btnRefresh.setMaximumSize(new java.awt.Dimension(91, 32));
        btnRefresh.setPreferredSize(new java.awt.Dimension(91, 32));
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlAccountConfiguration, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrAccountList, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(cbbFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlAccountDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                            .addComponent(btnUpdateStaffID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnRefresh, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pnlAccountDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnUpdateStaffID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(484, 484, 484))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbbFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(scrAccountList, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnlAccountConfiguration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if (inputEmptyAdd()) {
            JOptionPane.showMessageDialog(this, "Kh??ng ???????c ????? tr???ng th??ng tin!");
        } else if (accountBUS.usernameIsValid(txtName.getText())) {
            JOptionPane.showMessageDialog(this, "T??n t??i kho???n ???? t???n t???i!");
        } else if (accountBUS.hadAccount(Integer.parseInt(cbbStaffID.getSelectedItem() + ""))) {
            JOptionPane.showMessageDialog(this, "Nh??n vi??n n??y ???? c?? t??i kho???n!");
        } else {
            Account_DTO acc = new Account_DTO(txtName.getText(), txtPassword.getText(), Integer.parseInt(cbbStaffID.getSelectedItem() + ""), cbAdmin.isSelected());
            if (accountBUS.insert(acc)) {
                JOptionPane.showMessageDialog(this, "Th??m t??i kho???n th??nh c??ng!");
                listAccount = accountBUS.loadDataAccount();
                loadList(listAccount);
                reset();
            }
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if (selectedAcc.equals("")) {
            JOptionPane.showMessageDialog(this, "Vui l??ng ch???n t??i kho???n c???n x??a!");
        } else {
            int option = JOptionPane.showConfirmDialog(this, "B???n mu???n x??a t??i kho???n " + selectedAcc + "?", "X??a t??i kho???n", JOptionPane.OK_CANCEL_OPTION);
            if (option == JOptionPane.OK_OPTION) {
                if (accountBUS.delete(selectedAcc)) {
                    JOptionPane.showMessageDialog(this, "X??a t??i kho???n th??nh c??ng!");
                    listAccount = accountBUS.loadDataAccount();
                    loadList(listAccount);
                    reset();
                }
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        listSearch.clear();
        String filter = cbbFilter.getSelectedItem() + "";
        String key;
        if (filter.equals("M?? nh??n vi??n")) {
            try {
                key = Integer.parseInt(txtSearch.getText())+"";
                listSearch = accountBUS.search(key, filter);
            } catch (NumberFormatException e) {

            }
        }
        else {
            listSearch = accountBUS.search(txtSearch.getText(),filter);
        }

        if (listSearch.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Kh??ng t??m th???y k???t qu??? ph?? h???p!");
        } else {
            loadList(listSearch);
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void cbAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbAdminActionPerformed

    private void tblAccountListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAccountListMouseClicked
        int i = tblAccountList.getSelectedRow();
        Account_DTO account = listAccount.get(i);

        if (i >= 0) {
            lblName.setText(account.getUsername());
            lblPassword.setText(account.getPassword());
            lblStaffID.setText(account.getStaffID() + "");
            if (account.isIsAdmin()) {
                lblIsAdmin.setText("Yes");
            } else {
                lblIsAdmin.setText("No");
            }
            selectedAcc = account.getUsername();
        }
    }//GEN-LAST:event_tblAccountListMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if (selectedAcc.equals("")) {
            JOptionPane.showMessageDialog(this, "Vui l??ng ch???n t??i kho???n c???n c???p nh???t!");
        } else if (inputEmptyUpdate()) {
            JOptionPane.showMessageDialog(this, "Kh??ng c?? th??ng tin c???n c???p nh???t!");
        } else if (accountBUS.usernameExistedIgnores(txtName.getText(), lblName.getText())) {
            JOptionPane.showMessageDialog(this, "T??n t??i kho???n n??y ???? t???n t???i");
        } else {
            String username = lblName.getText();
            String password = lblPassword.getText();
            int staffID = Integer.parseInt(lblStaffID.getText());

            if (!txtName.getText().isBlank()) {
                username = txtName.getText();
            }
            if (!txtPassword.getText().isBlank()) {
                password = txtPassword.getText();
            }

            Account_DTO acc = new Account_DTO(username, password, staffID, cbAdmin.isSelected());
            if (accountBUS.update(acc)) {
                JOptionPane.showMessageDialog(this, "C???p nh???t th??ng tin th??nh c??ng!");
                listAccount = accountBUS.loadDataAccount();
                loadList(listAccount);
                reset();
            }
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnUpdateStaffIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateStaffIDActionPerformed
        if (selectedAcc.equals("")) {
            JOptionPane.showMessageDialog(this, "Vui l??ng ch???n t??i kho???n c???n c???p nh???t!");
        } else if (accountBUS.hadAccount(Integer.parseInt(cbbStaffID.getSelectedItem() + ""))) {
            JOptionPane.showMessageDialog(this, "M?? nh??n vi??n n??y thu???c v??? m???t t??i kho???n kh??c!");
        } else {
            boolean isAdmin;
            isAdmin = lblIsAdmin.getText().equals("Yes");
            Account_DTO acc = new Account_DTO(lblName.getText(), lblPassword.getText(), Integer.parseInt(cbbStaffID.getSelectedItem() + ""), isAdmin);
            if (accountBUS.update(acc)) {
                JOptionPane.showMessageDialog(this, "C???p nh???t th??ng tin th??nh c??ng!");
                listAccount = accountBUS.loadDataAccount();
                loadList(listAccount);
                reset();
            }
        }
    }//GEN-LAST:event_btnUpdateStaffIDActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        loadList(listAccount);
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void loadList(ArrayList<Account_DTO> list) {
        DefaultTableModel model = (DefaultTableModel) tblAccountList.getModel();
        model.setRowCount(0);

        for (Account_DTO acc : list) {
            model.addRow(new Object[]{acc.getUsername(), acc.getPassword()});
        }
    }

    private void loadCombobox() {
        Staff_BUS staffBUS = new Staff_BUS();
        ArrayList<Staff_DTO> listStaff = new ArrayList();
        listStaff = staffBUS.list();

        cbbStaffID.removeAllItems();
        for (Staff_DTO staff : listStaff) {
            cbbStaffID.addItem(staff.getId() + "");
        }
    }

    private void reset() {
        lblName.setText("");
        lblPassword.setText("");
        lblStaffID.setText("");
        lblIsAdmin.setText("");

        txtName.setText("");
        txtPassword.setText("");
        cbbStaffID.setSelectedIndex(0);
        cbAdmin.setSelected(false);

        selectedAcc = "";
    }

    private boolean inputEmptyAdd() {
        return txtName.getText().isBlank()
                || txtPassword.getText().isBlank();
    }

    private boolean inputEmptyUpdate() {
        String isAdmin;
        if (cbAdmin.isSelected()) {
            isAdmin = "Yes";
        } else {
            isAdmin = "No";
        }
        return txtName.getText().isBlank()
                && txtPassword.getText().isBlank()
                && isAdmin.equals(lblIsAdmin.getText());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnUpdateStaffID;
    private javax.swing.JCheckBox cbAdmin;
    private javax.swing.JComboBox<String> cbbFilter;
    private javax.swing.JComboBox<String> cbbStaffID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblIsAdmin;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblStaffID;
    private javax.swing.JPanel pnlAccountConfiguration;
    private javax.swing.JPanel pnlAccountDetails;
    private javax.swing.JScrollPane scrAccountList;
    private javax.swing.JTable tblAccountList;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
