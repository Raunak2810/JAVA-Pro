import java.util.Scanner;
public class LibraryApp {
    static Scanner sc = new Scanner(System.in);
    static LibraryManager library = new LibraryManager();
    public static void main(String[] args) {
        boolean running = true;
        while(running) {
            System.out.println("\n===== Library Management System =====");
            System.out.println("1. Add Book");
            System.out.println("2. Show All Books");
            System.out.println("3. Find Book");
            System.out.println("4. Search Book");
            System.out.println("5. Update Book");
            System.out.println("6. Delete Book");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            String choice = sc.nextLine();
            switch(choice) {
                case "1":
                    addBook();
                    break;
                case "2":
                    library.listAllBooks();
                    break;
                case "3":
                    findBook();
                    break;
                case "4":
                    searchBook();
                    break;
                case "5":
                    updateBook();
                    break;
                case "6":
                    deleteBook();
                    break;
                case "0":
                    running = false;
                    System.out.println("Program closed");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
        sc.close();
    }
    static void addBook(){
        System.out.print("Enter ISBN: ");
        String isbn = sc.nextLine();
        System.out.print("Enter Title: ");
        String title = sc.nextLine();
        System.out.print("Enter Author: ");
        String author = sc.nextLine();
        System.out.print("Enter Year: ");
        int year = Integer.parseInt(sc.nextLine());
        try {
            library.addBook(isbn,title,author,year);
            System.out.println("Book added successfully");
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    static void findBook(){
        System.out.print("Enter ISBN: ");
        String isbn = sc.nextLine();
        try{
            library.findByIsbn(isbn);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    static void searchBook(){
        System.out.print("Enter title: ");
        String title = sc.nextLine();
        library.searchByTitle(title);
    }
    static void updateBook(){
        System.out.print("Enter ISBN: ");
        String isbn = sc.nextLine();
        System.out.print("New title: ");
        String title = sc.nextLine();
        System.out.print("New author: ");
        String author = sc.nextLine();
        System.out.print("New year: ");
        int year = Integer.parseInt(sc.nextLine());
        try{
            library.updateBook(isbn,title,author,year);
            System.out.println("Book updated");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    static void deleteBook(){
        System.out.print("Enter ISBN: ");
        String isbn = sc.nextLine();
        try{
            library.deleteBook(isbn);
            System.out.println("Book deleted");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}