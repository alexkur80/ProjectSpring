package by.itacademy.newsproject.dao;

import java.util.List;

import by.itacademy.newsproject.entity.News;

public interface NewsDAO {
    void createNews(News news) throws DAOException;

    List<News> selectAllNews() throws DAOException;

    News selectNews(int id) throws DAOException;

    void deleteNews(int id) throws DAOException;

    void deleteSelectedNews(int[] id) throws DAOException;
}