
package numl;


public class decimales {
    
     //////////////////////////////// ///aqui identifico las decimas de un decimal
   public String cientos(int numero) {

        String cadena = new String();
        if ((numero / 100) > 0) {
            if ((numero / 100) == 1) {
                if ((numero % 100) == 0) {
                    cadena = "  cien  ";
                } else {
                    cadena = "  ciento " + cientos(numero % 100);
                }
            } else {
                if ((numero / 100) == 5) {
                    cadena = " Quinientos " + cientos(numero % 100);
                } else {
                    if ((numero / 100) == 9) {
                        cadena = " novecientos " + cientos(numero % 100);
                    } else {
                        cadena = cientos(numero / 100) + " cientos " + cientos(numero % 100);
                    }
                }
            }
        } else {
            cadena = decenas(numero);

        }
        return cadena;
    }

    ////////////////////////////aqui identifico las decenas de un entero
    public String decenas(int numero) {

        String cadena = new String();

        if ((numero / 10) > 0) {
            switch ((int) (numero / 10)) {
                case 1:
                    switch ((int) (numero % 10)) {

                        case 0:
                            cadena = " Diez ";
                            break;
                        case 1:
                            cadena = " Once ";
                            break;
                        case 2:
                            cadena = " Doce ";
                            break;
                        case 3:
                            cadena = " Trece ";
                            break;
                        case 4:
                            cadena = " Catorce ";
                            break;
                        case 5:
                            cadena = " Quince ";
                            break;
                        default:
                            cadena = " Diez y " + decenas(numero % 10);
                            break;
                    }
                    break;///////////

                case 2:
                    switch ((int) (numero % 10)) {
                        case 0:
                            cadena = " veinte ";
                            break;
                        default:
                            cadena = " veinti y " + decenas(numero % 10);
                            break;
                    }
                    break;/////////

                case 3:
                    switch ((int) (numero % 10)) {
                        case 0:
                            cadena = " Treinta ";
                            break;
                        default:
                            cadena = " Treinta y " + decenas(numero % 10);
                            break;
                    }
                    break;/////////

                case 4:
                    switch ((int) (numero % 10)) {
                        case 0:
                            cadena = " Cuarenta ";
                            break;
                        default:
                            cadena = " Cuarenta y " + decenas(numero % 10);
                            break;
                    }
                    break;/////////

                case 5:
                    switch ((int) (numero % 10)) {
                        case 0:
                            cadena = " Cincuenta ";
                            break;
                        default:
                            cadena = " Cincuenta y " + decenas(numero % 10);
                            break;
                    }
                    break;/////////

                case 6:
                    switch ((int) (numero % 10)) {
                        case 0:
                            cadena = " Sesenta ";
                            break;
                        default:
                            cadena = " Sesenta y " + decenas(numero % 10);
                            break;
                    }
                    break;/////////

                case 7:
                    switch ((int) (numero % 10)) {
                        case 0:
                            cadena = " Setenta ";
                            break;
                        default:
                            cadena = " Setenta y " + decenas(numero % 10);
                            break;
                    }
                    break;/////////

                case 8:
                    switch ((int) (numero % 10)) {
                        case 0:
                            cadena = " Ochenta ";
                            break;
                        default:
                            cadena = " Ochenta y " + decenas(numero % 10);
                            break;
                    }
                    break;/////////

                case 9:
                    switch ((int) (numero % 10)) {
                        case 0:
                            cadena = " Noventa ";
                            break;
                        default:
                            cadena = " Noventa y " + decenas(numero % 10);
                            break;
                    }
                    break;/////////
            }
        } else {
            cadena=unidades(numero);
        }return cadena;
}
    
    //odentifico unidades de un entero
    
           public String unidades(int numero) {

        String cadena = new String();  
            switch ((int) (numero)) {

                case 0:
                    cadena = " Cero ";
                    break;
                case 1:
                    cadena = " Uno ";
                    break;
                case 2:
                    cadena = " Dos ";
                    break;
                case 3:
                    cadena = " Tres ";
                    break;
                case 4:
                    cadena = " Cuatro ";
                    break;
                case 5:
                    cadena = " Cinco ";
                    break;
                case 6:
                    cadena = " Seis ";
                    break;
                case 7:
                    cadena = " Siete ";
                    break;
                case 8:
                    cadena = " Ocho ";
                    break;
                case 9:
                    cadena = " Nueve ";
                    break;
            }
        
        
         return cadena;
    }
    

    
    //////////////
       
}
