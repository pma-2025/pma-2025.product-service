CREATE TABLE product
(
    id varchar(36) NOT NULL,
    name varchar(255) NOT NULL,
    price FLOAT NOT NULL,
    unit varchar(64) NOT NULL,
    CONSTRAINT product_pkey PRIMARY KEY (id)
)
