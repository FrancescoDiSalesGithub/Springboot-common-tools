create table Employee
(

 idEmployee integer identity(1,1),
 name varchar(50),
 surname varchar(50),
 age integer,
 salary integer,
 departement integer,
 primary key(id),
 foreign key(departement) references Departement(idDepartement)
 
)



