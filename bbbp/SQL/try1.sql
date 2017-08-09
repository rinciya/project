INSERT INTO bbbb.donation (email, `name`, phno, amt, ngoname) 
	VALUES ('fd@gmail.com', 'dvz', 1234567890, 231, 'cry');
UPDATE bbbb.amount
        SET fund=fund + 231
        WHERE ngoname='cry';