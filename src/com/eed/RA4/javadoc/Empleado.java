package com.eed.RA4.javadoc;
/**
 * Clase Empleado que implementa la intefaz comparable para comparar las edades de los empleados
 * @author alejandro
 *
 */
public class Empleado implements Comparable <Empleado>{
  /**
   * Se le asigna el valor 1
   */
  public final static int MAYOR=1;
  /**
   * Se le asigna el valor 0
   */
  public final static int IGUAL=0;
  /**
   * Se le asigna el valor -1
   */
  public final static int MENOR=-1;
  /**
   * atributo nombre tipo String
   */
  private String nombre;
  /**
   * atributo apellido tipo String
   */
  private String apellido;
  /**
   * atributo edad tipo int
   */
  private int edad;
  /**
   * atributo salario tipo double
   */
  private double salario;

/**
 * 
 * @param nombre del empleado (String)
 * @param apellido del empleado (String)
 * @param edad del empleado (int)
 * @param salario del empleado (double)
 * @throws EdadIncorrectaException se lanza si la edad es menor que 1 o mayor que 100
 */
  public Empleado(String nombre, String apellido, int edad, double salario) throws EdadIncorrectaException{
    /**
     * asignamos el nombre del empleado a this.nombre
     */
    this.nombre=nombre;
    /**
     * asignamos el apellido del empleado a this.apellido
     */
    this.apellido=apellido;
    /**
     * asignamos la edad del empleado a this.edad y creamos la excepcion
     */
    setEdad(edad);
    /**
     * asignamos el salario del empleado a this.salario
     */
    this.salario=salario;
  }
  /**
   * 
   * @param edad edad del empleado
   * @throws EdadIncorrectaException Si al edad es menor que 1 o mayor que 100
   */
  private void setEdad(int edad) throws EdadIncorrectaException {
    if (edad<=1 || edad >= 100) {
      throw new EdadIncorrectaException("La edad debe ser un valor entre 1 y 100");
    }
    /**
     * asignamos la edad del empleado a this.edad
     */
    this.edad=edad;
  }
  /**
   * 
   * @return nombre del empleado (String)
   */
  public String getNombre() {
    return nombre;
  }

  /**
   * 
   * @return apellido del empleado (String)
   */
  public String getApellido() {
    return apellido;
  }

  /**
   * 
   * @return edad del empleado (int)
   */
  public int getEdad() {
    return edad;
  }

  /**
   * 
   * @return salario del empleado (double)
   */
  public double getSalario() {
    return salario;
  }

  /**
   * 
   * @param sueldoPlus sueldo para sumar (double)
   * @return un booleano
   */
  public boolean plus (double sueldoPlus){

    boolean aumento=false;
    if (edad>=40){
      salario+=sueldoPlus;
      aumento=true;
    }
    return aumento;
  }

/**
 * 
 * @param a nuevo empleado
 * @return un booleano
 */
  public boolean equals (Empleado a){

    if(a.getNombre().equals(nombre) && a.getApellido().equals(apellido)){
      return true;
    }else{
      return false;
    }
  }
/**
 * @param a Es un nuevo empleado
 * @return entero (1,0,-1)
 */
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
/**
 * Mostrar los datos del empleado
 */
  public String toString (){
    String mensaje="El empleado se llama "+nombre+" "+apellido+" con "+edad+" años " +
        "y un salario de "+salario;
    return mensaje;
  }




}

