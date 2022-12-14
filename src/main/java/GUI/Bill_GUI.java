/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import BUS.Bill_BUS;
import DTO.BillDetails_DTO;
import DTO.Bill_DTO;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LENOVO
 */
public class Bill_GUI extends javax.swing.JPanel {

    private Bill_BUS billBUS = new Bill_BUS();
    private ArrayList<Bill_DTO> listBill = new ArrayList();
    private ArrayList<Bill_DTO> listSearch = new ArrayList();
    private ArrayList<BillDetails_DTO> listDetails = new ArrayList();
    private Bill_DTO selectedBill;

    public Bill_GUI() {
        listBill = billBUS.list();
        initComponents();
        loadBillList(listBill);
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
        cbbFilter = new javax.swing.JComboBox<>();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        scrBillList = new javax.swing.JScrollPane();
        tblBillList = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        scrProductListBill = new javax.swing.JScrollPane();
        tblBillDetails = new javax.swing.JTable();
        btnDeleteBill = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblBillID = new javax.swing.JLabel();
        lblStaffID = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        btnResetSearch = new javax.swing.JButton();

        setForeground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(951, 676));

        cbbFilter.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        cbbFilter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M?? h??a ????n", "M?? nh??n vi??n" }));
        cbbFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbFilterActionPerformed(evt);
            }
        });

        txtSearch.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        btnSearch.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnSearch.setText("T??m ki???m");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        tblBillList.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tblBillList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "M?? h??a ????n", "T???ng th??nh ti???n"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblBillList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBillListMouseClicked(evt);
            }
        });
        scrBillList.setViewportView(tblBillList);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CHI TI???T H??A ????N ");

        tblBillDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "M?? s???n ph???m", "????n gi??", "S??? l?????ng", "Th??nh ti???n"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrProductListBill.setViewportView(tblBillDetails);

        btnDeleteBill.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnDeleteBill.setText("X??A H??A ????N");
        btnDeleteBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteBillActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("M?? h??a ????n:");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("M?? nh??n vi??n:");

        lblBillID.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        lblStaffID.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("Ng??y:");

        lblDate.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setText("Th??nh ti???n:");

        lblTotal.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(scrProductListBill, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(98, 98, 98))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel6))
                                        .addGap(37, 37, 37)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblBillID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblStaffID, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                    .addComponent(lblDate, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnDeleteBill)
                .addGap(102, 102, 102))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(58, 58, 58)
                .addComponent(lblTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBillID, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStaffID, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(scrProductListBill, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDeleteBill, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btnResetSearch.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnResetSearch.setText("L??m m???i");
        btnResetSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(scrBillList)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cbbFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnResetSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbbFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSearch)
                            .addComponent(txtSearch)
                            .addComponent(btnResetSearch))
                        .addGap(18, 18, 18)
                        .addComponent(scrBillList, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void loadBillList(ArrayList<Bill_DTO> list) {
        DefaultTableModel model = (DefaultTableModel) tblBillList.getModel();
        model.setRowCount(0);

        for (Bill_DTO bill : list) {
            model.addRow(new Object[]{bill.getId(), bill.getTotal()});
        }
    }

    private void cbbFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbFilterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbFilterActionPerformed

    private void reset() {
        lblBillID.setText("");
        lblStaffID.setText("");
        lblDate.setText("");
        lblTotal.setText("");
        listDetails.clear();
        loadBillDetails(listDetails);
    }
    
    private void btnDeleteBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteBillActionPerformed
        if (selectedBill == null) {
            JOptionPane.showMessageDialog(this, "Vui l??ng ch???n h??a ????n c???n x??a!");
        }
        else {
            int option = JOptionPane.showConfirmDialog(this, "B???n mu???n x??a h??a ????n n??y?", "X??a h??a ????n", JOptionPane.OK_CANCEL_OPTION);
            
            if (option == JOptionPane.OK_OPTION) {
                if (billBUS.deleteBill(selectedBill.getId())) {
                    JOptionPane.showMessageDialog(this, "X??a h??a ????n th??nh c??ng!");
                    listBill = billBUS.list();
                    loadBillList(listBill);
                    reset();
                }
            }
        }
    }//GEN-LAST:event_btnDeleteBillActionPerformed

    private void loadBillDetails(ArrayList<BillDetails_DTO> details) {
        DefaultTableModel model = (DefaultTableModel) tblBillDetails.getModel();
        model.setRowCount(0);

        for (BillDetails_DTO detail : details) {
            model.addRow(new Object[]{detail.getProductID(), detail.getPrice(), detail.getQuantity(), detail.total()});
        }
    }

    private void tblBillListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBillListMouseClicked
        int i = tblBillList.getSelectedRow();
        int selectedID = (int) tblBillList.getValueAt(i, 0);
        SimpleDateFormat format = new SimpleDateFormat("MM-dd-yyyy");

        for (Bill_DTO bill : listBill) {
            if (bill.getId() == selectedID) {
                selectedBill = bill;
            }
        }

        listDetails = billBUS.getDetails(selectedID);

        if (i >= 0) {
            lblBillID.setText(selectedBill.getId() + "");
            lblStaffID.setText(selectedBill.getStaffID() + "");
            lblDate.setText(format.format(selectedBill.getDate()));
            lblTotal.setText(selectedBill.getTotal() + "");
            loadBillDetails(listDetails);
        }
    }//GEN-LAST:event_tblBillListMouseClicked

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        if (txtSearch.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Vui l??ng nh???p n???i dung t??m ki???m!");
        } else {
            try {
                String filter = cbbFilter.getSelectedItem() + "";
                int key = Integer.parseInt(txtSearch.getText());

                listSearch = billBUS.search(key, filter, listBill);

                if (listSearch.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Kh??ng t??m th???y k???t qu??? ph?? h???p");
                } else {
                    loadBillList(listSearch);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Kh??ng t??m th???y k???t qu??? ph?? h???p");
            }
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnResetSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetSearchActionPerformed
        loadBillList(listBill);
    }//GEN-LAST:event_btnResetSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteBill;
    private javax.swing.JButton btnResetSearch;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cbbFilter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblBillID;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblStaffID;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JScrollPane scrBillList;
    private javax.swing.JScrollPane scrProductListBill;
    private javax.swing.JTable tblBillDetails;
    private javax.swing.JTable tblBillList;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
