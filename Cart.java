/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlineshopping;

/**
 *
 * @author hp
 */

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chandrasekar
 */
public class Cart extends javax.swing.JFrame {
   // Clothing clothes=new Clothing();
    Payment pay=new Payment();
    
    public boolean check()
    {
                DefaultTableModel model =(DefaultTableModel) t1.getModel();
                for (int i=0;i<model.getRowCount();i++)
                {
                    if((int)model.getValueAt(i,2)<(int)model.getValueAt(i,3))
               {
                  JOptionPane.showMessageDialog(this,"We dont have enough of "+(String)model.getValueAt(i,0)+" in Stock \n Please Reduce the quantity");
               return false;
                                     
                      }}
                return true;
                
    }
    
    public void showc()
    {
        setVisible(true);

    }
    
    @SuppressWarnings("empty-statement")
    public void addTo(String name,double cost,int stock)
    {
        Object[] data={name,cost,stock,0};
        DefaultTableModel model =(DefaultTableModel) t1.getModel();
        
        Object[] row ={data[0],data[1],data[2],data[3]};
        
        model.addRow(row);
       
        
    }
   
    /**
     * Creates new form Cart
     */
    public Cart() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        t1 = new javax.swing.JTable();
        tf1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        t1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Name", "Cost ", "No in Stock", "Quantity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        t1.setInheritsPopupMenu(true);
        t1.setNextFocusableComponent(jButton1);
        t1.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                t1ComponentAdded(evt);
            }
        });
        t1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                t1MouseExited(evt);
            }
        });
        t1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t1KeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(t1);

        tf1.setEditable(false);
        tf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf1ActionPerformed(evt);
            }
        });

        jButton1.setText("Total");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Proceed to Payment");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Shop More ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 22, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jButton1)
                        .addGap(88, 88, 88)
                        .addComponent(tf1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jButton3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void tf1ActionPerformed(java.awt.event.ActionEvent evt) {                                    
           
    // TODO add your handling code here:
    }                                   

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
        DefaultTableModel model =(DefaultTableModel) t1.getModel();
           int i =0;
           double total=0;
           for (i=0;i<(int)model.getRowCount();i++)
           {
               if((int)model.getValueAt(i,2)>(int)model.getValueAt(i,3))
               {
               double cost=(double)model.getValueAt(i,1);
               int quant=(int)model.getValueAt(i,2);
               double temp=quant*cost;
               total+=temp;
               }
               else
               {
                   JOptionPane.showMessageDialog(this,"We dont have enough of "+(String)model.getValueAt(i,0)+" in Stock \n Please Reduce the quantity");
               }
           }
           tf1.setText(String.valueOf(total)); 
           
           
// TODO add your handling code here:
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
if (check()){
        DefaultTableModel model =(DefaultTableModel) t1.getModel();
   
 double cost =Double.parseDouble(tf1.getText());
if(cost>0){
    
    pay.payment(cost);
    pay.setVisible(true);
    String []items = new String[model.getRowCount()];
    int quant []=new int [model.getRowCount()];
    for (int i=0;i<model.getRowCount();i++){
    items [i]=(String)model.getValueAt(i,0);
    quant[i]=(int)model.getValueAt(i,3);
    
     }
        try {
            pay.invoice(items, quant, cost);
        } catch (IOException ex) {
            Logger.getLogger(Cart.class.getName()).log(Level.SEVERE, null, ex);
        }
    dispose();
}else{
    JOptionPane.showMessageDialog(this,"Total cannot be Zero \n Please Enter a Quanity more than 0");
}
}

// TODO add your handling code here:
    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         

dispose();

// TODO add your handling code here:
    }                                        

    private void t1KeyPressed(java.awt.event.KeyEvent evt) {                              
  
jButton1.setSelected(true);
DefaultTableModel model =(DefaultTableModel) t1.getModel();
           int i =0;
           double total=0;
           for (i=0;i<(int)model.getRowCount();i++)
           {
               double cost=(double)model.getValueAt(i,1);
               int quant=(int)model.getValueAt(i,3);
               double temp=quant*cost;
               total+=temp;

           }
           tf1.setText(String.valueOf(total)); 
// TODO add your handling code here:
    }                             

    private void t1KeyTyped(java.awt.event.KeyEvent evt) {                            
      jButton1.setSelected(true); 
      DefaultTableModel model =(DefaultTableModel) t1.getModel();
           int i =0;
           double total=0;
           for (i=0;i<(int)model.getRowCount();i++)
           {
               double cost=(double)model.getValueAt(i,1);
               int quant=(int)model.getValueAt(i,3);
               double temp=quant*cost;
               total+=temp;

           }
           tf1.setText(String.valueOf(total)); // TODO add your handling code here:
    }                           

    private void t1ComponentAdded(java.awt.event.ContainerEvent evt) {                                  
   jButton1.setSelected(true); 
   DefaultTableModel model =(DefaultTableModel) t1.getModel();
           int i =0;
           double total=0;
           for (i=0;i<(int)model.getRowCount();i++)
           {
               double cost=(double)model.getValueAt(i,1);
               int quant=(int)model.getValueAt(i,3);
               double temp=quant*cost;
               total+=temp;

           }
           tf1.setText(String.valueOf(total)); // TODO add your handling code here:
    }                                 

    private void t1MouseExited(java.awt.event.MouseEvent evt) {                               
    jButton1.setSelected(true); 
    DefaultTableModel model =(DefaultTableModel) t1.getModel();
           int i =0;
           double total=0;
           for (i=0;i<(int)model.getRowCount();i++)
           {
               double cost=(double)model.getValueAt(i,1);
               int quant=(int)model.getValueAt(i,3);
               double temp=quant*cost;
               total+=temp;

           }
           tf1.setText(String.valueOf(total)); // TODO add your handling code here:
    }                              

    private void t1KeyReleased(java.awt.event.KeyEvent evt) {                               
     DefaultTableModel model =(DefaultTableModel) t1.getModel();
           int i =0;
           double total=0;
           for (i=0;i<(int)model.getRowCount();i++)
           {
               double cost=(double)model.getValueAt(i,1);
               int quant=(int)model.getValueAt(i,3);
               double temp=quant*cost;
               total+=temp;

           }
           tf1.setText(String.valueOf(total));    // TODO add your handling code here:
    }                              

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cart().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable t1;
    private javax.swing.JTextField tf1;
    // End of variables declaration                   
}
