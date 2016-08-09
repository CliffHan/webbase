create table users(
      username varchar_ignorecase(50) not null primary key,
      password varchar_ignorecase(50) not null,
      enabled boolean not null);

create table authorities (
    id int not null primary key auto_increment,
    username varchar_ignorecase(50) not null,
    authority varchar_ignorecase(50) not null,
    constraint fk_authorities_users foreign key(username) references users(username));

create unique index ix_auth_username on authorities (username,authority);

INSERT INTO users(username,password,enabled)
VALUES ('test1','123456', true);
INSERT INTO users(username,password,enabled)
VALUES ('test2','123456', true);

INSERT INTO authorities (username, authority)
VALUES ('test1', 'ROLE_USER');
INSERT INTO authorities (username, authority)
VALUES ('test1', 'ROLE_ADMIN');
INSERT INTO authorities (username, authority)
VALUES ('test2', 'ROLE_USER');
