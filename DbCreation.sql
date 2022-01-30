use reviews;

CREATE TABLE reviews (
    id int NOT NULL AUTO_INCREMENT,
    product_id varchar(255),
	rating int,
	review_text varchar(255),
    measured_date_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (id)
);


insert into reviews values('0PUK6V6EV0', 1, 'bad candle');
insert into reviews values('0PUK6V6EV0', 2, 'poor quality'  );
insert into reviews values('0PUK6V6EV0', 2, 'Hello'  );
insert into reviews values('0PUK6V6EV0', 5, ''  );
insert into reviews values('0PUK6V6EV0', 5, 'Na ja'  );
insert into reviews values('0PUK6V6EV0', 3, ''  );
insert into reviews values('0PUK6V6EV0', 2, ''  );
insert into reviews values('0PUK6V6EV0', 1, ''  );
insert into reviews values('0PUK6V6EV0', 3, ''  );
insert into reviews values('0PUK6V6EV0', 3, '' );