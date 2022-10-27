/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

/**
 *
 * @author DLCH
 */
public class Product_GUI extends javax.swing.JPanel {

    /**
     * Creates new form Product_GUI
     */
    public Product_GUI() {
        initComponents();
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
        scrProductList = new javax.swing.JScrollPane();
        tblProductList = new javax.swing.JTable();
        pnlProductDetails = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblProductID = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblProductName = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblProductPrice = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblProductType = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        scrProductRecipe = new javax.swing.JScrollPane();
        tblProductRecipe = new javax.swing.JTable();
        cbbSearchFilter = new javax.swing.JComboBox<>();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        pnlProductConfiguration = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtProductID = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtProductName = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtProductPrice = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cbbProductType = new javax.swing.JComboBox<>();
        scrProductRecipeConfig = new javax.swing.JScrollPane();
        tblProductRecipeConfig = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(204, 153, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(951, 676));

        scrProductList.setBackground(new java.awt.Color(255, 255, 255));
        scrProductList.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));
        scrProductList.setForeground(new java.awt.Color(255, 255, 255));

        tblProductList.setBackground(new java.awt.Color(255, 255, 255));
        tblProductList.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        tblProductList.setForeground(new java.awt.Color(153, 102, 255));
        tblProductList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"SP001", "Trà sữa trân châu"},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Mã sản phẩm", "Tên sản phẩm"
            }
        ));
        tblProductList.setGridColor(new java.awt.Color(204, 153, 255));
        tblProductList.setSelectionBackground(new java.awt.Color(204, 153, 255));
        tblProductList.setSelectionForeground(new java.awt.Color(255, 255, 255));
        scrProductList.setViewportView(tblProductList);

        pnlProductDetails.setBackground(new java.awt.Color(255, 255, 255));
        pnlProductDetails.setForeground(new java.awt.Color(153, 102, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 102, 255));
        jLabel1.setText("Chi tiết sản phẩm:");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 102, 255));
        jLabel2.setText("Mã sản phẩm:");

        lblProductID.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblProductID.setForeground(new java.awt.Color(153, 102, 255));
        lblProductID.setText("SP001");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 102, 255));
        jLabel3.setText("Tên sản phẩm:");

        lblProductName.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblProductName.setForeground(new java.awt.Color(153, 102, 255));
        lblProductName.setText("Trà sữa trân châu");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 102, 255));
        jLabel4.setText("Giá bán:");

        lblProductPrice.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblProductPrice.setForeground(new java.awt.Color(153, 102, 255));
        lblProductPrice.setText("20000");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 102, 255));
        jLabel5.setText("Loại sản phẩm:");

        lblProductType.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblProductType.setForeground(new java.awt.Color(153, 102, 255));
        lblProductType.setText("Trà sữa");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 102, 255));
        jLabel6.setText("Công thức:");

        scrProductRecipe.setBackground(new java.awt.Color(255, 255, 255));

        tblProductRecipe.setBackground(new java.awt.Color(255, 255, 255));
        tblProductRecipe.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        tblProductRecipe.setForeground(new java.awt.Color(153, 102, 255));
        tblProductRecipe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Trà túi lọc", "Túi", "1"},
                {"Sữa lùn", "ml", "50"},
                {"Nước", "ml", "200"},
                {"Đường", "g", "50"},
                {"Trân châu", "g", "10"}
            },
            new String [] {
                "Tên hàng hóa", "Đơn vị tính", "Số lượng"
            }
        ));
        tblProductRecipe.setGridColor(new java.awt.Color(204, 153, 255));
        tblProductRecipe.setSelectionBackground(new java.awt.Color(255, 255, 255));
        tblProductRecipe.setSelectionForeground(new java.awt.Color(204, 153, 255));
        scrProductRecipe.setViewportView(tblProductRecipe);

        javax.swing.GroupLayout pnlProductDetailsLayout = new javax.swing.GroupLayout(pnlProductDetails);
        pnlProductDetails.setLayout(pnlProductDetailsLayout);
        pnlProductDetailsLayout.setHorizontalGroup(
            pnlProductDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProductDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlProductDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlProductDetailsLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(pnlProductDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlProductDetailsLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblProductID, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlProductDetailsLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlProductDetailsLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblProductPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlProductDetailsLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                                .addComponent(lblProductType, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlProductDetailsLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(scrProductRecipe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlProductDetailsLayout.setVerticalGroup(
            pnlProductDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProductDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlProductDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblProductID))
                .addGap(18, 18, 18)
                .addGroup(pnlProductDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblProductName))
                .addGap(18, 18, 18)
                .addGroup(pnlProductDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblProductPrice))
                .addGap(18, 18, 18)
                .addGroup(pnlProductDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblProductType))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrProductRecipe, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        cbbSearchFilter.setBackground(new java.awt.Color(255, 255, 255));
        cbbSearchFilter.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        cbbSearchFilter.setForeground(new java.awt.Color(153, 102, 255));
        cbbSearchFilter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã sản phẩm", "Tên sản phẩm", "Loại sản phẩm" }));

        txtSearch.setBackground(new java.awt.Color(255, 255, 255));
        txtSearch.setForeground(new java.awt.Color(153, 102, 255));
        txtSearch.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 102, 255)), javax.swing.BorderFactory.createEmptyBorder(1, 4, 1, 4)));
        txtSearch.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        txtSearch.setSelectionColor(new java.awt.Color(204, 153, 255));

        btnSearch.setBackground(new java.awt.Color(255, 255, 255));
        btnSearch.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(153, 102, 255));
        btnSearch.setText("Tìm kiếm");
        btnSearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 102, 255)));

        btnAdd.setBackground(new java.awt.Color(255, 255, 255));
        btnAdd.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(153, 102, 255));
        btnAdd.setText("Thêm sản phẩm");
        btnAdd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 102, 255)));
        btnAdd.setMaximumSize(new java.awt.Dimension(91, 32));
        btnAdd.setPreferredSize(new java.awt.Dimension(91, 32));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(255, 255, 255));
        btnDelete.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(153, 102, 255));
        btnDelete.setText("Xóa sản phẩm");
        btnDelete.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 102, 255)));
        btnDelete.setMaximumSize(new java.awt.Dimension(81, 32));
        btnDelete.setPreferredSize(new java.awt.Dimension(81, 32));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(255, 255, 255));
        btnUpdate.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(153, 102, 255));
        btnUpdate.setText("Cập nhật sản phẩm");
        btnUpdate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 102, 255)));
        btnUpdate.setMaximumSize(new java.awt.Dimension(109, 32));
        btnUpdate.setMinimumSize(new java.awt.Dimension(109, 32));
        btnUpdate.setPreferredSize(new java.awt.Dimension(109, 32));

        pnlProductConfiguration.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 102, 255));
        jLabel7.setText("Chỉnh sửa danh sách sản phẩm:");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 102, 255));
        jLabel8.setText("Mã sản phẩm:");

        txtProductID.setBackground(new java.awt.Color(255, 255, 255));
        txtProductID.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtProductID.setForeground(new java.awt.Color(153, 102, 255));
        txtProductID.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 102, 255)), javax.swing.BorderFactory.createEmptyBorder(1, 4, 1, 4)));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 102, 255));
        jLabel9.setText("Tên sản phẩm:");

        txtProductName.setBackground(new java.awt.Color(255, 255, 255));
        txtProductName.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtProductName.setForeground(new java.awt.Color(153, 102, 255));
        txtProductName.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 102, 255)), javax.swing.BorderFactory.createEmptyBorder(1, 4, 1, 4)));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 102, 255));
        jLabel10.setText("Giá bán:");

        txtProductPrice.setBackground(new java.awt.Color(255, 255, 255));
        txtProductPrice.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtProductPrice.setForeground(new java.awt.Color(153, 102, 255));
        txtProductPrice.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 102, 255)), javax.swing.BorderFactory.createEmptyBorder(1, 4, 1, 4)));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 102, 255));
        jLabel11.setText("Loại sản phẩm:");

        cbbProductType.setBackground(new java.awt.Color(255, 255, 255));
        cbbProductType.setForeground(new java.awt.Color(153, 102, 255));
        cbbProductType.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 153, 255)));

        tblProductRecipeConfig.setBackground(new java.awt.Color(255, 255, 255));
        tblProductRecipeConfig.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        tblProductRecipeConfig.setForeground(new java.awt.Color(153, 102, 255));
        tblProductRecipeConfig.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Tên hàng hóa", "Đơn vị tính", "Số lượng"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProductRecipeConfig.setGridColor(new java.awt.Color(204, 153, 255));
        tblProductRecipeConfig.setSelectionBackground(new java.awt.Color(204, 153, 255));
        tblProductRecipeConfig.setSelectionForeground(new java.awt.Color(255, 255, 255));
        scrProductRecipeConfig.setViewportView(tblProductRecipeConfig);

        javax.swing.GroupLayout pnlProductConfigurationLayout = new javax.swing.GroupLayout(pnlProductConfiguration);
        pnlProductConfiguration.setLayout(pnlProductConfigurationLayout);
        pnlProductConfigurationLayout.setHorizontalGroup(
            pnlProductConfigurationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlProductConfigurationLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlProductConfigurationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(scrProductRecipeConfig)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlProductConfigurationLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlProductConfigurationLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(pnlProductConfigurationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlProductConfigurationLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                                .addComponent(txtProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlProductConfigurationLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtProductID, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlProductConfigurationLayout.createSequentialGroup()
                                .addGroup(pnlProductConfigurationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(pnlProductConfigurationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtProductPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                                    .addComponent(cbbProductType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap())
        );
        pnlProductConfigurationLayout.setVerticalGroup(
            pnlProductConfigurationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProductConfigurationLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlProductConfigurationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtProductID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlProductConfigurationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlProductConfigurationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtProductPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlProductConfigurationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(cbbProductType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrProductRecipeConfig, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrProductList)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cbbSearchFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnlProductConfiguration, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(pnlProductDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbbSearchFilter)
                            .addComponent(txtSearch)
                            .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(scrProductList, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnlProductConfiguration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(pnlProductDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cbbProductType;
    private javax.swing.JComboBox<String> cbbSearchFilter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblProductID;
    private javax.swing.JLabel lblProductName;
    private javax.swing.JLabel lblProductPrice;
    private javax.swing.JLabel lblProductType;
    private javax.swing.JPanel pnlProductConfiguration;
    private javax.swing.JPanel pnlProductDetails;
    private javax.swing.JScrollPane scrProductList;
    private javax.swing.JScrollPane scrProductRecipe;
    private javax.swing.JScrollPane scrProductRecipeConfig;
    private javax.swing.JTable tblProductList;
    private javax.swing.JTable tblProductRecipe;
    private javax.swing.JTable tblProductRecipeConfig;
    private javax.swing.JTextField txtProductID;
    private javax.swing.JTextField txtProductName;
    private javax.swing.JTextField txtProductPrice;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}