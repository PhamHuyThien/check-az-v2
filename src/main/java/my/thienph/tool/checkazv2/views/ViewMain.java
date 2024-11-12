package my.thienph.tool.checkazv2.views;

import org.springframework.stereotype.Service;

import javax.swing.table.DefaultTableModel;


@Service
public final class ViewMain extends javax.swing.JFrame {


    //    public ThreadPool threadPool;
    public DefaultTableModel model;

    public javax.swing.JButton btnCheck;
    public javax.swing.JButton btnSave;
    public javax.swing.JCheckBox cbCheckToken;
    public javax.swing.JCheckBox cbOption1;
    public javax.swing.JCheckBox cbOption2;
    public javax.swing.JCheckBox cbDebugMode;
    public javax.swing.JCheckBox cbShuffle;
    public javax.swing.JCheckBox cbUseProxies;
    public javax.swing.JComboBox<String> cbbServer;
    public javax.swing.JComboBox<String> cbbThread;
    public javax.swing.JTextField inpPath;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel2;
    public javax.swing.JPanel jPanel4;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel lbProcess;
    public javax.swing.JLabel lbToolContact;
    public javax.swing.JLabel lbToolName;
    public javax.swing.JLabel lbToolVer;
    public javax.swing.JTable tbAccount;

    public ViewMain() {
        initComponents();
        setLocationRelativeTo(null);
        model = (DefaultTableModel) tbAccount.getModel();
//        init();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        lbToolName = new javax.swing.JLabel();
        lbToolVer = new javax.swing.JLabel();
        lbToolContact = new javax.swing.JLabel();
        lbProcess = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        cbbServer = new javax.swing.JComboBox<>();
        btnCheck = new javax.swing.JButton();
        inpPath = new javax.swing.JTextField();
        cbUseProxies = new javax.swing.JCheckBox();
        cbCheckToken = new javax.swing.JCheckBox();
        cbOption2 = new javax.swing.JCheckBox();
        cbOption1 = new javax.swing.JCheckBox();
        cbbThread = new javax.swing.JComboBox<>();
        cbDebugMode = new javax.swing.JCheckBox();
        btnSave = new javax.swing.JButton();
        cbShuffle = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbAccount = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
//                formWindowClosing(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbToolName.setFont(new java.awt.Font("Consolas", 1, 30)); // NOI18N
        lbToolName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbToolName.setText("CheckAZ");

        lbToolVer.setFont(new java.awt.Font("Consolas", 0, 15)); // NOI18N
        lbToolVer.setText("v2.0.0");

        lbToolContact.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        lbToolContact.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbToolContact.setText("");
        lbToolContact.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
//                lbToolContactMouseClicked(evt);
            }
        });

        lbProcess.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        lbProcess.setForeground(new java.awt.Color(0, 204, 102));
        lbProcess.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbProcess.setText("---------------------------------------");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(lbToolName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbToolVer, javax.swing.GroupLayout.PREFERRED_SIZE, 64,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))
                .addGroup(jPanel4Layout.createSequentialGroup().addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbToolContact, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbProcess, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE))
                        .addContainerGap()));
        jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup().addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lbToolName, javax.swing.GroupLayout.PREFERRED_SIZE, 28,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbToolVer))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(lbToolContact)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbProcess, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(9, 9, 9)));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        cbbServer.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        cbbServer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"[1]GameGate - Gamvip,G88,1G88"}));

        btnCheck.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        btnCheck.setText("CHECK");
        btnCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                btnCheckActionPerformed(evt);
            }
        });

        inpPath.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N

        cbUseProxies.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        cbUseProxies.setSelected(true);
        cbUseProxies.setText("Sự dụng Proxies");

        cbCheckToken.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        cbCheckToken.setSelected(true);
        cbCheckToken.setText("Đăng nhập bằng token");

        cbOption2.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        cbOption2.setSelected(true);
        cbOption2.setText(".................");

        cbOption1.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        cbOption1.setSelected(true);
        cbOption1.setText(".................");

        cbbThread.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        cbbThread.setModel(new javax.swing.DefaultComboBoxModel<>(
                new String[]{"1", "5", "10", "30", "50", "100", "200", "500", "1000", "2000", "5000", "10000"}));
        cbbThread.setSelectedIndex(5);

        cbDebugMode.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        cbDebugMode.setSelected(true);
        cbDebugMode.setText("Chế độ gỡ lỗi");

        btnSave.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        btnSave.setText("LƯU");
        btnSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
