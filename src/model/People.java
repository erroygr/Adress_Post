package model;

public class People {

     String FirstName;
     String LastName;
     String SecondName;

     //Конструктор
     public People(){
        FirstName="Иван";
        LastName="Иванов";
        SecondName="Иванович";
    }

    public People(String FirstName, String LastName, String SecondName) {
         this.FirstName=FirstName;
         this.LastName=LastName;
         this.SecondName=SecondName;
    }

    public String info(){
         return FirstName+" "+LastName+" "+SecondName+" \n";
   }
}
