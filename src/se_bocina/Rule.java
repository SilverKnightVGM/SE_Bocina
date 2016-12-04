/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se_bocina;

import java.util.ArrayList;

/**
 *
 * @author Enzo
 */
public class Rule {

    //If Part for all rules
    private String pregunta;
    private int valor = -1;    
    //Then Part for ending (R6,R7,etc)
    private String respuesta;    
    //Then Part for more options (R1,R2,etc)
    private ArrayList<Rule> opciones;

    //Constructors
    public Rule(String pregunta, int valor, String respuesta) {
        this.pregunta = pregunta;
        this.valor = valor;
        this.respuesta = respuesta;
    }

    public Rule(String pregunta, int valor, ArrayList<Rule> opciones) {
        this.pregunta = pregunta;
        this.valor = valor;
        this.opciones = opciones;
    }

    //Getters and setters
    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public ArrayList<Rule> getOpciones() {
        return opciones;
    }

    public void setOpciones(ArrayList<Rule> opciones) {
        this.opciones = opciones;
    }

    @Override
    public String toString() {
        return "Rule{" +
                "pregunta='" + pregunta + '\'' +
                ", valor=" + valor +
                ", respuesta='" + respuesta + '\'' +
                '}';
    }
    
    public String toStringArray() {
        return "Rule{" +
                "pregunta='" + pregunta + '\'' +
                ", valor=" + valor +
                ", opciones=" + opciones +
                '}';
    }
    
}
