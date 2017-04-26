-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Apr 26, 2017 at 09:33 PM
-- Server version: 5.6.21
-- PHP Version: 5.6.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `login`
--

-- --------------------------------------------------------

--
-- Table structure for table `images`
--

CREATE TABLE IF NOT EXISTS `images` (
`id` int(10) unsigned NOT NULL,
  `original_name` text COLLATE utf8_unicode_ci NOT NULL,
  `filename` text COLLATE utf8_unicode_ci NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `images`
--

INSERT INTO `images` (`id`, `original_name`, `filename`, `created_at`, `updated_at`) VALUES
(2, '5pjgHfx1IA-p6vRUSfalEaRLGondNPQed5dQW8cuFeU79KVopUfLp4dXSnNwUdZlOPEpqxoIM9yrdT3DRrGIZh6LLvQZ6vY82sx5-Qcr7ok1tJ3FHPa0CLA6bRdxy3e77isnNg.jpg', '5pjghfx1ia-p6vrusfalearlgondnpqed5dqw8cufeu79kvopuflp4dxsnnwudzlopepqxoim9yrdt3drrgizh6llvqz6vy82sx5-qcr7ok1tj3fhpa0cla6brdxy3e77isnng-fd8ba.jpg', '2017-01-19 19:49:18', '2017-01-19 19:49:18'),
(3, '12.png', '12.png', '2017-01-19 19:49:20', '2017-01-19 19:49:20'),
(5, 'cuantos-tigres-ve-en-la-imagen-juegue-a-localizar-los-felinos-escondidos.jpg', 'cuantos-tigres-ve-en-la-imagen-juegue-a-localizar-los-felinos-escondidos.jpg', '2017-01-19 19:49:26', '2017-01-19 19:49:26'),
(6, 'cuantos-tigres-ve-en-la-imagen-juegue-a-localizar-los-felinos-escondidos.jpg', 'cuantos-tigres-ve-en-la-imagen-juegue-a-localizar-los-felinos-escondidos-79e53.jpg', '2017-01-19 19:49:28', '2017-01-19 19:49:28'),
(8, 'cuantos-tigres-ve-en-la-imagen-juegue-a-localizar-los-felinos-escondidos.jpg', 'cuantos-tigres-ve-en-la-imagen-juegue-a-localizar-los-felinos-escondidos-be370.jpg', '2017-01-19 19:49:51', '2017-01-19 19:49:51'),
(9, 'cuantos-tigres-ve-en-la-imagen-juegue-a-localizar-los-felinos-escondidos.jpg', 'cuantos-tigres-ve-en-la-imagen-juegue-a-localizar-los-felinos-escondidos-67cff.jpg', '2017-01-19 19:49:52', '2017-01-19 19:49:52'),
(10, 'cuantos-tigres-ve-en-la-imagen-juegue-a-localizar-los-felinos-escondidos.jpg', 'cuantos-tigres-ve-en-la-imagen-juegue-a-localizar-los-felinos-escondidos-a38c5.jpg', '2017-01-19 19:49:54', '2017-01-19 19:49:54'),
(16, 'imagen-cachorro-comprimir.jpg', 'imagen-cachorro-comprimir.jpg', '2017-01-19 19:59:29', '2017-01-19 19:59:29');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE IF NOT EXISTS `login` (
`id` int(11) NOT NULL,
  `loGin` varchar(255) DEFAULT NULL,
  `pasSword` char(40) DEFAULT NULL,
  `estado` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`id`, `loGin`, `pasSword`, `estado`) VALUES
(1, 'ADMIN', '81DC9BDB52D04DC20036DBD8313ED055', 1);

-- --------------------------------------------------------

--
-- Table structure for table `migrations`
--

CREATE TABLE IF NOT EXISTS `migrations` (
  `migration` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `batch` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `migrations`
--

INSERT INTO `migrations` (`migration`, `batch`) VALUES
('2014_10_12_000000_create_users_table', 1),
('2014_10_12_100000_create_password_resets_table', 1),
('2015_08_07_125128_CreateImages', 1);

-- --------------------------------------------------------

--
-- Table structure for table `password_resets`
--

CREATE TABLE IF NOT EXISTS `password_resets` (
  `email` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `token` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE IF NOT EXISTS `users` (
`id` int(10) unsigned NOT NULL,
  `name` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `email` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `password` varchar(60) COLLATE utf8_unicode_ci NOT NULL,
  `remember_token` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `usuario`
--

CREATE TABLE IF NOT EXISTS `usuario` (
`id` int(11) NOT NULL,
  `usuario` varchar(200) NOT NULL,
  `contra` varchar(200) NOT NULL,
  `status` varchar(200) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `usuario`
--

INSERT INTO `usuario` (`id`, `usuario`, `contra`, `status`) VALUES
(1, 'admin', 'admin', '');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `images`
--
ALTER TABLE `images`
 ADD PRIMARY KEY (`id`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
 ADD PRIMARY KEY (`id`);

--
-- Indexes for table `password_resets`
--
ALTER TABLE `password_resets`
 ADD KEY `password_resets_email_index` (`email`), ADD KEY `password_resets_token_index` (`token`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
 ADD PRIMARY KEY (`id`), ADD UNIQUE KEY `users_email_unique` (`email`);

--
-- Indexes for table `usuario`
--
ALTER TABLE `usuario`
 ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `images`
--
ALTER TABLE `images`
MODIFY `id` int(10) unsigned NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=17;
--
-- AUTO_INCREMENT for table `login`
--
ALTER TABLE `login`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
MODIFY `id` int(10) unsigned NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `usuario`
--
ALTER TABLE `usuario`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
