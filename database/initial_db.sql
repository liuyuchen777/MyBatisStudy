DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
    `id` INT(20) NOT NULL,
    `name` VARCHAR(30) DEFAULT NULL,
    `pwd` VARCHAR(30) DEFAULT NULL,
    PRIMARY KEY (`id`)
)ENGINE=INNODB DEFAULT CHARSET=utf8;

INSERT INTO `user`(`id`, `name`, `pwd`) VALUES
(1, 'Tom', '123456'),
(2, 'James', '123456'),
(3, 'Kitty', '123456');