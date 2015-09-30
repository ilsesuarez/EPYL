--1Creación de la tabla Usuario 
create table Usuario( 
    NoCta integer,
    Nombre_usuario varchar(30) not null,
    Correo_electronico varchar(255) not null,
    Clave varchar(50) not null,
    Nombre varchar(50) not null,
    App varchar(50) not null,
    Apm varchar(50) not null, 
    Puntuacion number,
    FacultadNombre varchar(100) not null,
    constraint Usuario_pk primary key(NoCta)
); 

--2Creación de la tabla Facultad
create table Facultad(
    Nombre varchar(100),
    Ubicacion varchar(255) not null,
    constraint Facultad_pk primary key(Nombre)
);

--3Creación de la tabla Biblioteca 
create table Biblioteca(
    ID integer,
    Nombre varchar(100) not null,
    Ubicacion varchar(255) not null,
    FacultadNombre varchar(100) not null,
    constraint Biblioteca_pk primary key(ID)
);

--4Creación de la tabla Autor
create table Autor(
    IDAutor integer,
    Nombre varchar(50) not null,
    App varchar(50) not null,
    Apm varchar(50) not null,
    constraint Autor_pk primary key(IDAutor)
);

--5Creación de la tabla Libro 
create table Libro(
    ID integer,
    Titulo varchar(100) not null,
    Imagen varchar(255) not null,
    Prestado integer,
    NoPrestamos integer,
    AutorIDAutor integer,
    constraint Libro_pk primary key(ID)
);

--6Creación de la tabla LibrosRegistrados
create table LibrosRegistrados(
    LibroID integer,
    UsuarioNoCta integer,
    constraint LibrosRegs_pk primary key(LibroID,UsuarioNoCta)
);

--7Creación de la tabla Prestamo
create table Prestamo(
    ID integer,
    Fecha_prestamo date not null,
    Fecha_devolucion date not null,
    Plazo integer,
    Aprobado integer,
    Hora integer,
    Puntuacion integer,
    LibroID integer,
    UsuarioReceptor integer,
    UsuarioEmisor integer,
    BibliotecaID integer,
    constraint Prestamo_pk primary key(ID)
);

--***************************
--Creación de las llaves foráneas
alter table Usuario add constraint Usuario_fk foreign key (FacultadNombre) References Facultad(Nombre);
alter table Biblioteca add constraint Biblioteca_fk foreign key (FacultadNombre) References Facultad(Nombre); 
alter table Libro add constraint Libro_fk foreign key (AutorIDAutor) References Autor(IDAutor);
alter table LibrosRegistrados add constraint LibRegs_Lib_fk foreign key (LibroID) References Libro(ID);
alter table LibrosRegistrados add constraint LibRegs_Usr_fk foreign key (UsuarioNoCta) References Usuario(NoCta);
alter table Prestamo add constraint Prestamo_Lib_fk foreign key (LibroID) References Libro(ID);
alter table Prestamo add constraint Prestamo_UsrR_fk foreign key (UsuarioReceptor) References Usuario(NoCta);
alter table Prestamo add constraint Prestamo_UsrE_fk foreign key (UsuarioEmisor) References Usuario(NoCta);
alter table Prestamo add constraint Prestamo_Bib_fk foreign key (BibliotecaID) References Biblioteca(ID);

--***************************
--Creación de las reestricciones
alter table Usuario add constraint NombUsr_unique UNIQUE (Nombre_usuario);
