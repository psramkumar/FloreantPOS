use app;


INSERT INTO APP.RESTAURANT (ID, NAME, ADDRESS_LINE1, ADDRESS_LINE2, ADDRESS_LINE3, TELEPHONE, CAPACITY, TABLES, AUTODRAWERPULLENABLE, DRAWER_PULL_HOUR, DRAWER_PULL_MIN, CNAME, CSYMBOL) VALUES 
(1, 'Floreant', null, null, null, null, 0, 0, 0, 0, 0, 'Dollar', '$');


INSERT INTO APP.TAX (ID, MODIFIED_TIME, NAME, RATE) VALUES (1, '2009-10-28 14:57:54', 'US', 6);

INSERT INTO APP.SHIFT (ID, NAME, START_TIME, END_TIME, SHIFT_LEN) VALUES 
(1, 'General', '1970-01-01 00:00:00', '1970-01-01 23:59:00', 86340000);

INSERT INTO APP.USER_TYPE (ID, P_NAME) VALUES (1, 'Administrator');

INSERT INTO APP.USER_PERMISSION (NAME) VALUES
('Create New Ticket'),
('Edit Ticket'),
('Pay Out'),
('Perform Administrative Task'),
('Perform Manager Task'),
('Reopen Ticket'),
('Settle Ticket'),
('Split Ticket'),
('Take Out'),
('View All Open Ticket'),
('View Back Office'),
('View Explorers'),
('View Reports'),
('Void Ticket');


INSERT INTO APP.USER_USER_PERMISSION (PERMISSIONID, ELT) VALUES
(1, 'Create New Ticket'),
(1, 'Edit Ticket'),
(1, 'Pay Out'),
(1, 'Perform Administrative Task'),
(1, 'Perform Manager Task'),
(1, 'Reopen Ticket'),
(1, 'Settle Ticket'),
(1, 'Split Ticket'),
(1, 'Take Out'),
(1, 'View All Open Ticket'),
(1, 'View Back Office'),
(1, 'View Explorers'),
(1, 'View Reports'),
(1, 'Void Ticket');


INSERT INTO APP.MENU_CATEGORY (ID, MODIFIED_TIME, NAME, VISIBLE, BEVERAGE) VALUES
(1, '2009-10-28 14:57:54', 'BEVERAGE', 1, 1),
(2, '2009-10-28 14:57:54', 'BREAKFAST', 1, 0);


INSERT INTO APP.MENU_GROUP (ID, MODIFIED_TIME, NAME, VISIBLE, CATEGORY_ID, MENU_CATEGORY_ID) VALUES
(1, '2009-10-28 14:57:54', 'COLD BEVERAGE', 1, 1, null),
(2, '2009-10-28 14:57:54', 'FAVOURITE', 1, 2, null);


INSERT INTO APP.MENU_ITEM (ID, MODIFIED_TIME, NAME, PRICE, DISCOUNT_RATE, VISIBLE, GROUP_ID, TAX_ID) VALUES
(1, '2009-10-28 14:57:54', 'Coke', 2, 0, 1, 1, 1),
(2, '2009-10-28 14:57:54', 'Egg', 2, 0, 1, 2, 1);

commit;