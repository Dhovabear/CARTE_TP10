package fr.progObj.tp9;

import java.util.Random;

public class Main {

    public static void main(String[] args){
        Random r = new Random();
        Poullailler p = new Poullailler();

        Poulet.setPoidsAbattage(5.5f);
        Canard.setPoidsAbattage(2.6f);

        for (int i = 0; i < 40 ; i++){
            Volaille v;
            if(r.nextBoolean()){
                v = new Poulet(3 + r.nextFloat() * (6 - 3));
            }else{
                v = new Canard(0.72f + r.nextFloat() * (3 - 0.72f));
            }
            p.addVolaille(v);
        }

        p.volailleAAbattre();
    }

}
