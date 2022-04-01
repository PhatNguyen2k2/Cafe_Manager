CREATE DATABASE CAFE_MANAGER
USE CAFE_MANAGER

CREATE TABLE EMPLOYEE(
	E_id VARCHAR(10) NOT NULL,
	surname VARCHAR(40),
	name VARCHAR(10),
	gender VARCHAR(10) NOT NULL,
	Bday TINYINT,
	Bmonth TINYINT,
	Byear SMALLINT,
	Eaddress VARCHAR(250),
	phone VARCHAR(15),
	working_hour TINYINT,
	bonus FLOAT,
	minus FLOAT,
	coefficients FLOAT,
	salary FLOAT,
	experience FLOAT,
	position VARCHAR(30),
	manager VARCHAR(10)
);

CREATE TABLE MANAGER(
	E_id VARCHAR(10) NOT NULL,
	surname VARCHAR(40),
	name VARCHAR(10)
);
CREATE TABLE CUSTOMER(
	C_id VARCHAR(10) NOT NULL,
	surname VARCHAR(40),
	name VARCHAR(10),
	gender VARCHAR(10),
	Bday TINYINT,
	Bmonth TINYINT,
	Byear SMALLINT,
	Caddress VARCHAR(250),
	point SMALLINT,
	member VARCHAR(15),
	phone VARCHAR(15)
);
CREATE TABLE INGREDIENT(
	I_id VARCHAR(10) NOT NULL,
	name VARCHAR(30),
	amount INT,
	unit VARCHAR(10),
	price FLOAT,
	Iday TINYINT,
	Imonth TINYINT,
	Iyear SMALLINT,
	inventory INT 
);
CREATE TABLE MENU(
	M_id VARCHAR(10) NOT NULL,
	name VARCHAR(30),
	price FLOAT
);
CREATE TABLE DRINKS(
	M_id VARCHAR(10) NOT NULL,
	I_id VARCHAR(10) NOT NULL
)
CREATE TABLE DRINK_ORDER(
	C_id VARCHAR(10) NOT NULL,
	M_id VARCHAR(10) NOT NULL,
	amount SMALLINT
)
CREATE TABLE BILL(
	B_id VARCHAR(10) NOT NULL,
	Bhour TINYINT,
	Bminute TINYINT,
	C_id VARCHAR(10),
	E_id VARCHAR(10),
);
CREATE TABLE BILLSHIP(
	BS_id VARCHAR(10) NOT NULL,
	B_id VARCHAR(10),
	BSaddress VARCHAR(250),
	fee FLOAT
);
--PRIMARY & FOREIGN KEY
ALTER TABLE EMPLOYEE
ADD CONSTRAINT PK_EMPLOYEE PRIMARY KEY(E_id)
ALTER TABLE CUSTOMER
ADD CONSTRAINT PK_CUSTOMER PRIMARY KEY(C_id)
ALTER TABLE INGREDIENT
ADD CONSTRAINT PK_INGREDIENT PRIMARY KEY(I_id)
ALTER TABLE MENU
ADD CONSTRAINT PK_MENU PRIMARY KEY(M_id)
ALTER TABLE DRINKS
ADD CONSTRAINT FK_DRINKS FOREIGN KEY(M_id) REFERENCES MENU(M_id)
ALTER TABLE DRINKS
ADD CONSTRAINT FK_DRINKS1 FOREIGN KEY(I_id) REFERENCES INGREDIENT(I_id)
ALTER TABLE DRINKS
ADD CONSTRAINT PK_DRINKS PRIMARY KEY (M_id,I_id)
ALTER TABLE DRINK_ORDER
ADD CONSTRAINT FK_DO FOREIGN KEY(C_id) REFERENCES CUSTOMER(C_id)
ALTER TABLE DRINK_ORDER
ADD CONSTRAINT FK_DO1 FOREIGN KEY(M_id) REFERENCES MENU(M_id)
ALTER TABLE DRINK_ORDER
ADD CONSTRAINT PK_DO PRIMARY KEY (C_id,M_id)
ALTER TABLE BILL
ADD CONSTRAINT PK_BILL PRIMARY KEY(b_id)
ALTER TABLE BILL
ADD CONSTRAINT FK_BILL FOREIGN KEY(C_id) REFERENCES CUSTOMER(C_id)
ALTER TABLE BILL
ADD CONSTRAINT FK_BILL2 FOREIGN KEY(E_id) REFERENCES EMPLOYEE(E_id)
ALTER TABLE BILL
ADD CONSTRAINT CHECK_HOUR CHECK (Bhour <= 24)
ALTER TABLE BILL
ADD CONSTRAINT CHECK_MINUTE CHECK (Bminute <= 60)
ALTER TABLE BILLSHIP
ADD CONSTRAINT PK_BILLSHIP PRIMARY KEY(BS_id)
ALTER TABLE BILLSHIP
ADD CONSTRAINT FK_BILLSHIP FOREIGN KEY(B_id) REFERENCES BILL(B_id)
--Insert
INSERT INTO MANAGER VALUES
('004','Bui Thi','Mien'),
('010','Huyen Ngoc','Tran'),
('014','Nguyen Ngoc To','My'),
('018','Nguyen Hai','Duong')
INSERT INTO DRINKS VALUES
('001','001'),
('001','002'),
('002','003'),
('002','004'),
('003','003'),
('003','004'),
('003','005'),
('004','006'),
('004','002'),
('005','007'),
('005','002'),
('006','008'),
('006','002'),
('007','009'),
('008','010'),
('009','011'),
('009','009'),
('010','012'),
('011','013'),
('012','014'),
('013','015'),
('014','016'),
('015','017'),
('016','018'),
('017','019'),
('018','020'),
('018','004'),
('019','021'),
('019','004'),
('020','022'),
('020','004'),
('021','023'),
('021','004')
INSERT INTO DRINK_ORDER VALUES
('001','002',3),
('001','007',2),
('001','015',1),
('001','021',4)
--DELETE ROW
DELETE FROM EMPLOYEE
WHERE working_hour = 50
DELETE FROM CUSTOMER
DELETE FROM DRINK_ORDER
DELETE FROM MANAGER
--DROP TABLE
DROP TABLE EMPLOYEE
DROP TABLE CUSTOMER
DROP TABLE INGREDIENT
DROP TABLE MENU
DROP TABLE DRINKS
DROP TABLE DRINK_ORDER
DROP TABLE BILL
DROP TABLE BILLSHIP
--QUERY
SELECT E_id,surname, name, gender, CONCAT(Bday,'/',Bmonth,'/',Byear) AS Birthday, Eaddress, phone, working_hour, bonus, minus, ROUND(coefficients,2) AS coefficients, salary, experience, position, manager
FROM EMPLOYEE;
SELECT * FROM EMPLOYEE
ORDER BY salary ASC;
SELECT * FROM EMPLOYEE
WHERE Eaddress LIKE 'district%'
SELECT * FROM CUSTOMERS
WHERE Caddress LIKE 'district%'
ORDER BY salary ASC
SELECT * FROM CUSTOMER;
SELECT * FROM INGREDIENT;
SELECT * FROM MENU
SELECT * FROM DRINKS
SELECT * FROM DRINK_ORDER
--EMPLOYEE
SELECT E_id, surname, name, position, ROUND((salary*coefficients+bonus-minus),-1) AS sum_salary
FROM EMPLOYEE
WHERE ROUND((salary*coefficients+bonus-minus),-1) >= 50000 AND position = 'waiter'
ORDER BY name,surname ASC

SELECT * FROM EMPLOYEE
WHERE Eaddress LIKE '%Ho Chi Minh city'

SELECT E.* FROM EMPLOYEE E INNER JOIN MANAGER M
ON E.manager = M.E_id
WHERE M.name = 'Tran' OR M.name = 'Duong'
ORDER BY E.name ASC

SELECT C_id, surname, name, point, member
FROM CUSTOMER
WHERE point >= 100
ORDER BY name,surname ASC

SELECT C_id, surname, name, point, member
FROM CUSTOMER
WHERE point < 100
ORDER BY name,surname ASC

SELECT * FROM CUSTOMER
WHERE Caddress LIKE '%Ho Chi Minh city' AND point >= 100
ORDER BY name,surname ASC
--INGREDIENT
SELECT * FROM INGREDIENT
WHERE inventory <= 2
ORDER BY name ASC

SELECT * FROM INGREDIENT
WHERE unit = 'thung'
ORDER BY name ASC

--MENU
SELECT * FROM MENU
WHERE price >= 30000
ORDER BY name ASC