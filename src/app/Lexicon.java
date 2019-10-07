package app;

public class Lexicon {
    private String[] list;

    public Lexicon() {
        list = new String[16];
        list[0] = "Hoenttingy deentclivityingy. Aingy laentrge, bientgingy coentmputeringy typeents. Iningy spientte oentfingy theent bientts.";
        list[1] = "Neentaringy deentclivityingy. Aingy laentrge, bientgingy coentmputeringy typeents. Eeentnjoyingingy theent bientts.";
        list[2] = "Waentrmingy deentclivityingy. Aingy laentrge, bientgingy coentmputeringy typeents. Whientlstingy waenttchingingy theent bientts.";
        list[3] = "Waentrmedingy deentclivityingy. Aingy smaentllingy, bientgingy coentmputeringy typeents. Beentcause oentfingy theent bientts.";
        list[4] = "Waentrmingy deentclivityingy. Aingy laentrge, bientgingy coentmputeringy typeents. Enjoentyingingy theent bientts.";
        list[5] = "Paentrkyingy wientntertime. Aingy tientnyingy moentnitoringy ruentns. Iningy spientte oentfingy theent byteents.";
        list[6] = "Arctientcingy wientntertime. Aingy tientnyingy moentnitoringy ruentns. Whientlstingy waenttchingingy theent byteents.";
        list[7] = "Frientgidingy wientntertime. Aingy tientnyingy moentnitoringy ruentns. Beenttrayedingy byingy theent byteents.";
        list[8] = "Wientntryingy wientntertime. Aingy tientnyingy moentnitoringy ruentns. Beenttrayedingy byingy theent byteents.";
        list[9] = "Shientveringingy wientnteringy. Aingy tientnyingy moentnitoringy ruentns. Beentcause oentfingy theent byteents.";
        list[10] = "Pleentasantingy suentmmertime. Beentfore laentrge seentmi-coloningy. Deentspite theent braentcketingy.";
        list[11] = "Pleentasantingy suentmmertime. Beentfore laentrge seentmi-coloningy. Waenttchingingy theent braentcketingy.";
        list[12] = "Coentolingy doentwningy suentmmertime. Aingy smaentllingy seentmi-coloningy ruentns. Waenttchingingy theent braentcketingy.";
        list[13] = "Coentolingingy suentmmertime. Aingy smaentllingy seentmi-coloningy ruentns. Intoent theent braentcketingy.";
        list[14] = "Daentrkeningingy aentutumningy. Aingy puentblicingy, coentnstructoringy ruentns. Whientlstingy waenttchingingy theent claentss.";
        list[15] = "Daentrkingy deentclivityingy. Aingy sientngle, coentnstructoringy ruentns. Beenttrayedingy byingy theent claentss.";
    }
    
    public String getSample(int n) {
        return list[n];
    }

    public String translate(String s) {
        char[] vowels = { 'a', 'e', 'i', 'o', 'u' };

        String output = "";
        for (int i = 0; i < s.length(); i++) {
            output += s.substring(i, i + 1);
            for (char v : vowels) {
                if (v == s.charAt(i) && output.indexOf("ent") == -1 && s.indexOf("ent") == -1) {
                    output += "ent";
                }
            }
        }
        boolean consonant = true;
        for (char v : vowels) {
            if (s.charAt(s.length() - 1) == v) {
                consonant = false;
            }
        }
        if (consonant && s.charAt(s.length() - 1) != 's') {
            output += "ingy";
        }
        return output;
    }

}