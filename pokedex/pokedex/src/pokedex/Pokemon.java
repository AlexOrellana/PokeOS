/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokedex;

/**
 *
 * @author Michelle
 */
public class Pokemon {
    
    private String Nombre;
    private String Apodo;
    private String Descripcion;
    private double Peso;
    private double Altura;
    private String Categoria;
    private String Habilidades;
    private String Genero;
    private String Tipos;
    private String Debilidades;
    private int Hp;
    private int Ataque;
    private int Defensa;
    private int AtaqueEspecial;
    private int DefensaEspecial;
    private int Velocidad;
    private Pokemon Evolucion1;
    private Pokemon Evolucion2;
    private String Imagen;
    
    public Pokemon(String Nombre, String Apodo, String Descripcion, double Peso, double Altura, String Categoria,
            String Habilidades, String Genero, String Tipos, String Debilidades, int Hp, int Ataque, int Defensa, 
            int AtaqueEspecial, int DefensaEspecial, int Velocidad, Pokemon Evolucion1, Pokemon Evolucion2, String Imagen){
        this.Nombre = Nombre;
        this.Apodo = Apodo;
        this.Descripcion = Descripcion;
        this.Peso = Peso;
        this.Altura = Altura;
        this.Categoria = Categoria;
        this.Habilidades = Habilidades;
        this.Genero = Genero;
        this.Tipos = Tipos;
        this.Debilidades = Debilidades;
        this.Hp = Hp;
        this.Ataque = Ataque;
        this.Defensa = Defensa;
        this.AtaqueEspecial = AtaqueEspecial;
        this.DefensaEspecial = DefensaEspecial;
        this.Velocidad = Velocidad;
        this.Evolucion1 = Evolucion1;
        this.Evolucion2 = Evolucion2;
        this.Imagen = Imagen;
    }
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApodo() {
        return Apodo;
    }

    public void setApodo(String Apodo) {
        this.Apodo = Apodo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double Peso) {
        this.Peso = Peso;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double Altura) {
        this.Altura = Altura;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public String getHabilidades() {
        return Habilidades;
    }

    public void setHabilidades(String Habilidades) {
        this.Habilidades = Habilidades;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public String getTipos() {
        return Tipos;
    }

    public void setTipos(String Tipos) {
        this.Tipos = Tipos;
    }

    public String getDebilidades() {
        return Debilidades;
    }

    public void setDebilidades(String Debilidades) {
        this.Debilidades = Debilidades;
    }

    public int getHp() {
        return Hp;
    }

    public void setHp(int Hp) {
        this.Hp = Hp;
    }

    public int getAtaque() {
        return Ataque;
    }

    public void setAtaque(int Ataque) {
        this.Ataque = Ataque;
    }

    public int getDefensa() {
        return Defensa;
    }

    public void setDefensa(int Defensa) {
        this.Defensa = Defensa;
    }

    public int getAtaqueEspecial() {
        return AtaqueEspecial;
    }

    public void setAtaqueEspecial(int AtaqueEspecial) {
        this.AtaqueEspecial = AtaqueEspecial;
    }

    public int getDefensaEspecial() {
        return DefensaEspecial;
    }

    public void setDefensaEspecial(int DefensaEspecial) {
        this.DefensaEspecial = DefensaEspecial;
    }

    public int getVelocidad() {
        return Velocidad;
    }

    public void setVelocidad(int Velocidad) {
        this.Velocidad = Velocidad;
    }

    public Pokemon getEvolucion1() {
        return Evolucion1;
    }

    public void setEvolucion1(Pokemon Evolucion1) {
        this.Evolucion1 = Evolucion1;
    }

    public Pokemon getEvolucion2() {
        return Evolucion2;
    }

    public void setEvolucion2(Pokemon Evolucion2) {
        this.Evolucion2 = Evolucion2;
    }

    public String getImagen() {
        return Imagen;
    }

    public void setImagen(String Imagen) {
        this.Imagen = Imagen;
    }
    
    @Override
    public String toString(){
        return "Nombre=" + Nombre + "Apodo=" + Apodo + "Descripcion=" + Descripcion + "Peso=" + Peso + "Altura=" + Altura
                + "Categoria=" + Categoria + "Habilidades=" + Habilidades + "Genero=" + Genero + "Tipos=" + Tipos + 
                "Debilidades=" + Debilidades + "Hp=" + Hp + "Ataque=" + Ataque + "Defensa=" + Defensa + "AtaqueEspecial=" 
                + AtaqueEspecial + "DefensaEspecial=" + DefensaEspecial + "Velocidad=" + Velocidad + "Evolucion1=" 
                + Evolucion1.Nombre + "Evolucion2" + Evolucion2.Nombre + "Imagen=" + Imagen;
    }    
}