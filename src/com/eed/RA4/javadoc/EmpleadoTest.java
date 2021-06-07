package com.eed.RA4.javadoc;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/**
 * Clase Test Empleado
 * @author alejandro
 *
 */
class EmpleadoTest {
  /**
   * Edad de jacinto invalida
   */
  private static final int EDADINVALIDA_101 = 101;
  /**
   * Edad de alejandro
   */
  private static final int _50 = 50;
  /**
   * Empleado alejandro
   */
  private Empleado alejandro;
  /**
   * Empleado Carmen
   */
  private Empleado carmen;
  /**
   * Se ejecuta antes
   * @throws Exception lanza la excepcion
   */
  @BeforeAll
  static void setUpBeforeClass() throws Exception {}
  /**
   * Se ejecuta despues de todo
   * @throws Exception lanza la excepcion
   */
  @AfterAll
  static void tearDownAfterClass() throws Exception {}
  /**
   * 
   * @throws Exception Si hay error al indicar objeto
   */
  @BeforeEach
  /**
   * asigna valores a los objetos empleados
   * @throws Exception
   */
  void setUp() throws Exception {
    /**
     * valores del objeto alejandro
     */
    alejandro = new Empleado("Alejandro","Rabadan",_50,1110);
    /**
     * valores del objeto carmen
     */
    carmen = new Empleado("Carmen", "Sánchez",28,1560);

  }
  
  /**
   * valor Boolean si el empleado es mayor que 40
   */
  @Test
  void plus() {
    /**
     * devuelve true porque el empleado tiene mas de 40 años.
     */
    assertTrue(alejandro.plus(100));
    /**
     * devuelve false porque el empleado tiene menos de 40 años.
     */
    assertFalse(carmen.plus(100));
  }
  /**
   * si la edad es mayor que cien o menor que 1 salta la excepcion
   */
  @Test
  void edadIncorrecta() {
    /**creo el objeto jacinto y le coloco una edad fuera del limite de edad para que salte
     * la excepcion
     */   
      Assertions.assertThrows(EdadIncorrectaException.class,()->{
      Empleado jacinto = new Empleado("Jacinto","Lopez",EDADINVALIDA_101,1110);
      });
  }
  /**
   * Compara edades
   */
  @Test
  void compareTo() {
    /**
     * Devuelve 1 porque mayor es igual a 1 y alejandro es mayor que carmen por lo tanto tmbn devuelve 1
     */
    assertEquals(Empleado.MAYOR,alejandro.compareTo(carmen));
    /**
     * Devuelve -1 porque menor es igual a -1 y carmen es menor que alejandro por lo tanto tmbn devuelve -1
     */
    assertEquals(Empleado.MENOR,carmen.compareTo(alejandro));
    /**
     * Lanza la excepcion NullPointerException
     */
      Assertions.assertThrows(NullPointerException.class,()->{
        alejandro.compareTo(null);
      });
      /**
       * Lanza la excepcion ClassCastExcepction
       */
      Assertions.assertThrows(ClassCastException.class,()->{
        alejandro.compareTo((Empleado)new Object());
      });
  }

}


