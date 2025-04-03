package model;


public class Article {
    private String titulo;
    private String autor;
    private long ISSN;
    private int año;
    private boolean disponible;

    public Article(String titulo, String autor, long ISSN, int año, boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISSN = ISSN;
        this.año = año;
        this.disponible = disponible;
    }

    // Getters y Setters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public long getISSN() {
        return ISSN;
    }

    public int getAño() {
        return año;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

 
    public static boolean validarISSN(long ISSN) {
        return String.valueOf(ISSN).matches("[0-9]{8}");
    }


    @Override
    public String toString() {
        return "Article: " + titulo + " | Autor: " + autor + " | ISSN: " + ISSN + " | Año: " + año + " | Disponible: " + disponible;
    }
}