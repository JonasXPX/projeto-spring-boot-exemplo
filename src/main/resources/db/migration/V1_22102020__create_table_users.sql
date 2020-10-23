CREATE TABLE usuario (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(255),
    idade INT(3),
    cpf VARCHAR(14)
);

CREATE TABLE sala (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    numero INT(10),
    capacidade INT(10),
    UNIQUE(numero)
);

CREATE TABLE usuario_sala (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    id_usuario BIGINT,
    id_sala BIGINT,
    FOREIGN KEY (id_usuario) REFERENCES usuario(id),
    FOREIGN KEY (id_sala) REFERENCES sala(id)
)
