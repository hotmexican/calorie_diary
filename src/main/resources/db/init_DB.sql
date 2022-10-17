CREATE TABLE product
(
    product_id                          BIGINT          PRIMARY KEY,
    product_name                        VARCHAR(30)      NOT NULL,
    product_description                 VARCHAR(30)      NOT NULL,
    product_kcal                        INTEGER          NOT NULL
);

CREATE TABLE productlist
(
    list_id                          BIGINT          PRIMARY KEY,
    list_name                        VARCHAR(30)      NOT NULL,
    product_id                       BIGINT          REFERENCES product(product_id)
)