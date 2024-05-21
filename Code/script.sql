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



create table tblUser(

    seq number primary key,
    name varchar2(30) not null

);

create sequence seqUser;


CREATE TABLE tblDetail (
    seq NUMBER PRIMARY KEY,
    email VARCHAR2(100) NOT NULL,
    user_seq NUMBER NOT NULL REFERENCES tblUser(seq)
);

create sequence seqDetail;


select * from tblUser;
select * from tblDetail;


---------------------------------------------------------------------

create table tblInfo (
	seq number,
	school varchar2(100) not null,
	country varchar2(100) not null,
	
	constraint info_pk primary key(seq),
	constraint info_kf foreign key(seq) references tblAddress(seq) 
);

insert into tblInfo values (1, '강남 동물학교', '대한민국');
insert into tblInfo values (2, '강남 동물학교', '대한민국');
insert into tblInfo values (3, '뉴욕 아카데미', '미국');
insert into tblInfo values (4, '동경 훈련원', '일본');
insert into tblInfo values (5, '베이징 훈련소', '중국');

create table tblMemo (
	seq number primary key,
	memo varchar2(500) not null,
	regdate date default sysdate not null,
	aseq number not null references tblAddress(seq) 
);

create sequence seqMemo;

insert into tblMemo values (seqMemo.nextVal, '안녕하세요.', default, 1);
insert into tblMemo values (seqMemo.nextVal, '날씨가 조금 흐려요.', default, 1);
insert into tblMemo values (seqMemo.nextVal, '월요일입니다.', default, 1);
insert into tblMemo values (seqMemo.nextVal, '스프링 공부하고 있어요.', default, 1);
insert into tblMemo values (seqMemo.nextVal, '벌써 배가 고파요.', default, 1);
insert into tblMemo values (seqMemo.nextVal, '오늘도 열심히 낮잠 중', default, 2);
insert into tblMemo values (seqMemo.nextVal, '집사야 밥내놔라!', default, 2);
insert into tblMemo values (seqMemo.nextVal, '삐약삐약', default, 3);
insert into tblMemo values (seqMemo.nextVal, '구구', default, 6);
insert into tblMemo values (seqMemo.nextVal, '하늘을 날다.', default, 9);
insert into tblMemo values (seqMemo.nextVal, '집이 좁아요.', default, 8);


commit;

-- tblAddress : tblInfo
-- 1 : 1 > Join

-- tblAddress : tblMemo
-- 1 : N > Join

select * from tblAddress;

select * from tblInfo;

select * from tblMemo;

select * from tblAddress a inner join tblInfo i on a.seq = i.seq;





























































