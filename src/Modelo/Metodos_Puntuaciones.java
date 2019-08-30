/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author darkm
 */
public class Metodos_Puntuaciones {
    ArrayList<Puntuacion> puntuaciones,paux;
    Puntuacion puntuacion;
    ObjectInputStream archivoEntrada;
    ObjectOutputStream archivoSalida;
    int puntuacionMenor;
    public Metodos_Puntuaciones() {
        if(cargarArchivo())
        {
            leerInformacion();
        }
        else
        {
            crearArchivo();
        }
    }
    public void recibirPuntuacion(int puntos,String nombre,String fecha)
    {
        puntuacion=new Puntuacion(puntos,nombre,fecha);
    }
    public void agregarPuntuaciones()
    {
        paux=puntuaciones;
        int tampaux=paux.size();
        if(puntuaciones.isEmpty())
        {
            puntuaciones.add(0, puntuacion);
        }
        else
        {
            if(revisarPuntuacion(puntuacion.getPuntos()))
            {
                puntuaciones=new ArrayList<Puntuacion>();
                for(int contador=0;contador<puntuacionMenor;contador++)
                {
                    puntuaciones.add(paux.get(contador));
                }
                puntuaciones.add(puntuacion);
                if(tampaux>10)
                    tampaux=10;
                for(int contador=puntuacionMenor+1;contador<tampaux+1;contador++)
                {
                    puntuaciones.add(paux.get(contador-1));
                }
            }
        }
        escribirInformacion();
    }
    public int getMenorPuntuacion()
    {
        return puntuaciones.get(puntuacionMenor).getPuntos();
    }
    public boolean revisarPuntuacion(int puntuacion)
    {
        boolean p=false;
        if(puntuaciones.isEmpty())
        {
            puntuacionMenor=0;
            return true;
        }
        else
        {
            if(puntuaciones.get(puntuaciones.size()-1).getPuntos()>puntuacion && puntuaciones.size()<10)
            {
                puntuacionMenor=puntuaciones.size();
                return true;
            }
            if(puntuaciones.get(puntuaciones.size()-1).getPuntos()>puntuacion && puntuaciones.size()>=10)
            {
                return false;
            }
            for(int contador=0;contador<puntuaciones.size();contador++)
            {
                if(puntuaciones.get(contador).getPuntos()==puntuacion && contador!=9)
                {
                    puntuacionMenor=contador+1;
                    return true;
                }
            }
            for(int contador=0;contador<puntuaciones.size();contador++)
            {
                if(puntuaciones.get(contador).getPuntos()<puntuacion)
                {
                    puntuacionMenor=contador;
                    return true;
                }
            }
        }
        return p;
    }
    public void agregarPuntuacion(Puntuacion puntuacion)
    {
        puntuaciones.add(puntuacion);
    }
    public String[][] devolverMatriz()
    {
        String matriz[][]=new String[10][3];
        int control=puntuaciones.size();
        int contadorAux=0;
        if(puntuaciones.size()>10)
        {
            control=10;
        }
        for(int contador=0;contador<control;contador++)
        {
            contadorAux=puntuaciones.size();
            matriz[contador][0]=puntuaciones.get(contador).getNombre();
            matriz[contador][1]=""+puntuaciones.get(contador).getPuntos();
            matriz[contador][2]=puntuaciones.get(contador).getFecha();
        }
        for(int contador=contadorAux;contador<10;contador++)
         {
             matriz[contador][0]="";
             matriz[contador][1]="";
             matriz[contador][2]="";
         }
        return matriz;
    }
    public boolean cargarArchivo()
    {
        boolean encontrado=false;
        
        try
        {
            archivoEntrada=new ObjectInputStream(new FileInputStream("Puntuacion.dat"));
            encontrado=true;
        }
        catch(Exception e)
        {
            System.out.println("No se pudo cargar el archivo de Puntuacion. "+e);
        }
        return encontrado;
    }
    public void leerInformacion()
    {
        puntuaciones=new ArrayList<Puntuacion>();
       try
       {
           while(true)
           {
           puntuaciones.add((Puntuacion)archivoEntrada.readObject());
           }
       }
       catch(EOFException e)
       {
       }
       catch(Exception e)
       {
           System.out.println("Error al leer informacion del archivo Puntuacion. "+e);
       }
    }
    public void crearArchivo()
    {
        try
        {
            archivoSalida=new ObjectOutputStream(new FileOutputStream("Puntuacion.dat"));
            puntuaciones=new ArrayList<Puntuacion>();
        }
        catch(Exception e)
        {
            System.out.println("Error creando el archivo de Puntuacion. "+e);
        }
    }
    public void escribirInformacion()
    {
        try
        {
            archivoSalida=new ObjectOutputStream(new FileOutputStream("Puntuacion.dat"));
            for(int contador=0;contador<puntuaciones.size();contador++)
            {
                archivoSalida.writeObject(puntuaciones.get(contador));
            }
        }
        catch(Exception e)
        {
            System.out.println("Error al escribir informacion en el archivo Puntuacion. "+e);
        }
    }
}
