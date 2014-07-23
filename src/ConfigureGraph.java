package GraphGenerator;

import java.sql.ResultSetMetaData;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;

public class ConfigureGraph extends javax.swing.JFrame {
    private final int BARS=0;
    private final int PIE=1;
    private final int GRAPH=2;
    private DatabaseManager db;
    private int designSelection;
    /** Creates new form ConfigureGraph */
    public ConfigureGraph() {
        initComponents();
        optionsTab.remove(jPanel2);
        optionsTab.remove(jPanel3);
        revalidate();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        design = new javax.swing.ButtonGroup();
        optionsTab = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        optBars = new javax.swing.JRadioButton();
        optPie = new javax.swing.JRadioButton();
        optGraph = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtDriver = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtURL = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDBName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtUname = new javax.swing.JTextField();
        txtTable = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnGetConnection = new javax.swing.JButton();
        txtPwd = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtXcolumn = new javax.swing.JComboBox();
        txtYcolumn = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnGenerate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Configure Your Graph");

        design.add(optBars);
        optBars.setText("Bars");
        optBars.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optBarsActionPerformed(evt);
            }
        });

        design.add(optPie);
        optPie.setText("Pie chart");
        optPie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optPieActionPerformed(evt);
            }
        });

        design.add(optGraph);
        optGraph.setText("Graph");
        optGraph.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optGraphActionPerformed(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_line.png"))); // NOI18N

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_pie.png"))); // NOI18N

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_line_bar.png"))); // NOI18N

        jLabel14.setForeground(new java.awt.Color(55, 55, 55));
        jLabel14.setText("Select the way in which you would like to analyse the data in graphical form");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(optBars)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel11)
                        .addGap(69, 69, 69)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel13)
                        .addGap(77, 77, 77))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(optPie)
                        .addGap(71, 71, 71)
                        .addComponent(optGraph)
                        .addGap(85, 85, 85))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel14)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(jLabel13))
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(optBars)
                    .addComponent(optGraph)
                    .addComponent(optPie))
                .addGap(40, 40, 40)
                .addComponent(jLabel14)
                .addGap(81, 81, 81))
        );

        optionsTab.addTab("Select Design ", jPanel1);

        txtDriver.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "MySQL", "Oracle", "JDBC-ODBC Bridge" }));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setText("Select DB Driver: ");

        jLabel2.setText("ServerURL with port: ");

        jLabel3.setText("Database / DSN file name: ");

        jLabel4.setText("Username: ");

        jLabel5.setText("Password: ");

        jLabel6.setText("Table: ");

        btnGetConnection.setText("Get Connection");
        btnGetConnection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetConnectionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtURL, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                                    .addComponent(txtDBName, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                                    .addComponent(txtUname, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                                    .addComponent(txtTable, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                                    .addComponent(txtPwd, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE))
                                .addGap(165, 165, 165))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtDriver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnGetConnection)
                        .addGap(21, 21, 21))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtDriver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtURL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDBName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtUname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(txtPwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(btnGetConnection)
                .addGap(38, 38, 38))
        );

        optionsTab.addTab("DB Connectivity ", jPanel2);

        jLabel7.setText("Field for X-axis: ");

        jLabel8.setText("Field for Y-axis: ");

        jLabel10.setText("(only numeric types)");

        btnGenerate.setText("Generate Graph");
        btnGenerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtYcolumn, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtXcolumn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9))
                .addContainerGap(152, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(344, Short.MAX_VALUE)
                .addComponent(btnGenerate)
                .addGap(159, 159, 159))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtXcolumn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtYcolumn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 158, Short.MAX_VALUE)
                .addComponent(btnGenerate)
                .addGap(23, 23, 23))
        );

        optionsTab.addTab("Customize", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(optionsTab, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(optionsTab, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void optBarsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optBarsActionPerformed
  designSelection=BARS;
  optionsTab.add("DB Connectivity ",jPanel2);
        revalidate();
  
}//GEN-LAST:event_optBarsActionPerformed

private void optPieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optPieActionPerformed
 designSelection=PIE;
  optionsTab.add("DB Connectivity ",jPanel2);
        revalidate();
}//GEN-LAST:event_optPieActionPerformed

private void optGraphActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optGraphActionPerformed
 designSelection=GRAPH;
  optionsTab.add("DB Connectivity ",jPanel2);
        revalidate();
}//GEN-LAST:event_optGraphActionPerformed

