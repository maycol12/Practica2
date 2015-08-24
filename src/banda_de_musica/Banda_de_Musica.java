/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banda_de_musica;

/**
 *
 * @author Michael
 */
public class Banda_de_Musica
{

    public static void main(String[] args) 
    {
        Instrumentos ins = new Instrumentos();
        IViento iviento = new IViento();
        ICuerda icuerda = new ICuerda();
        IPercusion ipercusion = new IPercusion();
        Flauta flauta = new Flauta();
        Trompeta trompeta = new Trompeta();
        Tuba tuba =  new Tuba();
        Saxofon saxofon = new Saxofon();
        GuitarraAcus guitarraacus = new GuitarraAcus();
        GuitarraClas  guitarraclas = new GuitarraClas();
        GuitarraElec guitarraelec = new GuitarraElec();
        Violin violin = new Violin();
        Arpa arpa = new Arpa();
        Bateria bateria = new Bateria();
        Bombo bombo = new Bombo();
        Timbales timbales = new Timbales();
        Caja caja = new Caja();
        ins.tocar('A');
        
        iviento.tocar('1');
        flauta.tocar('D');
        trompeta.tocar('E');
        tuba.tocar('F');
        saxofon.tocar('G');
        
        
        
        icuerda.tocar('2');
        guitarraacus.tocar('H');
        guitarraclas.tocar('I');
        guitarraelec.tocar('J');
        violin.tocar('K');
        arpa.tocar('L');
        
        ipercusion.tocar('3');
        bateria.tocar('M');
        bombo.tocar('N');
        timbales.tocar('Ñ');
        caja.tocar('O');
     
    }
    
}

// Instrumento[] i =new Instrumento[2];
//i[0] = new Flauta();
//i[1] = new Trompeta();
//i[0].tocar('C');
//i[1].tcar('C')


  // trompeta tr = new Trompeta();
// flauta f1 =  new Flauta();
// Integrante ramon = new Integrante(tr);
//ramon.tocarInstrumento()

//ramon.cambiarInstrumento(f1);
//ramon.tocarinstrumento();


// modificadores de acceso tarea.