
DROP table Board;
create table Board(
    seq number primary key,
    subject VARCHAR2(500) not null,
    content VARCHAR2(2000) not null,
    memberid VARCHAR2(50) not null references Member(memberid),
    regdate date default sysdate not null
);

create sequence seqBoard;

insert into Board 
    values(seqBoard.nextVal, '게시판입니다.', '내용', 'dog', default);

commit;

select * from board;









