//*****************************************************************************************************
//
//      File:               Groceries.java
//
//      Student:            Leon Krugliakov
//
//      Assignment:         Assignment #11
//
//      Course Name:        Java I
//
//      Course Number:      COSC 2050 - 01
//
//      Due:                April 24th, 2020
//
//
//      This is a program that allows the user to enter new items into a list
//      and then delete as well as clear the items from the grocery list.
//      The application validates that the user actually entered a value for 
//      the item input field as well as that the user actually made a selection
//      when trying to remove any items. If an error occures the application
//      presents an error message.
//
//      Other files required:
//
//*****************************************************************************************************

//package groceries;

//*****************************************************************************************************
import javax.swing.DefaultListModel;

//*****************************************************************************************************

public class Groceries extends javax.swing.JFrame 
{
    public Groceries() 
    {
        initComponents();
        this.setTitle("Groceries");
    }
    
    //*****************************************************************************************************
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        jLabel1 = new javax.swing.JLabel();
        itemInputField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        listScrollPane = new javax.swing.JScrollPane();
        groceryListPanel = new javax.swing.JList<>();
        addItemButton = new javax.swing.JButton();
        removeItemButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setLabelFor(itemInputField);
        jLabel1.setText("Item");

        itemInputField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        itemInputField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemInputFieldActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setLabelFor(listScrollPane);
        jLabel2.setText("List:");

        groceryListPanel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        listScrollPane.setViewportView(groceryListPanel);

        addItemButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        addItemButton.setText("Add");
        addItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addItemButtonActionPerformed(evt);
            }
        });

        removeItemButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        removeItemButton.setText("Remove");
        removeItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeItemButtonActionPerformed(evt);
            }
        });

        clearButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(listScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(itemInputField, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addComponent(addItemButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(clearButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(removeItemButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(itemInputField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addItemButton, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(listScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removeItemButton, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //*****************************************************************************************************
    
    private void itemInputFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemInputFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemInputFieldActionPerformed

    //*****************************************************************************************************
    
    private void addItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addItemButtonActionPerformed
        item = itemInputField.getText();
        
        if(item.equals(""))
        {
            jOptionPane1.showMessageDialog(this, "Please enter a value for item. It cannot be blank!",
                    "Invalid data", jOptionPane1.WARNING_MESSAGE);
        }
        else
        {
            groceryModel.addElement(item);
            groceryListPanel.setModel(groceryModel);
        }
    }//GEN-LAST:event_addItemButtonActionPerformed

    //*****************************************************************************************************
    
    private void removeItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeItemButtonActionPerformed
        int[] selectedIndices = groceryListPanel.getSelectedIndices();
        
        if(selectedIndices.length == 0)
        {
            jOptionPane1.showMessageDialog(this, "Please select at least one element from the list",
                    "Invalid selection", jOptionPane1.WARNING_MESSAGE);
        }
        else
        {
            
            for(int index : selectedIndices)
            {
                groceryModel.removeElementAt(index);
            }
            
        }
        
        
    }//GEN-LAST:event_removeItemButtonActionPerformed

    //*****************************************************************************************************
    
    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        groceryModel.clear();
    }//GEN-LAST:event_clearButtonActionPerformed

    //*****************************************************************************************************
    
    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new Groceries().setVisible(true);
                
            }
        });
    }

    //*****************************************************************************************************
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addItemButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JList<String> groceryListPanel;
    private javax.swing.JTextField itemInputField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JScrollPane listScrollPane;
    private javax.swing.JButton removeItemButton;
    // End of variables declaration//GEN-END:variables
    private String item;
    private DefaultListModel<String> groceryModel = new DefaultListModel<>();
}
