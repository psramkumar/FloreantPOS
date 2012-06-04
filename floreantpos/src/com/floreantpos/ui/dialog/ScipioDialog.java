//-AE-

package com.floreantpos.ui.dialog;

import java.text.ParseException;
import javax.swing.text.MaskFormatter;

import com.floreantpos.PosException;
import com.floreantpos.main.Application;
import com.floreantpos.model.ScipioInfo;
import com.floreantpos.model.Ticket;

/**
 *
 * @author Aaron Evans <aarone@one-shore.com>
 */
public class ScipioDialog extends POSDialog {

    private Ticket ticket;
    private ScipioInfo scipioInfo;
			
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.floreantpos.swing.PosButton btnCancel;
    private com.floreantpos.swing.PosButton btnOk;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblPIN;
    private javax.swing.JLabel lblTEI;
    private com.floreantpos.ui.views.NumberSelectionView numberSelectionView;
    private com.floreantpos.ui.TitlePanel titlePanel1;
    private javax.swing.JFormattedTextField txtPIN;
    private javax.swing.JFormattedTextField txtTEI;
    // End of variables declaration//GEN-END:variables
	
    MaskFormatter teiFormatter = null;
    MaskFormatter pinFormatter = null;
    
	
	
	/**
	 * Creates new form ScipioDialog
	 */
	public ScipioDialog() {
		super(Application.getPosWindow(), true, false);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
	
        try {
		teiFormatter = new MaskFormatter("#####");
		pinFormatter = new MaskFormatter("####");
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
        
		initComponents();
		setResizable(false);
		pack();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        titlePanel1 = new com.floreantpos.ui.TitlePanel();
        btnCancel = new com.floreantpos.swing.PosButton();
        btnOk = new com.floreantpos.swing.PosButton();
        numberSelectionView = new com.floreantpos.ui.views.NumberSelectionView();
        lblTEI = new javax.swing.JLabel();
        lblPIN = new javax.swing.JLabel();
        txtTEI = new javax.swing.JFormattedTextField();
        txtPIN = new javax.swing.JFormattedTextField();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SCIPIO INFORMATION");

        titlePanel1.setTitle("SCIPIO INFORMATION");

        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancel_32.png"))); // NOI18N
        btnCancel.setText("CANCEL");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCanceldoCancel(evt);
            }
        });

        btnOk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/finish_32.png"))); // NOI18N
        btnOk.setText("OK");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkdoOk(evt);
            }
        });

        numberSelectionView.setBorder(null);

        lblTEI.setText("TEI:");
        lblTEI.setMaximumSize(new java.awt.Dimension(32, 16));
        lblTEI.setMinimumSize(new java.awt.Dimension(16, 16));
        lblTEI.setPreferredSize(new java.awt.Dimension(32, 16));

        lblPIN.setText("PIN:");
        lblPIN.setMaximumSize(new java.awt.Dimension(32, 16));
        lblPIN.setMinimumSize(new java.awt.Dimension(16, 16));
        lblPIN.setPreferredSize(new java.awt.Dimension(32, 16));

        txtTEI.setMaximumSize(new java.awt.Dimension(250, 30));
        txtTEI.setMinimumSize(new java.awt.Dimension(24, 20));

        txtPIN.setMaximumSize(new java.awt.Dimension(250, 30));
        txtPIN.setMinimumSize(new java.awt.Dimension(24, 20));
        txtPIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPINActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titlePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(numberSelectionView, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTEI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTEI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lblPIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPIN, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(titlePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTEI, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTEI, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPIN, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPIN, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(numberSelectionView, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

	public void initData() throws Exception {
		scipioInfo = ticket.getScipioInfo();
		
		if (scipioInfo != null) { 
			txtPIN.setText(String.valueOf(scipioInfo.getPIN()));
			txtTEI.setText(String.valueOf(scipioInfo.getTEI()));
		}
	}

	// temporarily added to workaround Netbeans dialog code generation
	// TODO: edit to just use doOk
	private void btnOkdoOk(java.awt.event.ActionEvent evt) {
		doOk(evt);
	}
	private void doOk(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkdoOk
		try {
			if (scipioInfo == null) {
				scipioInfo = new ScipioInfo();
			}
			
			try {
				scipioInfo.setTEI(txtTEI.getText());
				scipioInfo.setPIN(txtPIN.getText());
				scipioInfo.setTicket(ticket);
			}
			catch (Exception e) {
				throw new PosException("Scipio info is not valid.\n" + e.getMessage());	
			}
				
			setCanceled(false);
			dispose();
		} catch (PosException e) {
			POSMessageDialog.showError(this, e.getMessage());
		}
	}//GEN-LAST:event_btnOkdoOk

	// temporarily added to workaround Netbeans dialog code generation
	// TODO: edit to just use doCancel
	private void btnCanceldoCancel(java.awt.event.ActionEvent evt) {
		doCancel(evt);
	}
	private void doCancel(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCanceldoCancel
		setCanceled(true);
		dispose();
	}//GEN-LAST:event_btnCanceldoCancel

	private void txtPINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPINActionPerformed
		// TODO add your handling code here:
	}//GEN-LAST:event_txtPINActionPerformed


	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
	
	public ScipioInfo getScipioInfo() {
		return scipioInfo;
	}
}