private void btnGenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateActionPerformed
    
    if(designSelection==GRAPH){
        Graph g=new Graph();
        try{
              ResultSet rs=db.executeQuery("select " + txtXcolumn.getSelectedItem() + " , " +  txtYcolumn.getSelectedItem() + " from " + txtTable.getText());
             int rowCount=0;
             while(rs.next()){
                 rowCount++;
             }
             rs.beforeFirst();
             
             g.setTotalpoints(rowCount);
             
             String lbl[]=new String[rowCount];
             double values[]=new double[rowCount];
             
             for(int i=0;rs.next();i++){
                 lbl[i]=rs.getString(1);
                 values[i]=rs.getDouble(2);
             }
             
             g.setLbl(lbl);
             g.setValues(values);
             
             
        }catch (Exception ex) {
                    System.out.println(ex);
                }
        g.setVisible(true);
        
    }else if(designSelection==BARS){
        BarChart g=new BarChart();
        try{
              ResultSet rs=db.executeQuery("select " + txtXcolumn.getSelectedItem() + " , " +  txtYcolumn.getSelectedItem() + " from " + txtTable.getText());
             int rowCount=0;
             while(rs.next()){
                 rowCount++;
             }
             rs.beforeFirst();
             
             g.setTotalpoints(rowCount);
             
             String lbl[]=new String[rowCount];
             double values[]=new double[rowCount];
             
             for(int i=0;rs.next();i++){
                 lbl[i]=rs.getString(1);
                 values[i]=rs.getDouble(2);
             }
             
             g.setLbl(lbl);
             g.setValues(values);
             
             
        }catch (Exception ex) {
                    System.out.println(ex);
                }
        g.setVisible(true);
    }else if(designSelection==PIE){
        Piechart g=new Piechart();
        try{
              ResultSet rs=db.executeQuery("select " + txtXcolumn.getSelectedItem() + " , " +  txtYcolumn.getSelectedItem() + " from " + txtTable.getText());
             int rowCount=0;
             while(rs.next()){
                 rowCount++;
             }
             rs.beforeFirst();
             
             g.setTotalpoints(rowCount);
             
             String lbl[]=new String[rowCount];
             double values[]=new double[rowCount];
             
             for(int i=0;rs.next();i++){
                 lbl[i]=rs.getString(1);
                 values[i]=rs.getDouble(2);
             }
             
             g.setLbl(lbl);
             g.setValues(values);
             
             
        }catch (Exception ex) {
                    System.out.println(ex);
                }
        g.setVisible(true);
    }        
        
}//GEN-LAST:event_btnGenerateActionPerformed

private void btnGetConnectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetConnectionActionPerformed
        try {
           int driver=-1;
           if(txtDriver.getSelectedItem().equals("MySQL")){
               driver=DatabaseManager.MYSQLdriver;
           }
           if(txtDriver.getSelectedItem().equals("Oracle")){
               driver=DatabaseManager.ORACLEdriver;
           }
           if(txtDriver.getSelectedItem().equals("JDBC-ODBC Bridge")){
               driver=DatabaseManager.ODBCdriver;
           }
          
           db=new DatabaseManager(driver, txtURL.getText(),txtDBName.getText(),txtUname.getText(),txtPwd.getText());
           ResultSet rs=db.executeQuery("select * from " + txtTable.getText());
          
           ResultSetMetaData rsinfo=rs.getMetaData();
           int colCount = rsinfo.getColumnCount();
           Vector ycols=new Vector();
            Vector xcols=new Vector();
                 
           for (int i=1; i<= colCount; i++) {
                 String column=rsinfo.getColumnName(i); 
                 String datatype= rsinfo.getColumnTypeName(i);
                 System.out.println(datatype);
                 if(datatype.toLowerCase().startsWith("int")||datatype.toLowerCase().equals("num")||datatype.toLowerCase().startsWith("float")||datatype.toLowerCase().startsWith("double")){
                        ycols.add(column);
                 }
                 xcols.add(column);
           }
           txtXcolumn.setModel(new DefaultComboBoxModel(xcols));
           txtYcolumn.setModel(new DefaultComboBoxModel(ycols));
           optionsTab.add("Customize",jPanel3);
           revalidate();
          
        }catch (Exception ex) {
            System.out.println(ex);
        }
  
}//GEN-LAST:event_btnGetConnectionActionPerformed
public String getPortNo() {
    return (txtURL.getText());
}
public String getDBName() {
    return (txtDBName.getText());
}
public String getUname() {
    return (txtUname.getText());
}
public String getPasswd() {
    return (txtPwd.getText());
}
public String getTables() {
    return (txtTable.getText());
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerate;
    private javax.swing.JButton btnGetConnection;
    private javax.swing.ButtonGroup design;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton optBars;
    private javax.swing.JRadioButton optGraph;
    private javax.swing.JRadioButton optPie;
    private javax.swing.JTabbedPane optionsTab;
    private javax.swing.JTextField txtDBName;
    private javax.swing.JComboBox txtDriver;
    private javax.swing.JTextField txtPwd;
    private javax.swing.JTextField txtTable;
    private javax.swing.JTextField txtURL;
    private javax.swing.JTextField txtUname;
    private javax.swing.JComboBox txtXcolumn;
    private javax.swing.JComboBox txtYcolumn;
    // End of variables declaration//GEN-END:variables
}
