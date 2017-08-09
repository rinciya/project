CREATE TABLE volunteer 
(vname VARCHAR(20),
 vpassword VARCHAR(20) NOT NULL, 
vaddress VARCHAR(30),
 vgender VARCHAR(10), 
vage INT DEFAULT 10 ,
 vmno INT DEFAULT 10 ,
 vemail VARCHAR(30) NOT NULL, 
PRIMARY KEY (vemail));

