/*
Csatlós Szabolcs 11.c

1. Mennyi lesz 11 és 16 "bitenkénti kizáró vagy" értéke? Miért?

2. Hozz létre két különböző típusú változót, és alakítsd át egyiket a másikba, oda-vissza!

3. Mennyi lesz 10 és 9 "bitenkénti vagy" értéke? Miért?

4. Mennyi lesz 15 bitenkénti eltolással jobbra kettővel? Írd le a megoldást binárisan is!

5. Mennyi lesz 5 bitenkénti eltolással balra eggyel? Írd le a megoldást binárisan! is
*/
package doga01;

public class Doga01 {

    public static void main(String[] args) {
        //1. feladat
        // 8421
        //01011 =11
        //10000 =16
        //Válasz : 11011 mert ott igaz az érték ahol csak az egyiknél igaz(ha igaz mindekettőnel akkor hamis)
        
        
        //2.feladat
        int i = 10000;
        short s = 100;
        i = s;
        System.out.println(i);
        s = (short)i;
        System.out.println(s);
        //A nagyobba rakjuk a kissebbet elsőnek ezért automatikusan converteli
        
        
        //3.feladat
        // 8421
        // 1010 = 10
        // 1001 = 9
        //Válasz : 1011 mert ha az egyik igaz vagy mindkettő akkor igaz lesz
        
        
        //4.feladat
        // 8421
        // 1111 = 15
        // -> 2
        // 0011 = 3
        //Válasz : 0011 lesz belőle.
        
        
        //5feladat
        // 8421
        // 0101 = 5
        // <- 1 
        // 1010 = 10
        //Válasz : 1010 lesz belőle.
    }
    
}
