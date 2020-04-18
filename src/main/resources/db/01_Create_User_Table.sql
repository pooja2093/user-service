CREATE TABLE `users_table` (
  `uuid` varchar(45) NOT NULL,
  `username` varchar(45) NOT NULL,
  `gender` varchar(45),
  `name` varchar(45),
  `interest` varchar(45),
  `loginType` varchar(45),
  `phone` varchar(45),
  `email` varchar(45),
  `dob` varchar(45),
  `minRange` varchar(45),
  `maxRange` varchar(45),
  `is_active` boolean default false,
  PRIMARY KEY (`uuid`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

CREATE TABLE `accounts_table` (
  `uuid` varchar(45) NOT NULL,
  `username` varchar(45) NOT NULL,
  `loginType` varchar(45),
  `is_active` boolean default false,
  `is_enabled` boolean default false,
  PRIMARY KEY (`uuid`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;