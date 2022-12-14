/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import BUS.Bill_BUS;
import BUS.Product_BUS;
import DTO.BillDetails_DTO;
import DTO.Bill_DTO;
import DTO.Product_DTO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LENOVO
 */
public class Sale_GUI extends javax.swing.JPanel {

    private Product_BUS productBUS = new Product_BUS();
    private Bill_BUS billBUS = new Bill_BUS();
    private ArrayList<Product_DTO> listProduct = new ArrayList();
    private ArrayList<Product_DTO> listSearch = new ArrayList();
    private ArrayList<BillDetails_DTO> listDetails = new ArrayList();
    private Product_DTO selectedProduct = new Product_DTO(0, "", 0, "");
    private BillDetails_DTO selectedDetail;

    public Sale_GUI() {
        listProduct = productBUS.list();
        initComponents();
        loadProductList(listProduct);
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
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        scrProductList = new javax.swing.JScrollPane();
        tblProductList = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        scrProductListBill = new javax.swing.JScrollPane();
        tblOrder = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        btnClearSale = new javax.swing.JButton();
        btnCheckOut = new javax.swing.JButton();
        btnAddProduct = new javax.swing.JButton();
        btnResetSearch = new javax.swing.JButton();
        btnDeleteProduct = new javax.swing.JButton();

        setForeground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(951, 676));

