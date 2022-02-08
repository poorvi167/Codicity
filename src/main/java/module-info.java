module io.dbc.github.testify {
    requires javafx.controls;
    requires javafx.fxml;


    opens io.dbc.github.testify to javafx.fxml;
    exports io.dbc.github.testify;
}