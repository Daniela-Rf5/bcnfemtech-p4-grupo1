DROP TABLE IF EXISTS games;

CREATE TABLE games (
                       id   BIGSERIAL PRIMARY KEY,
                       title VARCHAR(255) NOT NULL,
                       platform VARCHAR(255) NOT NULL,
                       yearR NUMERIC NOT NULL,
                       price NUMERIC (5,2) NOT NULL,
                       tag VARCHAR(255),
                       discount VARCHAR(255),
                       discounted NUMERIC ,
                       category VARCHAR(255) NOT NULL,
                       publisher VARCHAR(255) NOT NULL,
                       pegi VARCHAR(255) NOT NULL,
                       descripter VARCHAR(255)

);