        txtSearch.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        btnSearch.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnSearch.setText("T??m ki???m");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        tblProductList.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tblProductList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "M?? s???n ph???m", "T??n s???n ph???m", "Gi?? s???n ph???m"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProductList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductListMouseClicked(evt);
            }
        });
        scrProductList.setViewportView(tblProductList);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("H??A ????N B??N H??NG");

        tblOrder.setModel(new javax.swing.table.DefaultTableModel(
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
        tblOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblOrderMouseClicked(evt);
            }
        });
        scrProductListBill.setViewportView(tblOrder);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("T???ng th??nh ti???n:");

        lblTotal.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTotal.setText("0");

        btnClearSale.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnClearSale.setText("L??M M???I");
        btnClearSale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearSaleActionPerformed(evt);
            }
        });

        btnCheckOut.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnCheckOut.setText("THANH TO??N");
        btnCheckOut.setEnabled(false);
        btnCheckOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scrProductListBill, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnClearSale)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCheckOut)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrProductListBill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClearSale, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        btnAddProduct.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAddProduct.setText("TH??M S???N PH???M");
        btnAddProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProductActionPerformed(evt);
            }
        });

        btnResetSearch.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnResetSearch.setText("L??m m???i");
        btnResetSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetSearchActionPerformed(evt);
            }
        });

        btnDeleteProduct.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnDeleteProduct.setText("X??A S???N PH???M");
        btnDeleteProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteProductActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(scrProductList, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(txtSearch)
                            .addGap(18, 18, 18)
                            .addComponent(btnResetSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAddProduct)
                        .addGap(18, 18, 18)
                        .addComponent(btnDeleteProduct)))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSearch)
                            .addComponent(btnResetSearch))
                        .addGap(18, 18, 18)
                        .addComponent(scrProductList, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDeleteProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAddProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
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

    private void loadProductList(ArrayList<Product_DTO> list) {
        DefaultTableModel model = (DefaultTableModel) tblProductList.getModel();
        model.setRowCount(0);

        for (Product_DTO product : list) {
            model.addRow(new Object[]{product.getId(), product.getName(), product.getPrice()});
        }
    }

    private void btnClearSaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearSaleActionPerformed
        listDetails.clear();
        lblTotal.setText("0");
        loadOrder(listDetails);
        if (Integer.parseInt(lblTotal.getText()) > 0) {
            btnCheckOut.setEnabled(true);
        } else
            btnCheckOut.setEnabled(false);
    }//GEN-LAST:event_btnClearSaleActionPerformed

    private void btnCheckOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckOutActionPerformed
        Bill_DTO bill = new Bill_DTO();

        java.util.Date jDate = new java.util.Date();
        java.sql.Date sqlDate = new java.sql.Date(jDate.getTime());

        bill.setDate(sqlDate);
        bill.setId(0);
        bill.setStaffID(Home_GUI.user.getStaffID());
        bill.setTotal(Integer.parseInt(lblTotal.getText()));

        int option = JOptionPane.showConfirmDialog(this, "X??c nh???n thanh to??n v?? xu???t h??a ????n?", "Thanh to??n", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {
            if (billBUS.insertBill(bill)) {
                int billID = billBUS.getLatestBillID();
                for (BillDetails_DTO detail : listDetails) {
                    detail.setBillID(billID);
                    if (billBUS.insertBillDetail(detail)) {
                        //do nothing
                    }
                }
                JOptionPane.showMessageDialog(this, "T???o h??a ????n th??nh c??ng!");
                listDetails.clear();
                lblTotal.setText("0");
                loadOrder(listDetails);
                if (Integer.parseInt(lblTotal.getText()) > 0) {
                    btnCheckOut.setEnabled(true);
                } else {
                    btnCheckOut.setEnabled(false);
                }
            }
        }
    }//GEN-LAST:event_btnCheckOutActionPerformed

    private void tblProductListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductListMouseClicked
        int i = tblProductList.getSelectedRow();
        int selectedID = (int) tblProductList.getValueAt(i, 0);

        for (Product_DTO pd : listProduct) {
            if (pd.getId() == selectedID) {
                selectedProduct = pd;
                break;
            }
        }
    }//GEN-LAST:event_tblProductListMouseClicked

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        if (txtSearch.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Vui l??ng nh???p t??n s???n ph???m c???n t??m!");
        } else {
            listSearch = productBUS.search(txtSearch.getText(), listProduct);
            if (listSearch.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Kh??ng t??m th???y k???t qu??? ph?? h???p");
            } else {
                loadProductList(listSearch);
            }
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnResetSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetSearchActionPerformed
        loadProductList(listProduct);
    }//GEN-LAST:event_btnResetSearchActionPerformed

    private void btnAddProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProductActionPerformed
        if (selectedProduct.getId() == 0) {
            JOptionPane.showMessageDialog(this, "Vui l??ng ch???n s???n ph???m c???n th??m!");
        } else {
            try {
                int quantity = Integer.parseInt(JOptionPane.showInputDialog("Nh???p s??? l?????ng"));
                int total = 0;
                boolean isDuplicant = false;
                if (quantity <= 0) {
                    JOptionPane.showMessageDialog(this, "S??? l?????ng kh??ng h???p l???!");
                } else {
                    BillDetails_DTO detail = new BillDetails_DTO(0, selectedProduct.getId(), selectedProduct.getPrice(), quantity);
                    for (BillDetails_DTO dt : listDetails) {
                        if (dt.getProductID() == detail.getProductID()) {
                            dt.setQuantity(dt.getQuantity() + detail.getQuantity());
                            isDuplicant = true;
                        }
                    }
                    if (isDuplicant == false) {
                        listDetails.add(detail);
                    }

                    for (BillDetails_DTO dt : listDetails) {
                        total += dt.total();
                    }

                    selectedProduct.setId(0);
                    loadOrder(listDetails);
                    lblTotal.setText(total + "");
                    if (Integer.parseInt(lblTotal.getText()) > 0) {
                        btnCheckOut.setEnabled(true);
                    } else {
                        btnCheckOut.setEnabled(false);
                    }
                }
            } catch (NumberFormatException e) {

            }
        }
    }//GEN-LAST:event_btnAddProductActionPerformed

    private void btnDeleteProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteProductActionPerformed
        if (selectedDetail == null) {
            JOptionPane.showMessageDialog(this, "Vui l??ng ch???n s???n ph???m c???n x??a");
        } else {
            int option = JOptionPane.showConfirmDialog(this, "B???n mu???n x??a s???n ph???m n??y?", "X??a s???n ph???m", JOptionPane.OK_CANCEL_OPTION);
            int total = 0;
            if (option == JOptionPane.OK_OPTION) {
                listDetails.remove(selectedDetail);
                for (BillDetails_DTO dt : listDetails) {
                    total += dt.total();
                }
                lblTotal.setText(total + "");
                loadOrder(listDetails);
                selectedDetail = null;
                if (Integer.parseInt(lblTotal.getText()) > 0) {
                    btnCheckOut.setEnabled(true);
                } else btnCheckOut.setEnabled(false);
            }
        }
    }//GEN-LAST:event_btnDeleteProductActionPerformed

    private void tblOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOrderMouseClicked
        int i = tblOrder.getSelectedRow();
        int selectedPID = (int) tblOrder.getValueAt(i, 0);

        for (BillDetails_DTO bd : listDetails) {
            if (bd.getProductID() == selectedPID) {
                selectedDetail = bd;
            }
        }


    }//GEN-LAST:event_tblOrderMouseClicked

    private void loadOrder(ArrayList<BillDetails_DTO> list) {
        DefaultTableModel model = (DefaultTableModel) tblOrder.getModel();
        model.setRowCount(0);

        for (BillDetails_DTO dt : list) {
            model.addRow(new Object[]{dt.getProductID(), dt.getPrice(), dt.getQuantity(), dt.total()});
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddProduct;
    private javax.swing.JButton btnCheckOut;
    private javax.swing.JButton btnClearSale;
    private javax.swing.JButton btnDeleteProduct;
    private javax.swing.JButton btnResetSearch;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JScrollPane scrProductList;
    private javax.swing.JScrollPane scrProductListBill;
    private javax.swing.JTable tblOrder;
    private javax.swing.JTable tblProductList;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
