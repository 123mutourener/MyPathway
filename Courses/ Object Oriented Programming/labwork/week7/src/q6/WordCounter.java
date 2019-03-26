package q6;

import java.util.HashMap;

public class WordCounter {
    private HashMap<Integer, Integer> freqDist = new HashMap<Integer, Integer>();
    private int max = -1;
    private int maxIndex = -1;

    public WordCounter(String[] tokens) {
        wordLengthFreq(tokens);
    }

    public void wordLengthFreq(String[] tokens) {
        this.freqDist.clear();
        for (int i = 0; i < tokens.length; i++) {
            if (freqDist.get(tokens[i].length()) == null) {
                freqDist.put(tokens[i].length(), 1);
            } else {
                freqDist.put(tokens[i].length(), freqDist.get(tokens[i].length()) + 1);
            }
        }
    }

    public HashMap<Integer, Integer> getFreqDist() {
        return this.freqDist;
    }

    public int maxVal() {
        this.max = -1;
        this.maxIndex = -1;
        for (int i : this.freqDist.keySet()) {
            if (this.max < this.freqDist.get(i)) {
                this.max = this.freqDist.get(i);
            }
            if (i > this.maxIndex) {
                this.maxIndex = i;
            }
        }
        return this.max;
    }

    public double[] map2array() {
        this.maxVal();
        double[] arrayValue = new double[this.maxIndex + 1];
        for (int i = 0; i < this.maxIndex + 1; i++) {
            if (this.freqDist.get(i) == null) {
                arrayValue[i] = 0;
            } else {
                arrayValue[i] = (double) this.freqDist.get(i) / this.max * 100;
            }
        }
        return arrayValue;
    }

    public static void main(String[] args) {
    }
}