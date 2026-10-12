package com.mycompany.estructuradedatos2026;


public class EstructuraDeDatos2026 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args, String numeroTicket) {
    
          byte edad = 20;
            System.out.println("edad:" + edad);
        short year = 2026;
            System.out.println("año:" + year);
        int robux = 50000;
            System.out.println("robux:" + robux);
            System.out.println(robux+1000);
            System.out.println(robux-1000);
            System.out.println(robux/2);
            System.out.println(robux*2);
            System.out.println(++robux);
            System.out.println(--robux);
            System.out.println(robux==2);
            System.out.println(robux>2);
            System.out.println(robux<2);
        long estrellas = 20000000;
            System.out.println("estrellas:"+ estrellas);
        //decimal o flotantes 
        double estatura = 1.69;
            System.out.println("estatura:" + estatura);
        float deuda = 999.99f;
            System.out.println("deuda:" + deuda);
        
        /********CARACTER*******/
        char grupo = 'a';
        char grupo2 = 'Z';
            System.out.println(grupo);
            System.out.println(++grupo);
            System.out.println(++grupo);
            System.out.println(++grupo);
            System.out.println(grupo==grupo2);
            System.out.println(grupo<grupo2);
            System.out.println(grupo>grupo2);
        boolean pago = true; //false
            System.out.println("pago?" + pago);
            System.out.println(pago == true);
            System.out.println(pago != false);
            System.out.println(pago == false);
            System.out.println(pago != false);
            System.out.println("----");
            System.out.println(true && true && true );
            System.out.println(5>2 && 'a' == 'a' && 5.5!=2.5);
            System.out.println(5>2 && 'a' == 'b' && 5.5!=2.5);
            System.out.println(5>20 || 'a' == 'a' || 5.5!=2.5);
            System.out.println(false || false == true || true );
            
        String nombre = "Santiago Martinez";
        System.out.println(nombre);
            
        System.out.println(nombre.charAt(0));
        System.out.println(nombre.charAt(5));
        System.out.println(nombre.length());
        
        for (int i=0; i<nombre.length();i++){
            System.out.println(nombre.charAt(i));
        }
        System.out.println(nombre.toLowerCase());
        System.out.println(nombre.toUpperCase());
        System.out.println(nombre.equals("Santiago Martinez"));
        System.out.println(nombre.equals("Santiago Martinez"));
        System.out.println(nombre.equalsIgnoreCase("Santiago Martinez"));
        
        System.out.println("santiago@gamil.com".indexOf("@"));
        System.out.println("santiago@gamil.com".indexOf(".com"));
        System.out.println("fasdfas.png".endsWith(".jpg")|| "fasdfas.png".endsWith(".png"));
        System.out.println("  ".isEmpty());//vailida que el string este vacio
        System.out.println("  ".isBlank());// valida que este vacio y espacios en blanco
        System.out.println("conejo".replace("o", "e"));
        System.out.println("conejo bonito".replaceFirst("o", "e"));
        System.out.println("juanito".substring(3));
        System.out.println("juanito".substring(3,5));
        
        
        //operaciones aritmeticas
        // - + * /
        
        //operaciones racionales
        //==
        
        //operaciones logicas
        //&& and
        //|| or

        
        Producto producto1;
        
        producto1 = new Producto(
                1,
                "Playera Maja Verde", 
                "PM-V-M-01", 
                'M', 
                (byte)2, 
                (short)2026, 
                100, 
                0.25f, 
                1500.00, 
                true);
        System.out.println("Producto; "+producto1.getNombre());
        System.out.println("Precio: " +producto1.getPrecioUnitario());
        
        
        
        
        
        
        
        
        BoletoAvion BoletoAvion1;
        BoletoAvion1 = new BoletoAvion(
                (long)289032,
                892103,
                (short)39,
                'b',
                (double)280,
                1200.32f,
                25,
                2500f,
                true);
        System.out.println("Boleto de Avion: " + numeroTicket);
        
        
        Paciente Paciente1;
        Paciente1 = new Paciente(
                2515462,
                "Santiago Martinez Gonzalez",
                (byte)18,
                "Masculino",
                80,
                9.6f,
                69.0f,
                1.3f,
                true);
               
                
                    
        
        
    
                /** CLASE BoletoAvion
     * numeroTicket
     * codigoRserva
     * asientoFila
     * asientoLetra
     * distacniaKm
     * altitud
     * pesoEquipajeKg
     * precioBoleto
     * IncluyeEquipajeDeMano
     */
    /*
     * Clase Paciente
     * numerosegurosocial
     * nombreCompleto
     * edad
     * sexobiologico
     * glucosa
     * globulosrojos
     * temperaturacorporal
     * dosisMedicamentoMl
     * esAlergicoPenicilina
     */
          
   
 } 
}