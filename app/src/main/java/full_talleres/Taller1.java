/*
 * Este es el primer taller de lógica de programación. Tenga en cuenta la siguiente rúbrica que debe ser  
 * tenida en cuenta para cada ejercicio y se basa en los mandamientos del programador. El taller es una 
 * herramienta para comenzar a preparar la evaluación donde los descuentos si van a ser tenidos en cuenta. 
 * Con este taller, usted irá aprendiendo a aplicar buenas prácticas en la programación.
 * 
 * Al valor que obtenga en la evaluación automática de github, se revisará si cumple con buenas prácticas
 * de acuerdo con la siguiente rúbrica que se descuenta en cada ejercicio y es acumulativa:
 * Descuento por quemar valores en el código y no usar constantes: -0.5
 * Descuento por no implementar control de errores con trycatch: -0.8
 * Descuento por no escribir el código ordenado, identado: -0.4
 * 
 * RÉTESE, PÓNGASE A PRUEBA!!!
 * 
 */
package full_talleres;

public class Taller1 {
    
    public static void main(String[] args) {


    }

    /* 
     2.	Diseñe un algoritmo e implemente la función Convertir_km_seg que: reciba una velocidad entera en Km/seg 
     y la convierta a metros/seg y a metros/hora. Retorne un string del tipo: ### m/s - ### m/h. Si hay error, 
     devuelva el string "Error en la conversion"
    */
    public static String Convertir_km_seg(int km_s) { 
        try {    
            final short a = 1000; //factores de conversion 
            final short b = 3600;

            double Me_Seg = km_s*a;
            double Me_Hor = Me_Seg*b;
            String Velocidad =  Me_Seg + " m/s" + " - " + Me_Hor + " m/h";

            return Velocidad;
        } 
        catch (Exception e) {
            return "Error en la conversion";
        }
    }
    /*3. Diseñe un algoritmo e implemente la función Convertir_cm_lt que: reciba una cantidad double expresada en 
    cc (centímetros cúbicos) y devuelva un float con su equivalente en litros. Si hay algún error, retorne 0.
    */
    public static float Convertir_cm_lt(double cc){
        try {
            final short a = 1000;
            float Litr = (float) cc/a;
            return Litr;
        }
        catch (Exception e) {
            return 0;
        }
    }
   /*4.	Diseñe un algoritmo e implemente la función Convertir_us_cops que reciba una cantidad entera de dólares 
   y devuelva su equivalente en pesos usando una TRM de $4170 pesos por cada dólar. La función recibe enteros
   y devuelve enteros, pueden ser grandes. Si hay algún error, retorne -1.
   */
   public static int Convertir_us_cops (int Dolares){
    try {
        short TMR = 4170;
        int COP = Dolares*TMR;
        return COP;
    } 
    catch (Exception e) {
        return -1;
    }
   }
   /*5.	Diseñe un algoritmo e implemente la función Convertir_cent_far que recibe la temperatura real en grados 
   centígrados y la devuelve en grados Fahrenheit (averiguar la fórmula) F = 32 + ( 9 * C / 5). Si hay algún error, 
   retorne 0.
   */
 public static double Convertir_cent_far(int temperaturaR){
    try {
        final byte a = 32;
        final byte b = 9;
        final byte c = 5;
        double Fahrenheit = (a + (b * temperaturaR / c));

        return Fahrenheit;
    }
    catch (Exception e) {
        return 0;
    }
  }
   /*6.	Diseñe un algoritmo e implemente la función Calcular_segs que recibirá el número de Días, el número de horas, 
   el número de minutos y número segundos como enteros bytes, positivos y devuelva todo en segundos en un entero. 
   Si hay algún error, devuelva -1.
   */
public static int Calcular_segs (int dias, int horas, int minutos, int segundos){ /*Al no poder establecer las variables dias, horas, minutos y segundos como bytes, recurro por el uso de int, Nota: no estoy seguro si esto cumple con el enunciado*/
    try {
            if (dias<0 || horas<0 || minutos<0 || segundos < 0) {
                return -1;
            }
            final byte a = 24;
            final byte b = 60;

            int seg_dias = (dias*a*b*b);
            int seg_horas = (horas*b*b);
            int seg_min = (minutos*b);
            int segundos_totales = seg_dias + seg_horas + seg_min + segundos;
            
            return segundos_totales;
    }
    catch (Exception e) {
        return -1;
    }
  }
   /*7.	Un usuario tiene un sistema de báscula para pesar camiones. Diseñe un algoritmo e implemente la función 
   Calcular_peso_carga que reciba un float con el peso total del camión cargado en toneladas y otro float con 
   lo que pesa el camión vacío en toneladas, y devuelva el peso neto de la carga en kilos y toneladas 
   en un string del tipo: "### kilos - ### toneladas". 
   Si hay algún error, devuelva en un string "Error en la función Calcular_peso_carga"*/
public static String Calcular_peso_carga (float Camion_CargaTon, float Camion_VacioTon){
    try {
        final short a = 1000;
        float Carga_Ton = Camion_CargaTon - Camion_VacioTon;
        float Carga_Kg = Carga_Ton * a;
        String Carga = Carga_Kg + " kilos" + " - " + Carga_Ton + " toneladas";
        
        return Carga;
    }
    catch (Exception e) {
        return "Error en la función Calcular_peso_carga";
    }
   }
   /*8.	Diseñe un algoritmo e implemente la función Calcular_horasxviaje que calcule y devuelva un float con las horas  
   necesarias para alcanzar un destino que es recibido en un string, además de un short con la distancia en kms
   otro dato short que es la velocidad  promedio que alcanzará también el vehículo en kilómetros/hora.  
   Si hay algún error, devuelva -1.
   */
   public static float Calcular_horasxviaje(String destino, short kms, short Velocidad_p) {
    try {
        float Horas_N = kms / Velocidad_p;
        return Horas_N;
    }
    catch (Exception e) {
        return -1;
    }
   }
   /*9.	Un avión necesita cargar combustible para cubrir sus rutas programadas en el día. 
   Cada 0.2 toneladas de combustible puede recorrer 60.8 Km en velocidad de crucero. 
   En el despegue el avión consume 1.2 toneladas de combustible y en el aterrizaje consume 0.4 toneladas. 
   
   El piloto desea que sea diseñado un algoritmo e implementado en la función Calcular_combustible, 
   el kilometraje total para cada una de cuatro rutas que son datos enteros, y devuelva un float con la cantidad total 
   de combustible que debe ser cargado en el avión.
   
   Si hay algún error, devuelva -1.*/

