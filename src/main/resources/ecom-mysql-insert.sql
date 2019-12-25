
INSERT INTO CATEGORY ( ID, NAME )
VALUES 
(1, 'Shirt' ), 
(2, 'Pant'  ), 
(3, 'Caps'  ),
(4, 'Socks' );


INSERT INTO SUPPLIER ( ID, NAME )
VALUES 
(1, 'Lewis' ), 
(2, 'Roadster'  ), 
(3, 'Lee'  ),
(4, 'Otto' );


INSERT INTO PRODUCT ( ID, SUPPLIER_ID, COLOR, SIZE, PRICE, SKU, AVAIL_QTY, CATEGORY_ID )
VALUES 
(1, 1, 'RED', '36', 1540, 5, 23, 1), 
(2, 3, 'BULE',	'M', 999, 4,	10, 3), 
(3, 2, 'RED', 'L', 999, 10, 2, 2),
(4, 4, 'YELLOW', '41', 555, 5, 8,1),
(5, 1, 'RED', 'M', 1540, 5, 8,1);