/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokedex;

/**
 *
 * @author alex
 */
public class Usuario {

    String nombre;
    String contraseña;
    String sexo;
    int edad;
    String region;
    TDA_Archivo pokemons = new TDA_Archivo("Pokemons_" + nombre);

    public Usuario(String nombre, String contraseña, String sexo, int edad, String region) {
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.sexo = sexo;
        this.edad = edad;
        this.region = region;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public TDA_Archivo getPokemons() {
        return pokemons;
    }

    public void setPokemons(TDA_Archivo pokemons) {
        this.pokemons = pokemons;
    }

    @Override
    public String toString() {
        return nombre + ";" + contraseña + ";" + sexo + ";" + edad + ";" + region + ";" + pokemons + ";"+"~";
    }

}
