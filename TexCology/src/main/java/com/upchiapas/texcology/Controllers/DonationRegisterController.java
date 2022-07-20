package com.upchiapas.texcology.Controllers;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;


import com.upchiapas.texcology.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;

public class DonationRegisterController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnConfirmar;

    @FXML
    private ComboBox<?> comboLugar;

    @FXML
    private TextField txtApellidos;

    @FXML
    private TextArea txtComent;

    @FXML
    private TextField txtCorreo;

    @FXML
    private TextField txtFech;

    @FXML
    private TextField txtNombre;

    @FXML
    void btnConfirmarOnMouseClicked(MouseEvent event) {

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setHeaderText(null);
        alert.setTitle("Confirmación");
        alert.setContentText("¿La informacion es correcta?");
        Optional<ButtonType> action = alert.showAndWait();
        // Si hemos pulsado en aceptar
        if (action.get() == ButtonType.OK) {
            var nombre = txtNombre;
            var apellidos = txtApellidos;
            var lugar = comboLugar;
            var fecha = txtFech;
            var comentario = txtComent;

            txtNombre = null;
            txtApellidos = null;
            txtCorreo = null;
            txtFech = null;
            txtComent = null;

            HelloApplication.setFXML("FichaConfirmacion-view","Ficha - confirmada");
        } else {
            txtNombre = null;
            txtApellidos = null;
            txtCorreo = null;
            txtFech = null;
            txtComent = null;
        }
    }

    @FXML
    void initialize() {
        assert btnConfirmar != null : "fx:id=\"btnConfirmar\" was not injected: check your FXML file 'DonationRegister.fxml'.";
        assert comboLugar != null : "fx:id=\"comboLugar\" was not injected: check your FXML file 'DonationRegister.fxml'.";
        assert txtApellidos != null : "fx:id=\"txtApellidos\" was not injected: check your FXML file 'DonationRegister.fxml'.";
        assert txtComent != null : "fx:id=\"txtComent\" was not injected: check your FXML file 'DonationRegister.fxml'.";
        assert txtCorreo != null : "fx:id=\"txtCorreo\" was not injected: check your FXML file 'DonationRegister.fxml'.";
        assert txtFech != null : "fx:id=\"txtFech\" was not injected: check your FXML file 'DonationRegister.fxml'.";
        assert txtNombre != null : "fx:id=\"txtNombre\" was not injected: check your FXML file 'DonationRegister.fxml'.";

    }

}
