USE `full-stack-ecommerce`;

-- clean up previous database tables

-- disable the foreign key constraint checks
SET FOREIGN_KEY_CHECKS=0;


TRUNCATE customer;
TRUNCATE orders;
TRUNCATE order_item;
TRUNCATE address;

-- re-enable the foreign key constraint checks
SET FOREIGN_KEY_CHECKS=1;


-- make the email address unique
ALTER TABLE customer ADD UNIQUE(email);