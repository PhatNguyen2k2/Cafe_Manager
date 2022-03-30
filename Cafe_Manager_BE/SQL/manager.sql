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
	position VARCHAR(30)
);
CREATE TABLE CUSTOMER(
	C_id VARCHAR(10) NOT NULL,
	surname VARCHAR(40),
	name VARCHAR(10),
	gender VARCHAR(10) NOT NULL,
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
	price FLOAT,
	I_id VARCHAR(10)
);
CREATE TABLE PAYROLL(
	P_id VARCHAR(10) NOT NULL,
	E_id VARCHAR(10),
	Esalary FLOAT 
);
CREATE TABLE BILL(
	B_id VARCHAR(10) NOT NULL,
	Bday TINYINT,
	Bmonth TINYINT,
	Byear SMALLINT,
	C_id VARCHAR(10),
	E_id VARCHAR(10),
	M_id VARCHAR(10),
	B_price FLOAT
);
CREATE TABLE BILLSHIP(
	BS_id VARCHAR(10) NOT NULL,
	B_id VARCHAR(10),
	BSaddress VARCHAR(250),
	fee FLOAT
);
CREATE TABLE BOSS(
	name VARCHAR(30) NOT NULL,
	gender VARCHAR(10),
	Bday TINYINT,
	Bmonth TINYINT,
	Byear SMALLINT,
	Baddress VARCHAR(250),
	phone VARCHAR(15),
	E_id VARCHAR(10),
	I_id VARCHAR(10)
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
ALTER TABLE MENU
ADD CONSTRAINT FK_MENU FOREIGN KEY(I_id) REFERENCES INGREDIENT(I_id)
ALTER TABLE PAYROLL
ADD CONSTRAINT PK_PAYROLL PRIMARY KEY(P_id)
ALTER TABLE PAYROLL
ADD CONSTRAINT FK_PAYROLL FOREIGN KEY(E_id) REFERENCES EMPLOYEE(E_id)
ALTER TABLE BILL
ADD CONSTRAINT PK_BILL PRIMARY KEY(b_id)
ALTER TABLE BILL
ADD CONSTRAINT FK_BILL FOREIGN KEY(C_id) REFERENCES CUSTOMER(C_id)
ALTER TABLE BILL
ADD CONSTRAINT FK_BILL2 FOREIGN KEY(E_id) REFERENCES EMPLOYEE(E_id)
ALTER TABLE BILL
ADD CONSTRAINT FK_BILL3 FOREIGN KEY(M_id) REFERENCES MENU(M_id)
ALTER TABLE BILLSHIP
ADD CONSTRAINT PK_BILLSHIP PRIMARY KEY(BS_id)
ALTER TABLE BILLSHIP
ADD CONSTRAINT FK_BILLSHIP FOREIGN KEY(B_id) REFERENCES BILL(B_id)
ALTER TABLE BOSS
ADD CONSTRAINT PK_BOSS PRIMARY KEY(name)
ALTER TABLE BOSS
ADD CONSTRAINT FK_BOSS FOREIGN KEY(E_id) REFERENCES EMPLOYEE(E_id)
ALTER TABLE BOSS
ADD CONSTRAINT FK_BOSS2 FOREIGN KEY(I_id) REFERENCES INGREDIENT(I_id)
--Insert
--DELETE ROW
DELETE FROM EMPLOYEE
WHERE working_hour = 50
DELETE FROM CUSTOMER
--DROP TABLE
DROP TABLE EMPLOYEE
DROP TABLE CUSTOMER
DROP TABLE INGREDIENT
DROP TABLE MENU
DROP TABLE PAYROLL
DROP TABLE BILL
DROP TABLE BILLSHIP
DROP TABLE BOSS
--QUERY
SELECT E_id,surname, name, gender, CONCAT(Bday,'/',Bmonth,'/',Byear) AS Birthday, Eaddress, phone, working_hour, bonus, minus, ROUND(coefficients,2,1) AS coefficients, salary, experience, position
FROM EMPLOYEE;
SELECT * FROM EMPLOYEE
ORDER BY salary ASC;
SELECT * FROM EMPLOYEE
WHERE Eaddress LIKE 'district%'
SELECT * FROM CUSTOMER
WHERE Caddress LIKE 'district%'
ORDER BY salary ASC
SELECT * FROM CUSTOMER;
SELECT * FROM INGREDIENT;