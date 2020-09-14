module sim.main {
    requires javafx.controls;
    requires javafx.fxml;

    opens sim.main to javafx.fxml;
    exports sim.main;
}