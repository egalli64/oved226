drop table workers;
drop table workstations;

create table workstations(
    workstation_id integer primary key,
    name varchar2(20)
);

insert into workstations values(1, 'deepblue');
insert into workstations values(2, 'wotan');

create table workers(
    worker_id integer primary key,
    name varchar2(20),
    workstation_id integer referencing workstations(workstation_id) unique
);

insert into workers values(10, 'ken thompson', 2);
insert into workers values(11, 'dennis ritchie', 1);

select * from workers;
select * from workstations;

create table participants(
	participant_id integer primary key,
	name varchar2(20)
);

insert into participants values(10, 'ken thompson');
insert into participants values(11, 'dennis ritchie');
insert into participants values(12, 'guido van rossum');
insert into participants values(13, 'bjarne stroustrup');

create table projects(
	project_id integer primary key,
	name varchar2(20)
);

insert into projects values(1, 'fuchsia');
insert into projects values(2, 'wotan');

create table participant_project(
	participant_id integer references participants(participant_id),
	project_id integer references projects(project_id),
	
	primary key(participant_id, project_id)
);

insert into participant_project values(10, 1);
insert into participant_project values(10, 2);
insert into participant_project values(11, 1);
insert into participant_project values(12, 2);
insert into participant_project values(13, 1);
insert into participant_project values(13, 2);
