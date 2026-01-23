public class song{
    public static void main(String args[]){
        song01();
        song02();
        song03();
        song04();
        song05();
        song06();
    }
    static String cat(){
        String n = "cat";
        return n;
    }
    static String hen(){
        String n = "hen";
        return n;
    }
    static String goose(){
        String n = "goose";
        return n;
    }
    static String duck(){
        String n = "duck";
        return n;
    }
    static String sheep(){
        String n = "sheep";
        return n;
    }

    static void song01(){
        String animal01 = cat();
        String word01 = "Bought me a " + animal01 + " and the " + animal01 +" pleased me.";
        String word02 = "I fed my " + animal01 + " under yonder tree";
        String result = animal01.substring(0, 1).toUpperCase() + animal01.substring(1);
        String word03 = result + " Goes fiddle-i-fee. ";
        System.out.println(word01);
        System.out.println(word02);
        System.out.println(word03);
        System.out.println();
    }
    static void song02(){
        String animal01 = hen();
        String animal02 = cat();
        String word01 = "Bought me a " + animal01 + " and the " + animal01 +" pleased me.";
        String word02 = "I fed my " + animal01 + " under yonder tree";
        String result = animal01.substring(0, 1).toUpperCase() + animal01.substring(1);
        String word03 = result + " goes chimmy-chuck, chimmy-chuck,";
        String word04 = animal02.substring(0, 1).toUpperCase() + animal02.substring(1) + " goes fiddle-i-fee.";
        System.out.println(word01);
        System.out.println(word02);
        System.out.println(word03);
        System.out.println(word04);
        System.out.println();
    }
    static void song03(){
        String animal01 = duck();
        String animal02 = hen();
        String animal03 = cat();
        String word01 = "Bought me a " + animal01 + " and the " + animal01 +" pleased me.";
        String word02 = "I fed my " + animal01 + " under yonder tree";
        String result = animal01.substring(0, 1).toUpperCase() + animal01.substring(1);
        String word03 = result + " goes quack, quack,";
        String word04 = animal02.substring(0, 1).toUpperCase() + animal02.substring(1) + " goes chimmy-chuck, chimmy-chuck,";
        String word05 = animal03.substring(0, 1).toUpperCase() + animal03.substring(1) + " goes fiddle-i-fee.";
        System.out.println(word01);
        System.out.println(word02);
        System.out.println(word03);
        System.out.println(word04);
        System.out.println(word05);
        System.out.println();
    }
    static void song04(){
        String animal01 = goose();
        String animal02 = duck();
        String animal03 = hen();
        String animal04 = cat();
        String word01 = "Bought me a " + animal01 + " and the " + animal01 +" pleased me.";
        String word02 = "I fed my " + animal01 + " under yonder tree";
        String result = animal01.substring(0, 1).toUpperCase() + animal01.substring(1);
        String word03 = result + " goes hissy, hissy,";
        String word04 = animal02.substring(0, 1).toUpperCase() + animal02.substring(1) + " goes quack, quack,";
        String word05 = animal03.substring(0, 1).toUpperCase() + animal03.substring(1) + " goes chimmy-chuck, chimmy-chuck,";
        String word06 = animal04.substring(0, 1).toUpperCase() + animal04.substring(1) + " goes fiddle-i-fee.";
        System.out.println(word01);
        System.out.println(word02);
        System.out.println(word03);
        System.out.println(word04);
        System.out.println(word05);
        System.out.println(word06);
        System.out.println();
    }
    static void song05(){
        String animal01 = sheep();
        String animal02 = goose();
        String animal03 = duck();
        String animal04 = hen();
        String animal05 = cat();
        String word01 = "Bought me a " + animal01 + " and the " + animal01 +" pleased me.";
        String word02 = "I fed my " + animal01 + " under yonder tree";
        String result = animal01.substring(0, 1).toUpperCase() + animal01.substring(1);
        String word03 = result + " goes baa, baa,";
        String word04 = animal02.substring(0, 1).toUpperCase() + animal02.substring(1) + " goes hissy, hissy,";
        String word05 = animal03.substring(0, 1).toUpperCase() + animal03.substring(1) + " goes quack, quack,";
        String word06 = animal04.substring(0, 1).toUpperCase() + animal04.substring(1) + " goes chimmy-chuck, chimmy-chuck,";
        String word07 = animal05.substring(0, 1).toUpperCase() + animal05.substring(1) + " goes fiddle-i-fee.";
        System.out.println(word01);
        System.out.println(word02);
        System.out.println(word03);
        System.out.println(word04);
        System.out.println(word05);
        System.out.println(word06);
        System.out.println(word07);
        System.out.println();
    }
    static void song06(){
        String animal01 = "pig";
        String animal02 = sheep();
        String animal03 = goose();
        String animal04 = duck();
        String animal05 = hen();
        String animal06 = cat();
        String word01 = "Bought me a " + animal01 + " and the " + animal01 +" pleased me.";
        String word02 = "I fed my " + animal01 + " under yonder tree";
        String result = animal01.substring(0, 1).toUpperCase() + animal01.substring(1);
        String word03 = result + " goes oink, oink,";
        String word04 = animal02.substring(0, 1).toUpperCase() + animal02.substring(1) + " goes baa, baa,";
        String word05 = animal03.substring(0, 1).toUpperCase() + animal03.substring(1) + " goes hissy, hissy,";
        String word06 = animal04.substring(0, 1).toUpperCase() + animal04.substring(1) + " goes quack, quack,";
        String word07 = animal05.substring(0, 1).toUpperCase() + animal05.substring(1) + " goes chimmy-chuck, chimmy-chuck,";
        String word08 = animal06.substring(0, 1).toUpperCase() + animal06.substring(1) + " goes fiddle-i-fee.";
        System.out.println(word01);
        System.out.println(word02);
        System.out.println(word03);
        System.out.println(word04);
        System.out.println(word05);
        System.out.println(word06);
        System.out.println(word07);
        System.out.println(word08);
        System.out.println();
    }
}

//Bought me a cat and the cat pleased me,
//I fed my cat under yonder tree.
//Cat goes fiddle-i-fee.

//Bought me a hen and the hen pleased me,
//I fed my hen under yonder tree.
//Hen goes chimmy-chuck, chimmy-chuck,
//Cat goes fiddle-i-fee.

/* 
Bought me a duck and the duck pleased me,
I fed my duck under yonder tree.
Duck goes quack, quack,
Hen goes chimmy-chuck, chimmy-chuck,
Cat goes fiddle-i-fee.

Bought me a goose and the goose pleased me,
I fed my goose under yonder tree.
Goose goes hissy, hissy,
Duck goes quack, quack,
Hen goes chimmy-chuck, chimmy-chuck,
Cat goes fiddle-i-fee.

Bought me a sheep and the sheep pleased me,
I fed my sheep under yonder tree.
Sheep goes baa, baa,
Goose goes hissy, hissy,
Duck goes quack, quack,
Hen goes chimmy-chuck, chimmy-chuck,
Cat goes fiddle-i-fee.

Bought me a pig and the pig pleased me,
I fed my pig under yonder tree.
Pig goes oink, oink,
Sheep goes baa, baa,
Goose goes hissy, hissy,
Duck goes quack, quack,
Hen goes chimmy-chuck, chimmy-chuck,
Cat goes fiddle-i-fee.

*/