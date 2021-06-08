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
   * nombre del empleado
   */
  private String nombre;
  /**
   * apellido del empleado
   */
  private String apellido;
  /**
   * edad del empleado
   */
  private int edad;
  /**
   * salario del empleado
   */
  private double salario;

/**
 * 
 * @param nombre del empleado 
 * @param apellido del empleado 
 * @param edad del empleado 
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
   * asigna la edad del empleado
   * @param edad edad del empleado
   * @throws EdadIncorrectaException Si al edad es menor que 1 o mayor que 100
   */
  private void setEdad(int edad) throws EdadIncorrectaException {
    if (edad<=1 || edad >= 100) {
      throw new EdadIncorrectaException("La edad debe ser un valor entre 1 y 100");
    }
    /**
     * 
     * asignamos la edad del empleado a this.edad
     */
    this.edad=edad;
  }
  /**
   * devuelve el nombre del empleado
   * @return nombre del empleado (String)
   */
  public String getNombre() {
    return nombre;
  }

  /**
   * devuelve el apellido del empleado
   * @return apellido del empleado 
   */
  public String getApellido() {
    return apellido;
  }

  /**
   * devuelve la edad del empleado
   * @return edad del empleado 
   */
  public int getEdad() {
    return edad;
  }

  /**
   * devuelve el salario del empleado
   * @return salario del empleado 
   */
  public double getSalario() {
    return salario;
  }

  /**
   * si la edad del empleado es mayor o igual de 40 se suma su salario con el parámetro sueldo plus y devuelve verdadero, si la edad del empleado es menor de 40 devuelve false y no se realiza la suma de su su sueldo actual y su sueldo plus.
   * @param sueldoPlus sueldo para sumar 
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
 * compara el nombre y apellido de dos empleados
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
 * compara las edades para devolve 1,0 o -1 dependiendo si es mayor igual o menor
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
 * devuelve una cadena que representa el empleado
 */
  public String toString (){
    String mensaje="El empleado se llama "+nombre+" "+apellido+" con "+edad+" años " +
        "y un salario de "+salario;
    return mensaje;
  }




}

