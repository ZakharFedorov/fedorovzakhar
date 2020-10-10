/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vypocetgeomteles;

import java.util.Scanner;

/**
 *
 * @author Пользователь
 */
public class VypocetGeomTeles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double kva, kvb, kvc, V, kra, kor, cta;
        Scanner in = new Scanner(System.in);
        System.out.print("Zadejte stranu a: ");
        kva = in.nextDouble();
        System.out.print("Zadejte stranu b: ");
        kvb = in.nextDouble();
        System.out.print("Zadejte stranu c: ");
        kvc = in.nextDouble();
        V = kva * kvb * kvc;
        System.out.println(V);
        kra = Math.cbrt(V);
        System.out.println("strana krychte: " + kra);
        kor = Math.cbrt((3 * V)/(4*Math.PI));
        System.out.println("polomer koule: " + kor);
        cta = Math.cbrt((12*V)/(Math.sqrt(2)));
        System.out.println("strana ctyrstena: " + cta);
        
        double kva1, kvb1, kvc1, S, kra1, kor1, cta1;
        System.out.print("Zadejte stranu a: ");
        kva1 = in.nextDouble();
        System.out.print("Zadejte stranu b: ");
        kvb1 = in.nextDouble();
        System.out.print("Zadejte stranu c: ");
        kvc1 = in.nextDouble();
        S = 2*(kva * kvb + kvb * kvc + kvc * kva);
        System.out.println(S);
        kra1 = Math.sqrt(S/6);
        System.out.println("strana krychte: " + kra1);
        kor1 = Math.sqrt(S/(4*Math.PI));
        System.out.println("polomer koule: " + kor1);
        cta1 = Math.sqrt(S/Math.sqrt(3));
        System.out.println("strana ctyrstena: " + cta1);
                
      
    }
}
