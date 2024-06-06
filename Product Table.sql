USE mydb;

CREATE TABLE product (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(20),
    description VARCHAR(100),
    price DECIMAL(8,3)
);