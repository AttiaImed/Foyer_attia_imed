-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 20, 2024 at 03:04 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `foyer`
--

-- --------------------------------------------------------

--
-- Table structure for table `bloc`
--

CREATE TABLE `bloc` (
  `capatice_bloc` bigint(20) DEFAULT NULL,
  `foyer_id_foyer` bigint(20) DEFAULT NULL,
  `id_block` bigint(20) NOT NULL,
  `nom_block` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `chambre`
--

CREATE TABLE `chambre` (
  `bloc_id_block` bigint(20) DEFAULT NULL,
  `id_chambre` bigint(20) NOT NULL,
  `numero_chambre` bigint(20) DEFAULT NULL,
  `typec` enum('DOUBLE','SIMPLE','TRIPLE') DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `chambre_reservations`
--

CREATE TABLE `chambre_reservations` (
  `chambre_id_chambre` bigint(20) NOT NULL,
  `reservations_id_reservation` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `etudiant`
--

CREATE TABLE `etudiant` (
  `date_naissance` date DEFAULT NULL,
  `cin` bigint(20) DEFAULT NULL,
  `id` bigint(20) NOT NULL,
  `ecole` varchar(255) DEFAULT NULL,
  `nom` varchar(255) DEFAULT NULL,
  `prenom` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `etudiant`
--

INSERT INTO `etudiant` (`date_naissance`, `cin`, `id`, `ecole`, `nom`, `prenom`) VALUES
('2023-11-12', 12346578, 2, 'MnjiSlim', 'Chiha', 'Khalil'),
('2023-11-12', 87654321, 3, 'MnjiSlim', 'Attia', 'Imed');

-- --------------------------------------------------------

--
-- Table structure for table `foyer`
--

CREATE TABLE `foyer` (
  `capacite_foyer` bigint(20) DEFAULT NULL,
  `id_foyer` bigint(20) NOT NULL,
  `nom_foyer` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `foyer`
--

INSERT INTO `foyer` (`capacite_foyer`, `id_foyer`, `nom_foyer`) VALUES
(120, 1, 'Garcon'),
(120, 2, 'Fille'),
(120, 3, 'Fille');

-- --------------------------------------------------------

--
-- Table structure for table `reservation`
--

CREATE TABLE `reservation` (
  `est_valide` bit(1) DEFAULT NULL,
  `annee_universitaire` datetime(6) DEFAULT NULL,
  `id_reservation` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `reservation_etudiants`
--

CREATE TABLE `reservation_etudiants` (
  `etudiants_id` bigint(20) NOT NULL,
  `reservations_id_reservation` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `universite`
--

CREATE TABLE `universite` (
  `foyer_id_foyer` bigint(20) DEFAULT NULL,
  `id_universite` bigint(20) NOT NULL,
  `adresse` varchar(255) DEFAULT NULL,
  `nom_universite` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `universite`
--

INSERT INTO `universite` (`foyer_id_foyer`, `id_universite`, `adresse`, `nom_universite`) VALUES
(1, 3, 'Ariana', 'Esprit Technopole');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `bloc`
--
ALTER TABLE `bloc`
  ADD PRIMARY KEY (`id_block`),
  ADD KEY `FKrlx3b5jtde0ftmmrcqbifn0pt` (`foyer_id_foyer`);

--
-- Indexes for table `chambre`
--
ALTER TABLE `chambre`
  ADD PRIMARY KEY (`id_chambre`),
  ADD KEY `FKfv9rnixwbgrugxd0bd8iwoqyo` (`bloc_id_block`);

--
-- Indexes for table `chambre_reservations`
--
ALTER TABLE `chambre_reservations`
  ADD PRIMARY KEY (`chambre_id_chambre`,`reservations_id_reservation`),
  ADD UNIQUE KEY `UK_lhhok2kyd975dqwp4cuo2w6df` (`reservations_id_reservation`);

--
-- Indexes for table `etudiant`
--
ALTER TABLE `etudiant`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `foyer`
--
ALTER TABLE `foyer`
  ADD PRIMARY KEY (`id_foyer`);

--
-- Indexes for table `reservation`
--
ALTER TABLE `reservation`
  ADD PRIMARY KEY (`id_reservation`);

--
-- Indexes for table `reservation_etudiants`
--
ALTER TABLE `reservation_etudiants`
  ADD PRIMARY KEY (`etudiants_id`,`reservations_id_reservation`),
  ADD KEY `FKr9q9iw0kkhggmvjpnlv00h385` (`reservations_id_reservation`);

--
-- Indexes for table `universite`
--
ALTER TABLE `universite`
  ADD PRIMARY KEY (`id_universite`),
  ADD UNIQUE KEY `UK_shp3tdxapicb48phb2shb39gu` (`foyer_id_foyer`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `bloc`
--
ALTER TABLE `bloc`
  MODIFY `id_block` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `chambre`
--
ALTER TABLE `chambre`
  MODIFY `id_chambre` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `etudiant`
--
ALTER TABLE `etudiant`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `foyer`
--
ALTER TABLE `foyer`
  MODIFY `id_foyer` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `universite`
--
ALTER TABLE `universite`
  MODIFY `id_universite` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `bloc`
--
ALTER TABLE `bloc`
  ADD CONSTRAINT `FKrlx3b5jtde0ftmmrcqbifn0pt` FOREIGN KEY (`foyer_id_foyer`) REFERENCES `foyer` (`id_foyer`);

--
-- Constraints for table `chambre`
--
ALTER TABLE `chambre`
  ADD CONSTRAINT `FKfv9rnixwbgrugxd0bd8iwoqyo` FOREIGN KEY (`bloc_id_block`) REFERENCES `bloc` (`id_block`);

--
-- Constraints for table `chambre_reservations`
--
ALTER TABLE `chambre_reservations`
  ADD CONSTRAINT `FKhx2j8u5cpdmo8pptjvnsjqwma` FOREIGN KEY (`reservations_id_reservation`) REFERENCES `reservation` (`id_reservation`),
  ADD CONSTRAINT `FKqy33yndadmosa4l31qk6v3vm2` FOREIGN KEY (`chambre_id_chambre`) REFERENCES `chambre` (`id_chambre`);

--
-- Constraints for table `reservation_etudiants`
--
ALTER TABLE `reservation_etudiants`
  ADD CONSTRAINT `FKa0isg3b3fu38ym8n8650i6s7t` FOREIGN KEY (`etudiants_id`) REFERENCES `etudiant` (`id`),
  ADD CONSTRAINT `FKr9q9iw0kkhggmvjpnlv00h385` FOREIGN KEY (`reservations_id_reservation`) REFERENCES `reservation` (`id_reservation`);

--
-- Constraints for table `universite`
--
ALTER TABLE `universite`
  ADD CONSTRAINT `FK2b4r95emuv9ea1064hjqxpqq` FOREIGN KEY (`foyer_id_foyer`) REFERENCES `foyer` (`id_foyer`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
