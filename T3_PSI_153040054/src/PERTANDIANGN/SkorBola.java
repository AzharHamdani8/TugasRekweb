/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PERTANDIANGN;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class SkorBola extends javax.swing.JPanel {

    List<Tim> data = DataTim.getSoccerTeam();
    String tuanRumah = "";
    String penantang = "";

    /**
     * Creates new form SoccerTeamTable
     */
    public SkorBola() {
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

        homeCombo = new javax.swing.JComboBox<>();
        homescoreField = new javax.swing.JTextField();
        awayCombo = new javax.swing.JComboBox<>();
        awayscoreField = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        classmentTbl = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        homeCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tuan Rumah", "Barcelona", "Valencia", "Atlético Madrid", "Real Madrid", "Sevilla", "Villarreal", "Real Sociedad ", "Real Betis" }));
        homeCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                homeComboItemStateChanged(evt);
            }
        });

        awayCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Penantang", "Barcelona", "Valencia", "Atlético Madrid", "Real Madrid", "Sevilla", "Villarreal", "Real Sociedad ", "Real Betis" }));
        awayCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                awayComboItemStateChanged(evt);
            }
        });

        addBtn.setText("Tambah Data");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("Score :");

        jLabel2.setText("Score :");

        classmentTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ranking", "Nama Tim", "Pertandingan", "Menang", "Seri", "Kalah", "Poin"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        classmentTbl.setEnabled(false);
        jScrollPane1.setViewportView(classmentTbl);
        if (classmentTbl.getColumnModel().getColumnCount() > 0) {
            classmentTbl.getColumnModel().getColumn(0).setPreferredWidth(30);
            classmentTbl.getColumnModel().getColumn(1).setPreferredWidth(120);
        }
        classmentTbl.getAccessibleContext().setAccessibleName("");

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Demi", 2, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 255, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Skor Pertandingan Liga Santander");

        jLabel4.setFont(new java.awt.Font("NSimSun", 3, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("VS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(homeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(homescoreField, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(addBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(112, 112, 112)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(awayscoreField, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(awayCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(97, 97, 97))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(homeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(homescoreField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(awayCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(awayscoreField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        inputData();
        updateDataTable();
        resetField();
    }//GEN-LAST:event_addBtnActionPerformed

    private void awayComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_awayComboItemStateChanged
        boolean status = true;
        for (int i = 0; i < homeCombo.getItemCount(); i++) {
            if (awayCombo.getSelectedItem() == homeCombo.getItemAt(i)) {
                penantang = homeCombo.getItemAt(i);
                homeCombo.removeItemAt(i);
                status = false;
                break;
            } else if (awayCombo.getSelectedIndex() == 0) {
                status = false;
                break;
            }
        }

        if (status) {
            homeCombo.addItem(penantang);
        }
    }//GEN-LAST:event_awayComboItemStateChanged

    private void homeComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_homeComboItemStateChanged
        boolean status = true;
        for (int i = 0; i < awayCombo.getItemCount(); i++) {
            if (homeCombo.getSelectedItem() == awayCombo.getItemAt(i)) {
                tuanRumah = awayCombo.getItemAt(i);
                awayCombo.removeItemAt(i);
                status = false;
                break;
            } else if (homeCombo.getSelectedIndex() == 0) {
                status = false;
                break;
            }
        }

        if (status) {
            awayCombo.addItem(tuanRumah);
        }
    }//GEN-LAST:event_homeComboItemStateChanged

    public void resetField() {
        
        homescoreField.setText("");
        awayscoreField.setText("");
        homeCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Tuan Rumah", "Barcelona", "Valencia", "Atlético Madrid", "Real Madrid", "Sevilla", "Villarreal", "Real Sociedad", "Real Betis"}));
        awayCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Penantang","Barcelona", "Valencia", "Atlético Madrid", "Real Madrid", "Sevilla", "Villarreal", "Real Sociedad", "Real Betis"}));
        homeCombo.setSelectedIndex(0);
        awayCombo.setSelectedIndex(0);
    }

    public void inputData() {

        try {
            if (homeCombo.getSelectedItem() == homeCombo.getItemAt(0) || awayCombo.getSelectedItem() == awayCombo.getItemAt(0)) {

                JOptionPane.showMessageDialog(null, "Please select different Team!");

            } else {

                int tempHomeScore = Integer.parseInt(homescoreField.getText());
                int tempAwayScore = Integer.parseInt(awayscoreField.getText());

                Tim stHomeTemp = new Tim();
                stHomeTemp.setNamaTim(homeCombo.getSelectedItem().toString());

                Tim stAwayTemp = new Tim();
                stAwayTemp.setNamaTim(awayCombo.getSelectedItem().toString());

                boolean existHome = true;
                boolean existAway = true;

                for (Tim st : data) {
                    if (homeCombo.getSelectedItem() == st.getNamaTim()) {
                        existHome = false;
                        break;
                    }
                }

                if (existHome) {
                    data.add(stHomeTemp);
                }

                for (Tim st : data) {
                    if (awayCombo.getSelectedItem() == st.getNamaTim()) {
                        existAway = false;
                        break;
                    }
                }

                if (existAway) {
                    data.add(stAwayTemp);
                }

                for (Tim st : data) {

                    if (homeCombo.getSelectedItem() == st.getNamaTim()) {

                        st.setGamePlay(st.getGamePlay() + 1);

                        if (tempHomeScore > tempAwayScore) {

                            st.setSkoMenang(st.getSkoMenang() + 1);
                            st.setPoinSementara(st.getPoinSementara() + 3);

                        } else if (tempHomeScore == tempAwayScore) {

                            st.setSokrSeri(st.getSokrSeri() + 1);
                            st.setPoinSementara(st.getPoinSementara() + 1);

                        } else if (tempHomeScore < tempAwayScore) {

                            st.setSkorKalah(st.getSkorKalah() + 1);

                        }

                    } else if (awayCombo.getSelectedItem() == st.getNamaTim()) {

                        st.setGamePlay(st.getGamePlay() + 1);

                        if (tempAwayScore > tempHomeScore) {

                            st.setSkoMenang(st.getSkoMenang() + 1);
                            st.setPoinSementara(st.getPoinSementara() + 3);

                        } else if (tempAwayScore == tempHomeScore) {

                            st.setSokrSeri(st.getSokrSeri() + 1);
                            st.setPoinSementara(st.getPoinSementara() + 1);

                        } else if (tempAwayScore < tempHomeScore) {

                            st.setSkorKalah(st.getSkorKalah() + 1);

                        }

                    }

                }

            }

        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(null, "Please input number only!");

        }
    }

    public void updateDataTable() {
        DefaultTableModel tableModel = (DefaultTableModel) classmentTbl.getModel();

        int rowCount = tableModel.getRowCount();

        for (int j = 0; j < rowCount; j++) {
            DefaultTableModel tblTemp = (DefaultTableModel) classmentTbl.getModel();
            tblTemp.removeRow(0);
        }

        int i = 1;

        rankSorting();

        for (Tim st : data) {

            tableModel.addRow(new Object[]{i, st.getNamaTim(), st.getGamePlay(), st.getSkoMenang(), st.getSokrSeri(), st.getSkorKalah(), st.getPoinSementara()});

            i++;
        }

    }

    public void rankSorting() {
        Tim temp = new Tim();

        int totalScore = 0;

        for (int j = 0; j < data.size(); j++) {
            for (int k = 1 + j; k < data.size(); k++) {
                if (data.get(k - 1).getPoinSementara() < data.get(k).getPoinSementara()) {
                    temp.setNamaTim(data.get(k).getNamaTim());
                    temp.setGamePlay(data.get(k).getGamePlay());
                    temp.setSkoMenang(data.get(k).getSkoMenang());
                    temp.setSokrSeri(data.get(k).getSokrSeri());
                    temp.setSkorKalah(data.get(k).getSkorKalah());
                    temp.setPoinSementara(data.get(k).getPoinSementara());

                    data.get(k).setNamaTim(data.get(k - 1).getNamaTim());
                    data.get(k).setGamePlay(data.get(k - 1).getGamePlay());
                    data.get(k).setSkoMenang(data.get(k - 1).getSkoMenang());
                    data.get(k).setSokrSeri(data.get(k - 1).getSokrSeri());
                    data.get(k).setSkorKalah(data.get(k - 1).getSkorKalah());
                    data.get(k).setPoinSementara(data.get(k - 1).getPoinSementara());

                    data.get(k - 1).setNamaTim(temp.getNamaTim());
                    data.get(k - 1).setGamePlay(temp.getGamePlay());
                    data.get(k - 1).setSkoMenang(temp.getSkoMenang());
                    data.get(k - 1).setSokrSeri(temp.getSokrSeri());
                    data.get(k - 1).setSkorKalah(temp.getSkorKalah());
                    data.get(k - 1).setPoinSementara(temp.getPoinSementara());
                }
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JComboBox<String> awayCombo;
    private javax.swing.JTextField awayscoreField;
    private javax.swing.JTable classmentTbl;
    private javax.swing.JComboBox<String> homeCombo;
    private javax.swing.JTextField homescoreField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
