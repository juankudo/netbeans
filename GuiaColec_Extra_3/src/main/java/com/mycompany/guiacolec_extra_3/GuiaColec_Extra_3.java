/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.guiacolec_extra_3;

import com.mycompany.guiacolec_extra_3.entities.Book;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author HP-G42
 */
public class GuiaColec_Extra_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        HashSet<Book> books = new HashSet();
        String[] autores = {"Jorge Luis Borges", "Julio Cortázar", "Adolfo Bioy Casares", "Ernesto Sabato", "Manuel Puig"};
        String[] obras = {"El Aleph", "Rayuela", "La invencion de Morel", "El tunel", "El beso de la mujer aranha"};

        char op;
        int choose, cont = 0;
        do {
            Book aux = new Book();
            System.out.println("Enter the book´s title:");
            aux.setTitle(obras[cont]);  
            System.out.println(aux.getTitle());
//            aux.setTitle(sc.next());
            System.out.println("Enter the book´s author:");
            aux.setAuthor(autores[cont]);
            System.out.println(aux.getAuthor());
//            aux.setAuthor(sc.next());
            System.out.println("Enter the number of copies:");
            aux.setCopies((int)Math.floor(Math.random()*11));
            System.out.println(aux.getCopies());
            System.out.println("Enter the number of loaned copies:");
            aux.setLoanedCopies((int)Math.floor(Math.random()*11));
            System.out.println(aux.getLoanedCopies());
            books.add(aux);
            System.out.println("Do you want to continue adding books?(Y/N)");
            op = sc.next().toLowerCase().charAt(0);
            cont++;
        } while (op == 'y');
        do {
            System.out.println("---------------Menu------------------\n"
                    + "1)Lent a book\n"
                    + "2)Return a book\n"
                    + "3)Show all the books\n"
                    + "4)Add a new book\n"
                    + "5)Exit.");
            choose = sc.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("Enter the book´s title:");
                    String title = sc.next();
                    for (Book book : books) {
                        if (book.getTitle().equalsIgnoreCase(title)) {
                            System.out.println((book.loaned()) ? "Succesfully loaned" : "There aren´t enough copies available.");
                        }
                    }
                    break;
                case 2:
                    System.out.println("Enter the book´s title:");
                    title = sc.next();
                    for (Book book : books) {
                        if (book.getTitle().equalsIgnoreCase(title)) {
                            System.out.println((book.returns()) ? "Succesfully return" : "There aren´t loaned copies for return.");
                        }
                    }
                    break;
                case 3:
                    for (Book book : books) {
                        System.out.println(book);
                    }
                    break;
                case 4:
                    Book aux = new Book();
                    System.out.println("Enter the book´s title:");
                    aux.setTitle(sc.next());
                    System.out.println("Enter the book´s author:");
                    aux.setAuthor(sc.next());
                    System.out.println("Enter the number of copies:");
                    aux.setCopies(sc.nextInt());
                    System.out.println("Enter the number of loaned copies:");
                    aux.setLoanedCopies(sc.nextInt());
                    books.add(aux);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Incorrect option. Please try again :-D");
            }
        } while (choose != 5);
    }
}