   public static float Calcular_combustible (int R1, int R2, int R3, int R4){
    try {
        double a = 1.6; 
        double b = 60.8;
        double c = 0.2;
        double KTR1 =(R1 / b * c + a);
        double KTR2 =(R2 / b * c + a);
        double KTR3 =(R3 / b * c + a);
        double KTR4 =(R4 / b * c + a);
        double CT = (KTR1 + KTR2 + KTR3 + KTR4);

        return (float) CT;
    }
    catch (Exception e) {
        return -1;
    }
   }
   /*10. Diseñe un algoritmo e implemente la función Calcular_peso_luna que recibe un byte con el peso en la tierra en kilos
   y devuelve un double el equivalente de ese peso en la luna en Newtons. Utilice las siguientes fórmulas.
   peso_tierra_new = peso_kilos * 9.81m/s2
   peso_luna_new = peso_tierra_new * 0.165
   
   Si hay algún error, devuelva 0.
   */
    public static double Calcular_peso_luna (byte peso_kilos){
    try { 
        final double a = 9.81;
        final double b = 0.165;
        double peso_tierra_new = peso_kilos * a;
        double peso_luna_new = peso_tierra_new * b;

        return peso_luna_new;
    }
    catch (Exception e) {
       return 0;
    }
  }
}
