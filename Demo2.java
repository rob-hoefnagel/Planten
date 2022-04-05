//        - maak een plant en een cactus
//        - plant heeft methode groeien. Cactus heeft ook methode groeien. Methode catus override de methode van de plant
//        - maak een array van planten met 2 planten erin en 2 cactussen.
//        - Er is een collega die heeft een has-relatie met de Array planten.
//        - collega heeft een methode en daar moet je een int aan meegeven. Dan geeft hij een plant water.
//        - Als je een plant water geeft komt er 2cm bij, als je een cactus water geeft komt er niks bij.
public class Demo2 {
    public static void main(String[] args) {
        Plant plant1 = new Plant();
        Cactus cactus1 = new Cactus();
        cactus1.plantje.groeien();
        Plant plant2 = new Plant();
        Cactus cactus2 = new Cactus();
        cactus1.groeien();
        Plant[] myArray = new Plant[4];
        myArray[0] = plant1;
        myArray[1] = plant2;
        myArray[2] = cactus1.plantje;
        myArray[3]  = cactus2.plantje;
        Collega harry = new Collega();
        harry.waterGeven(5);
        for(int i = 0; i < myArray.length; i++){
            if (myArray[i] == plant1){
                plant1.lengte = plant1.lengte + 2;
                System.out.println("Plant1 heeft een lengte van " + plant1.lengte + " centimeter");
            } else if (myArray[i] == plant2) {
                plant2.lengte = plant2.lengte + 2;
                System.out.println("Plant2 heeft een lengte van " + plant2.lengte + " centimeter");
            } else if (myArray[i] == cactus1.plantje){
                System.out.println("De cactus groet niet");
            } else if (myArray[i] == cactus2.plantje){
                System.out.println("De cactus groeit niet");
            } else {
                System.out.println("Er ging iets fout");
            }
            }
        }

    }

class Plant{
    int lengte;
    void groeien(){
        System.out.println("de plant groeit");

    }
}
class Cactus {
    Plant plantje = new Plant();
    void groeien(){
        System.out.println("de cactus groeit");

    }
}
class Collega{
    void waterGeven(int mililiter){

    }
    Plant[] myArray = new Plant[]{};
}


