DROP TABLE IF EXISTS game_questions;
DROP TABLE IF EXISTS game;
DROP TABLE IF EXISTS question;

CREATE TABLE question (
    id SERIAL PRIMARY KEY,
    question TEXT NOT NULL,
    answer TEXT NOT NULL,
    category VARCHAR(256),
    level VARCHAR(256)
);

CREATE TABLE game (
    id SERIAL PRIMARY KEY,
    name VARCHAR(256) NOT NULL,
    category VARCHAR(256),
    level VARCHAR(256)
);

CREATE TABLE game_questions (
    game_id INTEGER NOT NULL,
    question_id INTEGER NOT NULL,
    PRIMARY KEY (game_id, question_id),
    CONSTRAINT fk_game FOREIGN KEY (game_id) REFERENCES game (id) ON DELETE CASCADE,
    CONSTRAINT fk_question FOREIGN KEY (question_id) REFERENCES question (id) ON DELETE CASCADE
);