package com.example;

public abstract class Usuario {
    private String nombre;
    private String email;
    private String contraseña;

    public Usuario(String nombre, String email, String contra) {
        this.nombre = nombre;
        this.email = email;
        this.contraseña = contra;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

}
