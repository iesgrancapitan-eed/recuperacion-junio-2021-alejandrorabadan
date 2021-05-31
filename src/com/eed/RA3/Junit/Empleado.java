package com.eed.RA3.Junit;

public class Empleado implements Comparable <Empleado>{

  public final static int MAYOR=1;

  public final static int IGUAL=0;

  public final static int MENOR=-1;

  private String nombre;

  private String apellido;

  private int edad;

  private double salario;


  public Empleado(String nombre, String apellido, int edad, double salario) throws EdadIncorrectaException{
    this.nombre=nombre;
    this.apellido=apellido;
    setEdad(edad);
    this.salario=salario;
  }

  private void setEdad(int edad) throws EdadIncorrectaException {
    if (edad<=1 || edad >= 100) {
      throw new EdadIncorrectaException("La edad debe ser un valor entre 1 y 100");
    }
    this.edad=edad;
  }

  public String getNombre() {
    return nombre;
  }


  public String getApellido() {
    return apellido;
  }


  public int getEdad() {
    return edad;
  }


  public double getSalario() {
    return salario;
  }


  public boolean plus (double sueldoPlus){

    boolean aumento=false;
    if (edad>=40){
      salario+=sueldoPlus;
      aumento=true;
    }
    return aumento;
  }


  public boolean equals (Empleado a){

    if(a.getNombre().equals(nombre) && a.getApellido().equals(apellido)){
      return true;
    }else{
      return false;
    }
  }

  @Override
  
  public int compareTo(Empleado a){

    int estado=MENOR;
    if(this.edad==a.getEdad()){
      estado=IGUAL;
    }else if(this.edad>=a.getEdad()){
      estado=MAYOR;
    }
    return estado;

  }

  public String toString (){
    String mensaje="El empleado se llama "+nombre+" "+apellido+" con "+edad+" años " +
        "y un salario de "+salario;
    return mensaje;
  }




}

