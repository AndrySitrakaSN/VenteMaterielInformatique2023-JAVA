-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le :  jeu. 06 juil. 2023 à 17:59
-- Version du serveur :  5.7.24
-- Version de PHP :  7.2.14

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `matinfo`
--

-- --------------------------------------------------------

--
-- Structure de la table `achat`
--

DROP TABLE IF EXISTS `achat`;
CREATE TABLE IF NOT EXISTS `achat` (
  `idAchat` int(11) NOT NULL AUTO_INCREMENT,
  `idMat` int(11) NOT NULL,
  `qte` int(11) NOT NULL,
  `idCli` int(11) NOT NULL,
  `dateAchat` varchar(100) NOT NULL,
  PRIMARY KEY (`idAchat`)
) ENGINE=MyISAM AUTO_INCREMENT=62 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `achat`
--

INSERT INTO `achat` (`idAchat`, `idMat`, `qte`, `idCli`, `dateAchat`) VALUES
(61, 27, 5, 14, '28/06/2023'),
(58, 15, 2, 8, '27/06/2023'),
(57, 15, 2, 13, '27/06/2023'),
(60, 27, 5, 33, '28/06/2023'),
(59, 11, 244, 8, '27/06/2023'),
(48, 20, 1, 15, '22/06/2023'),
(49, 3, 23, 15, '22/06/2023');

-- --------------------------------------------------------

--
-- Structure de la table `client`
--

DROP TABLE IF EXISTS `client`;
CREATE TABLE IF NOT EXISTS `client` (
  `numCli` int(11) NOT NULL AUTO_INCREMENT,
  `nomCli` varchar(255) NOT NULL,
  PRIMARY KEY (`numCli`)
) ENGINE=MyISAM AUTO_INCREMENT=40 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `client`
--

INSERT INTO `client` (`numCli`, `nomCli`) VALUES
(2, 'solonirina'),
(3, 'Telina'),
(4, 'Recary1'),
(5, 'Tiphanie'),
(6, 'Lucie'),
(7, 'Solo'),
(8, 'Benet'),
(9, 'Daniella'),
(33, 'kaka'),
(11, 'Froginah34'),
(12, 'Landy Endriny Kessy '),
(13, 'Sitrakaq'),
(14, 'Andry'),
(15, 'Zoket'),
(39, 'helo'),
(27, 'Damiandry'),
(29, 'Marinah2');

-- --------------------------------------------------------

--
-- Structure de la table `client1`
--

DROP TABLE IF EXISTS `client1`;
CREATE TABLE IF NOT EXISTS `client1` (
  `idCli1` int(11) NOT NULL AUTO_INCREMENT,
  `numCli1` int(11) NOT NULL,
  `nomCli1` varchar(255) NOT NULL,
  PRIMARY KEY (`idCli1`)
) ENGINE=MyISAM AUTO_INCREMENT=459 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `client1`
--

INSERT INTO `client1` (`idCli1`, `numCli1`, `nomCli1`) VALUES
(458, 14, 'Andry');

-- --------------------------------------------------------

--
-- Structure de la table `materiel`
--

DROP TABLE IF EXISTS `materiel`;
CREATE TABLE IF NOT EXISTS `materiel` (
  `numMat` int(11) NOT NULL AUTO_INCREMENT,
  `Design` varchar(255) NOT NULL,
  `Pu` int(11) NOT NULL,
  `stock` int(11) NOT NULL,
  PRIMARY KEY (`numMat`)
) ENGINE=MyISAM AUTO_INCREMENT=28 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `materiel`
--

INSERT INTO `materiel` (`numMat`, `Design`, `Pu`, `stock`) VALUES
(8, 'Haweil', 2000, 241),
(3, 'Iphone 12', 200000, 164),
(4, 'PC Mac 12C', 200000, 14),
(5, 'Mac we', 4000000, 788),
(20, 'Puce', 23, 968),
(7, 'ecouteur yo', 3000, 3),
(27, 'Haweil', 2000, 10),
(10, 'Ram ddr3 8Go', 8, 3),
(11, 'Ram ddr4 4Go', 50000, 3521),
(13, 'Disque Dure 500', 120000, 201),
(14, 'Clavier externe ', 20000, 384),
(15, 'Assus Rog 30', 2000000, 502),
(26, 'Ram ddr3 8Go', 8000, 2632);

-- --------------------------------------------------------

--
-- Structure de la table `materielv`
--

DROP TABLE IF EXISTS `materielv`;
CREATE TABLE IF NOT EXISTS `materielv` (
  `idMatx` int(11) NOT NULL AUTO_INCREMENT,
  `numMatx` int(11) NOT NULL,
  `nbrMatx` int(11) NOT NULL,
  `nomMatx` varchar(255) NOT NULL,
  `PuMatx` int(11) NOT NULL,
  `numCli` int(11) NOT NULL,
  `daty` varchar(100) NOT NULL,
  PRIMARY KEY (`idMatx`)
) ENGINE=MyISAM AUTO_INCREMENT=518 DEFAULT CHARSET=latin1;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
