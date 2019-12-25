INSERT INTO CATEGORY ( ID, NAME ) VALUES (1, 'Shirt' );
INSERT INTO CATEGORY ( ID, NAME ) VALUES (2, 'Pant'  );
INSERT INTO CATEGORY ( ID, NAME ) VALUES (3, 'Caps'  );
INSERT INTO CATEGORY ( ID, NAME ) VALUES (4, 'Socks' );


INSERT INTO SUPPLIER ( ID, NAME ) VALUES (1, 'Lewis');
INSERT INTO SUPPLIER ( ID, NAME ) VALUES (2, 'Roadster');
INSERT INTO SUPPLIER ( ID, NAME ) VALUES (3, 'Lee');
INSERT INTO SUPPLIER ( ID, NAME ) VALUES (4, 'Otto');

INSERT INTO `product` (`id`, `avail_qty`, `color`, `price`, `size`, `sku`, `category_id`, `supplier_id`) VALUES
(1, 23, 'RED', '1540.00', '36', 5, 1, 1),
(2, 10, 'BULE', '999.00', 'M', 4, 3, 3),
(3, 2, 'RED', '999.00', 'L', 10, 2, 2),
(4, 8, 'YELLOW', '555.00', '41', 5, 1, 4),
(5, 8, 'RED', '1540.00', 'M', 5, 1, 1);