//                btnSaveMouseClicked(evt);
            }
        });

        cbShuffle.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        cbShuffle.setSelected(true);
        cbShuffle.setText("Trộn ngẫu nhiên");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(jPanel1Layout.createSequentialGroup().addContainerGap(10, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cbOption1).addComponent(cbShuffle))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cbOption2).addComponent(cbCheckToken))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                        jPanel1Layout.createSequentialGroup().addComponent(cbDebugMode).addGap(42, 42,
                                                42))
                                .addGroup(jPanel1Layout.createSequentialGroup().addComponent(cbUseProxies).addGap(34,
                                        34, 34)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                        jPanel1Layout.createSequentialGroup()
                                                .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(18, 18, 18)
                                                .addComponent(cbbServer, javax.swing.GroupLayout.PREFERRED_SIZE, 276,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 76,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                        jPanel1Layout.createSequentialGroup()
                                                .addComponent(cbbThread, javax.swing.GroupLayout.PREFERRED_SIZE, 105,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18).addComponent(inpPath,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 358,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap()));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup().addContainerGap(13, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(inpPath, javax.swing.GroupLayout.PREFERRED_SIZE, 25,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbbThread, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbDebugMode).addComponent(cbCheckToken).addComponent(cbShuffle))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cbbServer, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnCheck).addComponent(cbUseProxies).addComponent(cbOption2)
                                .addComponent(cbOption1).addComponent(btnSave))
                        .addContainerGap()));

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL,
                btnCheck, cbbServer, cbbThread, inpPath);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tbAccount.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        tbAccount.setModel(new javax.swing.table.DefaultTableModel(new Object[][]{

        }, new String[]{"Tài khoản", "Mật khẩu", "Kết quả", "Tên nhân vật", "Tiền", "Két", "Số ĐT 1", "Số ĐT 2", "Ghi chú"}));
        tbAccount.setRowHeight(25);
        jScrollPane1.setViewportView(tbAccount);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1));
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
                .createSequentialGroup().addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup().addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap()));

        pack();
    }// </editor-fold>//GEN-END:initComponents
