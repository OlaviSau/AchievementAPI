ALTER TABLE achievement.task ADD `order` TINYINT UNSIGNED NOT NULL;
ALTER TABLE achievement.task ADD CONSTRAINT task_un UNIQUE KEY (`order`,achievement_id);
