package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import model.AdressRUS;
import model.AdressUSA;
import model.AdressValidator;
import model.People;

public class Controller {

    public ComboBox combo_adr; //выбор RUS_USA
    public TextField wr_LN;    // фамилия
    public TextField wr_FN;    // имя
    public TextField wr_SN;    // отчество  МОЖЕТ ОТСУТ
    public TextField wr_ST;    // улица
    public TextField wr_HOU;   //дом
    public TextField wr_APT;   //квартира   МОЖЕТ ОТСУТСТВОВАТЬ
    public TextField wr_LOC;   //населенный пунк
    public TextField wr_REG;   //область-штат-край
    public TextField wr_PC;    //индекс
    public ListView listAdress;//для хранения введенных данных

     @FXML
    public void initialize() {
        combo_adr.getItems().addAll("США", "Россия");
        combo_adr.getSelectionModel().select(0);
    }

    public void addAdress() {
               if (wr_LN.getText().equals("") || wr_FN.getText().equals("")
                || wr_ST.getText().equals("") || wr_HOU.getText().equals("")
                || wr_LOC.getText().equals("")|| wr_REG.getText().equals("")
                || wr_PC.getText().equals(""))
        {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Предупреждение: ");
            alert.setHeaderText(null);
            alert.setContentText("Ошибка введенных данных!");
            alert.showAndWait();
            return;
        }

        AdressValidator adr1 =null;
        People peop1 = null;
        switch (combo_adr.getSelectionModel().getSelectedItem().toString()){
            case "США":
                peop1=new People(wr_LN.getText(),wr_FN.getText(),wr_SN.getText());
                adr1=new AdressUSA(wr_HOU.getText(),wr_ST.getText(),wr_APT.getText(),wr_LOC.getText(),wr_REG.getText(),wr_PC.getText());
                break;

            case "Россия":
                peop1=new People(wr_LN.getText(),wr_FN.getText(),wr_SN.getText());
                adr1=new AdressRUS(wr_ST.getText(),wr_HOU.getText(),wr_APT.getText(),wr_LOC.getText(),wr_REG.getText(),wr_PC.getText());
                break;

                default:
                    break;
        }
        String kont=" ";
        listAdress.getItems().addAll(peop1.info(),adr1.info(),kont);


         wr_LN.setText("");
         wr_FN.setText("");
         wr_SN.setText("");
         wr_ST.setText("");
         wr_HOU.setText("");
         wr_APT.setText("");
         wr_LOC.setText("");
         wr_REG.setText("");
         wr_PC.setText("");


    }


}
