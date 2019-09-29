package interfazgrafica;

/**
 * Se importan todas las librerias a utilizar
 */
import javax.swing.*;
import estructuras_datos.LinkedList;
import java.awt.Cursor;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import estructuras_datos.Node;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import javax.swing.table.DefaultTableModel;

public class VentanaCircuito extends javax.swing.JFrame {

    /**
     * Se declaran algunas variables y se da ajustes a la ventana
     */
    private JLabel newOR, newAND, newNOR, newNAND, newXOR, newXNOR, newNOT, newLinea, newLineaV, newSalida;
    private JToggleButton newEntrada;
    private LinkedList Lista = new LinkedList();
    private static int entradas = 0;
    private static int salida = 1;
    private static int cont = 1;
    public VentanaCircuito() {
        initComponents();
        setLocationRelativeTo(null);
        dispose();
        setUndecorated(true);
    }
    @SuppressWarnings("unchecked")
    /**
     * En esta parte "NetBeans crea e inicializa todos los objetos del apartado diseño"
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Return = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jComboBox1 = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        OR = new javax.swing.JLabel();
        AND = new javax.swing.JLabel();
        NOR = new javax.swing.JLabel();
        NAND = new javax.swing.JLabel();
        XOR = new javax.swing.JLabel();
        XNOR = new javax.swing.JLabel();
        NOT = new javax.swing.JLabel();
        Linea = new javax.swing.JLabel();
        Entrada = new javax.swing.JToggleButton();
        LineaV = new javax.swing.JLabel();
        Salida = new javax.swing.JLabel();
        Tabla = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(89, 148, 148));

        jPanel1.setBackground(new java.awt.Color(89, 148, 148));

        Return.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Anterior.png"))); // NOI18N
        Return.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReturnMouseClicked(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jComboBox1.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Compuertas", "Prefabricados" }));
        jComboBox1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jPanel4.setForeground(new java.awt.Color(153, 255, 255));
        jPanel4.setLayout(null);

        OR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/OR.png"))); // NOI18N
        OR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ORMouseClicked(evt);
            }
        });
        jPanel4.add(OR);
        OR.setBounds(10, 20, 60, 35);

        AND.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/AND.png"))); // NOI18N
        AND.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ANDMouseClicked(evt);
            }
        });
        jPanel4.add(AND);
        AND.setBounds(80, 20, 60, 35);

        NOR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/NOR.png"))); // NOI18N
        NOR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NORMouseClicked(evt);
            }
        });
        jPanel4.add(NOR);
        NOR.setBounds(10, 80, 60, 35);

        NAND.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/NAND.png"))); // NOI18N
        NAND.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NANDMouseClicked(evt);
            }
        });
        jPanel4.add(NAND);
        NAND.setBounds(80, 80, 60, 35);

        XOR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/XOR.png"))); // NOI18N
        XOR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                XORMouseClicked(evt);
            }
        });
        jPanel4.add(XOR);
        XOR.setBounds(10, 140, 60, 35);

        XNOR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/XNOR.png"))); // NOI18N
        XNOR.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        XNOR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                XNORMouseClicked(evt);
            }
        });
        jPanel4.add(XNOR);
        XNOR.setBounds(80, 140, 60, 35);

        NOT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/NOT.png"))); // NOI18N
        NOT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NOTMouseClicked(evt);
            }
        });
        jPanel4.add(NOT);
        NOT.setBounds(10, 200, 60, 35);

        Linea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/linea.png"))); // NOI18N
        Linea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LineaMouseClicked(evt);
            }
        });
        jPanel4.add(Linea);
        Linea.setBounds(90, 210, 50, 10);

        Entrada.setBackground(new java.awt.Color(255, 255, 255));
        Entrada.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        Entrada.setText("0");
        Entrada.setEnabled(false);
        Entrada.setPreferredSize(new java.awt.Dimension(60, 35));
        Entrada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EntradaMouseClicked(evt);
            }
        });
        jPanel4.add(Entrada);
        Entrada.setBounds(10, 260, 60, 35);

        LineaV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LineaV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lineaV.png"))); // NOI18N
        LineaV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LineaVMouseClicked(evt);
            }
        });
        jPanel4.add(LineaV);
        LineaV.setBounds(110, 250, 10, 50);

        Salida.setBackground(new java.awt.Color(204, 204, 204));
        Salida.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        Salida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Salida.setText("Output");
        Salida.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        Salida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SalidaMouseClicked(evt);
            }
        });
        jPanel4.add(Salida);
        Salida.setBounds(50, 330, 60, 35);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox1, 0, 145, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)))
                        .addContainerGap())))
        );

        Tabla.setBackground(new java.awt.Color(102, 102, 102));
        Tabla.setFont(new java.awt.Font("Kristen ITC", 1, 10)); // NOI18N
        Tabla.setForeground(new java.awt.Color(0, 51, 51));
        Tabla.setText("Tabla");
        Tabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TablaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Return)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Tabla, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Return)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Tabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Se crea el evento para regresar a la ventana principal
     */
    private void ReturnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReturnMouseClicked
        VentanaPrincipal main = new VentanaPrincipal();
        main.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_ReturnMouseClicked

