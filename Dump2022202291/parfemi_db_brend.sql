-- MySQL dump 10.13  Distrib 8.0.34, for macos13 (arm64)
--
-- Host: 127.0.0.1    Database: parfemi_db
-- ------------------------------------------------------
-- Server version	8.0.37

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `brend`
--

DROP TABLE IF EXISTS `brend`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `brend` (
  `brend_id` int NOT NULL AUTO_INCREMENT,
  `ime` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `zemlja_porekla` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `created_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `deleted_at` datetime DEFAULT NULL,
  PRIMARY KEY (`brend_id`),
  UNIQUE KEY `ime_UNIQUE` (`ime`)
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `brend`
--

LOCK TABLES `brend` WRITE;
/*!40000 ALTER TABLE `brend` DISABLE KEYS */;
INSERT INTO `brend` VALUES (1,'Chanel','Francuska','2024-07-21 02:18:34','2024-07-31 16:43:02',NULL),(2,'Versace','Italija','2024-07-21 02:18:34','2024-07-31 16:46:59',NULL),(3,'Prada','Italija','2024-07-21 02:18:34','2024-07-31 16:46:59',NULL),(4,'Louis Vuitton','Francuska','2024-07-21 02:18:34','2024-07-31 16:46:59',NULL),(5,'Dior','Francuska','2024-07-21 02:18:34','2024-07-31 16:46:59',NULL),(6,'Gucci','Italija','2024-07-21 02:18:34','2024-07-31 16:46:59',NULL),(7,'D&G','Italija','2024-07-21 02:18:34','2024-07-31 16:46:59',NULL),(8,'Ysl','Francuska','2024-07-21 02:18:34','2024-07-31 16:46:59',NULL),(9,'Paco Rabanne','Francuska','2024-07-21 02:18:34','2024-07-31 16:46:59',NULL),(10,'Carolina Herrera','SAD','2024-07-21 02:18:34','2024-07-31 16:46:59',NULL),(11,'Giorgio Armani','Francuska','2024-07-21 02:18:34','2024-07-31 16:46:59',NULL),(12,'Tom Ford','SAD','2024-07-21 02:18:34','2024-07-31 16:46:59',NULL),(13,'Xerjoff','Italija','2024-07-21 02:18:34','2024-07-31 16:46:59',NULL),(14,'Montale','Francuska','2024-07-21 02:18:34','2024-07-31 16:46:59',NULL),(15,'Creed','Francuska','2024-07-21 02:18:34','2024-07-31 16:46:59',NULL),(16,'Bvlgari','Italija','2024-07-21 02:18:34','2024-07-31 16:46:59',NULL),(17,'Burberry','Velika Britanija','2024-07-21 02:18:34','2024-07-31 16:46:59',NULL),(18,'Tiziana Terenzi','Italija','2024-07-21 02:18:34','2024-07-31 16:46:59',NULL),(19,'Mancera','Francuska','2024-07-21 02:18:34','2024-07-31 16:46:59',NULL),(20,'Maison Francis Kurkdjian','Francuska','2024-07-21 02:18:34','2024-07-31 16:46:59',NULL),(21,'Kilian','Francuska','2024-07-21 02:18:34','2024-07-31 16:46:59',NULL),(23,'Cxo3','Frauus','2024-07-21 02:18:34','2024-07-31 17:15:02','2024-07-31 17:15:02'),(24,'Kiliakkkkn','Francuska','2024-07-21 15:03:21','2024-07-31 17:15:32','2024-07-31 17:15:33'),(25,'Kijjjn','Francuska','2024-07-21 15:19:05','2024-07-31 17:15:35','2024-07-31 17:15:36'),(26,'Gucciiiii','Italijaa','2024-08-05 19:31:57',NULL,NULL),(30,'Novi Brend','Francuska','2024-08-06 06:02:31',NULL,NULL),(31,'c','c','2024-09-05 02:35:57',NULL,NULL),(32,'j`sjs','d','2024-09-05 11:13:06','2024-09-05 11:13:06',NULL),(33,'xzc','zxc','2024-09-05 02:55:26','2024-09-05 02:55:30','2024-09-05 02:55:31');
/*!40000 ALTER TABLE `brend` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-09-05 15:23:14
