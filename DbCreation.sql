use postgres;

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