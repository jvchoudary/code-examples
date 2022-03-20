package com.reflectoring.begginersguide.services;

import com.reflectoring.begginersguide.repository.BookRepository;
import org.springframework.stereotype.Service;

@Service
public class DeleteBookService {

    private final BookRepository bookRepository;

    private final BookMapper bookMapper;

    public DeleteBookService(BookRepository bookRepository,
                             BookMapper getBookMapper) {
        this.bookRepository = bookRepository;
        this.bookMapper = getBookMapper;
    }

    public void delete(long id){
    }

}