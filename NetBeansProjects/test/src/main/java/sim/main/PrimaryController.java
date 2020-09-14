package sim.main;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class PrimaryController {

    @FXML
    private AnchorPane primaryStage;
    @FXML
    private Label labelResultadoEsperado;
    @FXML
    private Label labelResultadoObtenido;
    @FXML
    private Button BotonIniciarSimulacion;
    @FXML
    private Button botonNuevaSimulacion;
    @FXML
    private Button botonSalir;
    @FXML
    private TextField textfCantidadCebolla;
    @FXML
    private TextField textfCantidadTomate;
    @FXML
    private TextField textfCantidadLechuga;
    @FXML
    private TextField textfCantidadMayonesa;
    @FXML
    private TextField textfCantidadAderezo;
    @FXML
    private TextField textfCantidadPan;
    @FXML
    private TextField textfCantidadTocino;
    @FXML
    private TextField textfCantidadSalchicha;
    @FXML
    private TextField textfCantidadTiempoDisponible;
    @FXML
    private TextField textfCantidadProductoEsperado;
    @FXML
    private TextField textfPicarTomate;
    @FXML
    private TextField textfAplicarTomate;
    @FXML
    private TextField textfAplicarCebolla;
    @FXML
    private TextField textfPicarCebolla;
    @FXML
    private TextField textfPicarLechuga;
    @FXML
    private TextField textfAplicarLechuga;
    @FXML
    private TextField textfAplicarMayonesa;
    @FXML
    private TextField textfAplicarMostaza;
    @FXML
    private TextField textfileAplicarTocino;
    @FXML
    private TextField textfilePrepararPan;
    @FXML
    private TextField textfileAplicarPan;
    @FXML
    private TextField textfilePrepararSalchichas;
    @FXML
    private TextField textfileAplicarSalchicha;
    @FXML
    private Button botonEditarConfig;
    @FXML
    private Button botonGuardarConfig;
    @FXML
    private Button botonCancelarConfig;

    @FXML
    private void salir(ActionEvent event) {
        System.exit(0);
    }

   
}
