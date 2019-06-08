drop database software_prova

create database software_prova;

use software_prova;

create table software
(	
	Id	 		bigint 			not null,
	tit			varchar (50)	not null,
	Emp 		varchar (30)	not null,
	tip			varchar (20)	not null,
	chave 		int		(15)	not null,
	lic 		varchar	(60)	not null
    );



