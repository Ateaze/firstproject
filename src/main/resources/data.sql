INSERT INTO article(title, content) VALUES ('가가가','1111');
INSERT INTO article(title, content) VALUES ('나나나','2222');
INSERT INTO article(title, content) VALUES ('다다다','3333');


INSERT INTO member(email, password) VALUES ('admin@naver.com', '456789');
INSERT INTO member(email, password) VALUES ('admin@gmail.com', '999999');
INSERT INTO member(email, password) VALUES ('admin@kakao.com', '123456');


INSERT INTO coffee(name, price) VALUES('아메리카노', '4500');
INSERT INTO coffee(name, price) VALUES('라떼', '5000');
INSERT INTO coffee(name, price) VALUES('카페 모카', '5500');


INSERT INTO article(title, content) VALUES ('당신의 인생 영화는?', '댓글 고');
INSERT INTO article(title, content) VALUES ('당신의 소울 푸드는?', '댓글 고');
INSERT INTO article(title, content) VALUES ('당신의 취미는?', '댓글 고');

INSERT INTO comment(article_id, nickname, body) VALUES (4, 'Park', '굿 윌 헌팅');
INSERT INTO comment(article_id, nickname, body) VALUES (4, 'Kim', '쇼생크 탈출');
INSERT INTO comment(article_id, nickname, body) VALUES (4, 'Choi', '아이언맨');

INSERT INTO comment(article_id, nickname, body) VALUES (5, 'Park', '치킨');
INSERT INTO comment(article_id, nickname, body) VALUES (5, 'Kim', '스시');
INSERT INTO comment(article_id, nickname, body) VALUES (5, 'Choi', '피자');

INSERT INTO comment(article_id, nickname, body) VALUES (6, 'Park', '쇼핑');
INSERT INTO comment(article_id, nickname, body) VALUES (6, 'Kim', '영화보기');
INSERT INTO comment(article_id, nickname, body) VALUES (6, 'Choi', '독서');