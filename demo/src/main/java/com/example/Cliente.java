package com.example;

import java.util.List;

public class Cliente {
    private String nombre;
    private String apellido;
    private String estadoCivil;
    private String email;
    private String telefono;
    private String ocupacion;
    private String mascotas;
    private List<Animal> animalesAdoptados;

    // Constructor
    public Cliente(String nombre, String apellido, String estadoCivil, String email, String telefono,
                   String ocupacion, String mascotas, List<Animal> animalesAdoptados) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.estadoCivil = estadoCivil;
        this.email = email;
        this.telefono = telefono;
        this.ocupacion = ocupacion;
        this.mascotas = mascotas;
        this.animalesAdoptados = animalesAdoptados;
    }

    public Integer cantAnimalesAdoptados() {
        return animalesAdoptados.size();
    }

    // Métodos getter y setter para acceder a los atributos privados
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getMascotas() {
        return mascotas;
    }

    public void setMascotas(String mascotas) {
        this.mascotas = mascotas;
    }

    public List<Animal> getAnimalesAdoptados() {
        return animalesAdoptados;
    }

    public void setAnimalesAdoptados(List<Animal> animalesAdoptados) {
        this.animalesAdoptados = animalesAdoptados;
    }
}