//
//    private void formWindowClosing(java.awt.event.WindowEvent evt) {// GEN-FIRST:event_formWindowClosing
//        ConfigService.config = buildConfig();
//        Utils.exit();
//    }// GEN-LAST:event_formWindowClosing
//
//    private void btnCheckActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnCheckActionPerformed
//        new CheckAccountController(this).onClick();
//    }// GEN-LAST:event_btnCheckActionPerformed
//
//    private void lbToolContactMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_lbToolContactMouseClicked
//        new ContactController(this).onClick();
//    }// GEN-LAST:event_lbToolContactMouseClicked
//
//    private void btnSaveMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnSaveMouseClicked
//        new SaveAccountController(this).onClick();
//
//    }// GEN-LAST:event_btnSaveMouseClicked
//
//
//    public Server toServer() {
//        return ServerService.listServer.get(cbbServer.getSelectedIndex());
//    }
//
//    private void init() {
//        //
//        super.setTitle("Tool " + CheckAzToolMain.TOOL_NAME + " v" + CheckAzToolMain.TOOL_VERSION
//                + " - Code by " + CheckAzToolMain.TOOL_AUTHOR + " - Time Left: 23:59:59 - 31/12/2099");
//        lbToolName.setText("_" + CheckAzToolMain.TOOL_NAME);
//        lbToolVer.setText("v" + CheckAzToolMain.TOOL_VERSION);
//        lbToolContact.setText("Code by " + CheckAzToolMain.TOOL_AUTHOR.replace(" ", "") + " - Click để liên lạc với tôi!");
////        cbCheckToken.setEnabled(false);
//        cbOption1.setEnabled(false);
//        cbOption2.setEnabled(false);
//        //
//        Server[] servers = ServerService.toServerArray(ServerService.listServer);
//        final String type = "[%d]%s";
//        cbbServer.removeAllItems();
//        for (Server server : servers) {
//            cbbServer.addItem(String.format(type, server.getId(), server.getName()));
//        }
//        //
//        tbAccount.getColumnModel().getColumn(0).setPreferredWidth(120);
//        tbAccount.getColumnModel().getColumn(1).setPreferredWidth(120);
//        tbAccount.getColumnModel().getColumn(2).setPreferredWidth(170);
//        //
//        tbAccount.getTableHeader().setPreferredSize(new Dimension(-1, 27));
//        //
//        TableRowSorter<TableModel> sorter = new TableRowSorter<>(model);
//        sorter.setComparator(4,
//                (Object o1, Object o2) -> new Integer(o1.toString()).compareTo(new Integer(o2.toString())));
//        sorter.setComparator(5,
//                (Object o1, Object o2) -> new Integer(o1.toString()).compareTo(new Integer(o2.toString())));
//        tbAccount.setRowSorter(sorter);
//        //
//    }
//
//    public synchronized void updateToTable(GamblingModel gamblingModel) {
//        model.setValueAt(gamblingModel.getAccount().getDescription(), gamblingModel.getRowIndex(), 2);
//        model.setValueAt(gamblingModel.getAccount().getName(), gamblingModel.getRowIndex(), 3);
//        model.setValueAt(gamblingModel.getAccount().getMoney(), gamblingModel.getRowIndex(), 4);
//        model.setValueAt(gamblingModel.getAccount().getMoneyFreeze(), gamblingModel.getRowIndex(), 5);
//        model.setValueAt(gamblingModel.getAccount().getMobileOne(), gamblingModel.getRowIndex(), 6);
//        model.setValueAt(gamblingModel.getAccount().getMobileTwo(), gamblingModel.getRowIndex(), 7);
//        model.setValueAt(gamblingModel.getAccount().getConfirmStatus(), gamblingModel.getRowIndex(), 8);
//        int size = AccountService.listAccount.size();
//        setText("Thành công " + CounterService.count + "/" + size + " tài khoản...");
//    }
//
//    public Config buildConfig() {
//        Config config = ConfigService.config;
//        config.setPathCheckAccount(inpPath.getText());
//        config.setIdServer(cbbServer.getSelectedIndex());
//        config.setIdThread(cbbThread.getSelectedIndex());
//        config.setUseProxies(cbUseProxies.isSelected());
//        config.setDebugMode(cbDebugMode.isSelected());
//        config.setCheckFreeze(cbCheckToken.isSelected());
//        config.setCheckToken(cbCheckToken.isSelected());
//        config.setShuffle(cbShuffle.isSelected());
//        return config;
//    }
//
//    public void loadConfig(Config config) {
//        inpPath.setText(config.getPathCheckAccount());
////        cbbServer.setSelectedIndex(config.getIdServer());
////        cbbThread.setSelectedIndex(config.getIdThread());
//        cbUseProxies.setSelected(config.isUseProxies());
//        cbDebugMode.setSelected(config.isDebugMode());
//        cbCheckToken.setSelected(config.isCheckToken());
//        cbOption1.setSelected(false);
//        cbOption2.setSelected(false);
//        cbShuffle.setSelected(config.isShuffle());
//    }
//
//    public void setAlwaysOnTop() {
//        setAlwaysOnTop(true);
//        setAlwaysOnTop(false);
//    }
//
//    public void setText() {
//        setText("---------------------------------------");
//    }
//
//    public void setText(Object text) {
//        lbProcess.setText(text.toString());
//    }
//    // End of variables declaration//GEN-END:variables
}
