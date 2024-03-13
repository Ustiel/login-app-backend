INSERT INTO ROLE (name) VALUES
	('ROLE_USER'),
	('ROLE_MANAGER');

INSERT INTO USERS (username, name, password, role_id) VALUES
	('user', 'Casey Lim', '$2a$10$roFEwts2tKZjSorWoJu1JuK/qpzD7QqN2KF8mSnhOnNRdOnoHJKNm', 1),
	('manager', 'Sam Koh', '$2a$10$roFEwts2tKZjSorWoJu1JuK/qpzD7QqN2KF8mSnhOnNRdOnoHJKNm', 2);
