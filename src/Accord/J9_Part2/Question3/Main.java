package Accord.J9_Part2.Question3;

/*
    3. International airports have 2 types of memberships for frequent flyers –
        Platinum and Gold. Platinum members are allowed to use lounge and
        waiting room. Gold members can access waiting room only. Analyse and
        create 2 classes for each type of members – one as base and another as
        derived.
 */

class GoldMember{
    void accessWaitingRoom(){
        System.out.println("You are allowed in waiting room");
    }
}

class PlatinumMember extends GoldMember{
    void accessLounge(){
        System.out.println("You are allowed in lounge");
    }
}

public class Main {
    public static void main(String[] args) {
        PlatinumMember obj1 = new PlatinumMember();

        obj1.accessLounge();
        obj1.accessWaitingRoom();
        GoldMember obj = new GoldMember();
        obj.accessWaitingRoom(); // we can't able to access the lounge since it's a type of Gold member object
    }

}
