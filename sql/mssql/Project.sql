create table Project
(

	idProject integer,
	nameProject varchar(50) NOT NULL,
	idEmployee integer foreign key references Employee(idEmployee),
	Primary Key(idProject)

);



