SET search_path TO public,postgres;
DROP TABLE IF EXISTS product_reviews;
DROP TABLE IF EXISTS shop_reviews;

CREATE TABLE product_ratings (
    id SERIAL PRIMARY KEY,
    product_id varchar(255),
	rating int
);

CREATE TABLE shop_ratings (
    id SERIAL PRIMARY KEY,
	rating int
);