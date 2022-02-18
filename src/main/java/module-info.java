module io.dbc.github.codicity {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.apache.logging.log4j;

    opens io.dbc.github.codicity to javafx.fxml;
    exports io.dbc.github.codicity;
}