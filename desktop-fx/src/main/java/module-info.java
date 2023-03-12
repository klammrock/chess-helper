module name.klamm.chess.helper.app.fx.desktopfx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires name.klamm.chess.helper.lib;

    opens name.klamm.chess.helper.app.fx.desktopfx to javafx.fxml;
    exports name.klamm.chess.helper.app.fx.desktopfx;
}