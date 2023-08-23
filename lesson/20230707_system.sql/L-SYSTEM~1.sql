select * from user_tables;
-- 주석
-- ctrl + / 토글링
-- create 명령어 - DDL 데이터 정의어
create user c##scott identified by tiger;

alter session set "_ORACLE_SCRIPT"=true;

create user kh identified by kh;
create user scott identified by tiger;

-- DCL
grant create session to scott;
grant connect, resource to c##scott, kh;
revoke connect, resource from kh;