CREATE TABLE coupon (
    id INT AUTO_INCREMENT PRIMARY KEY,
    code VARCHAR(20),
    discount DECIMAL(8,3),
    exp_date VARCHAR(100)
);

SELECT * FROM product;
SELECT * FROM coupon;