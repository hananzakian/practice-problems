public class DnaStrand {
    public static void main(String[] args) {

        System.out.println(makeComplement("TTTT"));

    }

    public static String makeComplement(String dna) {

        String dna_comp = "";
        for (int i = 0; i < dna.length(); i++) {
            char letter = dna.charAt(i);
            switch (letter) {
                case 'A': dna_comp += "T"; break;
                case 'T': dna_comp += "A"; break;
                case 'C': dna_comp += "G"; break;
                case 'G': dna_comp += "C"; break;
            }
        }
        return dna_comp;
    }
}
