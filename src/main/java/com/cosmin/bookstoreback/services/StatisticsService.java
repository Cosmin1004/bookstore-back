package com.cosmin.bookstoreback.services;

import com.cosmin.bookstoreback.models.Book;
import com.cosmin.bookstoreback.models.Statistics;
import com.cosmin.bookstoreback.models.StatisticsInfo;

import java.util.List;

public interface StatisticsService {

    Statistics createStatistics();

    Integer getNumberOfBooks(List<Book> bookList);

    Integer getNumberOfAvailableBooks(List<Book> bookList);

    StatisticsInfo getNewestBook(List<Book> bookList);

    StatisticsInfo getOldestBook(List<Book> bookList);

    StatisticsInfo getMostExpensiveBook(List<Book> bookList);

    StatisticsInfo getCheapestBook(List<Book> bookList);

}
