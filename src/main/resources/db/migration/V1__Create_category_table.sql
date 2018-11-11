CREATE TABLE achievement.category (
	id INT UNSIGNED NOT NULL AUTO_INCREMENT,
	name varchar(100) NOT NULL,
	`key` varchar(100) NOT NULL,
	CONSTRAINT category_pk PRIMARY KEY (id)
)
ENGINE=InnoDB
DEFAULT CHARSET=utf8
COLLATE=utf8_general_ci;
