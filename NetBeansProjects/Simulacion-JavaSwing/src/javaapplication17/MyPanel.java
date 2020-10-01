package javaapplication17;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyPanel extends JPanel {

    private JButton nuevosInput;
    private MiBoton principal; //<-------- Cambiamos
    private MiMonito cebolla, tomate, lechuga, mayonesa, condimentos, salchicha, pan, tocino;
    private MiMonito persona; //<-------- Cambiamos
    private JTextField inputCebolla, inputTomate, inputLechuga, inputMayonesa, inputCondimentos,
            inputTocino, inputPan, inputSalchicha, inputTiempo, inputCantidad;
    private JLabel jcomp3, jcomp21, jcomp22, jcomp25, jcomp26, jcomp27, jcomp28, jcomp29,
            jcomp36, jcomp37, jcomp40, jcomp41, jcomp42, jcomp43, jcomp53;
    private JTextField tomatePicar, cebollaPicar, lechugaPicar, tomateAplicar, cebollaAplicar,
            lechugaAplicar, mayonesaAplicar, aderezoAplicar, tocinoAplicar, panPreparar,
            panAplicar, salchichaPreparar, salchichaAplicar;
    private JButton editar, guardad, cancelar, salir;

    public MyPanel() {
        //construct components
        nuevosInput = new JButton(" Nueva Simulacion");
        jcomp3 = new JLabel("Cantidades");

        principal = new MiBoton("Verificar Datos"); //<-------- Cambiamos
        cebolla = new MiMonito("c", "/imagenes/cebolla.png");
        tomate = new MiMonito("t", "/imagenes/tomate.png");
        lechuga = new MiMonito("L", "/imagenes/ensalada.png");
        mayonesa = new MiMonito("m", "/imagenes/mayonesa.png");
        condimentos = new MiMonito("cond", "/imagenes/salsa-de-tomate.png");
        salchicha = new MiMonito("s", "/imagenes/sausage-icon-0.jpg");
        pan = new MiMonito("pan", "/imagenes/66633797-hot-dog-bread-icon-image-vector-illustration-design.jpg");
        tocino = new MiMonito("tocino", "/imagenes/tocino.png");

        ImageIcon image = new ImageIcon("/imagenes/comida.png");
        jcomp53 = new JLabel(image);

        persona = new MiMonito("animacion", "\\icon.png");

        inputCebolla = new JTextField(5);
        inputTomate = new JTextField(5);
        inputLechuga = new JTextField(5);
        inputMayonesa = new JTextField(5);
        inputCondimentos = new JTextField(5);
        inputTocino = new JTextField(5);
        inputPan = new JTextField(5);
        inputSalchicha = new JTextField(5);
        jcomp21 = new JLabel("Tiempo con el que se cuentapara trabajar (minutos)");
        jcomp22 = new JLabel("Cantidad Esperada");
        inputTiempo = new JTextField(5);
        inputCantidad = new JTextField(5);
        jcomp25 = new JLabel("Configuracion en segundos");
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

        guardad = new JButton("Guardar");
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
        add(guardad);
        add(cancelar);
        add(salir);
        add(jcomp53);

        //set component bounds (only needed by Absolute Positioning)
        nuevosInput.setBounds(15, 10, 155, 20);
        principal.setBounds(455, 255, 100, 20);
        jcomp3.setBounds(-5, 115, 75, 25);
        cebolla.setBounds(120, 75, 65, 25);
        tomate.setBounds(170, 75, 35, 25);
        lechuga.setBounds(205, 75, 45, 25);
        mayonesa.setBounds(255, 75, 45, 25);
        condimentos.setBounds(315, 75, 50, 25);
        salchicha.setBounds(490, 75, 40, 25);
        pan.setBounds(445, 75, 40, 25);
        tocino.setBounds(370, 75, 65, 25);
        persona.setBounds(5, 40, 70, 25);
        inputCebolla.setBounds(90, 115, 50, 25);
        inputTomate.setBounds(150, 115, 45, 25);
        inputLechuga.setBounds(205, 115, 45, 25);
        inputMayonesa.setBounds(255, 115, 50, 25);
        inputCondimentos.setBounds(315, 115, 45, 25);
        inputTocino.setBounds(370, 115, 50, 25);
        inputPan.setBounds(425, 115, 55, 25);
        inputSalchicha.setBounds(490, 115, 50, 25);
        jcomp21.setBounds(140, 160, 305, 30);
        jcomp22.setBounds(300, 210, 135, 25);
        inputTiempo.setBounds(455, 160, 100, 25);
        inputCantidad.setBounds(455, 205, 100, 25);
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
        jcomp37.setBounds(225, 440, 100, 25);
        mayonesaAplicar.setBounds(335, 370, 55, 25);
        aderezoAplicar.setBounds(335, 440, 55, 25);
        jcomp40.setBounds(405, 370, 110, 20);
        jcomp41.setBounds(430, 400, 80, 25);
        jcomp42.setBounds(410, 440, 110, 25);
        jcomp43.setBounds(520, 335, 115, 30);
        tocinoAplicar.setBounds(590, 365, 55, 25);
        panPreparar.setBounds(520, 400, 55, 25);
        panAplicar.setBounds(590, 400, 55, 25);
        salchichaPreparar.setBounds(520, 435, 55, 25);
        salchichaAplicar.setBounds(590, 435, 55, 25);
        editar.setBounds(35, 485, 100, 25);
        guardad.setBounds(165, 485, 100, 25);
        cancelar.setBounds(290, 485, 100, 25);
        salir.setBounds(540, 485, 100, 25);
        jcomp53.setBounds(30, 235, 100, 25);

        //CODIGO DATOS DE INICIO
        MiMonito[] labelsCantidades = {cebolla, tomate, lechuga, mayonesa, condimentos, salchicha, pan, tocino};
        JTextField[] configuraciones = {tomatePicar, cebollaPicar, lechugaPicar, tomateAplicar, cebollaAplicar, lechugaAplicar,
            mayonesaAplicar, aderezoAplicar, tocinoAplicar, panPreparar, panAplicar, salchichaPreparar, salchichaAplicar};
        JTextField[] inputs = {inputCebolla, inputTomate, inputLechuga, inputMayonesa, inputCondimentos,
            inputTocino, inputPan, inputSalchicha};

        setStage(labelsCantidades, configuraciones, inputs); //<-------- Agrega funciones principales

        nuevosInput.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Aqui va el codigo de la accion
                desbloquearInputs(inputs);
            }});

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

        guardad.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Aqui va el codigo de la accion
                setConfiguracionNueva(configuraciones);
            }
        });

    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("MyPanel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new MyPanel());
        frame.pack();
        frame.setVisible(true);
    }

    private void setStage(MiMonito[] labelsCantidades, JTextField[] configuraciones, JTextField[] inputs) {
        inputTiempo.setEnabled(false);
        inputCantidad.setEnabled(false);
        guardad.setEnabled(false);
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
        inputTiempo.setEnabled(true);
        inputCantidad.setEnabled(true);
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
        
        guardad.setEnabled(false);
        cancelar.setEnabled(false);
        editar.setEnabled(true);
    }

    private void desbloquearConfiguraciones(JTextField[] configuraciones) {
        for (int i = 0; i < configuraciones.length; i++) {
            configuraciones[i].setEnabled(true);
        }
        guardad.setEnabled(true);
        cancelar.setEnabled(true);
        editar.setEnabled(false);

    }

    private void setConfiguracionNueva(JTextField[] configuraciones) {
        /* tomatePicar.getText();
        cebollaPicar.getText();
        lechugaPicar.getText();
        tomateAplicar.getText();
        cebollaAplicar.getText();
        lechugaAplicar.getText();
        mayonesaAplicar.getText();
        aderezoAplicar.getText();
        tocinoAplicar.getText();
        panPreparar.getText();
        panAplicar.getText();
        salchichaPreparar.getText();
        salchichaAplicar.getText();*/
        for (int i = 0; i < configuraciones.length; i++) {
            configuraciones[i].setEnabled(false);
        }

        guardad.setEnabled(false);
        cancelar.setEnabled(false);
        editar.setEnabled(true);
    }

}
