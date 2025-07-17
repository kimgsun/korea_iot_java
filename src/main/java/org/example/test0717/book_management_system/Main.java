package org.example.test0717.book_management_system;


import org.example.test0717.book_management_system.exception.BookNotFoundException;
import org.example.test0717.book_management_system.model.Book;
import org.example.test0717.book_management_system.service.BookService;
import org.example.test0717.book_management_system.service.BookServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        BookService bookService = new BookServiceImpl();

        // 책 추가
        bookService.addBook(new Book(1, "자바는 재밌어", "이승아"));
        bookService.addBook(new Book(2, "스프링부트는 재밌어", "김은아"));
        bookService.addBook(new Book(3, "스프링부트 스프링부트", "정수정"));

        System.out.println("=== 전체 조회 ===");
        List<Book> books = bookService.getAllBooks();
        for (Book book: books) {
            System.out.println(book);
        }

        System.out.println(); // 줄 바꿈

        System.out.println("=== ID로 수정 ===");
        try {
            bookService.updateBookAuthor(1, "이주은");
            System.out.println("수정이 완료되었습니다.");

            bookService.updateBookAuthor(5, "이승아");
        } catch (BookNotFoundException e) {
            System.out.println("수정 실패: " + e.getMessage());
        }

        System.out.println(); // 줄 바꿈

        System.out.println("=== ID로 검색 ===");
        try {
            bookService.getBookById(1);
            System.out.println(bookService.getBookById(1));

            bookService.getBookById(10);
        } catch (BookNotFoundException e) {
            System.out.println("검색 실패: " + e.getMessage());
        } // 실패

        System.out.println(); // 줄 바꿈

        System.out.println("=== ID로 삭제 ===");
        try {
            bookService.deleteBook(1);
            System.out.println("정상적으로 삭제되었습니다.");

            bookService.getBookById(1);
        } catch (BookNotFoundException e) {
            System.out.println("삭제 실패: " + e.getMessage());
        }

        System.out.println(); // 줄 바꿈

        System.out.println("=== 제목으로 검색 ===");
        String searchTitle = "스프링부트는 재밌어";
        List<Book> filteredBooks = bookService.findBookByTitle(searchTitle);
        System.out.println("[ " + searchTitle + " ] 제목으로 검색된 책: ");
        for (Book booksData: filteredBooks) {
            System.out.println(booksData);
        }
    }
}