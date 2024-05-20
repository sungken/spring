create table tblCode(
    seq number primary key,
    subject VARCHAR2(300) not null,
    code VARCHAR2(2000) not null,
    regdate date default sysdate not null,
    language varchar2(30) not null
);


create sequence seqCode;

select * from tblCode;

commit;













































































