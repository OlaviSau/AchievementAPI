CREATE TABLE achievement.achievement (
	id int unsigned NOT NULL AUTO_INCREMENT,
	`key` varchar(100) NOT NULL,
	title varchar(100) NOT NULL,
	points int unsigned NOT NULL,
	description varchar(255) NOT NULL,
	img varchar(100) NOT NULL,
	completed TINYINT DEFAULT 0 NOT NULL,
	category_id int unsigned NOT NULL,
	CONSTRAINT achievement_pk PRIMARY KEY (id),
	CONSTRAINT achievement_category_fk FOREIGN KEY (category_id) REFERENCES achievement.category(id) ON DELETE RESTRICT
)
ENGINE=InnoDB
DEFAULT CHARSET=utf8
COLLATE=utf8_general_ci;
