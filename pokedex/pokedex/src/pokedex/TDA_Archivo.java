/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokedex;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 *
 * @author alex
 */
public class TDA_Archivo {

    String nombre;

    public TDA_Archivo(String nombre) {
        this.nombre = nombre;
    }

    void Agregar(Object x) {
        FileWriter fichero = null;
        PrintWriter pw = null;
        try {
            fichero = new FileWriter(nombre + ".txt",true);
            pw = new PrintWriter(fichero);

            pw.append(x.toString());

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != fichero) {
                    fichero.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    String Buscar(int x) {
        int cont = 0;
        String temp = "";

        try {
            String s1;
            String s2;

            BufferedReader br = new BufferedReader(new FileReader(nombre + ".txt"));

            s1 = br.readLine();

            int numTokens = 0;
            StringTokenizer st = new StringTokenizer(s1, "~");

            while (st.hasMoreTokens()) {
                s2 = st.nextToken();
                numTokens++;
                if (cont == x) {
                    temp = s2;
                }
                cont++;
            }

            br.close();
        } catch (Exception e) { //Catch de excepciones
            System.err.println("Ocurrio un error: " + e.getMessage());
        }
        return temp;
    }

    void Listar() {
        try {
            String s1;
            String s2;

            BufferedReader br = new BufferedReader(new FileReader(nombre + ".txt"));

            s1 = br.readLine();

            int numTokens = 0;
            StringTokenizer st = new StringTokenizer(s1, "~");

            while (st.hasMoreTokens()) {
                s2 = st.nextToken();
                System.out.println(s2 + "\n");
                numTokens++;
            }

            br.close();
        } catch (Exception e) { //Catch de excepciones
            System.err.println("Ocurrio un error: " + e.getMessage());
        }
    }

    void Borrar(int x) {
        int cont = 0;
        String temp = "";

        try {
            String s1;
            String s2;

            BufferedReader br = new BufferedReader(new FileReader(nombre + ".txt"));

            s1 = br.readLine();

            int numTokens = 0;
            StringTokenizer st = new StringTokenizer(s1, "~");

            while (st.hasMoreTokens()) {
                s2 = st.nextToken();
                numTokens++;
                if (cont == x) {
                    temp += ("*" + s2 + "~");
                } else {
                    temp += (s2 + "~");
                }
                cont++;
            }

            br.close();

            FileWriter fichero = null;
            PrintWriter pw = null;
            try {
                fichero = new FileWriter(nombre + ".txt");
                pw = new PrintWriter(fichero);

                pw.println(temp);

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    if (null != fichero) {
                        fichero.close();
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        } catch (Exception e) { //Catch de excepciones
            System.err.println("Ocurrio un error: " + e.getMessage());
        }
    }

    void Modificar(int x, String s) {
        int cont = 0;
        String temp = "";

        try {
            String s1;
            String s2;

            BufferedReader br = new BufferedReader(new FileReader(nombre + ".txt"));

            s1 = br.readLine();

            int numTokens = 0;
            StringTokenizer st = new StringTokenizer(s1, "~");

            while (st.hasMoreTokens()) {
                s2 = st.nextToken();
                numTokens++;
                if (cont == x) {
                    temp += (s);
                } else {
                    temp += (s2 + "~");
                }
                cont++;
            }

            br.close();

            FileWriter fichero = null;
            PrintWriter pw = null;
            try {
                fichero = new FileWriter(nombre + ".txt");
                pw = new PrintWriter(fichero);

                pw.println(temp);

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    if (null != fichero) {
                        fichero.close();
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        } catch (Exception e) { //Catch de excepciones
            System.err.println("Ocurrio un error: " + e.getMessage());
        }
    }

    void Compactar() {
        int cont = 0;
        String temp = "";

        try {
            String s1;
            String s2;

            BufferedReader br = new BufferedReader(new FileReader(nombre + ".txt"));

            s1 = br.readLine();

            int numTokens = 0;
            StringTokenizer st = new StringTokenizer(s1, "~");

            while (st.hasMoreTokens()) {
                s2 = st.nextToken();
                numTokens++;
                if (s2.contains("*")) {

                } else {
                    temp += (s2 + "~");
                }
            }

            br.close();

            FileWriter fichero = null;
            PrintWriter pw = null;
            try {
                fichero = new FileWriter(nombre + ".txt");
                pw = new PrintWriter(fichero);

                pw.println(temp);

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    if (null != fichero) {
                        fichero.close();
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        } catch (Exception e) { //Catch de excepciones
            System.err.println("Ocurrio un error: " + e.getMessage());
        }
    }

    void Eliminar() {
        File x = new File(nombre + ".txt");
        x.delete();
    }
    
    int size(){
        int tamaño=0;
        
        try {
            String s1;
            String s2;

            BufferedReader br = new BufferedReader(new FileReader(nombre + ".txt"));

            s1 = br.readLine();

            int numTokens = 0;
            StringTokenizer st = new StringTokenizer(s1, "~");

            while (st.hasMoreTokens()) {
                s2 = st.nextToken();
                tamaño++;
                numTokens++;
            }

            br.close();
        } catch (Exception e) { //Catch de excepciones
            System.err.println("Ocurrio un error: " + e.getMessage());
        }
        return tamaño;
    }
}
