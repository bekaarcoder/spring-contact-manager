-- INSERT EMPLOYEES
insert into employee (id, first_name, last_name, email) values (1, 'Findlay', 'Edel', 'fedel0@sohu.com');
insert into employee (id, first_name, last_name, email) values (2, 'Sheila', 'Hallaways', 'shallaways1@ehow.com');
insert into employee (id, first_name, last_name, email) values (3, 'Nappie', 'Honnicott', 'nhonnicott2@hp.com');
insert into employee (id, first_name, last_name, email) values (4, 'Rockey', 'Micheli', 'rmicheli3@oakley.com');
insert into employee (id, first_name, last_name, email) values (5, 'Tasia', 'Strand', 'tstrand4@umich.edu');
insert into employee (id, first_name, last_name, email) values (6, 'Joanne', 'Levington', 'jlevington5@twitter.com');
insert into employee (id, first_name, last_name, email) values (7, 'Luis', 'Garrod', 'lgarrod6@adobe.com');
insert into employee (id, first_name, last_name, email) values (8, 'Aubine', 'Sinson', 'asinson7@noaa.gov');
insert into employee (id, first_name, last_name, email) values (9, 'Sydelle', 'Jentgens', 'sjentgens8@aol.com');
insert into employee (id, first_name, last_name, email) values (10, 'Chere', 'Slowey', 'cslowey9@clickbank.net');

-- INSERT PROJECT
insert into project (id, name, stage, description) values (1, 'Web Application', 'NOTSTARTED', 'In est risus, auctor sed, tristique in, tempus sit amet, sem. Fusce consequat.');
insert into project (id, name, stage, description) values (2, 'User Management', 'COMPLETED', 'Curabitur at ipsum ac tellus semper interdum.');
insert into project (id, name, stage, description) values (3, 'Admin Panel', 'NOTSTARTED', 'Donec posuere metus vitae ipsum. Aliquam non mauris.');
insert into project (id, name, stage, description) values (4, 'Deployment Activity', 'INPROGRESS', 'Integer tincidunt ante vel ipsum. Praesent blandit lacinia erat.');
insert into project (id, name, stage, description) values (5, 'Production Support', 'INPROGRESS', 'Nullam sit amet turpis elementum ligula vehicula consequat. Morbi a ipsum.');

-- INSERT PROJECT_EMPLOYEE_RELATION

insert into project_employee (project_id, employee_id) values (1, 1);
insert into project_employee (project_id, employee_id) values (2, 2);
insert into project_employee (project_id, employee_id) values (3, 3);
insert into project_employee (project_id, employee_id) values (4, 4);
insert into project_employee (project_id, employee_id) values (5, 5);
insert into project_employee (project_id, employee_id) values (1, 6);
insert into project_employee (project_id, employee_id) values (2, 7);
insert into project_employee (project_id, employee_id) values (3, 8);
insert into project_employee (project_id, employee_id) values (4, 9);
insert into project_employee (project_id, employee_id) values (5, 10);