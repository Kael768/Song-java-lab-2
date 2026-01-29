public class song02 {
    public static void main(String [] args){
        result();
    }
    public static void result(){
        String[] animals = {"cat", "hen", "duck", "goose", "sheep", "pig"};
        String[] sounds = {"fiddle-i-fee", "chimmy-chuck, chimmy-chuck", "quack, quack", "hissy, hissy", "baa, baa", "oink, oink"};
        
        for(int i = 0; i < animals.length; i++){
            System.out.println("Bought me a " + animals[i] + " and the " + animals[i] + " pleased me,");
            System.out.println("I fed my " + animals[i] + " under yonder tree.");
            for(int j = i; j >= 0; j--){
                String animalCapitalized = animals[j].substring(0, 1).toUpperCase() + animals[j].substring(1);
                System.out.println(animalCapitalized + " goes " + sounds[j] + (j == 0 ? "." : ","));
            }
            System.out.println();
        }
    }
}//nested loops