    /**
     * A partir de aca se crean los eventos de las compuertas, 
     * al hacer click sobre ellas, se muestra un duplicado.
     */
    private void ORMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ORMouseClicked
        newOR = new JLabel();
        newOR.setName("OR");
        this.CrearCompuertas(newOR, OR, "C:\\Users\\alvgo\\Documents\\NetBeansProjects\\Circuitos Logicos\\src\\imagenes\\OR.png");
    }//GEN-LAST:event_ORMouseClicked

    private void ANDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ANDMouseClicked
        newAND = new JLabel();
        newAND.setName("AND");
        this.CrearCompuertas(newAND, AND, "C:\\Users\\alvgo\\Documents\\NetBeansProjects\\Circuitos Logicos\\src\\imagenes\\AND.png");
    }//GEN-LAST:event_ANDMouseClicked

    private void NORMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NORMouseClicked
        newNOR = new JLabel();
        newNOR.setName("NOR");
        this.CrearCompuertas(newNOR, NOR, "C:\\Users\\alvgo\\Documents\\NetBeansProjects\\Circuitos Logicos\\src\\imagenes\\NOR.png");
    }//GEN-LAST:event_NORMouseClicked

    private void NANDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NANDMouseClicked
        newNAND = new JLabel();
        newNAND.setName("NAND");
        this.CrearCompuertas(newNAND, NAND, "C:\\Users\\alvgo\\Documents\\NetBeansProjects\\Circuitos Logicos\\src\\imagenes\\NAND.png");
    }//GEN-LAST:event_NANDMouseClicked

    private void XORMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XORMouseClicked
        newXOR = new JLabel();
        newXOR.setName("XOR");
        this.CrearCompuertas(newXOR, XOR, "C:\\Users\\alvgo\\Documents\\NetBeansProjects\\Circuitos Logicos\\src\\imagenes\\XOR.png");
    }//GEN-LAST:event_XORMouseClicked

    private void XNORMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XNORMouseClicked
        newXNOR = new JLabel();
        newXNOR.setName("XNOR");
        this.CrearCompuertas(newXNOR, XNOR, "C:\\Users\\alvgo\\Documents\\NetBeansProjects\\Circuitos Logicos\\src\\imagenes\\XNOR.png");
    }//GEN-LAST:event_XNORMouseClicked

    private void NOTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NOTMouseClicked
        newNOT = new JLabel();
        newNOT.setName("NOT");
        this.CrearCompuertas(newNOT, NOT, "C:\\Users\\alvgo\\Documents\\NetBeansProjects\\Circuitos Logicos\\src\\imagenes\\NOT.png");
    }//GEN-LAST:event_NOTMouseClicked

    private void EntradaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EntradaMouseClicked
        newEntrada = new JToggleButton("0", false);
        newEntrada.setName("i"+entradas);
        entradas++;
        jPanel2.add(newEntrada);
        newEntrada.setBounds(100, 100, Entrada.getWidth(), Entrada.getHeight());
        ArrastraMouse(newEntrada);
        setEntradas(newEntrada);
        Lista.insertFirst(newEntrada.getName(), 100, 100, newEntrada.getWidth(), newEntrada.getHeight(), newEntrada);
    }//GEN-LAST:event_EntradaMouseClicked

    private void LineaVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LineaVMouseClicked
        newLineaV = new JLabel();
        newLineaV.setName("Vertical");
        this.CrearCompuertas(newLineaV, LineaV, "C:\\Users\\alvgo\\Documents\\NetBeansProjects\\Circuitos Logicos\\src\\imagenes\\lineaV.png");
        newLineaV.addMouseMotionListener(new MouseAdapter() {
            public void mouseMoved(MouseEvent e){
                newLineaV.setCursor(new Cursor(MOVE_CURSOR));
                updateC(newLineaV);
            }
        });
        jPanel2.addMouseMotionListener(new MouseAdapter() {
            public void mouseDragged(MouseEvent evt3){
                newLineaV.setSize(newLineaV.getWidth(), evt3.getY()-newLineaV.getY());
                updateC(newLineaV);
            }
        });
        crearCircuito();
    }//GEN-LAST:event_LineaVMouseClicked

    private void LineaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LineaMouseClicked
        newLinea = new JLabel();
        newLinea.setName("Horizontal");
        this.CrearCompuertas(newLinea, Linea, "C:\\Users\\alvgo\\Documents\\NetBeansProjects\\Circuitos Logicos\\src\\imagenes\\linea.png");
        newLinea.addMouseMotionListener(new MouseAdapter() {
            public void mouseMoved(MouseEvent e){
                newLinea.setCursor(new Cursor(MOVE_CURSOR));
                updateC(newLinea);
            }
        });
        jPanel2.addMouseMotionListener(new MouseAdapter() {
            public void mouseDragged(MouseEvent evt2){
                newLinea.setSize(evt2.getX()-newLinea.getX(), newLinea.getHeight());
                updateC(newLinea);
            }
        });
        crearCircuito();
    }//GEN-LAST:event_LineaMouseClicked

    /**
     * Se crear la accion del boton Tabla que generara un internal frame
     */
    private void TablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TablaActionPerformed
        Lista.displayList();
        JInternalFrame internal = new JInternalFrame("Tabla de Verdad", false, true, false, false);
        internal.setSize(jPanel2.getSize());
        JPanel internalPanel = new JPanel();
        internalPanel.setSize(internal.getSize());
        internalPanel.setBackground(Color.GREEN);
        internalPanel.setLayout(new FlowLayout());
        internal.setVisible(true);
        internal.add(internalPanel);
        internal.setResizable(false);
        jPanel2.add(internal);
        crearTabla(internalPanel);
    }//GEN-LAST:event_TablaActionPerformed

    private void SalidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalidaMouseClicked
        newSalida = new JLabel("0");
        newSalida.setName("o"+salida);
        salida++;
        jPanel2.add(newSalida);
        newEntrada.setBounds(100, 100, Salida.getWidth(), Salida.getHeight());
        ArrastraMouse(newSalida);
        Lista.insertFirst(newSalida.getName(), 100, 100, newSalida.getWidth(), newSalida.getHeight(), newSalida);
    }//GEN-LAST:event_SalidaMouseClicked

    /**
     * Este metodo crea una tabla con todas las posibles combinaciones de entradas.
     * @param jP es el panel que recibe donde se creara la tabla.
     */
    private void crearTabla(JPanel jP){
        String[] columnNames = new String[entradas];
        for(int i = 0; i < entradas; i++){
            columnNames[i] = "i"+(i+1);
        }
        int filas = (int)Math.pow(2, entradas);
        int conta;
        Object [][] datos = new Object[filas][entradas];
        for(int i = 0; i < datos.length; i++){
            conta = 0;
            for(int j = datos[i].length-1; j >= 0; j--){
                datos[i][conta] = (i/(int) Math.pow(2, j))%2;
                conta++;
            }
        }
        DefaultTableModel dtm = new DefaultTableModel(0, entradas);
        dtm.addRow(columnNames);
        for(int i = 0; i < datos.length; i++){
            dtm.addRow(datos[i]);
        }
        JTable table = new JTable(dtm);
        jP.add(table);
    }
    
    /**
     * Este metodo crea un evento de cambio de item para el Toggle Button o sea las entradas.
     * @param i es el la entrada a la que se le pondra el evento.
     */
    private void setEntradas(JToggleButton i){
        i.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange()==ItemEvent.SELECTED){
                    i.setText("1");
                } 
                else{
                    i.setText("0");
                }
             }
        });
    }
    
    /**
     * Este metodo crea una copia de lo que se seleccione en la paleta y guarda toda la info 
     * (nombre, posicion en x, posicion en y, ancho, alto y el componente) en una lista enlazada.
     * @param lbl es el nuevo label que se agregara al panel
     * @param refe es el label de referencia ubicado en la paleta
     * @param direccion es la direccion de la imagen de la compuerta
     */
    private void CrearCompuertas(JLabel lbl, JLabel refe, String direccion){
        lbl.setIcon(new ImageIcon(direccion));
        jPanel2.add(lbl);
        lbl.setBounds(100, 100, refe.getWidth(), refe.getHeight());
        ArrastraMouse(lbl);
        Lista.insertFirst(lbl.getName(), 100, 100, lbl.getWidth(), lbl.getHeight(), lbl);
        crearCircuito();
    }
    
    /**
     * Este metodo crea las conexiones entre las compuertas, las entradas y la salida.
     */
    private void crearCircuito(){
        Node Aux, Aux2;
        Aux = Lista.getHead();
        Aux2 = Lista.getHead();
        while(Aux != null){
            if(Aux.getNombre().equals("Horizontal")){
                while(Aux2 != null){
                    if (Aux != Aux2){
                        if((Aux.getPosX()+Aux.getW()) - Aux2.getPosX() < 3 &&  Aux.getPosY() == Aux2.getPosY()+(Aux2.getH()/2)){
                            
                        }
                    }
                    Aux2 = Aux2.getNext();
                }
            }
            Aux = Aux.getNext();
        }
    }
    
    /**
     * Este metodo actualiza las posiciones de los componentes en la lista.
     * @param lbl es el componente que sera actualizado en la lista.
     */
    private void updateC(JComponent lbl){
        Lista.find(lbl.getName()).setPosX(lbl.getX());
        Lista.find(lbl.getName()).setPosY(lbl.getY());
        Lista.find(lbl.getName()).setW(lbl.getWidth());
        Lista.find(lbl.getName()).setH(lbl.getHeight());
    }

    
    /**
     * Se crea un metodo general para mover las compuertas al arrastrar el mouse sobre ellas
     * @param comp es el componente que sera arrastrado
     */
    private void ArrastraMouse(JComponent comp){
        comp.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent evt){
                comp.setLocation(comp.getX()+evt.getX()-comp.getWidth()/2, comp.getY()+evt.getY()-comp.getHeight()/2);
                updateC(comp);
            }
        });
        crearCircuito();
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
            java.util.logging.Logger.getLogger(VentanaCircuito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaCircuito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaCircuito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaCircuito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaCircuito().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AND;
    private javax.swing.JToggleButton Entrada;
    private javax.swing.JLabel Linea;
    private javax.swing.JLabel LineaV;
    private javax.swing.JLabel NAND;
    private javax.swing.JLabel NOR;
    private javax.swing.JLabel NOT;
    private javax.swing.JLabel OR;
    private javax.swing.JLabel Return;
    private javax.swing.JLabel Salida;
    private javax.swing.JButton Tabla;
    private javax.swing.JLabel XNOR;
    private javax.swing.JLabel XOR;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
