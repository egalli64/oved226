--TABELLA PRENOTAZIONI
create table prenotazioni (
simple_id integer
constraint simple_pk primary key
constraint simple_id_ck check (mod(simple_id, 2) = 1),
status char default 'A'
constraint simple_status_ck check (status in ('A', 'B', 'X')),
name varchar2(20),
-- constraint simple_name_nn not null,
-- constraint simple_name_uq unique,
coder_id integer
constraint simple_coder_id_fk references coders(coder_id) on delete cascade,
constraint simple_name_status_uq unique(name, status));



--TABELLA UTENTI
create table utenti (
utente_id integer
constraint utenti_pk primary key,
nome varchar2(20)
constraint utenti_nome_nn not null,
cognome varchar2(20)
constraint utenti_cognome_nn not null,
email varchar2(20)
constraint utenti_email_nn not null,
user_id varchar2(20)
-- constraint simple_coder_id_fk references coders(coder_id) on delete cascade,
constraint utenti_user_id_status_uq unique(name, status)),
password varchar2(20)
constraint utenti_password_nn not null,
affidabilita varchar2(20));
-- constraint utenti_affidabilita_fk references coders(coder_id) on delete cascade,

--TABELLA RISTORANTI
create table ristoranti (
ristorante_id integer
constraint ristoranti_pk primary key,
nome varchar2(20)
constraint ristoranti_nome_nn not null,
posizione varchar2(20),
posti_disponibili integer,
tipo_cucina varchar2(20));



--TABELLA INVITI
create table inviti (
simple_id integer
constraint simple_pk primary key
constraint simple_id_ck check (mod(simple_id, 2) = 1),
status char default 'A'
constraint simple_status_ck check (status in ('A', 'B', 'X')),
name varchar2(20),
-- constraint simple_name_nn not null,
-- constraint simple_name_uq unique,
coder_id integer
constraint simple_coder_id_fk references coders(coder_id) on delete cascade,
constraint simple_name_status_uq unique(name, status));


--TABELLA FEEDBACK
create table feedback (
simple_id integer
constraint simple_pk primary key
constraint simple_id_ck check (mod(simple_id, 2) = 1),
status char default 'A'
constraint simple_status_ck check (status in ('A', 'B', 'X')),
name varchar2(20),
-- constraint simple_name_nn not null,
-- constraint simple_name_uq unique,
coder_id integer
constraint simple_coder_id_fk references coders(coder_id) on delete cascade,
constraint simple_name_status_uq unique(name, status));


--TABELLA AFFIDABILITà
create table affidabilita (
simple_id integer
constraint simple_pk primary key
constraint simple_id_ck check (mod(simple_id, 2) = 1),
status char default 'A'
constraint simple_status_ck check (status in ('A', 'B', 'X')),
name varchar2(20),
-- constraint simple_name_nn not null,
-- constraint simple_name_uq unique,
coder_id integer
constraint simple_coder_id_fk references coders(coder_id) on delete cascade,
constraint simple_name_status_uq unique(name, status));

rollback;
