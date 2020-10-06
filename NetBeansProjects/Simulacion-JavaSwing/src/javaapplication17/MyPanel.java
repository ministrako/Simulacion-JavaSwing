package javaapplication17;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

public class MyPanel extends JPanel {

    private MiBoton principal; //<-------- Cambiamos
    private MiMonito cebolla, tomate, lechuga, mayonesa, condimentos, salchicha, pan, persona, tocino, calentar, guisar;
    private JTextField inputCebolla, inputTomate, inputLechuga, inputMayonesa, inputCondimentos,
            inputTocino, inputPan, inputSalchicha, inputTiempo, inputCantidad;
    private JTextField tomatePicar, cebollaPicar, lechugaPicar, tomateAplicar, cebollaAplicar,
            lechugaAplicar, mayonesaAplicar, aderezoAplicar, tocinoAplicar, panPreparar,
            panAplicar, salchichaPreparar, salchichaAplicar;
    private JLabel jcomp3, jcomp21, jcomp22, jcomp25, jcomp26, jcomp27, jcomp28, jcomp29,
            jcomp36, jcomp37, jcomp40, jcomp41, jcomp42, jcomp43, jcomp53, cdaM, cdaC, pzaP, pzaT, pzaS, cantC, cantT, cantL;
    private JButton editar, guardar, cancelar, salir, nuevosInput, resultados, reset, cancelarC;

