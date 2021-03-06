package by.itacademy.newsproject.service;

import java.util.List;

import by.itacademy.newsproject.entity.News;

public interface NewsService {
    void createNews(News news) throws ServiceException;

    List<News> selectAllNews() throws ServiceException;

    News selectNews(int id) throws ServiceException;

    void deleteNews(int id) throws ServiceException;

    void deleteSelectedNews(int[] id) throws ServiceException;
}