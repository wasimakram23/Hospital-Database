import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;

public class MainFrame extends javax.swing.JFrame {
	
	static String dbname="jdbc:mysql://localhost/hospitalentry";
	Connection connection = null; 
	Statement statement = null; 
	ResultSet resultset = null;
	
    public MainFrame() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        HospitalName = new javax.swing.JLabel();
        Pname = new javax.swing.JLabel();
        Pntf = new javax.swing.JTextField();
        Pfname = new javax.swing.JLabel();
        Pfntf = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Pmntf = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Padtf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Pmatf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Pctf = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Pbdtf = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Patf = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Pmstf = new javax.swing.JTextField();
        Prtf = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Pidtf = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        dntf = new javax.swing.JTextField();
        dtf = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        detf = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        DSUB = new javax.swing.JButton();
        PSUB = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        Aidtf = new javax.swing.JTextField();
        AOKb = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        Antf = new javax.swing.JTextField();
        AGOb = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        Sidtf = new javax.swing.JTextField();
        SOKb = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        MPRIb = new javax.swing.JButton();
        idnap = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable(table1);
        jLabel23 = new javax.swing.JLabel();
        logp = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable(table2);
        jLabel24 = new javax.swing.JLabel();
        editb = new javax.swing.JButton();
        okb = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 153));
        setVisible(true);

        HospitalName.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        HospitalName.setText("     Hospital Entry");

        Pname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Pname.setText("Name               :");

        Pfname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Pfname.setText("Father's Name  :");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Mother's Name :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Address            :");


        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Mail Address     :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Contact No.     :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Date Of Birth    :");

        Pbdtf.setText("");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Age :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Married Status  :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Relegion :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("ID Number       :");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Doctor's Name :");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Date                :");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Desease Name :");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("Patient's Information");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("Doctor Information");

        DSUB.setToolTipText("Press for submit Doctor name,date,disease information.\n\nBy-MAWSK");
        DSUB.setFont(new Font("Tahoma", 3, 14)); // NOI18N
        DSUB.setText("SUBMIT");
        DSUB.setToolTipText("Press for submit Doctor information");
        DSUB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                try {
					DSUBActionPerformed(evt);
				} catch (SQLException e) {
					System.err.println(e);;
				}
            }
        });

        PSUB.setToolTipText("Press for patientinformation.\n\nBy-MAWSK");
        PSUB.setFont(new Font("Tahoma", 3, 14)); // NOI18N
        PSUB.setText("SUBMIT");
        PSUB.setToolTipText("Press for submit Patient information");
        PSUB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                try {
					PSUBActionPerformed(evt);
				} catch (SQLException e) {
					System.err.println(e);
				}
            }
        });
        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setText("Autofill Option ");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Enter ID No. :");

        AOKb.setToolTipText("Press for auto filling patient information.\n\nBy-MAWSK");
        AOKb.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        AOKb.setText("OK");
        AOKb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					AOKbActionPerformed(evt);
				} catch (SQLException e) {
					e.printStackTrace();
				}
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setText("Search for ID");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Enter Name :");

        AGOb.setToolTipText("Press for finding avobe name ID.\n\nBy-MAWSK");
        AGOb.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        AGOb.setText("GO");
        AGOb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					AGObActionPerformed(evt);
				} catch (SQLException e) {
					e.printStackTrace();
				}
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("Enter ID No. :");

        SOKb.setToolTipText("Press for view above id holder patient log.\n\nBy-MAWSK");
        SOKb.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        SOKb.setText("OK");
        SOKb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					SOKbActionPerformed(evt);
				} catch (SQLException e) {
					e.printStackTrace();
				}
            }
        });

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel22.setText("Search Patient's Log");

        MPRIb.setToolTipText("Press for print current information.\n\nBy-MAWSK");
        MPRIb.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        MPRIb.setText("PRINT");
        MPRIb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MPRIbActionPerformed(evt);
            }
        });

        idnap.setBorder(new javax.swing.border.MatteBorder(null));
        idnap.setPreferredSize(new java.awt.Dimension(300, 159));
        jScrollPane1.setViewportView(jTable1);
        javax.swing.GroupLayout idnapLayout = new javax.swing.GroupLayout(idnap);
        idnap.setLayout(idnapLayout);
        idnapLayout.setHorizontalGroup(
            idnapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
        );
        idnapLayout.setVerticalGroup(
            idnapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(idnapLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel23.setText("   ID NO. & Name");

        logp.setBorder(new javax.swing.border.MatteBorder(null));
        logp.setPreferredSize(new java.awt.Dimension(100, 100));
        jScrollPane2.setViewportView(jTable2);
        javax.swing.GroupLayout logpLayout = new javax.swing.GroupLayout(logp);
        logp.setLayout(logpLayout);
        logpLayout.setHorizontalGroup(
            logpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
        );
        logpLayout.setVerticalGroup(
            logpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
        );

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel24.setText("LOG");

        editb.setToolTipText("Press for entering new information.\n\nBy-MAWSK");
        editb.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        editb.setText("NEW");
        editb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editbActionPerformed(evt);
            }
        });

        okb.setToolTipText("Press after editing current information about patient except\npatientid.\n\nBy-MAWSK");
        okb.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        okb.setText("OK");
        okb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					okbActionPerformed(evt);
				} catch (SQLException e) {
					e.printStackTrace();
				}
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(detf, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(Padtf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                                                .addComponent(Pmntf, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(Pmatf)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(Pname)
                                                .addComponent(Pfname)
                                                .addComponent(jLabel4))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(Pntf, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                                                .addComponent(Pfntf)
                                                .addComponent(Pctf)))
                                        .addComponent(jLabel13)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGap(12, 12, 12)
                                            .addComponent(editb)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(okb)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(PSUB, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(DSUB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel5)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(Pbdtf, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(109, 109, 109)))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(Prtf, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(Patf, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Pmstf, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Pidtf, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel14)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(dntf, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(dtf, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(100, 100, 100)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(AGOb)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel18)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(Antf))
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(AOKb)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel15)
                                                        .addComponent(jLabel17)
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addComponent(jLabel16)
                                                            .addGap(18, 18, 18)
                                                            .addComponent(Aidtf, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                        .addGap(36, 36, 36)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel23)
                                            .addComponent(idnap, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(SOKb)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel19)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(Sidtf, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(jLabel22)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(91, 91, 91)
                                                .addComponent(MPRIb)))
                                        .addGap(28, 28, 28)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(29, 29, 29)
                                                .addComponent(jLabel24))
                                            .addComponent(logp, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(HospitalName, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(158, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(HospitalName, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel15)
                    .addComponent(jLabel23))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Pname)
                                .addComponent(Pntf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Aidtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Pfname)
                            .addComponent(Pfntf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AOKb))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(Pmntf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(Padtf, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(Pmatf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(Pctf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(Pbdtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Patf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(Pmstf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Prtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(Pidtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel18)
                                    .addComponent(Antf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AGOb)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel24))
                                .addGap(19, 19, 19))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(idnap, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Sidtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SOKb))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(PSUB, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(editb, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                                    .addComponent(okb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(17, 17, 17)
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(dntf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(dtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(detf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DSUB, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MPRIb)))
                    .addComponent(logp, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

private void AOKbActionPerformed(ActionEvent evt) throws SQLException {
	String id=Aidtf.getText();
	fill(id);
	dntf.setText(null);
	dtf.setText(null);
	detf.setText(null);
	PSUB.setEnabled(false);
	DSUB.setEnabled(true);
        
    }                                    

    private void AGObActionPerformed(ActionEvent evt) throws SQLException {
    	String name=Antf.getText() ;
    	table1. idnametable(name);
    	close();
        
    }                                    

    private void SOKbActionPerformed(ActionEvent evt) throws SQLException {
    	String id=Sidtf.getText();
    	table2. logtable(id);
    	dntf.setText(null);
    	dtf.setText(null);
    	detf.setText(null);
    	PSUB.setEnabled(false);
    	DSUB.setEnabled(false);
    	fill(id);
        
    }                                    

    private void MPRIbActionPerformed(ActionEvent evt) {                                      
        
    }                                     

    private void PSUBActionPerformed(ActionEvent evt) throws SQLException {
    	String n=Pntf.getText();
    	//System.out.println(n+"\n");
    	String fn=Pfntf.getText();
    	String mn=Pmntf.getText();
    	String ad=Padtf.getText();
    	String ma=Pmatf.getText();
    	String c=Pctf.getText();
    	String bd=Pbdtf.getText();
    	String a=Patf.getText();
    	String ms=Pmstf.getText();
    	String r=Prtf.getText();
    	String id=Pidtf.getText();
    	insertPI(n,fn,mn,ad,ma,c,bd,a,ms,r,id);
        
    }                                    

    private void DSUBActionPerformed(ActionEvent evt) throws SQLException {  
    	String id=Pidtf.getText();
    	String dn=dntf.getText();
    	String da=dtf.getText();
    	String de=detf.getText();
    	insertLOG(id,dn,da,de);
    	PSUB.setEnabled(true);
    }                                    

    private void editbActionPerformed(ActionEvent evt) {                                      
    	Pntf.setText(null);
    	Pfntf.setText(null);
    	Pmntf.setText(null);
    	Padtf.setText(null);
    	Pmatf.setText(null);
    	Pctf.setText(null);
    	Pbdtf.setText(null);
    	Patf.setText(null);
    	Pmstf.setText(null);
    	Prtf.setText(null);
    	Pidtf.setText(null);
    	dntf.setText(null);
    	dtf.setText(null);
    	detf.setText(null);
    	PSUB.setEnabled(true);
    	DSUB.setEnabled(true);
    }                                     

    private void okbActionPerformed(ActionEvent evt) throws SQLException {
    	String n=Pntf.getText();
    	PSUB.setEnabled(false);
    	String fn=Pfntf.getText();
    	String mn=Pmntf.getText();
    	String ad=Padtf.getText();
    	String ma=Pmatf.getText();
    	String c=Pctf.getText();
    	String bd=Pbdtf.getText();
    	String a=Patf.getText();
    	String ms=Pmstf.getText();
    	String r=Prtf.getText();
    	String id=Pidtf.getText();
    	updatepi(n, fn, mn, ad, ma, c, bd, a, ms, r, id);
        
    }  
    
    //For databage operation
    public void insertPI(String n, String fn, String mn, String ad, String ma, String c, String bd, String a, String ms, String r, String id) throws SQLException{
		System.out.println("\n"+n);
		try{
	                                      
	           connection =(Connection) DriverManager.getConnection( dbname, "root", "" );
	           statement = (Statement) connection.createStatement();
	           
	           System.out.println("hospitalentry connected");
	           statement.execute("INSERT INTO patientinfo VALUES ('"+n+"','"+fn+"','"+mn+"','"+ad+"','"+ma+"','"+c+"','"+bd+"','"+ms+"','"+id+"','"+a+"','"+r+"')");
	          statement.execute("INSERT INTO idname VALUES ('"+id+"','"+n+"')");
	          close();
	         }
	        catch(Exception e){
	        System.err.println(e);}
		
		}
	                

	public void insertLOG(String id, String dn, String da, String de) throws SQLException{
			try{
	                                        
	           connection =(Connection) DriverManager.getConnection( dbname, "root", "" );
	           statement = (Statement) connection.createStatement();
	          statement.execute("INSERT INTO patientlog VALUES ('"+id+"','"+dn+"','"+de+"','"+da+"')");
	          close();
	         }
	        catch(Exception e){
	        e.printStackTrace();}
			}
	
	 
	public void fill(String id) throws SQLException{
		try{
			connection =(Connection) DriverManager.getConnection( "jdbc:mysql://localhost/hospitalentry", "root", "" );
	        statement = (Statement) connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
		    resultset=statement.executeQuery("SELECT * FROM patientinfo WHERE ID='"+id+"'");
		while(resultset.next()){
			Pntf.setText(resultset.getString("Name"));
			Pfntf.setText(resultset.getString("FatherName"));
			Pmntf.setText(resultset.getString("MotherName"));
			Padtf.setText(resultset.getString("Address"));
			Pmatf.setText(resultset.getString("MailAddress"));
			Pctf.setText(resultset.getString("Contact"));
			Pmstf.setText(resultset.getString("MarriedStatus"));
			Patf.setText(resultset.getString("Age"));
			Pbdtf.setText(resultset.getString("BirthDate"));
			Pidtf.setText(resultset.getString("ID"));
			Prtf.setText(resultset.getString("Relegion"));
			
		}
		close();
		}
		catch(Exception e){
			System.err.println(e);
		}
		
		
	}
	
	public void updatepi(String n, String fn, String mn, String ad, String ma, String c, String bd, String a, String ms, String r, String id) throws SQLException{
		try{
            
	           connection =(Connection) DriverManager.getConnection( dbname, "root", "" );
	           statement = (Statement) connection.createStatement();
	           //System.out.println("hospitalentry connected");
	           statement.execute("UPDATE patientinfo SET Name='"+n+"',FatherName='"+fn+"',MotherName='"+mn+"',Address='"+ad+"',MailAddress='"+ma+"',Contact='"+c+"',BirthDate='"+bd+"',MarriedStatus='"+ms+"',Age='"+a+"',Relegion='"+r+"' WHERE ID='"+id+"'");
	          close();
	         }
	        catch(Exception e){
	        System.err.println(e);}
		
		
	}
	

	public void close() throws SQLException{
		if(resultset!=null)
            resultset.close();
		if(statement!=null)
			statement.close();
		if(connection!=null){
			connection.close();
			System.out.println("Disconnected");}
			
			
			
	}



    // Variables declaration - do not modify                     
    public javax.swing.JButton AGOb;
    public javax.swing.JButton AOKb;
    public javax.swing.JTextField Aidtf;
    public javax.swing.JTextField Antf;
    public javax.swing.JButton DSUB;
    public javax.swing.JLabel HospitalName;
    public javax.swing.JButton MPRIb;
    public javax.swing.JButton PSUB;
    public javax.swing.JTextField Padtf;
    public javax.swing.JTextField Patf;
    public javax.swing.JTextField Pbdtf;
    public javax.swing.JTextField Pctf;
    public javax.swing.JLabel Pfname;
    public javax.swing.JTextField Pfntf;
    public javax.swing.JTextField Pidtf;
    public javax.swing.JTextField Pmatf;
    public javax.swing.JTextField Pmntf;
    public javax.swing.JTextField Pmstf;
    public javax.swing.JLabel Pname;
    public javax.swing.JTextField Pntf;
    public javax.swing.JTextField Prtf;
    public javax.swing.JButton SOKb;
    public javax.swing.JTextField Sidtf;
    public javax.swing.JTextField detf;
    public javax.swing.JTextField dntf;
    public javax.swing.JTextField dtf;
    public javax.swing.JButton editb;
    public javax.swing.JPanel idnap;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel10;
    public javax.swing.JLabel jLabel11;
    public javax.swing.JLabel jLabel12;
    public javax.swing.JLabel jLabel13;
    public javax.swing.JLabel jLabel14;
    public javax.swing.JLabel jLabel15;
    public javax.swing.JLabel jLabel16;
    public javax.swing.JLabel jLabel17;
    public javax.swing.JLabel jLabel18;
    public javax.swing.JLabel jLabel19;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel22;
    public javax.swing.JLabel jLabel23;
    public javax.swing.JLabel jLabel24;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    public javax.swing.JLabel jLabel8;
    public javax.swing.JLabel jLabel9;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTable jTable1;
    public javax.swing.JTable jTable2;
    public javax.swing.JPanel logp;
    public javax.swing.JButton okb;
    public ResultSetTable table1=new ResultSetTable("SELECT * FROM idname");
    public ResultSetTable table2=new ResultSetTable("SELECT * FROM patientlog");
    // End of variables declaration                   
}
