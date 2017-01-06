-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jan 06, 2017 at 11:36 AM
-- Server version: 10.1.10-MariaDB
-- PHP Version: 7.0.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `karyawan`
--

-- --------------------------------------------------------

--
-- Table structure for table `karyawan`
--

CREATE TABLE `karyawan` (
  `id` int(6) NOT NULL,
  `nama` varchar(25) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `jk` varchar(1) NOT NULL,
  `email` varchar(20) NOT NULL,
  `telp` varchar(15) NOT NULL,
  `gaji` int(12) NOT NULL,
  `jabatan` varchar(10) NOT NULL,
  `status` varchar(13) NOT NULL,
  `agama` varchar(10) NOT NULL,
  `pendidikan` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `karyawan`
--

INSERT INTO `karyawan` (`id`, `nama`, `alamat`, `jk`, `email`, `telp`, `gaji`, `jabatan`, `status`, `agama`, `pendidikan`) VALUES
(11, 'Aji Nur', 'Karanganyar', 'L', 'nurrohman@gmail.com', '081345123523', 8000000, 'Manager', 'Single', 'Islam', 'S1'),
(12, 'Pradana Cipta', 'Sragen', 'L', 'pradana@yahoo.com', '08192671623', 8000000, 'Manager', 'Singke', 'Islam', 'S1'),
(13, 'Asti Amalina', 'Pemalang', 'P', 'amalina@gmail.com', '08234523444', 8000000, 'Manager', 'Single', 'Islam', 'S1'),
(14, 'Dewangga P', 'Ngawi', 'L', 'dewangga@gmail.com', '08524424523`', 8000000, 'Manager', 'Single', 'Islam', 'S1');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `karyawan`
--
ALTER TABLE `karyawan`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `karyawan`
--
ALTER TABLE `karyawan`
  MODIFY `id` int(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
