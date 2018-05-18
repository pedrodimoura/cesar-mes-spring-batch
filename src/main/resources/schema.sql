CREATE TABLE IF NOT EXISTS _user (
	id int(11) not null AUTO_INCREMENT,
	username varchar(16) not null,
	constraint pk_user_id primary key (id),
	constraint un_user_username unique (username)
);