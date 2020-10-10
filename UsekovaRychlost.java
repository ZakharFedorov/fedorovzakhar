/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UsekovaRychlost ;

import java.util.Scanner;

/**
 *
 * @author РџРѕР»СЊР·РѕРІР°С‚РµР»СЊ
 */
public class UsekovaRychlost {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double pre_rych, max_rych_kmh, delka_km, rych, cas_o, cas_z_s, cas_k_s, hod_z, min_z, sec_z, hod_k, min_k, sec_k;
        Scanner in = new Scanner(System.in);
        System.out.print("Zadejte max rychlost: ");
        max_rych_kmh = in.nextDouble();
        System.out.print("Zadejte delku: ");
        delka_km = in.nextDouble();
        System.out.print("Zadejte hodin bylo na zacatku: ");
        hod_z = in.nextDouble();
        System.out.print("Zadejte minut bylo na zacatku: ");
        min_z= in.nextDouble();
        System.out.print("Zadejte sekund bylo na zacatku: ");
        sec_z = in.nextDouble();
        cas_z_s = (hod_z * 3600 + min_z * 60 + sec_z);
        System.out.print("Zadejte hodin bylo na konci: ");
        hod_k = in.nextDouble();
        System.out.print("Zadejte minut bylo na konci: ");
        min_k = in.nextDouble();
        System.out.print("Zadejte sekund bylo na konci: ");
        sec_k = in.nextDouble();
        cas_k_s = (hod_k * 3600 + min_k * 60 + sec_k);
        cas_o = (cas_k_s - cas_z_s) / 3600;
        rych = delka_km / cas_o;
        System.out.println( rych + "km/h prunik rychlosti" );
        if (max_rych_kmh < rych) {
            pre_rych = rych - max_rych_kmh;
            System.out.println(pre_rych + "km/h prekroceni rychlosti");
        }
        else { pre_rych = 0 ;
            System.out.println("prekroceni rychlosti neni");
        }
        String pokuta;
        pokuta = (max_rych_kmh > rych) ? "ano" :"ne";
        System.out.print("Treba pokuta: ");
        System.out.println(pokuta);

    }

}
