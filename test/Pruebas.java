/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import dstp7.model.DiaSemana;
import dstp7.model.Negocio;
import dstp7.model.Venta;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 
 */
public class Pruebas {
    
    public Pruebas() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("setUpClass");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("tearDownClass");
    }
    
    @Before
    public void setUp() {
        System.out.println("setUp");
        Negocio.Iniciar();
        Venta venta = new Venta();
    }
    
    @After
    public void tearDown() {
        System.out.println("tearDown");
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void Regla1Prueba1() {
        //Definicion
       
        Venta venta = new Venta();
        venta.AgregarDetalle(Negocio.Productos()[5], 2);
        double descuento;
        
        //Ejecucion
        venta.CalcularDescuentos(DiaSemana.Lunes);
        descuento = venta.Descuento();
        
        //Comprobacion
        assertEquals(7.5, descuento, 0);
    }
    
     @Test
    public void Regla1Prueba2() {
        //Definicion
       
        Venta venta = new Venta();
        venta.AgregarDetalle(Negocio.Productos()[5], 4);
        double descuento;
        
        //Ejecucion
        venta.CalcularDescuentos(DiaSemana.Lunes);
        descuento = venta.Descuento();
        
        //Comprobacion
        assertEquals(15, descuento, 0);
    }
    
      @Test
    public void Regla2Prueba1() {
        //Definicion
        Venta venta = new Venta();
        venta.AgregarDetalle(Negocio.Productos()[0], 15);
        double descuento;
        
        //Ejecucion
        venta.CalcularDescuentos(DiaSemana.Martes);
        descuento = venta.Descuento();
        
        //Comprobacion
        assertEquals(22.5, descuento, 0);
    }   
    
      @Test
    public void Regla2Prueba2() {
        //Definicion
       
        Venta venta = new Venta();
        venta.AgregarDetalle(Negocio.Productos()[4], 20);
        double descuento;
        
        //Ejecucion
        venta.CalcularDescuentos(DiaSemana.Miercoles);
        descuento = venta.Descuento();
        
        //Comprobacion
        assertEquals(80, descuento, 0);
    }
    

    
       @Test
    public void Regla3Prueba1() {
        //Definicion
       
        Venta venta = new Venta();
        venta.AgregarDetalle(Negocio.Productos()[2], 4);
        double descuento;
        
        //Ejecucion
        venta.CalcularDescuentos(DiaSemana.Jueves);
        descuento = venta.Descuento();
        
        //Comprobacion
        assertEquals(36, descuento, 0);
    }
       @Test
    public void Regla3Prueba2() {
        //Definicion
       
        Venta venta = new Venta();
        venta.AgregarDetalle(Negocio.Productos()[3], 2);
        double descuento;
        
        //Ejecucion
        venta.CalcularDescuentos(DiaSemana.Jueves);
        descuento = venta.Descuento();
        
        //Comprobacion
        assertEquals(18, descuento, 0);
}

       @Test
    public void Regla4Prueba1() {
        //Definicion
        
        Venta venta = new Venta();
        venta.AgregarDetalle(Negocio.Productos()[4], 8); //640
        venta.AgregarDetalle(Negocio.Productos()[1], 15); //450
        double descuento;
        
        //Ejecucion
        venta.CalcularDescuentos(DiaSemana.Viernes);
        descuento = venta.Descuento();
        
        //Comprobacion
        assertEquals(109, descuento, 0);
}
      @Test
    public void Regla4Prueba2() {
        //Definicion
        
        Venta venta = new Venta();
        venta.AgregarDetalle(Negocio.Productos()[0], 33);//1650
        double descuento;
        
        //Ejecucion
        venta.CalcularDescuentos(DiaSemana.Domingo);
        descuento = venta.Descuento();
        
        //Comprobacion
        assertEquals(165, descuento, 0);
}   
}