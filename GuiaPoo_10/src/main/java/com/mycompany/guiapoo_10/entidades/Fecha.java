/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guiapoo_10.entidades;

/**
 *
 * @author HP-G42
 * Crear una clase Fecha con atributos para el día, mes y año. Se debe incluir al
menos los siguientes métodos:
• Constructor predeterminado con el 1-1-1900 como fecha por defecto
• Constructor parametrizado con día, mes y año ingresados por el usuario.
• Método leer() para pedir al usuario el día (1 a 31), el mes (1 a 12) y el año (1900 a 2050).
• Método bisiesto() para indicar si el año es bisiesto o no.
• Método diasMes(int) para devolver el número de días del mes indicado (para el año
de la fecha).
• Método validar() para comprobar si la fecha es correcta (entre el 1-1-1900 y el 31-12-
2050). Si el día no es correcto, se pondrá en 1; si el mes no es correcto se pondrá en
1; y si el año no es correcto lo pondrá en 1900. Esto último se realizará mediante los
métodos setters de cada atributo. Los setters también se llamarán en el constructor
parametrizado y en el método leer().
• Método diasTranscurridos() para devolver la cantidad de días transcurridos desde el
1-1-1900 hasta la fecha ingresada por el usuario.
• Método diasEntre(Fecha) para devolver el número de días entre la fecha ingresada
por el usuario y la proporcionada como parámetro.
• Método siguiente() para devolver el día siguiente del día de la fecha ingresada.
• Método anterior() para devolver el día anterior del día de la fecha ingresada.
 */
public class Fecha {
    private int día;
    private int mes;
    private int año;
/**
 * Constructor predeterminado con el 1-1-1900 como fecha por defecto
 */
    public Fecha() {
        día = 1;
        mes = 1;
        año = 1990;
    }
    /**
     * Constructor parametrizado con día, mes y año ingresados por el usuario.
     * @param día
     * @param mes
     * @param año 
     */
    public Fecha(int día, int mes, int año) {
        setDía(día);
        setMes(mes);
        setAño(año);
    }

    public void setDía(int día) {
        if (día<=31 && día>=1){ 
            this.día = día;
    }else
            this.día = 1;
    }
    public void setMes(int mes) {
        if (mes<=12&&mes>=1) {
        this.mes = mes;
    }else
            this.mes = 1;
    }

    public void setAño(int año) {
        if (año<=2050&&año>=1900) {
            this.año = año;
        }else
        this.año = 1900;
    }

    public int getDía() {
        return día;
    }

    public int getMes() {
        return mes;
    }

    public int getAño() {
        return año;
    }
//    Método bisiesto() para indicar si el año es bisiesto o no.
    public boolean bisiesto() {
        boolean respond=false;
        if (año % 4 == 0 && !(año % 400 == 0)) {
            respond= true;
        } 
        return respond;
    }
//     Método diasMes(int) para devolver el número de días del mes indicado (para el año
//de la fecha).
    public int diasMes(int mes) {
        int respond=0;
        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12:
                respond = 31;
                break;
            case 4, 6, 9, 11:
                respond = 30;
                break;
            case 2:
                if (bisiesto()) {
                    respond = 29;
                } else {
                    respond = 28;
                }
                break;      
        }
        return respond;
    }
//    Método validar() para comprobar si la fecha es correcta (entre el 1-1-1900 y el 31-12-
//2050). Si el día no es correcto, se pondrá en 1; si el mes no es correcto se pondrá en
//1; y si el año no es correcto lo pondrá en 1900. Esto último se realizará mediante los
//métodos setters de cada atributo. Los setters también se llamarán en el constructor
//parametrizado y en el método leer().
    public void validar()  {
        if (diasMes(mes)<día) 
                día=1; 
        }
    
    /**
     * Método diasTranscurridos() 
     * @return 
     * la cantidad de días transcurridos desde el 1-1-1900 hasta la fecha ingresada por el usuario.
     */
    public int diasTranscurridos()  {
        Fecha fecha=new Fecha();
        int contDia=0;
        for (int i = 1900; i <año; i++) {
            fecha.setAño(i);
            if (fecha.bisiesto()) {
                contDia+=366;
            }else
                contDia+=365;
        }
        for (int i = 1; i < mes; i++) {
            contDia+=diasMes(i);
        }
        contDia+=día;
        return contDia;
    }
/**
 * Método diasEntre(Fecha) 
 * @param fecha
 * @return el número de días entre la fecha ingresada
por el usuario y la proporcionada como parámetro.
 */
    public int diasEntre(Fecha fecha) {
        int contDia = 0, inicio = 0, fin = 0,mesIni=0,diaIni=0,mesFin=0,diaFin=0;
        Fecha aux = new Fecha();
        if (año < fecha.getAño()) {
            inicio = año;
            fin = fecha.getAño();
            mesIni=mes;
            diaIni=día;
            mesFin=fecha.getMes();
            diaFin=fecha.getDía();
        } else if (año > fecha.getAño()) {
            inicio = fecha.getAño();
            fin = año;
            mesIni=fecha.getMes();
            diaIni=fecha.getDía();
            mesFin=mes;
            diaFin=día;
        }else if(mes==fecha.getMes()) {
            mesIni=12;
            diaIni=fecha.getDía();
            if (día<=fecha.getDía()) {
                diaFin=fecha.getDía()-día;
            }else{
                diaFin=día-fecha.getDía();
            }
            
        }
        for (int i = inicio ; i < fin-1; i++) {
            aux.setAño(i);
            if (aux.bisiesto()) {
                contDia += 366;
            } else {
                contDia += 365;
            }
        }
        for (int i = 12; i > mesIni; i--) {
            contDia += diasMes(i);
        }
        if (!(mes==fecha.getMes())) {
             contDia += diasMes(mesIni)-diaIni;
        }
       

        for (int i = 1; i < mesFin; i++) {
            contDia += diasMes(i);
        }
        contDia += diaFin;
        return contDia;
    }
/**
 * Método anterior()  
 * @return 
 * el día anterior del día de la fecha ingresada.
 */
    public Fecha anterior()   {
        Fecha fecha=new Fecha(día, mes, año);
        if(fecha.getDía()==1 && fecha.getMes()==1){
            fecha.setDía(31);
            fecha.setMes(12);
            fecha.setAño(año-1);
        }else if (fecha.getDía()==1) {
            fecha.setDía(diasMes(mes-1));
            fecha.setMes(mes-1);
        }else{
            fecha.setDía(día-1);
        }
        return fecha;
    }

    /**
     *  Método siguiente()
     * @return 
     * el día siguiente del día de la fecha ingresada.
     */
    public Fecha siguiente() {
        Fecha fecha=new Fecha(día, mes, año);
        if (día==diasMes(mes) && mes==12) {
            fecha.setDía(1);
            fecha.setMes(1);
            fecha.setAño(año+1);
        } else if(día==diasMes(mes)) {
            fecha.setDía(1);
            fecha.setMes(mes+1);
        }else{
            fecha.setDía(día+1);
        }
        return fecha;
    }

    @Override
    public String toString() {
        return "Fecha{" + "d\u00eda=" + día + ", mes=" + mes + ", a\u00f1o=" + año + '}';
    }
    
}
