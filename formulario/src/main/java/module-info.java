module formulario.allcontrols {
    requires javafx.controls;
    requires javafx.fxml;

    opens formulario.allcontrols to javafx.fxml;
    exports formulario.allcontrols;
}
