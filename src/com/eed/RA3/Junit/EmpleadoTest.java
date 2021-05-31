package com.eed.RA3.Junit;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmpleadoTest {
  private static final int EDADINVALIDA_101 = 101;
  private static final int _50 = 50;
  private Empleado alejandro;
  private Empleado carmen;
  @BeforeAll
  static void setUpBeforeClass() throws Exception {}

  @AfterAll
  static void tearDownAfterClass() throws Exception {}

  @BeforeEach
  void setUp() throws Exception {
    alejandro = new Empleado("Alejandro","Rabadan",_50,1110);
    carmen = new Empleado("Carmen", "Sánchez",28,1560);

  }

  @Test
  void plus() {
    //devuelve true porque el empleado tiene mas de 40 años.
    assertTrue(alejandro.plus(100));
    //devuelve false porque el empleado tiene menos de 40 años.
    assertFalse(carmen.plus(100));
  }

  @Test
  void edadIncorrecta() {
    /**creo el objeto jacinto y le coloco una edad fuera del limite de edad para que salte
     * la excepcion
     */   
      Assertions.assertThrows(EdadIncorrectaException.class,()->{
      Empleado jacinto = new Empleado("Jacinto","Lopez",EDADINVALIDA_101,1110);
      });
  }
  @Test
  void compareTo() {
    //El empleado alejandro tiene mas edad que carmen
    assertEquals(Empleado.MAYOR,alejandro.compareTo(carmen));
    //La empleada carmen tiene menos edad que alejandro
    assertEquals(Empleado.MENOR,carmen.compareTo(alejandro));
      Assertions.assertThrows(NullPointerException.class,()->{
        alejandro.compareTo(null);
      });
      Assertions.assertThrows(ClassCastException.class,()->{
        alejandro.compareTo((Empleado)new Object());
      });
  }

}


