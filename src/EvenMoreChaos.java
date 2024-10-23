import java.util.ArrayList;

public class EvenMoreChaos {
    int chaos = 2;
    ArrayList choas = new ArrayList<String>();
    public static void main(String[] args) {
        EvenMoreChaos chaos = new EvenMoreChaos();
    }
    public EvenMoreChaos(){
        int chaos = 1;
        System.out.println(this.chaos); // What does this line print?

        for(int Chaos = 28; Chaos > 26; Chaos-=2){
            chaos += Chaos + this.chaos;
            Chaos+=1;
        }

        for(int Chaos = 200;Chaos>20;Chaos-=8){
            choas.add(Chaos);
        }

        System.out.println(chaos); // what does this line print?
        this.chaos = chaos(chaos);
        if (this.chaos>78){
            System.out.println("chaos");
        }
        else if (this.chaos<78){
            System.out.println("chaos?");
        }
        else{
            System.out.println("chaos!");
        }
        // which of these conditionals prints?

        chaos = this.chaos/7;

        System.out.println(choas.get(chaos)); // What does this line print?

    }
    public int chaos(int chaos){
        chaos += this.chaos;
        return chaos;
    }
}