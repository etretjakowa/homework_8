
package ru.skypro;

public class Main {


    public static void main(String[] args) {

        Author bulgakov = new Author("Mikhail", "Bulgakov");
        Author dreiser = new Author("Theodore", "Dreiser");

        Book theWhiteGuard = new Book(bulgakov, "The White Guard", 2008);
        Book titan = new Book(dreiser, "Titan", 2016);

        titan.setPublicationYear(2021);
        System.out.println("Титан - " + titan.getPublicationYear() + " год переиздания.");
    }
}
