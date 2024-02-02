use evae;
    Create table user(
        id int primary key AUTO_INCREMENT,
        email varchar(255) not null,
        password varchar(255) not null,
        role varchar(255) not null    );
insert into user(email,password,role) VALUES('israe.saidi@gmail.com','israe2000','etudiant'),('safae.kaddouri@gmail.com','safae2000','prof');