    public MyPanel() {
        //construct components
        resultados = new JButton("Resultados");
        nuevosInput = new JButton("Editar cantidades");
        reset = new JButton("Nueva Simulacion");

        principal = new MiBoton("Comenzar"); //<-------- Cambiamos
        cebolla = new MiMonito("c", "imagenes/cebolla.png");
        tomate = new MiMonito("t", "imagenes/tomate.png");
        lechuga = new MiMonito("L", "imagenes/lechuga.png");
        mayonesa = new MiMonito("m", "imagenes/mayonesa.png");
        condimentos = new MiMonito("cond", "imagenes/ketchup.png");
        salchicha = new MiMonito("s", "imagenes/salchicha.png");
        pan = new MiMonito("pan", "imagenes/pan.jpg");
        tocino = new MiMonito("tocino", "imagenes/tocino.png");
        persona = new MiMonito("animacion", "imagenes/user.png");
        calentar = new MiMonito("calentar", "imagenes/calentarpan.png");
        guisar = new MiMonito("guisar", "imagenes/guisarsalchicha.png");

        ImageIcon image = new ImageIcon("imagenes/dogo.png");
        jcomp53 = new JLabel(image);

        cantL = new JLabel("/12");
        cantT = new JLabel("/4");
        cantC = new JLabel("/4");
        pzaS = new JLabel("pza.");
        pzaT = new JLabel("pza.");
        pzaP = new JLabel("pza.");
        cdaM = new JLabel("cda.");            // suponiendo que se necesita 1 cda de mayonesa para cada hot-dog
        cdaC = new JLabel("cda.");            // suponiendo que se necesita 1 cda de condimentos para cada hot-dog
        inputCebolla = new JTextField("1");
        inputTomate = new JTextField("1");
        inputLechuga = new JTextField("1");
        inputMayonesa = new JTextField("1");
        inputCondimentos = new JTextField("1");
        inputTocino = new JTextField("1");
        inputSalchicha = new JTextField("1");
        inputPan = new JTextField("1");
        jcomp3 = new JLabel("Cantidades");
        jcomp21 = new JLabel("Tiempo para trabajar(seg)");
        jcomp22 = new JLabel("Cantidad Hot-Dogs");
        inputTiempo = new JTextField("11289.5");
        inputCantidad = new JTextField("1");
        jcomp25 = new JLabel("TIEMPO EN SEGUNDOS");
        jcomp26 = new JLabel("Picar / Aplicar");
        jcomp27 = new JLabel("Tomate");
        jcomp28 = new JLabel("Cebolla");
        jcomp29 = new JLabel("Lechuga");
        tomatePicar = new JTextField("18.5");
        cebollaPicar = new JTextField("21.25");
        lechugaPicar = new JTextField("17.3");
        tomateAplicar = new JTextField("5.25");
        cebollaAplicar = new JTextField("4.75");
        lechugaAplicar = new JTextField("5.5");
        jcomp36 = new JLabel("Aplicar mayonesa");
        jcomp37 = new JLabel("Aplicar aderezo");
        mayonesaAplicar = new JTextField("7.25");
        aderezoAplicar = new JTextField("4");
        jcomp40 = new JLabel("Tocino a salchicha");
        jcomp41 = new JLabel("Calentar pan");
        jcomp42 = new JLabel("Cocinar salchicha");
        jcomp43 = new JLabel("Preparar / Aplicar");
        tocinoAplicar = new JTextField("23.75");
        panPreparar = new JTextField("55");
        panAplicar = new JTextField("1");
        salchichaPreparar = new JTextField("105");
        salchichaAplicar = new JTextField("4.75");
        editar = new JButton("Editar tiempos");
        guardar = new JButton("Guardar");
        cancelar = new JButton("Cancelar tiempo");
        cancelarC = new JButton("Cancelar cantidades");
        salir = new JButton("Salir");

        //adjust size and set layout
        setPreferredSize(new Dimension(662, 527));
        setLayout(null);

        //set component bounds (only needed by Absolute Positioning)
        reset.setBounds(15, 10, 155, 20);
        cantL.setBounds(570, 136, 40, 25);
        cantT.setBounds(520, 136, 40, 25);
        cantC.setBounds(460, 136, 40, 25);
        pzaS.setBounds(400, 136, 40, 25);
        pzaT.setBounds(340, 136, 40, 25);
        pzaP.setBounds(175, 136, 40, 25);
        cdaC.setBounds(630, 136, 40, 25);
        cdaM.setBounds(235, 136, 40, 25);
        resultados.setBounds(555, 275, 100, 20);
        // Persona el label que se mueve como animacion
        persona.setBounds(85, 40, 80, 40);
        // end label animacion de persona
        calentar.setBounds(85, 90, 80, 40);
        guisar.setBounds(255, 90, 90, 40);
        nuevosInput.setBounds(300, 10, 160, 20);
        principal.setBounds(440, 275, 100, 20);
        jcomp3.setBounds(5, 135, 75, 25);
        cebolla.setBounds(425, 90, 65, 40);
        tomate.setBounds(480, 90, 65, 40);
        lechuga.setBounds(535, 90, 65, 40);
        mayonesa.setBounds(200, 90, 65, 40);
        condimentos.setBounds(590, 90, 70, 40);
        salchicha.setBounds(370, 80, 80, 50);
        pan.setBounds(140, 100, 40, 25);
        tocino.setBounds(305, 90, 70, 40);
        inputCebolla.setBounds(430, 135, 30, 25);
        inputTomate.setBounds(490, 135, 30, 25);
        inputLechuga.setBounds(540, 135, 30, 25);
        inputMayonesa.setBounds(205, 135, 30, 25);
        inputCondimentos.setBounds(600, 135, 30, 25);
        inputTocino.setBounds(310, 135, 30, 25);
        inputPan.setBounds(145, 135, 30, 25);
        inputSalchicha.setBounds(370, 135, 30, 25);
        jcomp21.setBounds(290, 180, 305, 30);
        jcomp22.setBounds(305, 230, 135, 25);
        inputTiempo.setBounds(440, 180, 100, 25);
        inputCantidad.setBounds(440, 225, 100, 25);
        jcomp25.setBounds(250, 310, 190, 25);
        jcomp26.setBounds(105, 335, 100, 25);
        jcomp27.setBounds(15, 365, 55, 25);
        jcomp28.setBounds(15, 405, 60, 25);
        jcomp29.setBounds(10, 440, 60, 25);
        tomatePicar.setBounds(85, 370, 50, 25);
        cebollaPicar.setBounds(85, 405, 50, 25);
        lechugaPicar.setBounds(85, 440, 50, 25);
        tomateAplicar.setBounds(145, 370, 50, 25);
        cebollaAplicar.setBounds(145, 405, 50, 25);
        lechugaAplicar.setBounds(145, 440, 50, 25);
        jcomp36.setBounds(225, 370, 105, 25);
        jcomp37.setBounds(230, 440, 100, 25);
        mayonesaAplicar.setBounds(335, 370, 55, 25);
        aderezoAplicar.setBounds(335, 440, 55, 25);
        jcomp40.setBounds(405, 370, 110, 20);
        jcomp41.setBounds(435, 400, 80, 25);
        jcomp42.setBounds(410, 440, 110, 25);
        jcomp43.setBounds(520, 335, 115, 30);
        tocinoAplicar.setBounds(590, 365, 55, 25);
        panPreparar.setBounds(520, 400, 55, 25);
        panAplicar.setBounds(590, 400, 55, 25);
        salchichaPreparar.setBounds(520, 435, 55, 25);
        salchichaAplicar.setBounds(590, 435, 55, 25);
        editar.setBounds(35, 485, 120, 25);
        guardar.setBounds(420, 485, 100, 25);
        cancelar.setBounds(165, 485, 150, 25);
        cancelarC.setBounds(480, 10, 160, 20);
        salir.setBounds(540, 485, 100, 25);
        jcomp53.setBounds(20, 150, 200, 200);

        //add components
        add(reset);
        add(cantL);
        add(cantT);
        add(cantC);
        add(pzaS);
        add(pzaT);
        add(pzaP);
        add(cdaC);
        add(cdaM);
        add(resultados);
        add(nuevosInput);
        add(principal);
        add(jcomp3);
        add(cebolla);
        add(tomate);
        add(lechuga);
        add(mayonesa);
        add(condimentos);
        add(salchicha);
        add(pan);
        add(tocino);
        add(persona);
        add(inputCebolla);
        add(inputTomate);
        add(inputLechuga);
        add(inputMayonesa);
        add(inputCondimentos);
        add(inputTocino);
        add(inputPan);
        add(inputSalchicha);
        add(jcomp21);
        add(jcomp22);
        add(inputTiempo);
        add(inputCantidad);
        add(jcomp25);
        add(jcomp26);
        add(jcomp27);
        add(jcomp28);
        add(jcomp29);
        add(tomatePicar);
        add(cebollaPicar);
        add(lechugaPicar);
        add(tomateAplicar);
        add(cebollaAplicar);
        add(lechugaAplicar);
        add(jcomp36);
        add(jcomp37);
        add(mayonesaAplicar);
        add(aderezoAplicar);
        add(jcomp40);
        add(jcomp41);
        add(jcomp42);
        add(jcomp43);
        add(tocinoAplicar);
        add(panPreparar);
        add(panAplicar);
        add(salchichaPreparar);
        add(salchichaAplicar);
        add(editar);
        add(guardar);
        add(cancelar);
        add(cancelarC);
        add(salir);
        add(jcomp53);
        add(calentar);
        add(guisar);

        //CODIGO DATOS DE INICIO
        MiMonito[] labelsCantidades = {cebolla, tomate, lechuga, mayonesa, condimentos, salchicha, pan, tocino, calentar, guisar};
        // Configuraciones son los tiempos de las actividades
        JTextField[] configuraciones = {tomatePicar, cebollaPicar, lechugaPicar, tomateAplicar, cebollaAplicar, lechugaAplicar,
            mayonesaAplicar, aderezoAplicar, tocinoAplicar, panPreparar, panAplicar, salchichaPreparar, salchichaAplicar, inputTiempo};
        // Cantidades de los ingredientes
        JTextField[] inputs = {inputCebolla, inputTomate, inputLechuga, inputMayonesa, inputCondimentos,
            inputTocino, inputPan, inputSalchicha, inputCantidad};

        setStage(labelsCantidades, configuraciones, inputs); //<-------- Agrega funciones principales
        agregarVerificadoresT(configuraciones);
                
        //CODIGO FUNCIONES DE LOS INPUT CANTIDADES
        nuevosInput.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Aqui va el codigo de la accion
                desbloquearInputs(inputs);
                agregarVerificadoresC(inputs);
            }
        });

        //CODIGO DEL THREAD SIMULACION
        principal.innit();
        persona.innit();
        persona.txtIngredientes = inputs;
        persona.txtTiempos = configuraciones;
        principal.monito = persona;
        principal.txtIngredientes = inputs;
        principal.addActionListener(principal);
        

        //CODIGO FUNCIONES DE LA CONFIGURACION (TIEMPOS)
        editar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Aqui va el codigo de la accion
                desbloquearConfiguraciones(configuraciones);
            }
        });

        cancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Aqui va el codigo de la accion
                setConfiguracionDefault(configuraciones);
            }
        });

        cancelarC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Aqui va el codigo de la accion
                setInputsDefault(inputs);
            }
        });

        guardar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Aqui va el codigo de la accion
                bloquearConfiguracionesInputs(configuraciones, inputs);
            }
        });

        reset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                reset.setEnabled(false);
                bloquearConfiguracionesInputs(configuraciones, inputs);
                agregarVerificadoresC(inputs);
                setInputsDefault(inputs);
                setConfiguracionDefault(configuraciones);
            }
        });

        salir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        resultados.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JDialog r = new JDialog();

                JButton cerrar = new JButton("Cerrar");
                cerrar.setBounds(140, 130, 80, 20);
                r.add(cerrar);

                ActionListener listener = new ActionListener() {
                    public void actionPerformed(ActionEvent ae) {
                        if (ae.getSource() == cerrar) {
                            r.dispose();
                        }
                    }
                };
                cerrar.addActionListener(listener);

                r.setSize(250, 200);
                r.setResizable(false);
                r.setLayout(null);
                r.setModal(true);
                r.setLocationRelativeTo(null);
                r.setDefaultCloseOperation(r.DISPOSE_ON_CLOSE);
                r.setVisible(true);
            }
        });
        
        
        
        
    } // end class MyPanel()

    public static void main(String[] args) {
        JFrame frame = new JFrame("EVENhoT-dog");

        frame.getContentPane().add(new MyPanel());
        frame.pack();
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    private void setStage(MiMonito[] labelsCantidades, JTextField[] configuraciones, JTextField[] inputs) {
        guardar.setEnabled(false);
        cancelar.setEnabled(false);
        cancelarC.setEnabled(false);
        reset.setEnabled(false);

        for (int i = 0; i < labelsCantidades.length; i++) {
            labelsCantidades[i].innit();
        }
        for (int i = 0; i < configuraciones.length; i++) {
            configuraciones[i].setEnabled(false);
        }
        for (int i = 0; i < inputs.length; i++) {
            inputs[i].setEnabled(false);
        }
    }

    private void desbloquearInputs(JTextField[] inputs) {
        for (int i = 0; i < inputs.length; i++) {
            inputs[i].setEnabled(true);
        }
        guardar.setEnabled(true);
        cancelarC.setEnabled(true);
        nuevosInput.setEnabled(false);
        reset.setEnabled(true);
    }

    private void setInputsDefault(JTextField[] inputs) {
        // poner cantidades originales
        inputCebolla.setText("1");
        inputTomate.setText("1");
        inputLechuga.setText("1");
        inputMayonesa.setText("1");
        inputCondimentos.setText("1");
        inputTocino.setText("1");
        inputSalchicha.setText("1");
        inputPan.setText("1");
        inputCantidad.setText("1");

        for (int i = 0; i < inputs.length; i++) {
            inputs[i].setBackground(Color.white);
            inputs[i].setEnabled(false);
        }
        nuevosInput.setEnabled(true);
        cancelarC.setEnabled(false);
    }

    private void setConfiguracionDefault(JTextField[] configuraciones) {
        // poner tiempos originales
        tomatePicar.setText("18.5");
        cebollaPicar.setText("21.25");
        lechugaPicar.setText("17.3");
        tomateAplicar.setText("5.25");
        cebollaAplicar.setText("4.75");
        lechugaAplicar.setText("5.5");
        mayonesaAplicar.setText("7.25");
        aderezoAplicar.setText("4");
        tocinoAplicar.setText("23.75");
        panPreparar.setText("55");
        panAplicar.setText("1");
        salchichaPreparar.setText("105");
        salchichaAplicar.setText("4.75");
        inputTiempo.setText("11289.5");

        for (int i = 0; i < configuraciones.length; i++) {
            configuraciones[i].setBackground(Color.white);
            configuraciones[i].setEnabled(false);
        }

        cancelar.setEnabled(false);
        editar.setEnabled(true);
    }

    private void desbloquearConfiguraciones(JTextField[] configuraciones) {
        for (int i = 0; i < configuraciones.length; i++) {
            configuraciones[i].setEnabled(true);
        }
        guardar.setEnabled(true);
        cancelar.setEnabled(true);
        editar.setEnabled(false);
        reset.setEnabled(true);
    }

    private void bloquearConfiguracionesInputs(JTextField[] configuraciones, JTextField[] inputs) {
        for (int i = 0; i < configuraciones.length; i++) {
            configuraciones[i].setEnabled(false);
        }
        for (int i = 0; i < inputs.length; i++) {
            inputs[i].setEnabled(false);
        }
        guardar.setEnabled(false);
        cancelar.setEnabled(false);
        editar.setEnabled(true);
        nuevosInput.setEnabled(true);
        cancelarC.setEnabled(false);
    }

    private void agregarVerificadoresT(JTextField[] inputs) {   // Verificador para el tiempo
        if (inputs.length > 0) {
            for (int i = 0; i < inputs.length; i++) {
                inputs[i].setInputVerifier(new VerificadorT());
            }
        }
    }

    private void agregarVerificadoresC(JTextField[] inputs) {  // Verificador para cantidades
        if (inputs.length > 0) {
            for (int i = 0; i < inputs.length; i++) {
                inputs[i].setInputVerifier(new VerificadorC());
            }
        }
    }
}
