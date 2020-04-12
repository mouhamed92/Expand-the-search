
class Unit {
    String nameUnit;

    public Unit(String name){
        nameUnit = name;
    }
}

class Knight {
    String nameKnight;

    public Knight(String name){
        nameKnight = name;
    }
}

class General {
    String nameGeneral;

    public General(String name){
        nameGeneral = name;
    }
}

class Doctor {
    String nameDoctor;

    public Doctor(String name) {
        nameDoctor = name;
    }
}

public static void createArmy(){

    Unit unit1 = new Unit("unit 1");
    Unit unit2 = new Unit("unit 2");
    Unit unit3 = new Unit("unit 3");
    Unit unit4 = new Unit("unit 3");
    Unit unit5 = new Unit("unit 5");

    Knight knight1 = new Knight("Knight 1");
    Knight knight2 = new Knight("Knight 2");
    Knight knight3 = new Knight("Knight 3");

    General general = new General("general");

    Doctor doctor = new Doctor("doctor");



}

    public static void main(String[] args) {

        createArmy();

    }