SET search_path TO public,postgres;
DROP TABLE IF EXISTS product_reviews;
DROP TABLE IF EXISTS shop_reviews;

CREATE TABLE product_reviews (
    id int NOT NULL AUTO_INCREMENT,
    product_id varchar(255),
	rating int,
    PRIMARY KEY (id)
);

CREATE TABLE shop_reviews (
    id int NOT NULL AUTO_INCREMENT,
	rating int,
    PRIMARY KEY (id)
);