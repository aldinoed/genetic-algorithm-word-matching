package com.aldinoed.ga;

public class Generation {
    private String allele;
    private boolean match;
    private int fitness;

    Generation(String allele){
        this.allele = allele;
        this.match = false;
    }

    String getAllele(){
        return this.allele;
    }

    void setFitness(int newFitness){
        this.fitness = newFitness;
    }

    void setAllele(String newAllele){
        this.allele = newAllele;
    }

    void setMatch(boolean newMatch){
        this.match = newMatch;
    }
    boolean getMatch(){
        return this.match;
    }

    int getFitness() {
        return fitness;
    }
}
