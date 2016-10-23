/*
CREATE USER corejsf WITH password 'corejsf';
CREATE DATABASE corejsf OWNER corejsf;
GRANT ALL privileges ON DATABASE corejsf TO corejsf;
*/
SET search_path TO corejsf;

CREATE SCHEMA corejsf;
GRANT CONNECT, TEMPORARY ON DATABASE corejsf TO corejsf;

CREATE TABLE corejsf.Credentials (username VARCHAR(20), passwd VARCHAR(32), logincount INTEGER);

INSERT INTO Credentials VALUES ('troosevelt', 'jabberwock', 0); 

INSERT INTO Credentials VALUES ('tjefferson', 'mockturtle', 0); 


CREATE TABLE corejsf.Groups (username VARCHAR(20), groupname VARCHAR(20));

INSERT INTO Groups VALUES ('troosevelt', 'registereduser');

INSERT INTO Groups VALUES ('troosevelt', 'invitedguest');

INSERT INTO Groups VALUES ('tjefferson', 'invitedguest');
