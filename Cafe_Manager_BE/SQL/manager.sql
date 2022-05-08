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
CREATE TABLE ACCOUNT(
	username VARCHAR(20),
	passwords VARCHAR(20) NOT NULL,
	motherName VARCHAR(30),
	E_id VARCHAR(10) NOT NULL
)
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
ALTER TABLE EMPLOYEE
ADD CONSTRAINT FK_EMPLOYEE FOREIGN KEY(manager) REFERENCES MANAGER(E_id)
ALTER TABLE MANAGER
ADD CONSTRAINT PK_MANAGER PRIMARY KEY(E_id)
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
ALTER TABLE ACCOUNT
ADD CONSTRAINT PK_ACCOUNT PRIMARY KEY(passwords)
ALTER TABLE ACCOUNT
ADD CONSTRAINT FK_ACCOUNT FOREIGN KEY(E_id) REFERENCES MANAGER(E_id)
--Insert
INSERT INTO MANAGER VALUES
('004','Bui Thi','Mien'),
('010','Huyen Ngoc','Tran'),
('014','Nguyen Ngoc To','My'),
('018','Nguyen Hai','Duong')
INSERT INTO ACCOUNT VALUES
('mn004','buithiMien@', 'Tran Thi Thu Huong','004'),
('mn010','huyenngocTran@', 'Nguyen Thi Vuong','010'),
('mn014','nguyenngoctoMy@', 'Dao Cam Thi','014'),
('mn018','nguyenhaiDuong@', 'Vuong Thi Hong','018')
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
('005','008'),
('005','002'),
('006','009'),
('006','002'),
('007','007'),
('008','010'),
('009','011'),
('009','007'),
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
INSERT INTO CUSTOMER(C_id)VALUES
('031')
INSERT INTO EMPLOYEE(E_id,gender)VALUES
('020','male')
--DELETE ROW
DELETE FROM EMPLOYEE
DELETE FROM BILL
WHERE C_id = '033'
DELETE FROM DRINK_ORDER
WHERE C_id = '033'
DELETE FROM CUSTOMER
WHERE C_id = '033'
DELETE FROM CUSTOMER
DELETE FROM DRINKS
DELETE FROM MANAGER
--UPDATE TABLE
--UPDATE CUSTOMER SET surname=?,name =?,gender=?,Bday=?,Bmonth=?,Byear=?,Caddress=?,point=?,member=?,phone=? WHERE C_id = '001'
--UPDATE EMPLOYEE SET surname=?,name =?,gender=?,Bday=?,Bmonth=?,Byear=?,Eaddress=?,phone=?,working_hour=?,bonus=?,minus=?,coefficients=?,salary=?,experient=?,position=? WHERE E_id = '001'
--DROP TABLE
DROP TABLE EMPLOYEE
DROP TABLE MANAGER
DROP TABLE ACCOUNT
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
SELECT * FROM EMPLOYEE WHERE E_id = '020'
ORDER BY salary ASC;
SELECT * FROM EMPLOYEE
WHERE Eaddress LIKE 'district%'
SELECT * FROM CUSTOMERS
WHERE Caddress LIKE 'district%'
ORDER BY salary ASC
SELECT * FROM MANAGER
SELECT * FROM ACCOUNT
SELECT * FROM CUSTOMER
SELECT * FROM INGREDIENT
SELECT * FROM MENU
SELECT * FROM DRINKS
SELECT * FROM DRINK_ORDER
SELECT * FROM BILL
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
--CUSTOMER
SELECT * FROM CUSTOMER
WHERE point >= 100 AND name IS NOT NULL
ORDER BY name, surname ASC

SELECT * FROM CUSTOMER
WHERE member = 'gold' AND name IS NOT NULL
ORDER BY name, surname ASC

SELECT * FROM CUSTOMER
WHERE Caddress LIKE '%Ho Chi Minh city' AND name IS NOT NULL
ORDER BY name, surname ASC

SELECT TOP 1 C_id
FROM CUSTOMER
ORDER BY C_id DESC

SELECT TOP 1 member
FROM CUSTOMER
WHERE phone = '0123656666'
ORDER BY C_id DESC
--ACCOUNT
SELECT (E.surname + ' ' +E.name) AS Name FROM ACCOUNT A, EMPLOYEE E WHERE A.E_id = E.E_id AND A.username LIKE 'mn004'
--INGREDIENT
SELECT * FROM INGREDIENT
WHERE inventory <= 2
ORDER BY name ASC

SELECT * FROM INGREDIENT
WHERE unit = 'thung'
ORDER BY name ASC
--DRINK
SELECT DISTINCT D1.M_id, M.name, ( 
	SELECT D2.I_id + ',' 
	FROM DRINKS D2 
	WHERE D2.M_id = D1.M_id 
	ORDER BY D2.M_id 
	FOR XML PATH(''))[I_id], ( 
		SELECT I.name + ',' 
		FROM INGREDIENT I INNER JOIN DRINKS D3 
		ON D3.I_id = I.I_id 
		WHERE D3.M_id = D1.M_id 
		ORDER BY D3.M_id 
		FOR XML PATH(''))[I_name] 
FROM DRINKS D1 INNER JOIN MENU M 
ON D1.M_id = M.M_id
--MENU
SELECT * FROM MENU
WHERE price >= 30000
ORDER BY name ASC
--BILL
--Get bottom row
SELECT TOP 1 B_id
FROM BILL
ORDER BY B_id DESC

SELECT DISTINCT B.B_id,B.E_id, B.Bhour, B.Bminute, 
	(SELECT M.name + ':'+ STR(M.price,6,2)+ 'VND Amount: '+STR(DO1.amount,2,2)+ CHAR(13)+ CHAR(10) 
		FROM MENU M INNER JOIN DRINK_ORDER DO1 
		ON M.M_id = DO1.M_id 
		WHERE DO1.C_id = DO.C_id 
		ORDER BY DO1.C_id 
		FOR XML PATH(''))[name], 
	(SELECT SUM(DO.amount) 
		FROM DRINK_ORDER DO1 INNER JOIN DRINK_ORDER DO2 
		ON DO1.C_id = DO2.C_id 
		WHERE DO1.C_id = DO.C_id 
		GROUP BY DO1.C_id 
		) AS plusPoint, 
	(SELECT SUM(M.price*DO1.amount) 
		FROM DRINK_ORDER DO1 INNER JOIN MENU M 
		ON DO1.M_id = M.M_id 
		WHERE DO1.C_id = DO.C_id 
		GROUP BY DO1.C_id) AS Total 
FROM BILL B INNER JOIN DRINK_ORDER DO 
ON B.C_id = DO.C_id 
GROUP BY B.B_id, B.E_id, B.Bhour, B.Bminute, DO.C_id

SELECT M.name, DO.amount,(STR(M.price,6,2)+ ' VND') AS price
FROM BILL B, DRINK_ORDER DO, MENU M
WHERE B.C_id = DO.C_id AND DO.M_id = M.M_id AND B.C_id = '006'

SELECT SUM(DO.amount) AS plusPoint FROM BILL B, DRINK_ORDER DO 
WHERE B.C_id = DO.C_id  AND B.C_id = '006' 
GROUP BY B.B_id, B.E_id, DO.C_id 

SELECT SUM(M.price*DO.amount) AS Total FROM BILL B, DRINK_ORDER DO, MENU M
WHERE B.C_id = DO.C_id AND DO.M_id = M.M_id AND B.C_id = '006' 
GROUP BY B.B_id, B.E_id, DO.C_id