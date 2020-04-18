CREATE TABLE  IF NOT EXISTS `accounts_table` (
  `uuid` varchar(45) NOT NULL,
  `username` varchar(45) NOT NULL,
  `login_type` varchar(45),
  `is_active` boolean default true,
  `is_deleted` boolean default false,
  `is_enabled` boolean default false,
  PRIMARY KEY (`uuid`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

CREATE TABLE IF NOT EXISTS `users_table` (
  `uuid` varchar(45) NOT NULL,
  `user_id` varchar(45) NOT NULL UNIQUE,
  `gender` varchar(45) NOT NULL,
  `name` varchar(45) NOT NULL,
  `interest` varchar(45) NOT NULL,
  `location` varchar(10),
  `status` varchar(45),
  `dob` varchar(45),
  `min_range` INT,
  `max_range` INT,
  FOREIGN KEY (user_id) REFERENCES accounts_table(uuid) ON DELETE CASCADE,
  PRIMARY KEY (`uuid`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;