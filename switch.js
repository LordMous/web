/*let szam = Number(prompt("Kérek egy számot 1-7ig :"));
let t = "";
switch(szam){
    case 1: t = "Hétfő"; break;
    case 2: t = "Kedd"; break;
    case 3: t = "Szerda"; break;
    case 4: t = "Csütörtök"; break;
    case 5: t = "Péntek"; break;
    default: t = "Hétvége"; break;
}

console.log(t)

while(szam<10){
    console.log(szam)
    szam++
}
*/
//do while - hátultesztelős

/*do{
    console.log(szam)
    szam++
}while(szam>=10)
*/

//kérj egy számot majd 1ig irasd ki csökkenőbe
//kerj 1 nevet 1 szamot es irasd ki a nevet adott szamszor
//kerj egy szamit irasd ki az osztoit
//irj egy programot ami megkerdi van e tantargyad majd 

/*
let szam = prompt("Kérek egy számot :")
while(szam!=0){
    console.log(szam)
    szam--
}

let nev = prompt("Kérek egy nevet :")
let szamm = prompt("Kérek egy uj szamot :")
do{
    console.log(nev)
    szamm--
}while(szamm>=0)
*/

let szammm = prompt("Kérek egy ujjabb szamot :")
valtozo = 1
do{
    if(szammm%valtozo==0){
        console.log(valtozo)
    }
    valtozo++
}while(valtozo!=szammm)

let tantargy = prompt("Adj egy tantargyat :")
while(szam!=0){
    szam=Number(prompt('Adj egy jegyet'))
    


}