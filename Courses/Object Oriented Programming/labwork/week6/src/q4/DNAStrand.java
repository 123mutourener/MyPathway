package q4;

public class DNAStrand {
    private String dna;

    public DNAStrand(String dna) {
        this.dna = dna;
    }

    public boolean isValidDNA() {
        boolean flag = true;
        if(this.dna.equals("") || this.dna == null) {
            flag = false;
        }
        String invalidDNA = this.dna.replace("A", "").replace("C", "").replace("G", "").replace("T", "");
        if(invalidDNA.length() != 0) {
            flag = false;
        }
        return flag;
    }

    public String complementWC() {
        String complementString = this.dna.replace("A", "a").replace("T", "A").replace("a", "T");
        complementString = complementString.replace("C", "c").replace("G", "C").replace("c", "G");
        return complementString;
    }

    public String palindromeWC() {
        String complemeString = complementWC();
        String palindromedString = "";
        for (int i = complemeString.length() - 1; i >= 0; i--) {
            palindromedString += complemeString.charAt(i);
        }
        return palindromedString;
    }

    public boolean containsSequence(String seq) {
        return this.dna.contains(seq);
    }

    public String toString() {
        return this.dna;
    }

    public static void main(String[] args) {
        DNAStrand dna = new DNAStrand("ACGTGACTCTGAGACTC");
        System.out.println("Original DNA Sequence: " + dna);
        if (dna.isValidDNA()) {
            System.out.println("Is valid");
            System.out.println("Complement: " + dna.complementWC());
            System.out.println("WC Palindrome: " + dna.palindromeWC());
        } 
        else {
            System.out.println("Not Valid DNA");
    }
}
}