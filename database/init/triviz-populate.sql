INSERT INTO question (question, answer, category, level) VALUES
('What does CPU stand for?', 'Central Processing Unit', 'Sciences', 'Easy'),
('What does RAM stand for?', 'Random Access Memory', 'Sciences', 'Easy'),
('Which data structure uses FIFO (First In, First Out) ordering?', 'Queue', 'Sciences', 'Easy'),
('Which data structure uses LIFO (Last In, First Out) ordering?', 'Stack', 'Sciences', 'Easy'),
('What is the binary equivalent of the decimal number 10?', '1010', 'Sciences', 'Easy'),
('What is the time complexity of a linear search?', 'O(n)', 'Sciences', 'Easy'),
('What does HTML stand for?', 'HyperText Markup Language', 'Sciences', 'Easy'),
('Which algorithm is used to find the shortest path in a graph and guarantees the shortest result for all nodes from a source?', 'Dijkstra', 'Sciences', 'Medium'),
('What does SQL stand for?', 'Structured Query Language', 'Sciences', 'Medium'),
('What is the time complexity of binary search?', 'O(log n)', 'Sciences', 'Medium'),
('What does API stand for?', 'Application Programming Interface', 'Sciences', 'Medium'),
('What is the capital of France?', 'Paris', 'Geography', 'Easy'),
('Which country has the largest population?', 'China', 'Geography', 'Easy'),
('What is the longest river in the world?', 'Nile', 'Geography', 'Easy'),
('What is the capital of Japan?', 'Tokyo', 'Geography', 'Easy'),
('What is the largest desert in the world?', 'Sahara Desert', 'Geography', 'Easy'),
('Which country has the most UNESCO World Heritage Sites?', 'Italy', 'Geography', 'Hard'),
('What is the capital of Canada?', 'Ottawa', 'Geography', 'Medium'),
('Which ocean is the largest?', 'Pacific Ocean', 'Geography', 'Medium'),
('What is the capital of Australia?', 'Canberra', 'Geography', 'Medium'),
('What is the capital of Italy?', 'Rome', 'Geography', 'Easy'),
('What is the capital of Spain?', 'Madrid', 'Geography', 'Easy'),
('What is the capital of Germany?', 'Berlin', 'Geography', 'Medium');

INSERT INTO game (name, category, level) VALUES
('Computer Science Quiz', 'Sciences', 'Easy'),
('Geography Challenge', 'Geography', 'Easy'),
('General Knowledge Quiz', 'Mix', 'Medium');

INSERT INTO game_questions (game_id, question_id) VALUES
(1, 1), (1, 2), (1, 3), (1, 4), (1, 5), (1, 6), (1, 7), (1, 8), (1, 9), (1, 10), (1, 11),
(2, 12), (2, 13), (2, 14), (2, 15), (2, 16), (2, 17), (2, 18), (2, 19), (2, 20), (2, 21), (2, 22), (2, 23),
(3, 1), (3, 2), (3, 7), (3, 9), (3, 11), (3, 12), (3, 13), (3, 14), (3, 15), (3, 16);