-- 테스트 계정
-- TODO: 테스트용이지만 비밀번호가 노출된 데이터 세팅. 개선하는 것이 좋을 지 고민해 보자.
insert into user_account (user_id, user_password, nickname, email, memo, created_at, created_by, modified_at, modified_by) values
    ('noose', '{noop}asdf1234', 'noose', 'noose@mail.com', 'I am noose.', now(), 'noose', now(), 'noose')
;
insert into user_account (user_id, user_password, nickname, email, memo, created_at, created_by, modified_at, modified_by) values
    ('noose2', '{noop}asdf1234', 'noose2', 'noose2@mail.com', 'I am noose2.', now(), 'noose2', now(), 'noose2')
;
