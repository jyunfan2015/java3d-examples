/*
 * Copyright (c) 2016 JogAmp Community. All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 * 
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 * 
 * The views and conclusions contained in the software and documentation are those
 * of the authors and should not be interpreted as representing official policies,
 * either expressed or implied, of the JogAmp Community.
 *
 */

package org.jdesktop.j3d.examples.depth_func;

import org.jogamp.java3d.RenderingAttributes;


/**
 *The goal of that example is to show the use of different ZBuffer comparison modes.
 */
public class DepthFuncTestGL2ES2 extends javax.swing.JFrame
{
    
    RenderFrameGL2ES2 rf;
    
    /**
     * Creates new form DepthFuncTest
     */
    public DepthFuncTestGL2ES2(){
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents()
    {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        normalComboBox = new javax.swing.JComboBox();
        wfCheckBox = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        shadedComboBox = new javax.swing.JComboBox();
        shadedCheckBox = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        rotatingComboBox = new javax.swing.JComboBox();

        getContentPane().setLayout(new java.awt.GridBagLayout());

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jPanel1.setBorder(new javax.swing.border.TitledBorder("WireFrame Object"));
        jLabel1.setFont(new java.awt.Font("Dialog", 0, 12));
        jLabel1.setText("Depth function");
        jLabel1.setToolTipText("Mode for normal object");
        jPanel1.add(jLabel1);
        jLabel1.getAccessibleContext().setAccessibleParent(shadedComboBox);

        normalComboBox.setFont(new java.awt.Font("Dialog", 0, 12));
        normalComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ALWAYS", "NEVER", "EQUAL", "NOT_EQUAL", "LESS", "LESS_OR_EQUAL", "GREATER", "GREATER_OR_EQUAL" }));
        normalComboBox.setSelectedIndex(6);
        normalComboBox.setPreferredSize(new java.awt.Dimension(150, 22));
        normalComboBox.addActionListener(new java.awt.event.ActionListener()
        {
            @Override
			public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                normalComboBoxActionPerformed(evt);
            }
        });

        jPanel1.add(normalComboBox);

        wfCheckBox.setFont(new java.awt.Font("Dialog", 0, 12));
        wfCheckBox.setText("Write Depth Buffer");
        wfCheckBox.setToolTipText("Depth will be written for the object, if selected");
        wfCheckBox.addActionListener(new java.awt.event.ActionListener()
        {
            @Override
			public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                wfCheckBoxActionPerformed(evt);
            }
        });

        jPanel1.add(wfCheckBox);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(jPanel1, gridBagConstraints);

        jPanel2.setBorder(new javax.swing.border.TitledBorder("Shaded Object"));
        jLabel3.setFont(new java.awt.Font("Dialog", 0, 12));
        jLabel3.setText("Depth Function");
        jLabel3.setToolTipText("Mode of shaded object");
        jPanel2.add(jLabel3);

