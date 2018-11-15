CREATE TABLE achievement.task (
	id int unsigned NOT NULL AUTO_INCREMENT,
	description varchar(100) NOT NULL,
	achievement_id int unsigned NOT NULL,
	completed tinyint DEFAULT 0 NOT NULL,
	CONSTRAINT task_pk PRIMARY KEY (id),
	CONSTRAINT task_achievement_fk FOREIGN KEY (achievement_id) REFERENCES achievement.achievement(id)
)
ENGINE=InnoDB
DEFAULT CHARSET=utf8
COLLATE=utf8_general_ci;
