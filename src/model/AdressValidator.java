package model;

public interface AdressValidator {

     String info();
     /* ГЕТТЕР-СЕТТЕР УЛИЦЫ*/
     String getStreet();
     void setStreet(String Street);

     /* ГЕТТЕР-СЕТТЕР НОМЕРА ДОМА*/
     String getHouse();
     void setHouse(String House);

     /* ГЕТТЕР-СЕТТЕР КВАРТИРЫ*/
     String getApt();
     void setApt(String Apt);

     /* ГЕТТЕР-СЕТТЕР НАИМЕНОВАНИЯ НАСЕЛЕНОГО ПУНКТА*/
     String getLocality();
     void setLocality(String Locality);

     /* ГЕТТЕР-СЕТТЕР КРАЙ/ОБЛАСТЬ/ШТАТ*/
     String getRegion();
     void setRegion(String Region);

     /* ГЕТТЕР-СЕТТЕР ИНДЕКСА*/
     String getPostalCode();
     void setPostalCode(String PostalCode);


}