        shadedComboBox.setFont(new java.awt.Font("Dialog", 0, 12));
        shadedComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ALWAYS", "NEVER", "EQUAL", "NOT_EQUAL", "LESS", "LESS_OR_EQUAL", "GREATER", "GREATER_OR_EQUAL" }));
        shadedComboBox.setSelectedIndex(4);
        shadedComboBox.addActionListener(new java.awt.event.ActionListener()
        {
            @Override
			public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                shadedComboBoxActionPerformed(evt);
            }
        });

        jPanel2.add(shadedComboBox);

        shadedCheckBox.setFont(new java.awt.Font("Dialog", 0, 12));
        shadedCheckBox.setSelected(true);
        shadedCheckBox.setText("Write Depth Buffer");
        shadedCheckBox.setToolTipText("Depth will be written for the object, if selected");
        shadedCheckBox.addActionListener(new java.awt.event.ActionListener()
        {
            @Override
			public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                shadedCheckBoxActionPerformed(evt);
            }
        });

        jPanel2.add(shadedCheckBox);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(jPanel2, gridBagConstraints);

        jPanel3.setBorder(new javax.swing.border.TitledBorder("Rotating Cube"));
        jLabel4.setFont(new java.awt.Font("Dialog", 0, 12));
        jLabel4.setText("Raster Operator - Raster Ops are not availible in GL2ES2");
        jLabel4.setToolTipText("Raster mode of rotating object (try NOOP)");
        jPanel3.add(jLabel4);

        rotatingComboBox.setFont(new java.awt.Font("Dialog", 0, 12));
        rotatingComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CLEAR", "AND", "AND_REVERSE", "COPY", "AND_INVERTED", "NOOP", "XOR", "OR", "NOR", "EQUIV", "INVERT", "OR_REVERSE", "COPY_INVERTED", "OR_INVERTED", "NAND", "SET" }));
        rotatingComboBox.setSelectedIndex(3);
        rotatingComboBox.addActionListener(new java.awt.event.ActionListener()
        {
            @Override
			public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                rotatingComboBoxActionPerformed(evt);
            }
        });

      //Raster Ops are not availible in GL2ES2
        //jPanel3.add(rotatingComboBox);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(jPanel3, gridBagConstraints);

        setBounds(0, 0, 403, 240);
    }
    // </editor-fold>//GEN-END:initComponents

    private void rotatingComboBoxActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_rotatingComboBoxActionPerformed
    {//GEN-HEADEREND:event_rotatingComboBoxActionPerformed
        String selectedItem = rotatingComboBox.getSelectedItem().toString();  // how to avoid a cast and all that goes with it. (lazyness)
        int mode = RenderingAttributes.ROP_COPY;
        if ( "CLEAR".equals(selectedItem) )
        {
            mode = RenderingAttributes.ROP_CLEAR;
        }
        else if ( "AND".equals(selectedItem) )
        {
            mode = RenderingAttributes.ROP_AND;
        }
        else if ( "AND_REVERSE".equals(selectedItem) )
        {
            mode = RenderingAttributes.ROP_AND_REVERSE;
        }
        else if ( "COPY".equals(selectedItem) )
        {
            mode = RenderingAttributes.ROP_COPY;
        }
        else if ( "AND_INVERTED".equals(selectedItem) )
        {
            mode = RenderingAttributes.ROP_AND_INVERTED;
        }
        else if ( "NOOP".equals(selectedItem) )
        {
            mode = RenderingAttributes.ROP_NOOP;
        }
        else if ( "XOR".equals(selectedItem) )
        {
            mode = RenderingAttributes.ROP_XOR;
        }
        else if ( "OR".equals(selectedItem) )
        {
            mode = RenderingAttributes.ROP_OR;
        }
        else if ( "NOR".equals(selectedItem) )
        {
            mode = RenderingAttributes.ROP_NOR;
        }
        else if ( "EQUIV".equals(selectedItem) )
        {
            mode = RenderingAttributes.ROP_EQUIV;
        }
        else if ( "INVERT".equals(selectedItem) )
        {
            mode = RenderingAttributes.ROP_INVERT;
        }
        else if ( "OR_REVERSE".equals(selectedItem) )
        {
            mode = RenderingAttributes.ROP_OR_REVERSE;
        }
        else if ( "COPY_INVERTED".equals(selectedItem) )
        {
            mode = RenderingAttributes.ROP_COPY_INVERTED;
        }
        else if ( "OR_INVERTED".equals(selectedItem) )
        {
            mode = RenderingAttributes.ROP_OR_INVERTED;
        }
        else if ( "NAND".equals(selectedItem) )
        {
            mode = RenderingAttributes.ROP_NAND;
        }
        else if ( "SET".equals(selectedItem) )
        {
            mode = RenderingAttributes.ROP_SET;
        }
        else
        {
            System.out.println("oops. wrong mode in ROP combo: "+selectedItem);
        }

        rf.setRotatingObjectROPMode( mode );
    }//GEN-LAST:event_rotatingComboBoxActionPerformed

    private void shadedCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shadedCheckBoxActionPerformed
        rf.setStaticObjectDBWriteStatus( shadedCheckBox.isSelected() );
    }//GEN-LAST:event_shadedCheckBoxActionPerformed

    private void wfCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wfCheckBoxActionPerformed
        rf.setStaticWFObjectDBWriteStatus( wfCheckBox.isSelected() );
    }//GEN-LAST:event_wfCheckBoxActionPerformed

    private void shadedComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shadedComboBoxActionPerformed
        //int func = RenderingAttributes.LESS_OR_EQUAL;
        String selectedItem = shadedComboBox.getSelectedItem().toString();  // how to avoid a cast and all that goes with it. (lazyness)
        rf.setStaticObjectTestFunc( getID( selectedItem ) );
    }//GEN-LAST:event_shadedComboBoxActionPerformed

    private void normalComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_normalComboBoxActionPerformed
        //int func = RenderingAttributes.LESS_OR_EQUAL;
        String selectedItem = normalComboBox.getSelectedItem().toString();  // how to avoid a cast and all that goes with it. (lazyness)
        rf.setStaticWFObjectTestFunc( getID( selectedItem ) );
    }//GEN-LAST:event_normalComboBoxActionPerformed

    int getID( String selectedItem ) 
    {
      int func = RenderingAttributes.LESS_OR_EQUAL;
      if ( "LESS_OR_EQUAL".equals(selectedItem) )
      {
          func = RenderingAttributes.LESS_OR_EQUAL;
      }
      else if ( "NEVER".equals(selectedItem) )
      {
          func = RenderingAttributes.NEVER;
      }
      else if ( "ALWAYS".equals(selectedItem) )
      {
          func = RenderingAttributes.ALWAYS;
      }
      else if ( "GREATER".equals(selectedItem) )
      {
          func = RenderingAttributes.GREATER;
      }
      else if ( "GREATER_OR_EQUAL".equals(selectedItem) )
      {
          func = RenderingAttributes.GREATER_OR_EQUAL;
      }
      else if ( "LESS".equals(selectedItem) )
      {
          func = RenderingAttributes.LESS;
      }
      else if ( "EQUAL".equals(selectedItem) )
      {
          func = RenderingAttributes.EQUAL;
      }
      else if ( "NOT_EQUAL".equals(selectedItem) )
      {
          func = RenderingAttributes.NOT_EQUAL;
      }
      return func;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {System.setProperty("sun.awt.noerasebackground", "true"); 
    System.setProperty("j3d.rend", "jogl2es2");
	System.setProperty("j3d.displaylist", "false");
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
			public void run() {
                DepthFuncTestGL2ES2 dpt = new DepthFuncTestGL2ES2();
                dpt.rf = new RenderFrameGL2ES2( dpt );
                dpt.setVisible(true);
                dpt.rf.setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JComboBox<?> normalComboBox;
    private javax.swing.JComboBox<?> rotatingComboBox;
    private javax.swing.JCheckBox shadedCheckBox;
    private javax.swing.JComboBox<?> shadedComboBox;
    private javax.swing.JCheckBox wfCheckBox;
    // End of variables declaration//GEN-END:variables
    
}
