DROP TABLE IF EXISTS games;

CREATE TABLE games (
                       id   BIGSERIAL PRIMARY KEY,
                       title VARCHAR(255) NOT NULL,
                       platform VARCHAR(255) NOT NULL,
                       release_year NUMERIC NOT NULL,
                       price NUMERIC (4,2) NOT NULL,  --PREGUNTAR CLIENTE SI MÁS ADELANTE AÑADIRÁ ALGUN JUEGO O CONSOLA PRECIO SUPERIOR A 99.99--
                       tag VARCHAR(255),
                       discount INTEGER,
                       discount_price NUMERIC (4,2),
                       category VARCHAR(255) NOT NULL,
                       publisher VARCHAR(255) NOT NULL,
                       pegi INTEGER NOT NULL,
                       pegi_descriptor VARCHAR(255),
                       photo VARCHAR (64) --NOT NULL

);