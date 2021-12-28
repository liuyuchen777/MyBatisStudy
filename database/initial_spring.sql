DROP TABLE IF EXISTS `t_msg`;

CREATE TABLE `t_msg` (
    `id` int(11) NOT NULL,
    `message` varchar(255) DEFAULT NULL COMMENT '信息',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `t_msg` (id, message)
    VALUES
        (1, 'eat breakfast'),
        (2, 'do things'),
        (3, 'have fun');