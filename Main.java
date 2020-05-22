//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager.LookAndFeelInfo;

public class Main extends JFrame {
    int nn = 0;
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JLabel jLabel1;
    private JLabel jLabel10;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JPasswordField jPasswordField1;
    private JPasswordField jPasswordField2;
    private JScrollPane jScrollPane1;
    private JScrollPane jScrollPane2;
    private JTextArea jTextArea1;
    private JTextArea jTextArea2;
    private JTextField jTextField1;
    private JTextField jTextField2;
    private JTextField jTextField3;
    private JTextField jTextField4;

    public Main() {
        this.initComponents();
    }

    private void initComponents() {
        this.jTextField1 = new JTextField();
        this.jPasswordField1 = new JPasswordField();
        this.jTextField2 = new JTextField();
        this.jPasswordField2 = new JPasswordField();
        this.jLabel1 = new JLabel();
        this.jLabel2 = new JLabel();
        this.jLabel3 = new JLabel();
        this.jLabel4 = new JLabel();
        this.jTextField3 = new JTextField();
        this.jButton2 = new JButton();
        this.jTextField4 = new JTextField();
        this.jButton3 = new JButton();
        this.jLabel5 = new JLabel();
        this.jLabel6 = new JLabel();
        this.jLabel7 = new JLabel();
        this.jScrollPane1 = new JScrollPane();
        this.jTextArea1 = new JTextArea();
        this.jLabel8 = new JLabel();
        this.jLabel9 = new JLabel();
        this.jLabel10 = new JLabel();
        this.jScrollPane2 = new JScrollPane();
        this.jTextArea2 = new JTextArea();
        this.jButton1 = new JButton();
        this.setDefaultCloseOperation(3);
        this.jPasswordField1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Main.this.jPasswordField1ActionPerformed(evt);
            }
        });
        this.jLabel1.setText("Name1");
        this.jLabel2.setText("Name2");
        this.jLabel3.setText("Number");
        this.jLabel4.setText("Number");
        this.jButton2.setText("OK");
        this.jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Main.this.jButton2ActionPerformed(evt);
            }
        });
        this.jButton3.setText("OK");
        this.jButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Main.this.jButton3ActionPerformed(evt);
            }
        });
        this.jLabel5.setText("бык");
        this.jLabel6.setText("    итерация");
        this.jLabel7.setText("корова");
        this.jTextArea1.setColumns(20);
        this.jTextArea1.setRows(5);
        this.jScrollPane1.setViewportView(this.jTextArea1);
        this.jLabel8.setText("бык");
        this.jLabel9.setText("    итерация");
        this.jLabel10.setText("корова");
        this.jTextArea2.setColumns(20);
        this.jTextArea2.setRows(5);
        this.jScrollPane2.setViewportView(this.jTextArea2);
        this.jButton1.setText("Start again");
        this.jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Main.this.jButton1ActionPerformed(evt);
            }
        });
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(112, 112, 112).addGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.jLabel1, -2, 58, -2).addComponent(this.jLabel3)).addGap(27, 27, 27).addGroup(layout.createParallelGroup(Alignment.LEADING, false).addComponent(this.jPasswordField1).addComponent(this.jTextField1, -2, 82, -2))).addGroup(layout.createSequentialGroup().addComponent(this.jTextField3, -2, 91, -2).addPreferredGap(ComponentPlacement.UNRELATED).addComponent(this.jButton2, -2, 52, -2).addGap(26, 26, 26).addComponent(this.jButton1))).addGap(0, 0, 32767)).addGroup(Alignment.TRAILING, layout.createSequentialGroup().addContainerGap(-1, 32767).addGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING, layout.createSequentialGroup().addGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.jTextField4, -2, 91, -2).addComponent(this.jLabel9, -2, 100, -2)).addPreferredGap(ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.jButton3, -2, 52, -2).addGroup(layout.createSequentialGroup().addComponent(this.jLabel8, -2, 31, -2).addGap(29, 29, 29).addComponent(this.jLabel10, -2, 51, -2)))).addGroup(Alignment.TRAILING, layout.createSequentialGroup().addGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.jLabel2, -2, 57, -2).addComponent(this.jLabel4)).addPreferredGap(ComponentPlacement.UNRELATED).addGroup(layout.createParallelGroup(Alignment.LEADING, false).addComponent(this.jPasswordField2).addComponent(this.jTextField2, -2, 82, -2)).addGap(59, 59, 59))))).addGap(58, 58, 58)).addGroup(layout.createSequentialGroup().addGap(65, 65, 65).addGroup(layout.createParallelGroup(Alignment.TRAILING).addComponent(this.jScrollPane1, -2, 244, -2).addGroup(layout.createSequentialGroup().addComponent(this.jLabel5, -2, 31, -2).addPreferredGap(ComponentPlacement.UNRELATED).addComponent(this.jLabel7, -2, 51, -2))).addPreferredGap(ComponentPlacement.RELATED, 79, 32767).addComponent(this.jScrollPane2, -2, 244, -2).addGap(60, 60, 60)).addGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(94, 94, 94).addComponent(this.jLabel6, -2, 100, -2).addContainerGap(498, 32767))));
        layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(37, 37, 37).addGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jTextField2, -2, -1, -2).addComponent(this.jLabel2)).addPreferredGap(ComponentPlacement.UNRELATED).addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jPasswordField2, -2, -1, -2).addComponent(this.jLabel4))).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jTextField1, -2, -1, -2).addComponent(this.jLabel1)).addPreferredGap(ComponentPlacement.UNRELATED).addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jPasswordField1, -2, -1, -2).addComponent(this.jLabel3)))).addGap(28, 28, 28).addGroup(layout.createParallelGroup(Alignment.TRAILING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jTextField3, -2, -1, -2).addComponent(this.jButton2).addComponent(this.jTextField4, -2, -1, -2).addComponent(this.jButton3).addComponent(this.jButton1)).addGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(37, 37, 37).addComponent(this.jLabel5, -2, 24, -2)).addGroup(Alignment.TRAILING, layout.createSequentialGroup().addPreferredGap(ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jLabel10, -2, 24, -2).addComponent(this.jLabel8, -2, 24, -2).addComponent(this.jLabel9, -2, 24, -2))))).addComponent(this.jLabel7, -2, 24, -2)).addPreferredGap(ComponentPlacement.UNRELATED).addGroup(layout.createParallelGroup(Alignment.TRAILING).addComponent(this.jScrollPane1, -2, 156, -2).addComponent(this.jScrollPane2, -2, 156, -2)).addContainerGap(22, 32767)).addGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING, layout.createSequentialGroup().addContainerGap(196, 32767).addComponent(this.jLabel6, -2, 24, -2).addGap(189, 189, 189))));
        this.pack();
    }

    private void jPasswordField1ActionPerformed(ActionEvent evt) {
    }

    private void jButton2ActionPerformed(ActionEvent evt) {
        char[] a = this.jPasswordField1.getPassword();
        String c = this.jTextField3.getText();
        char[] h = c.toCharArray();
        int k = 0;

        int t;
        for(t = 0; t < 4; ++t) {
            if (a[t] == h[t]) {
                ++k;
            }
        }

        t = 0;

        for(int i = 0; i < 4; ++i) {
            for(int j = 0; j < 4; ++j) {
                if (a[i] == h[j]) {
                    ++t;
                }
            }
        }

        t -= k;
        char kk = (char)(k + 48);
        String kkk = "";
        kkk = kkk + kk;
        char tt = (char)(t + 48);
        String ttt = "";
        ttt = ttt + tt;
        this.jTextArea1.setText(this.jTextArea1.getText() + "           " + c + "  \t               " + kkk + "            " + ttt + "\n");
        this.jTextField3.setText("");
        if (k == 4) {
            this.jTextArea1.setText(this.jTextArea1.getText() + "\n\n\tWIN  " + this.jTextField2.getText() + " ! ! ! ");
        }

    }

    private void jButton3ActionPerformed(ActionEvent evt) {
        char[] a = this.jPasswordField2.getPassword();
        String c = this.jTextField4.getText();
        char[] h = c.toCharArray();
        int k = 0;

        int t;
        for(t = 0; t < 4; ++t) {
            if (a[t] == h[t]) {
                ++k;
            }
        }

        t = 0;

        for(int i = 0; i < 4; ++i) {
            for(int j = 0; j < 4; ++j) {
                if (a[i] == h[j]) {
                    ++t;
                }
            }
        }

        t -= k;
        char kk = (char)(k + 48);
        String kkk = "";
        kkk = kkk + kk;
        char tt = (char)(t + 48);
        String ttt = "";
        ttt = ttt + tt;
        this.jTextArea2.setText(this.jTextArea2.getText() + "           " + c + "  \t               " + kkk + "            " + ttt + "\n");
        this.jTextField4.setText("");
        if (k == 4) {
            this.jTextArea2.setText(this.jTextArea2.getText() + "\n\n\tWIN  " + this.jTextField1.getText() + " ! ! ! ");
        }

    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        this.jTextArea1.setText((String)null);
        this.jTextArea2.setText((String)null);
        this.jTextField1.setText((String)null);
        this.jTextField2.setText((String)null);
        this.jTextField3.setText((String)null);
        this.jTextField4.setText((String)null);
        this.jButton2.setVisible(true);
        this.jTextField3.setVisible(true);
        this.jButton3.setVisible(true);
        this.jTextField4.setVisible(true);
        this.jButton1.setVisible(true);
        this.jPasswordField1.setText((String)null);
        this.jPasswordField2.setText((String)null);
    }

    public static void main(String[] args) {
        try {
            LookAndFeelInfo[] var1 = UIManager.getInstalledLookAndFeels();
            int var2 = var1.length;

            for(int var3 = 0; var3 < var2; ++var3) {
                LookAndFeelInfo info = var1[var3];
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException var5) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, (String)null, var5);
        } catch (InstantiationException var6) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, (String)null, var6);
        } catch (IllegalAccessException var7) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, (String)null, var7);
        } catch (UnsupportedLookAndFeelException var8) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, (String)null, var8);
        }

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                (new NewJFrame()).setVisible(true);
            }
        });
    }
}
