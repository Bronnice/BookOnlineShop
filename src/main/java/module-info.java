module com.konstantinponomarev.bookonlineshop {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.konstantinponomarev.bookonlineshop to javafx.fxml;
    exports com.konstantinponomarev.bookonlineshop;
    exports com.konstantinponomarev.bookonlineshop.Controllers;
    opens com.konstantinponomarev.bookonlineshop.Controllers to javafx.fxml;
}