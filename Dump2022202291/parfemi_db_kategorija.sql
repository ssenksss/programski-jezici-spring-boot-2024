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
-- Table structure for table `kategorija`
--

DROP TABLE IF EXISTS `kategorija`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `kategorija` (
  `kategorija_id` int NOT NULL AUTO_INCREMENT,
  `pol` enum('ŽENSKI','MUŠKI','UNISEX') CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `visoke_note` set('visnja','badem','cimet','orasi','citrus','drvene note','pačuli','slatke note','belo cveće','ruža','zemljane note','vanila','vreli začini','žuto cveće','aldehidi','iris','sveže','cveće','kokos','životinjske note','pčelinji vosak','tropske note','med','amber','oud','note dima','voćne note','koža','balzamičan','aromatični','sveže začinsko','zelene note','puderaste note','mošusne note','bilje','lavanda','tuberoza') COLLATE utf8mb4_unicode_ci NOT NULL,
  `srednje_note` set('visnja','badem','cimet','orasi','citrus','drvene note','pačuli','slatke note','belo cveće','ruža','zemljane note','vanila','vreli začini','žuto cveće','aldehidi','iris','sveže','cveće','kokos','životinjske note','pčelinji vosak','tropske note','med','amber','oud','note dima','voćne note','koža','balzamičan','aromatični','sveže začinsko','zelene note','puderaste note','mošusne note','bilje','lavanda','tuberoza') COLLATE utf8mb4_unicode_ci NOT NULL,
  `niske_note` set('visnja','badem','cimet','orasi','citrus','drvene note','pačuli','slatke note','belo cveće','ruža','zemljane note','vanila','vreli začini','žuto cveće','aldehidi','iris','sveže','cveće','kokos','životinjske note','pčelinji vosak','tropske note','med','amber','oud','note dima','voćne note','koža','balzamičan','aromatični','sveže začinsko','zelene note','puderaste note','mošusne note','bilje','lavanda','tuberoza') COLLATE utf8mb4_unicode_ci NOT NULL,
  `created_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `deleted_at` datetime DEFAULT NULL,
  PRIMARY KEY (`kategorija_id`)
) ENGINE=InnoDB AUTO_INCREMENT=43 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kategorija`
--

LOCK TABLES `kategorija` WRITE;
/*!40000 ALTER TABLE `kategorija` DISABLE KEYS */;
INSERT INTO `kategorija` VALUES (1,'ŽENSKI','drvene note,puderaste note','iris,sveže','citrus,žuto cveće','2024-07-31 17:19:40',NULL,NULL),(2,'ŽENSKI','citrus,belo cveće','drvene note,belo cveće','vreli začini,žuto cveće','2024-07-31 17:19:40',NULL,NULL),(3,'MUŠKI','citrus,aromatični','cveće,sveže začinsko','ruža,zelene note','2024-07-31 17:19:40',NULL,NULL),(4,'MUŠKI','citrus,amber,sveže začinsko','vreli začini,mošusne note','sveže,note dima','2024-07-31 17:19:40',NULL,NULL),(5,'ŽENSKI','vreli začini,kokos','puderaste note','aromatični,mošusne note','2024-07-31 17:19:40',NULL,NULL),(6,'ŽENSKI','citrus,belo cveće','vanila,amber,puderaste note','sveže,životinjske note','2024-07-31 17:19:40',NULL,NULL),(7,'ŽENSKI','cveće,tuberoza','belo cveće,pčelinji vosak,tropske note','med,puderaste note','2024-07-31 17:19:40',NULL,NULL),(8,'UNISEX','vreli začini,amber,oud','ruža,note dima','slatke note,balzamičan','2024-07-31 17:19:40',NULL,NULL),(9,'MUŠKI','citrus,voćne note,aromatični','sveže začinsko,zelene note','slatke note,puderaste note','2024-07-31 17:19:40',NULL,NULL),(10,'ŽENSKI','drvene note,amber,voćne note','pačuli,slatke note,zemljane note','citrus,belo cveće,cveće','2024-07-31 17:19:40',NULL,NULL),(11,'MUŠKI','amber,sveže začinsko','aromatični,mošusne note','vreli začini,bilje,lavanda','2024-07-31 17:19:40',NULL,NULL),(12,'ŽENSKI','belo cveće','tuberoza','tuberoza','2024-07-31 17:19:40',NULL,NULL),(13,'ŽENSKI','cveće,voćne note','pačuli,slatke note,sveže','sveže začinsko,mošusne note','2024-07-31 17:19:40',NULL,NULL),(14,'ŽENSKI','slatke note,vanila','belo cveće,puderaste note','citrus','2024-07-31 17:19:40',NULL,NULL),(15,'ŽENSKI','belo cveće,voćne note','slatke note,amber,puderaste note','sveže,mošusne note','2024-07-31 17:19:40',NULL,NULL),(16,'ŽENSKI','citrus,belo cveće','vanila,aromatični,lavanda','drvene note,mošusne note','2024-07-31 17:19:40',NULL,NULL),(17,'ŽENSKI','slatke note,vanila','drvene note,belo cveće','voćne note,puderaste note','2024-07-31 17:19:40',NULL,NULL),(18,'MUŠKI','životinjske note,mošusne note','zemljane note,med,puderaste note','drvene note,aldehidi','2024-07-31 17:19:40',NULL,NULL),(19,'MUŠKI','citrus,vreli začini','drvene note,ruža,koža','pačuli,životinjske note,zelene note','2024-07-31 17:19:40',NULL,NULL),(20,'ŽENSKI','belo cveće,vanila','citrus,amber,puderaste note','balzamičan','2024-07-31 17:19:40',NULL,NULL),(21,'MUŠKI','vreli začini,aromatični','drvene note,sveže začinsko,zelene note','citrus,slatke note,voćne note','2024-07-31 17:19:40',NULL,NULL),(22,'ŽENSKI','slatke note,belo cveće,vreli začini','drvene note,amber','puderaste note,tuberoza','2024-07-31 17:19:40',NULL,NULL),(23,'MUŠKI','vreli začini,sveže začinsko','slatke note,vanila','citrus,drvene note,amber','2024-07-31 17:19:40',NULL,NULL),(24,'ŽENSKI','citrus,aromatični','belo cveće,zelene note','drvene note,sveže','2024-07-31 17:19:40',NULL,NULL),(25,'MUŠKI','citrus,aromatični','cveće,sveže začinsko','drvene note,sveže','2024-07-31 17:19:40',NULL,NULL),(26,'ŽENSKI','visnja,badem,slatke note','orasi,vanila,voćne note','drvene note,amber,balzamičan','2024-07-31 17:19:40',NULL,NULL),(27,'UNISEX','citrus,slatke note,voćne note','puderaste note,mošusne note','vanila,amber,sveže začinsko','2024-07-31 17:19:40',NULL,NULL),(28,'UNISEX','vanila,puderaste note','voćne note','slatke note','2024-07-31 17:19:40',NULL,NULL),(29,'UNISEX','slatke note,amber','drvene note,ruža,zemljane note','orasi,vreli začini','2024-07-31 17:19:40',NULL,NULL),(30,'MUŠKI','citrus,drvene note,puderaste note','aromatični,mošusne note','životinjske note,balzamičan,sveže začinsko','2024-07-31 17:19:40',NULL,NULL),(31,'MUŠKI','slatke note,voćne note','citrus,drvene note,mošusne note','sveže','2024-07-31 17:19:40',NULL,NULL),(32,'UNISEX','citrus,voćne note,zelene note','drvene note,aromatični,mošusne note','sveže,cveće','2024-07-31 17:19:40',NULL,NULL),(33,'ŽENSKI','drvene note,cveće,mošusne note','voćne note,zelene note','zemljane note,puderaste note','2024-07-31 17:19:40',NULL,NULL),(34,'ŽENSKI','drvene note,cveće,sveže začinsko','citrus,voćne note,mošusne note','puderaste note','2024-07-31 17:19:40',NULL,NULL),(35,'ŽENSKI','belo cveće','citrus,voćne note','slatke note,ruža,cveće','2024-07-31 17:19:40',NULL,NULL),(36,'MUŠKI','drvene note,amber,aromatični','vreli začini,koža','životinjske note,balzamičan','2024-07-31 17:19:40',NULL,NULL),(37,'UNISEX','drvene note,slatke note,vanila','amber,voćne note','žuto cveće,zelene note,puderaste note','2024-07-31 17:19:40',NULL,NULL),(38,'UNISEX','drvene note,vanila,oud','vreli začini,sveže začinsko','balzamičan,aromatični','2024-07-31 17:19:40',NULL,NULL),(39,'UNISEX','drvene note,vreli začini,amber','aromatični,sveže začinsko','belo cveće,životinjske note','2024-07-31 17:19:40',NULL,NULL),(40,'UNISEX','ruža,vanila,oud','amber,puderaste note','vreli začini,cveće,balzamičan','2024-07-31 17:19:40',NULL,NULL),(41,'UNISEX','amber','vanila','vanila','2024-07-31 17:19:40',NULL,NULL),(42,'ŽENSKI','belo cveće,cveće,voćne note','ruža,žuto cveće,zelene note,tuberoza','životinjske note,amber','2024-07-31 17:19:40',NULL,NULL);
/*!40000 ALTER TABLE `kategorija` ENABLE KEYS */;
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
