drop database if EXISTS JDBC ;
CREATE database JDBC;
USE JDBC;
CREATE TABLE employee(
    id int(15) PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(30),
    gender boolean,
    birth_date DATE,
    salary REAL

);