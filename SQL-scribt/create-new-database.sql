CREATE DATABASE  IF NOT EXISTS `task_schema`;
USE `task_schema`;

DROP TABLE IF EXISTS `employees`;

CREATE TABLE `employees` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

INSERT INTO `employees` VALUES 
	(1,'Mostafa','Hares','mostafahares698@gmail.com'),
	(2,'Ahmed','Yahia','ahmedyahia@gmail.com'),
	(3,'Mohamed','Hares','mohamedhares@yahoo.com'),
	(4,'Ahmed','ali','ali@outlook.com'),
	(5,'Mahmoud','wahba','mahmoudwahba@yahoo.com');
