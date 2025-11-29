CREATE TABLE account
(
    id varchar(36) NOT NULL,
    product_name varchar(255) NOT NULL,
    price FLOAT NOT NULL,
    unit varchar(64) NOT NULL,
    CONSTRAINT account_pkey PRIMARY KEY (id)
)
