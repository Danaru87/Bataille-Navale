package com.company.objects;

public class Grille {

    private Case[][] grille;

    public Grille(int largeur, int longueur){
        grille = new Case[longueur][largeur];
        for(int i=0; i<longueur; i++){
            for(int j=0; j<largeur; j++){
                grille[i][j] = new Case();
            }
        }
    }

    //Par défaut 10 x 10
    public Grille(){
        grille = new Case[10][10];
        for(int i=0; i<10; i++){
            for(int j=0; j<10; j++){
                grille[i][j] = new Case();
            }
        }
    }

    public Case[][] getGrille() {
        return grille;
    }

    public void setGrille(Case[][] grille) {
        this.grille = grille;
    }
}
