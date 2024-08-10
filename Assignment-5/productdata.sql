
create database productsdata;
use productsdata;

CREATE TABLE products (
  product_id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    price DECIMAL(10, 2) NOT NULL,
    description VARCHAR(200),
    qty INT,
    reviews_count INT DEFAULT 0
);

-- insert
INSERT INTO products VALUES (NULL, 'camera', 3000,'CCTV', 5, 4);
INSERT INTO products VALUES (NULL, 'butter', 50,'good nutrient', 20, 5);
INSERT INTO products VALUES (NULL, 'shirt', 250,'this is stylish shirt', 10, 5);
INSERT INTO products VALUES (NULL, 'T-shirt', 150,'this is stylish T-shirt', 5, 5);
INSERT INTO products VALUES (NULL, 'table', 450,'this is plastic table', 40, 5);
INSERT INTO products VALUES (NULL, 'chair', 250,'this is small chair', 100, 4);
INSERT INTO products VALUES (NULL, 'duster', 25,'Medium size', 10, 3);
INSERT INTO products VALUES (NULL, 'projector', 1200,'epson model', 15, 4);
INSERT INTO products VALUES (NULL, 'speaker', 500,'34 * 40 inch', 25, 5);
INSERT INTO products VALUES (NULL, 'bench', 450,'plastic bench', 35, 5);
INSERT INTO products VALUES (NULL, 'bags', 300,'this is college bags', 25, 4);
INSERT INTO products VALUES (NULL, 'notebook', 50,'Talent Products', 50, 4);
INSERT INTO products VALUES (NULL, 'keyboard', 400,'36 * 15 inch', 12, 5);
INSERT INTO products VALUES (NULL, 'mouse', 200,'this is wireless mouse', 24, 4);
INSERT INTO products VALUES (NULL, 'CPU', 10000,'Smart CPU', 60, 5);

-- fetch 
SELECT * FROM products;



CREATE TABLE customer (
    customer_id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50),
    email VARCHAR(100),
    mobile VARCHAR(10),
    address VARCHAR(255)
);

-- -- insert
INSERT INTO customer VALUES (NULL,'Abhishek', 'abhi@gmail.com','8805769439','at post ambav');
INSERT INTO customer VALUES (NULL,'Yash', 'abhi@gmail.com','8805769439','at post ambav');
INSERT INTO customer VALUES (NULL,'Raj', 'abhi@gmail.com','8805769439','at post ambav');
INSERT INTO customer VALUES (NULL,'Naresh', 'abhi@gmail.com','8805769439','at post ambav');
INSERT INTO customer VALUES (NULL,'Paresh', 'abhi@gmail.com','8805769439','at post ambav');
INSERT INTO customer VALUES (NULL,'Ganesh', 'abhi@gmail.com','8805769439','at post ambav');
INSERT INTO customer VALUES (NULL,'Ramesh', 'abhi@gmail.com','8805769439','at post ambav');
INSERT INTO customer VALUES (NULL,'Suresh', 'abhi@gmail.com','8805769439','at post ambav');

-- -- fetch 
SELECT * FROM customer;




CREATE TABLE InvoiceDetails (
    invoice_id INT PRIMARY KEY AUTO_INCREMENT,
    customer_id INT REFERENCES customers(customer_id),
    product_id INT REFERENCES products(product_id),
    InvoiceDate DATE NOT NULL,
    DueDate DATE NOT NULL,
    TotalAmount DECIMAL(10, 2) NOT NULL,
    TaxAmount DECIMAL(10, 2),
    Status VARCHAR(20) NOT NULL,
    PaymentMethod VARCHAR(50)
);



INSERT INTO InvoiceDetails (customer_id, product_id, InvoiceDate, DueDate, TotalAmount, TaxAmount, Status, PaymentMethod)
VALUES 
(1, 1, '2024-07-01', '2024-07-15', 150.00, 10.00, 'Paid', 'Credit Card'),
(2, 2, '2024-07-02', '2024-07-16', 200.00, 15.00, 'Unpaid', 'Bank Transfer'),
(3, 3, '2024-07-03', '2024-07-17', 250.00, 20.00, 'Overdue', 'Cash'),
(4, 4, '2024-07-04', '2024-07-18', 300.00, 25.00, 'Paid', 'Credit Card'),
(5, 5, '2024-07-05', '2024-07-19', 350.00, 30.00, 'Unpaid', 'Bank Transfer'),
(6, 1, '2024-07-06', '2024-07-20', 400.00, 35.00, 'Paid', 'Credit Card'),
(7, 2, '2024-07-07', '2024-07-21', 450.00, 40.00, 'Unpaid', 'Bank Transfer'),
(8, 3, '2024-07-08', '2024-07-22', 500.00, 45.00, 'Overdue', 'Cash');

SELECT * FROM InvoiceDetails;


CREATE TABLE OrderDetails (
    OrderDetail_id INT PRIMARY KEY AUTO_INCREMENT,
    InvoiceID INT REFERENCES InvoiceDetails(invoice_id),
    ProductID INT REFERENCES products(product_id),
    Quantity INT,
    Discount DECIMAL(10, 2)
);

INSERT INTO OrderDetails (InvoiceID, ProductID, Quantity, Discount)
VALUES 
(1, 101, 2, 5.00),
(1, 102, 1, 0.00),
(2, 103, 3, 10.00),
(2, 104, 1, 0.00),
(3, 105, 5, 25.00),
(3, 106, 2, 5.00),
(4, 107, 4, 20.00),
(4, 108, 2, 10.00);

SELECT o.InvoiceID, o.ProductID, o.Quantity, p.price, o.Discount ,((o.Quantity * p.price) - (o.Quantity * p.price) * (o.Discount/100)) as TotalCost FROM products as p JOIN OrderDetails as o ON o.OrderDetail_id=p.product_id;



