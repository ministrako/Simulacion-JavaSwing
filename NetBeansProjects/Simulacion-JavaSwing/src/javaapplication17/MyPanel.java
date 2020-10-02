package javaapplication17;

import java.awt.*;
import java.awt.event.*;
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
            jcomp36, jcomp37, jcomp40, jcomp41, jcomp42, jcomp43, jcomp53;
    private JButton editar, guardar, cancelar, salir, nuevosInput;

    public MyPanel() {
        //construct components
        nuevosInput = new JButton("Nueva Simulacion");

        principal = new MiBoton("Verificar"); //<-------- Cambiamos
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

        inputCebolla = new JTextField("1");
        inputTomate = new JTextField("1");
        inputLechuga = new JTextField("1");
        inputMayonesa = new JTextField("1");
        inputCondimentos = new JTextField("1");
        inputTocino = new JTextField("1");
        inputSalchicha = new JTextField("2");
        inputPan = new JTextField("1");
        jcomp3 = new JLabel("Cantidades");
        jcomp21 = new JLabel("Tiempo para trabajar (minutos)");
        jcomp22 = new JLabel("Cantidad Hot-Dogs");
        inputTiempo = new JTextField(5);
        inputCantidad = new JTextField(5);
        jcomp25 = new JLabel("TIEMPO EN SEGUNDOS");
        jcomp26 = new JLabel("Picar / Aplicar");
        jcomp27 = new JLabel("Tomate");
        jcomp28 = new JLabel("Cebolla");
        jcomp29 = new JLabel("Lechuga");
        tomatePicar = new JTextField(5);
        cebollaPicar = new JTextField(5);
        lechugaPicar = new JTextField(5);
        tomateAplicar = new JTextField(5);
        cebollaAplicar = new JTextField(5);
        lechugaAplicar = new JTextField(5);
        jcomp36 = new JLabel("Aplicar mayonesa");
        jcomp37 = new JLabel("Aplicar aderezo");
        mayonesaAplicar = new JTextField(5);
        aderezoAplicar = new JTextField(5);
        jcomp40 = new JLabel("Tocino a salchicha");
        jcomp41 = new JLabel("Calentar pan");
        jcomp42 = new JLabel("Cocinar salchicha");
        jcomp43 = new JLabel("Preparar / Aplicar");
        tocinoAplicar = new JTextField(5);
        panPreparar = new JTextField(5);
        panAplicar = new JTextField(5);
        salchichaPreparar = new JTextField(5);
        salchichaAplicar = new JTextField(5);
        editar = new JButton("Editar");

        guardar = new JButton("Guardar");
        cancelar = new JButton("Cancelar");
        salir = new JButton("Salir");

        //set components properties
        tomatePicar.setText("73.75");
        cebollaPicar.setText("85");
        lechugaPicar.setText("235");
        tomateAplicar.setText("5.25");
        cebollaAplicar.setText("4.75");
        lechugaAplicar.setText("5.5");
        mayonesaAplicar.setText("7.25");
        aderezoAplicar.setText("4");
        tocinoAplicar.setText("23.75");
        panPreparar.setText("55");
        panAplicar.setText("0");
        salchichaPreparar.setText("105");
        salchichaAplicar.setText("4.75");

        //adjust size and set layout
        setPreferredSize(new Dimension(662, 527));
        setLayout(null);

        //set component bounds (only needed by Absolute Positioning)
        persona.setBounds(90, 40, 80, 40);
        calentar.setBounds(90, 90, 80, 40);
        guisar.setBounds(255, 90, 90, 40);
        nuevosInput.setBounds(15, 10, 155, 20);
        principal.setBounds(455, 275, 100, 20);
        jcomp3.setBounds(5, 135, 75, 25);
        cebolla.setBounds(420, 90, 65, 40);
        tomate.setBounds(480, 90, 65, 40);
        lechuga.setBounds(535, 90, 65, 40);
        mayonesa.setBounds(200, 90, 65, 40);
        condimentos.setBounds(590, 90, 70, 40);
        salchicha.setBounds(370, 80, 80, 50);
        pan.setBounds(145, 100, 40, 25);
        tocino.setBounds(305, 90, 70, 40);
        inputCebolla.setBounds(420, 135, 50, 25);
        inputTomate.setBounds(480, 135, 45, 25);
        inputLechuga.setBounds(535, 135, 45, 25);
        inputMayonesa.setBounds(200, 135, 50, 25);
        inputCondimentos.setBounds(590, 135, 45, 25);
        inputTocino.setBounds(305, 135, 50, 25);
        inputPan.setBounds(140, 135, 55, 25);
        inputSalchicha.setBounds(365, 135, 50, 25);
        jcomp21.setBounds(230, 180, 305, 30);
        jcomp22.setBounds(305, 230, 135, 25);
        inputTiempo.setBounds(455, 180, 100, 25);
        inputCantidad.setBounds(455, 225, 100, 25);
        jcomp25.setBounds(245, 310, 190, 25);
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
        editar.setBounds(35, 485, 100, 25);
        guardar.setBounds(165, 485, 100, 25);
        cancelar.setBounds(290, 485, 100, 25);
        salir.setBounds(540, 485, 100, 25);
        jcomp53.setBounds(20, 150, 200, 200);

        //add components
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
        add(salir);
        add(jcomp53);
        add(calentar);
        add(guisar);

        //CODIGO DATOS DE INICIO
        MiMonito[] labelsCantidades = {cebolla, tomate, lechuga, mayonesa, condimentos, salchicha, pan, tocino,  calentar, guisar};
        JTextField[] configuraciones = {tomatePicar, cebollaPicar, lechugaPicar, tomateAplicar, cebollaAplicar, lechugaAplicar,
            mayonesaAplicar, aderezoAplicar, tocinoAplicar, panPreparar, panAplicar, salchichaPreparar, salchichaAplicar};
        JTextField[] inputs = {inputCebolla, inputTomate, inputLechuga, inputMayonesa, inputCondimentos,
            inputTocino, inputPan, inputSalchicha, inputTiempo, inputCantidad};

        setStage(labelsCantidades, configuraciones, inputs); //<-------- Agrega funciones principales
        agregarVerificadores(configuraciones);

        //CODIGO FUNCIONES DE LOS INPUT
        nuevosInput.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Aqui va el codigo de la accion
                desbloquearInputs(inputs);
                agregarVerificadores(inputs);
            }
        });

        //CODIGO DEL THREAD SIMULACION
        principal.innit();
        persona.innit();

        principal.monito = persona;

        principal.addActionListener(principal);

        //CODIGO FUNCIONES DE LA CONFIGURACION
        editar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Aqui va el codigo de la accion
                desbloquearConfiguraciones(configuraciones);
            }
        });

        cancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Aqui va el codigo de la accion
                setConfiguracionDefaul(configuraciones);
            }
        });

        guardar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Aqui va el codigo de la accion
                setConfiguracionNueva(configuraciones);
            }
        });

    }

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
        principal.setEnabled(false);

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
        principal.setEnabled(true);
    }

    private void setConfiguracionDefaul(JTextField[] configuraciones) {
        //set components properties
        tomatePicar.setText("73.75");
        cebollaPicar.setText("85");
        lechugaPicar.setText("235");
        tomateAplicar.setText("5.25");
        cebollaAplicar.setText("4.75");
        lechugaAplicar.setText("5.5");
        mayonesaAplicar.setText("7.25");
        aderezoAplicar.setText("4");
        tocinoAplicar.setText("23.75");
        panPreparar.setText("55");
        panAplicar.setText("0");
        salchichaPreparar.setText("105");
        salchichaAplicar.setText("4.75");

        for (int i = 0; i < configuraciones.length; i++) {
            configuraciones[i].setEnabled(false);
        }
        guardar.setEnabled(false);
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
    }

    private void setConfiguracionNueva(JTextField[] configuraciones) {
        for (int i = 0; i < configuraciones.length; i++) {
            configuraciones[i].setEnabled(false);
        }
        guardar.setEnabled(false);
        cancelar.setEnabled(false);
        editar.setEnabled(true);
    }

    private void agregarVerificadores(JTextField[] inputs) {
        if (inputs.length > 0) {
            for (int i = 0; i < inputs.length; i++) {
                inputs[i].setInputVerifier(new Verificador());
            }
        }
    }

}
