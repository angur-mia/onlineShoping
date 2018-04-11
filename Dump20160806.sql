CREATE DATABASE  IF NOT EXISTS `shop_online` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `shop_online`;
-- MySQL dump 10.13  Distrib 5.7.9, for Win32 (AMD64)
--
-- Host: localhost    Database: shop_online
-- ------------------------------------------------------
-- Server version	5.7.11-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `admin` (
  `id` varchar(45) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `pass` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin`
--

LOCK TABLES `admin` WRITE;
/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
INSERT INTO `admin` VALUES ('1173088','AL PARVES','11331133'),('1185966','Ashraf','123');
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `category`
--

DROP TABLE IF EXISTS `category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `category` (
  `cat_id` int(11) NOT NULL AUTO_INCREMENT,
  `cat_name` varchar(45) DEFAULT NULL,
  `cat_desc` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`cat_id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `category`
--

LOCK TABLES `category` WRITE;
/*!40000 ALTER TABLE `category` DISABLE KEYS */;
INSERT INTO `category` VALUES (4,'Sportswear','Sports basis wear'),(5,'Mens','Mens dress'),(6,'Womens','Womens dress'),(7,'Kids','Kids dress'),(8,'Fashion','Fashion dress'),(9,'Households','Households dress'),(10,'Interiors','Interiors dress'),(11,'Clothing','Clothing dress'),(12,'Bags','Bags dress'),(13,'Shoes','Shoes'),(14,'Other','Other Product'),(15,'Tshirt','New Tshirt'),(16,'Blazer','New Blazer'),(17,'Sunglass','New Sunglass');
/*!40000 ALTER TABLE `category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `choose`
--

DROP TABLE IF EXISTS `choose`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `choose` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ses_id` varchar(80) NOT NULL,
  `pro_id` int(11) DEFAULT NULL,
  `pro_name` varchar(100) DEFAULT NULL,
  `pro_url` varchar(130) DEFAULT NULL,
  `price` double DEFAULT NULL,
  `quantity` int(11) DEFAULT NULL,
  `total` double DEFAULT NULL,
  `ch_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `pro_size` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `choose`
--

LOCK TABLES `choose` WRITE;
/*!40000 ALTER TABLE `choose` DISABLE KEYS */;
/*!40000 ALTER TABLE `choose` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `delivary_address`
--

DROP TABLE IF EXISTS `delivary_address`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `delivary_address` (
  `delivary_id` int(11) NOT NULL AUTO_INCREMENT,
  `shoper_name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `phone` varchar(15) DEFAULT NULL,
  `district` varchar(45) DEFAULT NULL,
  `country` varchar(45) DEFAULT NULL,
  `zip_code` varchar(45) DEFAULT NULL,
  `recive_time` varchar(45) DEFAULT NULL,
  `order_time` datetime DEFAULT CURRENT_TIMESTAMP,
  `address` varchar(150) DEFAULT NULL,
  `comments` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`delivary_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `delivary_address`
--

LOCK TABLES `delivary_address` WRITE;
/*!40000 ALTER TABLE `delivary_address` DISABLE KEYS */;
INSERT INTO `delivary_address` VALUES (1,'Md.ABDULLAH AL MAMUN','alparves.dc@gmail.com','01929645480','Chittagong','Bangladesh','3910','Morging time','2016-07-24 06:28:15','Feni','Yes'),(2,'Md.ABDULLAH AL MAMUN','alparves.dc@gmail.com','01929645480','Chittagong','Bangladesh','3910','dmam','2016-07-25 08:24:04','Feni','mamm'),(3,'','','','','','','','2016-07-30 17:13:23','',''),(4,'Angur Mia','angur87@gmail.com','01817577725','Chandpur','Bangladesh','1209','2','2016-07-30 17:36:58','Dhanmondi','dfddfgd'),(5,'','','','','','','','2016-07-30 18:42:34','',''),(6,'Md.ABDULLAH AL MAMUN','alparves.dc@gmail.com','01929645480','Chittagong','Bangladesh','3910','morning','2016-08-02 10:14:02','Feni','hfhhf'),(7,'','','','','','','','2016-08-02 10:17:39','',''),(8,'','','','','','','','2016-08-06 10:47:34','','');
/*!40000 ALTER TABLE `delivary_address` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `delivary_cost`
--

DROP TABLE IF EXISTS `delivary_cost`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `delivary_cost` (
  `delivary_id` int(11) NOT NULL,
  `zone_name` varchar(45) DEFAULT NULL,
  `delivary_cost` double DEFAULT NULL,
  PRIMARY KEY (`delivary_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `delivary_cost`
--

LOCK TABLES `delivary_cost` WRITE;
/*!40000 ALTER TABLE `delivary_cost` DISABLE KEYS */;
INSERT INTO `delivary_cost` VALUES (100,'Feni',77),(101,'Bagerhat',85),(102,'Bandarban',88),(103,'Barguna',87),(104,'Barisal',105),(105,'Bhola',150),(106,'Bogra',90),(107,'Brahmanbaria',55),(108,'Chandpur',65),(109,'Chittagong',150),(110,'Chuadanga',130);
/*!40000 ALTER TABLE `delivary_cost` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pro_order`
--

DROP TABLE IF EXISTS `pro_order`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pro_order` (
  `order_id` int(11) NOT NULL AUTO_INCREMENT,
  `pro_id` int(11) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `order_date` date DEFAULT NULL,
  `order_qty` int(11) DEFAULT NULL,
  `total_price` double DEFAULT NULL,
  `order_status` varchar(45) DEFAULT 'N',
  `delivary_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pro_order`
--

LOCK TABLES `pro_order` WRITE;
/*!40000 ALTER TABLE `pro_order` DISABLE KEYS */;
/*!40000 ALTER TABLE `pro_order` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pro_order_details`
--

DROP TABLE IF EXISTS `pro_order_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pro_order_details` (
  `order_details_id` int(11) NOT NULL AUTO_INCREMENT,
  `order_id` int(11) DEFAULT NULL,
  `pro_id` int(11) DEFAULT NULL,
  `pro_qty` int(11) DEFAULT NULL,
  PRIMARY KEY (`order_details_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pro_order_details`
--

LOCK TABLES `pro_order_details` WRITE;
/*!40000 ALTER TABLE `pro_order_details` DISABLE KEYS */;
/*!40000 ALTER TABLE `pro_order_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product`
--

DROP TABLE IF EXISTS `product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `product` (
  `pro_id` int(11) NOT NULL AUTO_INCREMENT,
  `sub_cat_id` int(11) DEFAULT NULL,
  `pro_name` varchar(100) NOT NULL,
  `pro_qty` int(11) DEFAULT NULL,
  `pro_price` double DEFAULT NULL,
  `pro_url` varchar(100) DEFAULT NULL,
  `pro_desc` varchar(200) DEFAULT NULL,
  `pro_size` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`pro_id`)
) ENGINE=InnoDB AUTO_INCREMENT=245 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product`
--

LOCK TABLES `product` WRITE;
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
INSERT INTO `product` VALUES (1,1,'Nike Cads',10,15,'resources/nike.jpg','Brad new cads',NULL),(2,1,'Nike Tops',18,12,'resources/topsNike.jpg','New imported tops',NULL),(3,1,'Nike Pro Cool Fitted',20,10,'resources/topstNike1A.jpg','Dri-FIT fabric',NULL),(4,1,'Buscatball Clothing',9,20,'resources/mmama.jpg','Nike Hyper Elite Knit ',NULL),(5,1,'W NIKE AIR RIFT BR  ',10,100,'resources/Wnikesopt12.jpeg','Really Nice Sprotsware',NULL),(6,1,'NIKE MODERN ',10,75,'resources/NIKE-MODERN.jpg','A new brand in Nike',NULL),(7,1,'NIKE BONDED',12,55,'resources/BTKA12.jpeg','The oversized football jersey has been a longtime staple of women’s sportswear.',NULL),(8,1,'NIKE LEG-A-SEE CROPPED PRINTED',15,45,'resources/BTKA_1124.jpeg','The Leg-A-See Cropped Leggings fuse Nike’s modern aesthetic ',NULL),(9,1,'NIKE LEG-A-SEE CROPPED PRINTED ',15,45,'resources/BTKA_146.jpeg','The Leg-A-See Cropped Leggings fuse Nike’s modern aesthetic ',NULL),(10,1,'W NIKE SIGNAL ',18,42,'resources/BTKA_1463.jpeg','When the warmer months roll around and the thermometer passes a certain point,Parves',NULL),(11,1,'NIKE WINDRUNNER',16,100,'resources/BTKA_146ma.jpeg',' Nike, athletic apparel made with running specifically in mind was basically nonexistent.',NULL),(12,1,'NIKE PRESTO (GS)',12,15,'resources/BTKA_1464mam.jpeg','Nowadays, the minimalist running movement is everywhere.',NULL),(13,2,'Jordan Spieth UA Tour Cap',15,29,'resources/under-armourcao.jpg','Structured build maintains shape with a slightly higher crown',NULL),(14,2,'UA Micro G® Limitless',18,66.99,'resources/urmar.jpg','Adjustable heel lock down strap for improved fit',NULL),(15,2,'UA Micro G® Speed Swift',19,59.99,'resources/mamag.jpeg','Anatomical rubber outsole for natural traction & performance',NULL),(16,2,'UA F5',10,34,'resources/1271183-001_F.jpg','Meets NFHS/NCAA/NOCSAE standards',NULL),(17,2,'UA 395 Indoor/Outdoor Basketball',24,23.99,'resources/1233710-860.jpg','Meets NFHS/NCAA/NOCSAE standards',NULL),(18,2,'UA Solid Batting Helmet',18,34.99,'resources/UA_Matte_Royal.jpg','Meets NOCSAE standards',NULL),(19,2,'UA Storm Undeniable II',25,18.22,'resources/under-armour0.jpg','UA Storm technology delivers an element-battling',NULL),(20,2,'UA Pitch Knit ¾',12,50,'resources/V5-1277775-001_HTF.jpg','Fitted: Next-to-skin without the squeeze.',NULL),(21,3,'Messi 16.1 Firm Ground Cleats',20,200,'resources/130659.jpg','Developed in cooperation with Lionel Messi',NULL),(22,3,'Ultra Boost Shoes',24,226,'resources/a0038-adidas2b22.jpg','Continental™ Rubber outsole for extraordinary grip in wet and dry conditions',NULL),(23,3,'Superstar 2.0 Shorts',28,8,'resources/1320787_003_main.jpg','The 3-Stripes are made to move on the court',NULL),(24,3,'Standard One Blocked Tank Top',9,40,'resources/AJ7864_000_plp_model.jpg','Contrast back panel with graphic print above hem',NULL),(25,3,'Techfit Base Tee',15,19.99,'resources/S27925_01_laydown.jpg','climalite® fabric sweeps sweat away from your skin',NULL),(26,3,'Barricade Uncontrol Climachill Shorts',18,65,'resources/AI7507_21_model.jpg','climachill™ keeps you cool with a meshlike fabric and aluminum-silver dots that conduct heat away from the body',NULL),(27,3,'Light Down Jacket',24,72,'resources/product~p~5011G_01~1500.1.jpg','High-quality down fill; Heat-seal overlapping baffles for improved insulation',NULL),(28,3,'All-Timers Tee',15,30,'resources/AJ5204_21_model.jpg','Back neck tape with linear Trefoil logo print',NULL),(29,3,'Elite Knee Pads',12,30,'resources/bauerelitepaddedkneepad_1.jpg','50% polyester / 28% elastane / 22% viscose French terry',NULL),(30,3,'Busenitz Pro Classified Shoes',19,90,'resources/adidasbusenitzproshoeblkblkblk.jpg','Textile upper with suede toe overlay for durability and protection',NULL),(31,6,'Zip Monster Eye Hoodie',6,70,'resources/fendi-black-monstenormal.jpeg','Monster eye motif styled with a mother of pearl button Attached drawcord hood Front zip closure Long sleeves with banded cuffs',NULL),(32,6,'Faces Calf Leather Slip-On Sneakers',18,80,'resources/s-l1000.jpg','Monster eye motif styled with a mother of pearl button Attached drawcord hood Front zip closure Long sleeves with banded cuffs',NULL),(33,6,'Maison Margiela',10,100,'resources/IMG_1377a.jpg','Monster eye motif styled with a mother of pearl button Attached drawcord hood Front zip closure Long sleeves with banded cuffs',NULL),(34,6,'Quilted Leather High-Top Sneakers',14,111,'resources/Ace-leather-low-top-sneaker.jpg','    Leather high-top sneaker with quilted side panels     Lace-up vamp with side zip     Leather upper     Round toe     Leather lining     Rubber sole     Padded insole     Made in Italy',NULL),(35,8,'Embossed logo print T-shirt',11,17,'resources/Collection-005.jpg','Stylish monochrome printed t-shirt for cool looks, with the confident embossed logo making a trend-driven choice.      Cotton t-shirt.     Round neck.     Short sleeves.     Slim fit.',NULL),(36,8,'Printed cotton T-shirt',11,40,'resources/look-book-11.jpg','The photographic print creates a striking, original graphic impact, making this V neck tee extra versatile.      Cotton t-shirt.     Photographic print on the front.',NULL),(37,8,'T-shirt with pocket',188,44,'resources/Menswear-Looks-13.jpg','The photographic print creates a striking, original graphic impact, making this V neck tee extra versatile.      Cotton t-shirt.     Photographic print on the front.',NULL),(38,8,'Bell-bottom jeans Jumpsuit',11,55,'resources/75Ml-1018381-1-8d6ba.jpg','Inseam length approx. 89 cm / 35.04 in. Denim weight 5 oz. 100% Lyocell. Machine wash 30°.  Model height 173 cm. ',NULL),(41,8,'Cotton logo T-shirt',44,88,'resources/Guess-Women-watches-2016.jpg','Inseam length approx. 89 cm / 35.04 in. Denim weight 5 oz. 100% Lyocell. Machine wash 30°.  Model height 173 cm. ',NULL),(46,21,'Himalaya Diaper Rash',17,65,'resources/51sGuJV5LcL.jpg','     Himalaya diaper rash cream tube     best baby personal care set     premium quality baby diaper rash cream     best diaper creams',NULL),(47,21,'Chicco Talcum Powder',15,85,'resources/61E4oTbz5gL._SL1500_.jpg','All processors, listed as Components under \"Computers & Accessories\", that are labeled as non-returnable on their product detail pages. ',NULL),(48,21,'Himalaya Gentle Baby',14,28,'resources/71LLNYUSTBL._SL1500_.jpg','The photographic print creates a striking, original graphic impact, making this V neck tee extra versatile.      Cotton t-shirt.     Photographic print on the front.',NULL),(49,21,'Pampers Active Baby',14,100,'resources/71nLUNZ7qGL._SL1500_.jpg','This ships separately from other items in your order. The item ships in its original manufacturer\'s packaging and therefore the contents cannot be concealed',NULL),(50,21,'Baby Medium Size',44,45,'resources/71npjRMgLlL._SL1500_.jpg',' All night absorbency Extra dry layer for all night dryness/absorbency Baby lotion with Aloe Vera to protect skin and helps to provide smoother skin',NULL),(51,21,'Diapers Large Size',35,44,'resources/81TFN-rjeZL._SL1500_.jpg',' Cushiony soft liner feels soft and keeps baby\'s skin healthy Blue speed dry layer pulls in wetness instantly and keeps baby\'s skin dry',NULL),(52,22,'Mannat Fashion Combo Chanderi',54,100,'resources/41Gq1CdiCLL.jpg',' Material: Cotton (For Top), Raw Silk (For Inner), Net (For Dupatta) Size: Fit up to Bust Size 44\" (Semi-Stitched) Occasion: Party and Festive Wear',NULL),(53,22,'Fresh@Fashion Women\'s Georgette 2',122,111,'resources/51NnrPKdb5L.jpg',' So, before giving your order please check that your order is sold and fulfil by \"fresh@fashion\". Actual Color Slightly Differes From Image.',NULL),(54,22,'Wimberly Fashion Women\'s',16,55,'resources/71kFsj4UL1500.jpg','Offer Direct from Manufacturer at Wholesale Rate (Please note that you are eligible to purchase one item per order per account.',NULL),(55,22,'J and J fashion Women\'s Net Gown',77,112,'resources/81IRGXHIS2LUL1500.jpg',' dress material:net,inner material:satin\r\nLife Style: Party Wear, Occasion Wear, Festival Wear\r\nWashcare: Dry clean or else Normal Hand Wash\r\nBest Quality and Best Services',NULL),(56,22,'Fashion Mark 4U Women\'s Georgette',118,102,'resources/615iMBUL1500.jpg','Offer: Direct from Manufacturer at Wholesale Rate (Please note that you are eligible to purchase one item per order per account. So if there is any multiple qty order.',NULL),(57,22,'Zaveri Pearls Non-Precious Metal ',11,200,'resources/71JO0eqxQvLUL1500.jpg',' Zaveri Pearls Collection Can Be Seen In Major Tv Serials Of Balaji Telefilms,Designer And Boutique Collection Of Zaveri Pearls Is Preferred By Many Designers, Stars, Celebrities,Shows.',NULL),(58,22,'Zephyrr Hand Made Golden White',5,185,'resources/71JO0eqxQvLUL1500.jpg',' Gather compliments in this pretty multi strand necklace with pearl beads\r\nLooks great with traditional dresses and ethnic wear\r\nPearl strands looks great with all dress color combinations',NULL),(59,22,'YouBella Combo of Trendy American',12,130,'resources/71Pe-ft8QsLUL1500.jpg',' Gather compliments in this pretty multi strand necklace with pearl beads\r\nLooks great with traditional dresses and ethnic wear\r\nPearl strands looks great with all dress color combinations',NULL),(60,22,'Atasi International Pink Metal',18,140,'resources/71XG-BO2FZLUL1500.jpg',' Gather compliments in this pretty multi strand necklace with pearl beads\r\nLooks great with traditional dresses and ethnic wear\r\nPearl strands looks great with all dress color combinations',NULL),(61,22,'Sukkhi Gold Plated Multi Strand',11,185,'resources/81fgO8dD6uLUL1500.jpg',' Gather compliments in this pretty multi strand necklace with pearl beads\r\nLooks great with traditional dresses and ethnic wear\r\nPearl strands looks great with all dress color combinations',NULL),(62,22,'Sukkhi Golden Gold Plated Ad Stone',21,195,'resources/A1UXz-4mReLUL1500.jpg',' Gather compliments in this pretty multi strand necklace with pearl beads\r\nLooks great with traditional dresses and ethnic wear\r\nPearl strands looks great with all dress color combinations',NULL),(63,23,'Modern Home Office Wall Décor',121,3,'resources/515bSSgCuNL.jpg',' Sticks on Wall, Tiles, Wood or Glass Surfaces.\r\nMade of Foam with a Glittering Body.\r\nPackage Includes 1 Sheet of Butterfly Wall Décor Stickers in Varying Sizes.',NULL),(64,23,'Attractive and Beautiful Decorative',13,2,'resources/81sDmlEjdaL._SL1500_.jpg',' Sticks on Wall, Tiles, Wood or Glass Surfaces.\r\nMade of Foam with a Glittering Body.\r\nPackage Includes 1 Sheet of Butterfly Wall Décor Stickers in Varying Sizes.',NULL),(65,23,'HOKIPO Apple Shaped Bamboo',10,8,'resources/71XftW0+PoL._SL1001_.jpg',' Sticks on Wall, Tiles, Wood or Glass Surfaces.\r\nMade of Foam with a Glittering Body.\r\nPackage Includes 1 Sheet of Butterfly Wall Décor Stickers in Varying Sizes.',NULL),(66,23,'Cartoon Design Plastic Self Adhesive',48,1,'resources/615AAehWn+L._SL1500_.jpg',' Sticks on Wall, Tiles, Wood or Glass Surfaces.\r\nMade of Foam with a Glittering Body.\r\nPackage Includes 1 Sheet of Butterfly Wall Décor Stickers in Varying Sizes.',NULL),(67,23,'Vintage Royal Look Wooden Serving',33,5,'resources/71mFA54gQ5L._SL1500_.jpg',' Sticks on Wall, Tiles, Wood or Glass Surfaces.\r\nMade of Foam with a Glittering Body.\r\nPackage Includes 1 Sheet of Butterfly Wall Décor Stickers in Varying Sizes.',NULL),(68,24,'Philips B22 17-Watt Bulb',75,12,'resources/71St8qCLsjL._SL1500_.jpg',' 12 years of life\r\nBase: SV8.5\r\n5x more light\r\nHigh power LED',NULL),(69,24,'Philips Fest 10 5x38 LED',12,17,'resources/31I3ocyZlrL.jpg',' 12 years of life\r\nBase: SV8.5\r\n5x more light\r\nHigh power LED',NULL),(70,24,'CAMERA Connectivity Media Player',19,20,'resources/61gyL-SgB1L._SL1024_.jpg',' 12 years of life\r\nBase: SV8.5\r\n5x more light\r\nHigh power LED',NULL),(71,24,'GCT WHITE 16 SMD LED Interior',12,55,'resources/61HpIjnRn4L._SL1020_.jpg',' 12 years of life\r\nBase: SV8.5\r\n5x more light\r\nHigh power LED',NULL),(72,24,'GCT White 28 LED Car Interior',55,11,'resources/61T2XDLebiL._SL1001_.jpg',' 12 years of life\r\nBase: SV8.5\r\n5x more light\r\nHigh power LED',NULL),(73,25,'Men brown leather Belt',55,12,'resources/51TmAPuV8iL.jpg','\r\nSold and fulfilled by Garg Store (3.8 out of 5 | 185 ratings).\r\n\r\n    Size- 30inch to 42inch\r\n    color-brown\r\n    Material- PU leather\r\n',NULL),(74,25,'INKOVY Men\'s Hooded Full Sleeve',12,155,'resources/61AyXESfREL._UL1500_.jpg','\r\n    Style: Double Zip Flap\r\n    Material: Cotton\r\n    Sleeve: Full Sleeve\r\n    Occasion: Casual\r\n\r\n',NULL),(75,25,'Men\'s Cotton Track Pants',10,122,'resources/61b6bOdFRwL._UL1500_.jpg','    Style: Double Zip Flap\r\n    Material: Cotton\r\n    Sleeve: Full Sleeve\r\n    Occasion: Casual\r\n\r\n',NULL),(76,25,'Clifton Army Shorts - Walnut',13,88,'resources/71vUMDiEMIL._UL1500_.jpg','    Style: Double Zip Flap\r\n    Material: Cotton\r\n    Sleeve: Full Sleeve\r\n    Occasion: Casual\r\n\r\n',NULL),(77,25,'Men\'s 3pk Cotton Woven Boxer',44,72,'resources/81auCpp0THL._UL1500_.jpg','    Style: Double Zip Flap\r\n    Material: Cotton\r\n    Sleeve: Full Sleeve\r\n    Occasion: Casual\r\n\r\n',NULL),(78,25,'ELS Men\'s Brown Artificial',10,65,'resources/613n1qBmLLL._UL1500_.jpg','    Style: Double Zip Flap\r\n    Material: Cotton\r\n    Sleeve: Full Sleeve\r\n    Occasion: Casual\r\n\r\n',NULL),(79,26,'HP Odyssey Backpack',22,150,'resources/818k5rZgnfL._SL1500_.jpg',' Outer Material: Polyester, Inner Material: Polyester, Color: Black-Green\r\nWear Resistant: No , Stain Resistant: No , Water Resistance: Yes\r\nCapacity: 30 liters; Weight: 370 Kg; Dimension: 46 ',NULL),(80,26,'Polestar BPL 30 Ltrs Black ',11,131,'resources/71+CiD8PqnL._SL1243_.jpg',' Outer Material: Polyester, Inner Material: Polyester, Color: Black-Green\r\nWear Resistant: No , Stain Resistant: No , Water Resistance: Yes\r\nCapacity: 30 liters; Weight: 370 Kg; Dimension: 46 Cm * ',NULL),(81,26,'Polestar BPL 30 Ltrs Black ',33,124,'resources/91C1-mb1yJL._SL1500_.jpg','\r\n    Outer Material: Polyester, Color: Mazarine Blue and Red Blast\r\n    Capacity: 29 liters; Dimensions: 45 cms x 26.5 cms x 25 cms (LxWxH)\r\n    Warranty type: Seller; 90 days warranty\r\n',NULL),(82,26,'Asus Black Laptop Bag',5,44,'resources/91W-e0CgctL._SL1500_.jpg','    Outer Material: Polyester, Color: Mazarine Blue and Red Blast\r\n    Capacity: 29 liters; Dimensions: 45 cms x 26.5 cms x 25 cms (LxWxH)\r\n    Warranty type: Seller; 90 days warranty\r\n',NULL),(83,26,'HP Entry Level Backpack (Black) ',44,158,'resources/513jT2FHj7L.jpg','    Outer Material: Polyester, Color: Mazarine Blue and Red Blast\r\n    Capacity: 29 liters; Dimensions: 45 cms x 26.5 cms x 25 cms (LxWxH)\r\n    Warranty type: Seller; 90 days warranty\r\n',NULL),(84,26,'American Tourister Crete Polyester',3,222,'resources/51-tdBzWONL._SL1000_.jpg','    Outer Material: Polyester, Color: Mazarine Blue and Red Blast\r\n    Capacity: 29 liters; Dimensions: 45 cms x 26.5 cms x 25 cms (LxWxH)\r\n    Warranty type: Seller; 90 days warranty\r\n',NULL),(89,27,'SCATCHITE Boxer Black Canvas',55,120,'resources/411taaIRH2L.jpg','    Outer Material: Synthetic Leather\r\n    Sole Material: TPR\r\n    Closure: Laced\r\n    Toe Style: Pointed\r\n    Product colour may slightly vary due to photographic lighting sources or your monitor s',NULL),(90,27,'Earton COMBO Pack of 2 Pair',18,154,'resources/71JVj+T0piL._UL1500_.jpg','    Outer Material: Synthetic Leather\r\n    Sole Material: TPR\r\n    Closure: Laced\r\n    Toe Style: Pointed\r\n    Product colour may slightly vary due to photographic lighting sources or your monitor s',NULL),(91,27,'Rosso Italiano Men\'s loafers shoes',14,156,'resources/41tVYGYe11L.jpg','    Outer Material: Synthetic Leather\r\n    Sole Material: TPR\r\n    Closure: Laced\r\n    Toe Style: Pointed\r\n    Product colour may slightly vary due to photographic lighting sources or your monitor s',NULL),(92,27,'Nivia Marathon Running Shoe',32,142,'resources/71Tli9DVQXL._UL1500_.jpg','    Outer Material: Synthetic Leather\r\n    Sole Material: TPR\r\n    Closure: Laced\r\n    Toe Style: Pointed\r\n    Product colour may slightly vary due to photographic lighting sources or your monitor s',NULL),(93,27,'Freedom Daisy 1047 Mens Black/BR',22,148,'resources/51SSyXkkDLL.jpg','    Outer Material: Synthetic Leather\r\n    Sole Material: TPR\r\n    Closure: Laced\r\n    Toe Style: Pointed\r\n    Product colour may slightly vary due to photographic lighting sources or your monitor s',NULL),(94,27,'Earton Men\'s Blue & Grey Casual',55,185,'resources/41BEHnExw8L.jpg','    Outer Material: Synthetic Leather\r\n    Sole Material: TPR\r\n    Closure: Laced\r\n    Toe Style: Pointed\r\n    Product colour may slightly vary due to photographic lighting sources or your monitor s',NULL),(95,27,'Columbus Men\'s Blue and Green',85,136,'resources/61OlI4CYITL._UL1500_.jpg','    Outer Material: Synthetic Leather\r\n    Sole Material: TPR\r\n    Closure: Laced\r\n    Toe Style: Pointed\r\n    Product colour may slightly vary due to photographic lighting sources or your monitor s',NULL),(102,6,'fendi mens boots',211,18,'resources/ucca-boots-5330812-2-0.jpg','Fendi, Men at Saks.com, offering the modern energy, style and personalized service of Saks Fifth Avenue stores,',NULL),(103,6,'fendi mens new dress',115,171,'resources/020mans-ss16-fendi-tc-62315.jpg','Fendi, Men at Saks.com, offering the modern energy, style and personalized service of Saks Fifth Avenue stores,',NULL),(104,6,'fendi mens new Glass',15,100,'resources/71oHKGbkAAL._UL1500_.jpg','Fendi, Men at Saks.com, offering the modern energy, style and personalized service of Saks Fifth Avenue stores,',NULL),(105,6,'fendi mens new pant ball',100,10,'resources/fendi-black-zucca-belt-product-1-25605892-2-686981228-normal.jpeg','Fendi, Men at Saks.com, offering the modern energy, style and personalized service of Saks Fifth Avenue stores,',NULL),(106,6,'fendi mens new shows',18,181,'resources/nmn2tt7_mz_1.jpg','Fendi, Men at Saks.com, offering the modern energy, style and personalized service of Saks Fifth Avenue stores,',NULL),(107,8,'Guess men\'s Quartz',12,400,'resources/mam1423899476.jpg','\r\nDispatched from and sold by Thril.\r\n\r\n    Mens\r\n    Analogue\r\n    Stainless Steel\r\n    Quartz\r\n    Chronograph, Date',NULL),(108,8,'Guess , Men\'s Cross-body',11,318,'resources/A1dwa24ROeL._UL1500_.jpg','\r\nDispatched from and sold by Amazon. Gift-wrap available.\r\nNote: This item is eligible for click and collect. Details\r\n\r\n    Outer Material: Synthetic\r\n',NULL),(109,8,'Guess GUF 127 GUN-35A Men\'s Aviator',14,150,'resources/gu0115f_65j46-1.jpg','Dispatched from and sold by Amazon. Gift-wrap available.\r\nNote: This item is eligible for click and collect. Details\r\n\r\n    Outer Material: Synthetic\r\n',NULL),(110,8,'Guess W75052G2 Framed Stainless',18,155,'resources/71S-WzGDizL._UL1500_.jpg','Dispatched from and sold by Amazon. Gift-wrap available.\r\nNote: This item is eligible for click and collect. Details\r\n\r\n    Outer Material: Synthetic\r\n',NULL),(111,8,'GUESS GF0141 66 10B MEN\'S SILVER',55,110,'resources/8737d92bfc5a99d357135.jpg','Dispatched from and sold by Amazon. Gift-wrap available.\r\nNote: This item is eligible for click and collect. Details\r\n\r\n    Outer Material: Synthetic\r\n',NULL),(112,8,'Guess W0040G3 Rigor - Wristwatch men\'s',16,121,'resources/99950021424001961.jpg','Dispatched from and sold by Amazon. Gift-wrap available.\r\nNote: This item is eligible for click and collect. Details\r\n\r\n    Outer Material: Synthetic\r\n',NULL),(113,8,'Guess Men\'s SS RN T Junction Tee T-Shirt ',11,400,'resources/TM163QU1_001_01_e.jpg','Dispatched from and sold by Amazon. Gift-wrap available.\r\nNote: This item is eligible for click and collect. Details\r\n\r\n    Outer Material: Synthetic\r\n',NULL),(114,9,'Whatlees Mens slim fit Skinny Shirt',11,118,'resources/prod_2107369612.jpg','    Contains stretch for comfort\r\n    Premium Quality, 100% Real & Genuine Product\r\n    80% Polyester, 20% Cotton\r\n\r\n    Skinny fit - cut closely to the body\r\n    Machine',NULL),(115,9,'ALONK Men\'s Motorcycle Riders',15,200,'resources/91LbpRbsEGL._UL1500_.jpg','    Contains stretch for comfort\r\n    Premium Quality, 100% Real & Genuine Product\r\n    80% Polyester, 20% Cotton\r\n\r\n    Skinny fit - cut closely to the body\r\n    Machine',NULL),(116,9,'VALENTINO MEN\'S KV0DEJC02MU518',10,212,'resources/71Gm5-RyQeL._UL1500_.jpg','    Contains stretch for comfort\r\n    Premium Quality, 100% Real & Genuine Product\r\n    80% Polyester, 20% Cotton\r\n\r\n    Skinny fit - cut closely to the body\r\n    Machine',NULL),(117,9,'VALENTINO MEN\'S KV0DEJC02MS518',19,119,'resources/$_35.JPG','    Contains stretch for comfort\r\n    Premium Quality, 100% Real & Genuine Product\r\n    80% Polyester, 20% Cotton\r\n\r\n    Skinny fit - cut closely to the body\r\n    Machine',NULL),(118,9,'VALENTINO MEN\'S KV0DEJ1031N598',21,220,'resources/art36382b_1_20150327114941_86.jpg','    Contains stretch for comfort\r\n    Premium Quality, 100% Real & Genuine Product\r\n    80% Polyester, 20% Cotton\r\n\r\n    Skinny fit - cut closely to the body\r\n    Machine',NULL),(119,9,'BLU YBBLOS MAN SHOES SNEAKER',23,211,'resources/I520x490.jpg','    Contains stretch for comfort\r\n    Premium Quality, 100% Real & Genuine Product\r\n    80% Polyester, 20% Cotton\r\n\r\n    Skinny fit - cut closely to the body\r\n    Machine',NULL),(120,9,'Whatlees Mens Urban Basic Short',18,225,'resources/513bTuoSYiL._UL1500_.jpg','    Contains stretch for comfort\r\n    Premium Quality, 100% Real & Genuine Product\r\n    80% Polyester, 20% Cotton\r\n\r\n    Skinny fit - cut closely to the body\r\n    Machine',NULL),(121,9,'Christian Dior Homme Intense',11,102,'resources/cdesp.jpg','A luxurious fragrance. Just like the original this scent stands for modern luxury. It’s more intense composition emphasizes these attitudes.\r\n',NULL),(122,9,'Dior Eau Eau de Toilette Spray',14,121,'resources/Intense Edp 100ml.jpg','A luxurious fragrance. Just like the original this scent stands for modern luxury. It’s more intense composition emphasizes these attitudes.\r\n',NULL),(123,10,'Dior Eau Eau de Toilette Spray for Men',14,121,'resources/Intense Edp 100ml.jpg','A luxurious fragrance. Just like the original this scent stands for modern luxury. It’s more intense composition emphasizes these attitudes.\r\n',NULL),(124,10,'Dior Eau Eau de Toilette Spray',148,50,'resources/cdesp.jpg','A luxurious fragrance. Just like the original this scent stands for modern luxury. It’s more intense composition emphasizes these attitudes.\r\n',NULL),(125,10,'I Love You Always Full Ceramic',111,145,'resources/mammEdition.jpg','A luxurious fragrance. Just like the original this scent stands for modern luxury. It’s more intense composition emphasizes these attitudes.\r\n',NULL),(126,10,'Sub Sports RX Women\'s Graduated',52,111,'resources/81XGnC8JjlL._SL1500_.jpg','A luxurious fragrance. Just like the original this scent stands for modern luxury. It’s more intense composition emphasizes these attitudes.\r\n',NULL),(127,10,'Sub Sports COLD Boy\'s Thermal',13,118,'resources/81sMfj4fszL._SL1500_.jpg','A luxurious fragrance. Just like the original this scent stands for modern luxury. It’s more intense composition emphasizes these attitudes.\r\n',NULL),(128,10,'Christian Dior SO REAL ',50,180,'resources/dior so real b0yy0-7-edit.jpg','A luxurious fragrance. Just like the original this scent stands for modern luxury. It’s more intense composition emphasizes these attitudes.\r\n',NULL),(129,10,'GAMT Square Mirrored Sunglsses',18,179,'resources/SKU219610_20_15_1024x1024.jpeg','A luxurious fragrance. Just like the original this scent stands for modern luxury. It’s more intense composition emphasizes these attitudes.\r\n',NULL),(130,11,'Thor Men\'s Cotton T-Shirt ',55,115,'resources/91vWUcA8qNL._UL1500_.jpg','\r\n    Product Type: Sunglasses\r\n    Free Express Shipping to your doorstep. You don\'t have to pay anything extra!!\r\n    This product is imported from USA - It is a 100% genuine product\r\n    The ',NULL),(131,11,'Thor Men\'s Cotton T-Shirt ',41,113,'resources/91ofcXv4mwL._UL1500_.jpg','    Product Type: Sunglasses\r\n    Free Express Shipping to your doorstep. You don\'t have to pay anything extra!!\r\n    This product is imported from USA - It is a 100% genuine product\r\n    The ',NULL),(132,11,'Cat Eye Police Pilot Style Fashion',48,220,'resources/51u2XSausdL._SL1010_.jpg','    Product Type: Sunglasses\r\n    Free Express Shipping to your doorstep. You don\'t have to pay anything extra!!\r\n    This product is imported from USA - It is a 100% genuine product\r\n    The ',NULL),(133,11,'Jakkasdeal Semi-Rimless Sunglasses',12,18,'resources/61xacFvmVJL._UL1500_.jpg','    Product Type: Sunglasses\r\n    Free Express Shipping to your doorstep. You don\'t have to pay anything extra!!\r\n    This product is imported from USA - It is a 100% genuine product\r\n    The ',NULL),(134,11,'Flaps Men\'s Causal Sandals',14,178,'resources/61RVAhkv3IL._UL1500_.jpg','    Product Type: Sunglasses\r\n    Free Express Shipping to your doorstep. You don\'t have to pay anything extra!!\r\n    This product is imported from USA - It is a 100% genuine product\r\n    The ',NULL),(135,11,'Hey You Original For Men 75',45,12,'resources/71dIbxKjYJL._SL1024_.jpg','    Product Type: Sunglasses\r\n    Free Express Shipping to your doorstep. You don\'t have to pay anything extra!!\r\n    This product is imported from USA - It is a 100% genuine product\r\n    The ',NULL),(136,11,'Fanvi Men\'s Synthetic Casual',14,178,'resources/81I5OI7pQOL._UL1500_.jpg','    Product Type: Sunglasses\r\n    Free Express Shipping to your doorstep. You don\'t have to pay anything extra!!\r\n    This product is imported from USA - It is a 100% genuine product\r\n    The ',NULL),(137,11,'Versace VE4044B Sunglasses',44,15,'resources/61SjQPvauqL._SL1500_.jpg','    Product Type: Sunglasses\r\n    Free Express Shipping to your doorstep. You don\'t have to pay anything extra!!\r\n    This product is imported from USA - It is a 100% genuine product\r\n    The ',NULL),(138,11,'Flaps Men\'s Casual Sandals',20,80,'resources/61EUuJ4R3uL._UL1500_.jpg','    Product Type: Sunglasses\r\n    Free Express Shipping to your doorstep. You don\'t have to pay anything extra!!\r\n    This product is imported from USA - It is a 100% genuine product\r\n    The ',NULL),(139,11,'Flaps Men\'s Casual Sandals Blue',22,78,'resources/61gi0SxHIbL._UL1500_.jpg','    Product Type: Sunglasses\r\n    Free Express Shipping to your doorstep. You don\'t have to pay anything extra!!\r\n    This product is imported from USA - It is a 100% genuine product\r\n    The ',NULL),(140,7,'Fendi Gradient Rectangula',11,201,'resources/71ki5OR5b5L._UL1500_.jpg',' Frame size: Lens width - 56 mm, nose-bridge - 16 mm, temple length - 135 mm\r\n6 months manufacturer warranty on manufacturing defects\r\n',NULL),(141,7,'Fendi Aviator Sunglasses',14,105,'resources/71vpxgyaRiL._SL1500_.jpg',' Frame size: Lens width - 56 mm, nose-bridge - 16 mm, temple length - 135 mm\r\n6 months manufacturer warranty on manufacturing defects\r\n',NULL),(142,7,'Fendi Oversized Sunglasses',19,218,'resources/51Sv05Pt6CL._UL1500_.jpg',' Frame size: Lens width - 56 mm, nose-bridge - 16 mm, temple length - 135 mm\r\n6 months manufacturer warranty on manufacturing defects\r\n',NULL),(143,7,'Fendi Gradient Oval Women',11,190,'resources/71uItVi+xML._UL1500_.jpg',' Frame size: Lens width - 56 mm, nose-bridge - 16 mm, temple length - 135 mm\r\n6 months manufacturer warranty on manufacturing defects\r\n',NULL),(144,7,'Fendi W-SG-2777',18,191,'resources/61pLNyJ9CUL._UL1500_.jpg',' Frame size: Lens width - 56 mm, nose-bridge - 16 mm, temple length - 135 mm\r\n6 months manufacturer warranty on manufacturing defects\r\n',NULL),(145,7,'Fendi Oversized Sunglaess',27,111,'resources/71+P-7dBZJL._UL1500_.jpg',' Frame size: Lens width - 56 mm, nose-bridge - 16 mm, temple length - 135 mm\r\n6 months manufacturer warranty on manufacturing defects\r\n',NULL),(146,7,'Fendi Oversized Sunglasses 01',33,128,'resources/51hEMYcKkeL._UL1500_.jpg',' Frame size: Lens width - 56 mm, nose-bridge - 16 mm, temple length - 135 mm\r\n6 months manufacturer warranty on manufacturing defects\r\n',NULL),(147,7,'Fendi Oversized Sunglasses 02',34,111,'resources/61yrHs5KZ+L._UL1500_.jpg',' Frame size: Lens width - 56 mm, nose-bridge - 16 mm, temple length - 135 mm\r\n6 months manufacturer warranty on manufacturing defects\r\n',NULL),(148,7,'Fendi Oversized Sunglasses 03',55,118,'resources/71aA6wHNfAL._UL1500_.jpg',' Frame size: Lens width - 56 mm, nose-bridge - 16 mm, temple length - 135 mm\r\n6 months manufacturer warranty on manufacturing defects\r\n',NULL),(149,7,' Tripssy e124-e127 sling bag',11,118,'resources/61LafwcfHLL._UL1500_.jpg','    Ethnic & Casual\r\n    Quality Fabric\r\n    Durable\r\n    Elegant Look\r\n',NULL),(150,17,'Imported Fanny Waist Belt',19,211,'resources/61h85fe78iL._SL1024_.jpg','    Ethnic & Casual\r\n    Quality Fabric\r\n    Durable\r\n    Elegant Look\r\n',NULL),(151,17,'Sleek Travel Passport Organize',14,98,'resources/71NpnqnVJ6L._SL1500_.jpg','    Ethnic & Casual\r\n    Quality Fabric\r\n    Durable\r\n    Elegant Look\r\n',NULL),(152,17,'GUESS Rikki Slim ClutchÂ Black',12,99,'resources/61ofnoh8X4L._UL1500_.jpg','    Ethnic & Casual\r\n    Quality Fabric\r\n    Durable\r\n    Elegant Look\r\n',NULL),(153,17,'Gussaci Italy Women\'s Handbag',13,98,'resources/910T5Q1Fe8L._UL1500_.jpg','    Ethnic & Casual\r\n    Quality Fabric\r\n    Durable\r\n    Elegant Look\r\n',NULL),(154,17,' GUESS Women\'s Casey Petite Cr',11,55,'resources/91n1aaWowXL._UL1500_.jpg','    Ethnic & Casual\r\n    Quality Fabric\r\n    Durable\r\n    Elegant Look\r\n',NULL),(155,17,'Buxton 28535 Green Leather ',22,118,'resources/51rN7ltwahL._UL1500_.jpg','    Ethnic & Casual\r\n    Quality Fabric\r\n    Durable\r\n    Elegant Look\r\n',NULL),(156,17,'GUESS Delaney Slim Clutch Wall',11,115,'resources/61K5noS3XFL._UL1500_.jpg','    Ethnic & Casual\r\n    Quality Fabric\r\n    Durable\r\n    Elegant Look\r\n',NULL),(157,17,'GUESS Ines Slim Clutch WalletÂ',19,119,'resources/71euCgI8+6L._UL1500_.jpg','    Ethnic & Casual\r\n    Quality Fabric\r\n    Durable\r\n    Elegant Look\r\n',NULL),(158,18,'Valentino Genuine Leather',11,189,'resources/51c20Jyan3L._UL1500_.jpg','\r\n    Material: Genuine Leather\r\n    Dimensions:3x20x17\r\n    Strap Adjustible:No\r\n',NULL),(159,18,'Valentino Genuine Leather',15,155,'resources/51NE0rMG+yL._UL1500_.jpg','    Material: Genuine Leather\r\n    Dimensions:3x20x17\r\n    Strap Adjustible:No\r\n',NULL),(160,18,'Valentino Genuine Leather 01',18,130,'resources/61B-eJbU8cL._UL1500_.jpg','    Material: Genuine Leather\r\n    Dimensions:3x20x17\r\n    Strap Adjustible:No\r\n',NULL),(161,18,'Valentino Genuine Leather 02',15,140,'resources/61xJxeUC9sL._UL1500_.jpg','    Material: Genuine Leather\r\n    Dimensions:3x20x17\r\n    Strap Adjustible:No\r\n',NULL),(162,18,' BLACK Color Medium Size Women',15,151,'resources/61xy+ELEn+L._UL1500_.jpg','    Material: Genuine Leather\r\n    Dimensions:3x20x17\r\n    Strap Adjustible:No\r\n',NULL),(163,18,'SILVER Color Medium Size Women',12,144,'resources/71k0lE7TtcL._UL1500_.jpg','    Material: Genuine Leather\r\n    Dimensions:3x20x17\r\n    Strap Adjustible:No\r\n',NULL),(164,18,'Valentino Genuine Leather',22,152,'resources/71PcRx2Q7VL._UL1500_.jpg','    Material: Genuine Leather\r\n    Dimensions:3x20x17\r\n    Strap Adjustible:No\r\n',NULL),(165,18,' BLACK Color Medium',45,123,'resources/71UuYBqZk6L._UL1500_.jpg','    Material: Genuine Leather\r\n    Dimensions:3x20x17\r\n    Strap Adjustible:No\r\n',NULL),(166,18,'Pole Star Polyester',44,500,'resources/81Kj8JjPpGL._SL1500_.jpg','    Material: Genuine Leather\r\n    Dimensions:3x20x17\r\n    Strap Adjustible:No\r\n',NULL),(167,18,'Polestar Salute 28 Ltrs Black ',13,450,'resources/811VpocnDtL._SL1500_.jpg','    Material: Genuine Leather\r\n    Dimensions:3x20x17\r\n    Strap Adjustible:No\r\n',NULL),(168,19,'Sky Blue Trendy Women ',18,155,'resources/51dHoYVYjRL.jpg','    Available in 35 Colours\r\n    Ultra Stylish\r\n    26 Different Ways to wear\r\n    Very Soft Fiber Material',NULL),(169,19,'Christian Dior Hypnotic',12,158,'resources/81CEeP9ZSwL._SL1500_.jpg','    Available in 35 Colours\r\n    Ultra Stylish\r\n    26 Different Ways to wear\r\n    Very Soft Fiber Material',NULL),(170,19,'Pure Poison By Christian',15,155,'resources/61Aut6q-KmL._SL1200_.jpg','    Available in 35 Colours\r\n    Ultra Stylish\r\n    26 Different Ways to wear\r\n    Very Soft Fiber Material',NULL),(171,19,'Christian Dior Diorshow',18,185,'resources/41kJe-KSkCL.jpg','    Available in 35 Colours\r\n    Ultra Stylish\r\n    26 Different Ways to wear\r\n    Very Soft Fiber Material',NULL),(172,19,'Sunglasses Christian Dior SORE',19,155,'resources/71MUvgoXatL._UL1500_.jpg','    Available in 35 Colours\r\n    Ultra Stylish\r\n    26 Different Ways to wear\r\n    Very Soft Fiber Material',NULL),(173,19,'Imported Classic Retro Women\'s',14,198,'resources/51x8guOB-gL._UL1500_.jpg','    Available in 35 Colours\r\n    Ultra Stylish\r\n    26 Different Ways to wear\r\n    Very Soft Fiber Material',NULL),(174,19,'Imported MagiDeal Vintage',43,124,'resources/51L8o4y7KDL._UL1500_.jpg','    Available in 35 Colours\r\n    Ultra Stylish\r\n    26 Different Ways to wear\r\n    Very Soft Fiber Material',NULL),(175,19,'Vast UV Protection',46,125,'resources/61VTcT6PJQL._UL1500_.jpg','    Available in 35 Colours\r\n    Ultra Stylish\r\n    26 Different Ways to wear\r\n    Very Soft Fiber Material',NULL),(176,19,'Jakkasdeal Round Shape',24,45,'resources/71REOrhmN1L._UL1500_.jpg','    Available in 35 Colours\r\n    Ultra Stylish\r\n    26 Different Ways to wear\r\n    Very Soft Fiber Material',NULL),(177,20,'Versace Yellow Diamond EDT',16,188,'resources/51HpuN324dL.jpg','    Available in 35 Colours\r\n    Ultra Stylish\r\n    26 Different Ways to wear\r\n    Very Soft Fiber Material',NULL),(178,20,'Versace Bright Crystal EDT',18,177,'resources/410z7Nqv-3L.jpg','    Available in 35 Colours\r\n    Ultra Stylish\r\n    26 Different Ways to wear\r\n    Very Soft Fiber Material',NULL),(179,20,'Glitz Designer Fashion',2,560,'resources/51HHe3eohIL._UL1500_.jpg','    Available in 35 Colours\r\n    Ultra Stylish\r\n    26 Different Ways to wear\r\n    Very Soft Fiber Material',NULL),(180,20,'Glitz Fashion Classic',5,612,'resources/51caKEQAs2L._UL1500_.jpg','    Available in 35 Colours\r\n    Ultra Stylish\r\n    26 Different Ways to wear\r\n    Very Soft Fiber Material',NULL),(181,20,'Glitz Fashion Elegant Antique',8,585,'resources/61c5cR0zvrL._UL1500_.jpg','    Available in 35 Colours\r\n    Ultra Stylish\r\n    26 Different Ways to wear\r\n    Very Soft Fiber Material',NULL),(182,20,'Glitz Fashion Elegant Clavicle',5,665,'resources/51-e7h1E2FL._UL1500_.jpg','    Available in 35 Colours\r\n    Ultra Stylish\r\n    26 Different Ways to wear\r\n    Very Soft Fiber Material',NULL),(183,20,'LeCalla 22k (916) Yellow Gold',12,950,'resources/61xbeGgvk5L._UL1500_.jpg','    Available in 35 Colours\r\n    Ultra Stylish\r\n    26 Different Ways to wear\r\n    Very Soft Fiber Material',NULL),(184,20,'Versus by Versace Analog',12,800,'resources/91xaKFH1o1L._UL1500_.jpg','    Available in 35 Colours\r\n    Ultra Stylish\r\n    26 Different Ways to wear\r\n    Very Soft Fiber Material',NULL),(185,17,'GUESS Analog Silver Dial Women',15,200,'resources/71O.jpg',' The order quantity for this product is limited to 1 unit per customer\r\n\r\nPlease note that orders which exceed the quantity limit will be auto-canceled. This is applicable across sellers. ',NULL),(186,28,'Other one product',14,15,'resources/mtec2.jpg','This is wonderful product.',NULL),(187,20,'V1969 Italia Womens Designer',12,199,'resources/71OLZPuYCWL._UL1500_.jpg','\r\n    Man made materials\r\n    Interior lining, cushioned insole\r\n    HEEL HEIGHT: 4\", OUTSOLE: Synthetic\r\n    Imported\r\n    Ships immediately',NULL),(188,21,'Felcy Fashions Girls',177,15,'resources/715DJtRl4dL._UL1500_.jpg',' Please note that orders which exceed the quantity limit will be auto-canceled. This is applicable across sellers',NULL),(189,21,'Happy Feet Kids Sneakers ',185,11,'resources/61vr6qze18L._UL1500_.jpg',' Please note that orders which exceed the quantity limit will be auto-canceled. This is applicable across sellers',NULL),(190,21,'Happy Feet Bangbang',179,12,'resources/71ExyFsWTcL._UL1500_.jpg',' Please note that orders which exceed the quantity limit will be auto-canceled. This is applicable across sellers',NULL),(191,23,'UNIMET JK HARD ANODISED',120,11,'resources/716nPqFhLuL._SL1500_.jpg','EXTRA HARD, NON TOXIC, NON REACTIVE, HIGH COOKING PERFORMANCE, EASY TO CLEAN',NULL),(192,23,'OKS Multipurpose Absorbent',150,18,'resources/713hsE8ZZ3L._SL1500_.jpg','EXTRA HARD, NON TOXIC, NON REACTIVE, HIGH COOKING PERFORMANCE, EASY TO CLEAN',NULL),(193,23,'UNIMET JK HARD ANODISED',171,9,'resources/710CXrM-1ML._SL1500_.jpg','EXTRA HARD, NON TOXIC, NON REACTIVE, HIGH COOKING PERFORMANCE, EASY TO CLEAN',NULL),(194,23,'ANODISED FRYING PAN 2L',145,10,'resources/71XStYXU7VL._SL1500_.jpg','EXTRA HARD, NON TOXIC, NON REACTIVE, HIGH COOKING PERFORMANCE, EASY TO CLEAN',NULL),(195,24,'ExclusiveLane 9 Terracotta',11,250,'resources/41JGGJLReoL.jpg','EXTRA HARD, NON TOXIC, NON REACTIVE, HIGH COOKING PERFORMANCE, EASY TO CLEAN',NULL),(196,24,'ExclusiveLane Terracotta 01',18,188,'resources/31T10s-1SoL.jpg','EXTRA HARD, NON TOXIC, NON REACTIVE, HIGH COOKING PERFORMANCE, EASY TO CLEAN',NULL),(197,24,'Little India Gold Painted',55,210,'resources/61nbKdha8QL._SL1000_.jpg','EXTRA HARD, NON TOXIC, NON REACTIVE, HIGH COOKING PERFORMANCE, EASY TO CLEAN',NULL),(198,24,'Little India Gemstone Studded',14,213,'resources/61YnJi1X5nL._SL1000_.jpg','EXTRA HARD, NON TOXIC, NON REACTIVE, HIGH COOKING PERFORMANCE, EASY TO CLEAN',NULL),(199,24,'ExclusiveLane 4 Terracotta',19,230,'resources/610370pfGBL._SL1000_.jpg','EXTRA HARD, NON TOXIC, NON REACTIVE, HIGH COOKING PERFORMANCE, EASY TO CLEAN',NULL),(200,27,'Welcome Men\'s Fitness',15,530,'resources/mamm.jpg','Rotate your pair of shoes once every other day, allowing them to de-odorize and retain their shapes. Use Shoe bags to prevent any stains or mildew. ',NULL),(201,27,'Columbus Men\'s Blue and Green ',18,488,'resources/mammaajajfwna.jpg','Rotate your pair of shoes once every other day, allowing them to de-odorize and retain their shapes. Use Shoe bags to prevent any stains or mildew. ',NULL),(202,27,'Freedom daisy Men\'s Sea',18,530,'resources/712iIwXhdcL._UL1500_.jpg','Rotate your pair of shoes once every other day, allowing them to de-odorize and retain their shapes. Use Shoe bags to prevent any stains or mildew. ',NULL),(203,28,'Sports Itmes',0,0,'resources/sportsGroupPicture1.jpg','Sports Items',NULL),(204,28,'Mens\'s Items',0,0,'resources/mensItemGroup1.jpg','Mens Items',NULL),(205,28,'Women\'s Items',0,0,'resources/womensGroupPicture1.jpg','Womens Items',NULL),(206,28,'Fashion Items',0,0,'resources/fashionGroup1.jpg','Fation Items',NULL),(207,28,'Households Items',0,0,'resources/householdItemsGroup1.jpg','Households Items',NULL),(208,28,'Interiors Items',0,0,'resources/inetriorsProudt1.jpg','Interiors Items',NULL),(209,28,'Clothing Items',0,0,'resources/clothingGroup.jpg','Clothing Items',NULL),(210,28,'Bags Items',0,0,'resources/bagsItemGroup1.jpg','Bags Items',NULL),(211,28,'Shows Items',0,0,'resources/showsItemGroup1.jpg','Shows Items',NULL),(212,28,'Kids Items',0,0,'resources/kidsProductGroup1.jpg','Kids Items',NULL),(213,28,'Nike Items',0,0,'resources/nikeProudtGroup1.jpg','Nike Items',NULL),(214,28,'Adidas Items',0,0,'resources/adidasProductgroup1.jpg','Adidas Items',NULL),(215,28,'Under-armor Items',0,0,'resources/underUrmorProduct1.jpg','Under-armor Items',NULL),(216,28,'Men\'s Fendi Items',0,0,'resources/mensFandiGroup1.jpg','Men\'s Fendi Items',NULL),(217,28,'Men\'s Guess Items',0,0,'resources/guessProductgroup1.jpg','Men\'s Guess Items',NULL),(218,28,'Men\'s Valantino Items',0,0,'resources/valentinoProductGroup1.jpg','Men\'s Valantino Items',NULL),(219,28,'Men\'s Dior Items',0,0,'resources/mensDiorGroup.jpg','Men\'s Dior Items',NULL),(220,28,'Men\'s Versace Items',0,0,'resources/versaceGroupProduct1.jpg','Men\'s Versace Items',NULL),(221,28,'Womens Fendi Items',0,0,'resources/womensFendiGroup1.jpg','Womens Fendi Items',NULL),(222,28,'Womens Guess Items',0,0,'resources/womensGuessGroup1.jpg','Womens Gouss Items',NULL),(223,28,'Womens Dior Items',0,0,'resources/womensValentinoGroup1.jpg','Womens Gouss Items',NULL),(224,28,'Womens Valentino Items',0,0,'resources/womensDior.jpg','Womens Valentino Items',NULL),(225,28,'Womens Varsace Items',0,0,'resources/womensVersaceGroup1.jpg','Womens Varsace Items',NULL),(226,29,'Pokemon Go is my Cardio',14,445,'resources/71B77qGbbYL._UL150mam0_.jpg','We bring you the designs that tickle your like and enhance your personality leaving a trend anywhere you go!',NULL),(227,29,'T-Shirt Bongio_RMS5A20',15,398,'resources/71Ah2tgkRzL._UL1500_.jpg','We bring you the designs that tickle your like and enhance your personality leaving a trend anywhere you go!',NULL),(228,29,'Sleeves Sheldon T-Shirts ',16,145,'resources/71zoeD7eZcL._UL1500_.jpg','We bring you the designs that tickle your like and enhance your personality leaving a trend anywhere you go!',NULL),(229,29,'Sleeve Solid T-Shirt',14,200,'resources/713bsUiROzL._UL1500_.jpg','We bring you the designs that tickle your like and enhance your personality leaving a trend anywhere you go!',NULL),(230,29,'Sleeve Solid T-Shirt',20,180,'resources/61XkqB+QU2L._UL1500_.jpg','We bring you the designs that tickle your like and enhance your personality leaving a trend anywhere you go!',NULL),(231,30,'Smooth Leather Jacket',11,480,'resources/41eQrPw5G0L.jpg','We bring you the designs that tickle your like and enhance your personality leaving a trend anywhere you go!',NULL),(232,30,'Casual Slim Fit Blazer ',18,500,'resources/41UhIe7IHSL.jpg','We bring you the designs that tickle your like and enhance your personality leaving a trend anywhere you go!',NULL),(233,30,'Jack & Jones Men\'s  ',15,480,'resources/61m-Kh-TUPL._UL1500_.jpg','We bring you the designs that tickle your like and enhance your personality leaving a trend anywhere you go!',NULL),(234,30,'Tailored Fit Jacket   ',40,200,'resources/71N8borAS4L._UL1500_.jpg','We bring you the designs that tickle your like and enhance your personality leaving a trend anywhere you go!',NULL),(235,30,'Wintage Men\'s Rayon ',12,600,'resources/81MG4DqM79L._UL1500_.jpg','We bring you the designs that tickle your like and enhance your personality leaving a trend anywhere you go!',NULL),(236,30,'Polo Tshirts- Orange ',12,112,'resources/41Ja+GMm+hL.jpg','We bring you the designs that tickle your like and enhance your personality leaving a trend anywhere you go!',NULL),(237,30,'Button Down Shirt ',20,200,'resources/81T16QRO-4L._UL1500_.jpg','We bring you the designs that tickle your like and enhance your personality leaving a trend anywhere you go!',NULL),(238,30,'Polo Collar Solid T-Shirt  ',21,180,'resources/71LT2P+6QvL._UL1500_.jpg','We bring you the designs that tickle your like and enhance your personality leaving a trend anywhere you go!',NULL),(239,30,'Men\'s Cotton T-Shirt   ',24,200,'resources/A1nUv-ndr+L._UL1500_.jpg','We bring you the designs that tickle your like and enhance your personality leaving a trend anywhere you go!',NULL),(240,30,' Boys\' Polo Shirt  ',40,300,'resources/91x4AMF7wbL._UL1500_.jpg','We bring you the designs that tickle your like and enhance your personality leaving a trend anywhere you go!',NULL),(241,31,'Sunglasses for Mens',18,100,'resources/31HZRHO+iPL.jpg','     Himalaya diaper rash cream tube     best baby personal care set     premium quality baby diaper rash cream     best diaper creams',NULL),(242,31,'Derry Men Sunglasses',110,200,'resources/51mHl6NyN2L._UL1500_.jpg','     Himalaya diaper rash cream tube     best baby personal care set     premium quality baby diaper rash cream     best diaper creams',NULL),(243,31,'Younky Sunglasses Mens',50,112,'resources/51PzvdU04qL._UL1500_.jpg','     Himalaya diaper rash cream tube     best baby personal care set     premium quality baby diaper rash cream     best diaper creams',NULL),(244,31,'Fastrack Wrap Sunglasses ',40,218,'resources/61bsY1cha2L._UL1500_.jpg','     Himalaya diaper rash cream tube     best baby personal care set     premium quality baby diaper rash cream     best diaper creams',NULL);
/*!40000 ALTER TABLE `product` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `purchase`
--

DROP TABLE IF EXISTS `purchase`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `purchase` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `pro_id` int(11) DEFAULT NULL,
  `pro_name` varchar(100) DEFAULT NULL,
  `pro_size` varchar(45) DEFAULT NULL,
  `pro_price` double DEFAULT NULL,
  `pro_qty` int(11) DEFAULT NULL,
  `total` double DEFAULT NULL,
  `pur_date` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `purchase`
--

LOCK TABLES `purchase` WRITE;
/*!40000 ALTER TABLE `purchase` DISABLE KEYS */;
INSERT INTO `purchase` VALUES (2,2,'Jordan Spieth UA Tour Cap','XXL',29,15,870,'2016-07-30'),(3,3,'UA Pitch Knit ¾',NULL,50,12,6500,'2016-07-30'),(4,13,'Jordan Spieth UA Tour Cap','XXL',29,15,675,'2016-07-29');
/*!40000 ALTER TABLE `purchase` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sell`
--

DROP TABLE IF EXISTS `sell`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sell` (
  `pur_id` int(11) NOT NULL AUTO_INCREMENT,
  `pro_id` int(11) DEFAULT NULL,
  `pro_name` varchar(100) DEFAULT NULL,
  `pur_price` double DEFAULT NULL,
  `sell_price` double DEFAULT NULL,
  `sell_qty` int(11) DEFAULT NULL,
  `sell_total` double DEFAULT NULL,
  `profit` double DEFAULT NULL,
  `sell_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`pur_id`)
) ENGINE=InnoDB AUTO_INCREMENT=38 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sell`
--

LOCK TABLES `sell` WRITE;
/*!40000 ALTER TABLE `sell` DISABLE KEYS */;
INSERT INTO `sell` VALUES (1,14,'UA Micro G� Limitless',NULL,66.99,1,66.99,66.99,'2016-07-30 10:36:49'),(2,119,'BLU YBBLOS MAN SHOES SNEAKER',NULL,211,1,211,211,'2016-07-30 10:36:49'),(3,2,'Nike Tops',29,12,1,12,-17,'2016-07-30 10:36:50'),(4,14,'UA Micro G� Limitless',29,66.99,1,66.99,37.989999999999995,'2016-07-30 10:36:50'),(5,22,'Ultra Boost Shoes',29,226,1,226,197,'2016-07-30 10:36:50'),(6,22,'Ultra Boost Shoes',29,226,1,226,197,'2016-07-30 10:36:50'),(7,22,'Ultra Boost Shoes',29,226,1,226,197,'2016-07-30 10:36:50'),(8,22,'Ultra Boost Shoes',29,226,1,226,197,'2016-07-30 10:36:50'),(9,31,'Zip Monster Eye Hoodie',29,70,1,70,41,'2016-07-30 10:36:50'),(10,31,'Zip Monster Eye Hoodie',29,70,1,70,41,'2016-07-30 10:36:50'),(11,31,'Zip Monster Eye Hoodie',29,70,1,70,41,'2016-07-30 10:36:50'),(12,31,'Zip Monster Eye Hoodie',29,70,1,70,41,'2016-07-30 10:36:50'),(13,31,'Zip Monster Eye Hoodie',29,70,1,70,41,'2016-07-30 10:36:50'),(14,31,'Zip Monster Eye Hoodie',29,70,1,70,41,'2016-07-30 10:36:50'),(15,31,'Zip Monster Eye Hoodie',29,70,1,70,41,'2016-07-30 10:36:50'),(16,68,'Philips B22 17-Watt Bulb',NULL,12,1,12,12,'2016-07-30 11:38:02'),(17,4,'Buscatball Clothing',NULL,20,1,20,20,'2016-07-31 16:15:27'),(18,31,'Zip Monster Eye Hoodie',NULL,70,1,70,70,'2016-07-31 16:15:27'),(19,131,'Thor Men\'s Cotton T-Shirt ',NULL,113,1,113,113,'2016-08-01 17:57:43'),(20,31,'Zip Monster Eye Hoodie',NULL,70,1,70,70,'2016-08-01 17:57:43'),(21,33,'Maison Margiela',NULL,100,1,100,100,'2016-08-01 17:57:43'),(22,52,'Mannat Fashion Combo Chanderi',NULL,100,1,100,100,'2016-08-01 17:59:23'),(23,54,'Wimberly Fashion Women\'s',NULL,55,1,55,55,'2016-08-01 17:59:23'),(24,55,'J and J fashion Women\'s Net Gown',NULL,112,1,112,112,'2016-08-01 17:59:23'),(25,57,'Zaveri Pearls Non-Precious Metal ',NULL,200,1,200,200,'2016-08-01 17:59:23'),(26,49,'Pampers Active Baby',NULL,100,1,100,100,'2016-08-01 18:06:30'),(27,68,'Philips B22 17-Watt Bulb',NULL,12,1,12,12,'2016-08-01 18:08:43'),(28,65,'HOKIPO Apple Shaped Bamboo',NULL,8,1,8,8,'2016-08-01 18:11:04'),(29,65,'HOKIPO Apple Shaped Bamboo',NULL,8,1,8,8,'2016-08-01 18:12:51'),(30,65,'HOKIPO Apple Shaped Bamboo',NULL,8,1,8,8,'2016-08-01 18:13:11'),(31,65,'HOKIPO Apple Shaped Bamboo',NULL,8,1,8,8,'2016-08-01 18:14:15'),(32,66,'Cartoon Design Plastic Self Adhesive',NULL,1,1,1,1,'2016-08-01 18:14:15'),(33,66,'Cartoon Design Plastic Self Adhesive',NULL,1,1,1,1,'2016-08-01 18:14:15'),(34,24,'Standard One Blocked Tank Top',NULL,40,3,120,40,'2016-08-02 04:16:00'),(35,24,'Standard One Blocked Tank Top',NULL,40,3,120,40,'2016-08-02 04:16:01'),(36,2,'Nike Tops',29,12,1,12,-17,'2016-08-02 04:16:01'),(37,46,'Himalaya Diaper Rash',NULL,65,1,65,65,'2016-08-06 04:54:28');
/*!40000 ALTER TABLE `sell` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shop_user`
--

DROP TABLE IF EXISTS `shop_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shop_user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `email` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `reg_date` date DEFAULT NULL,
  `contact_no` varchar(11) DEFAULT NULL,
  `role_id` int(11) DEFAULT NULL,
  `address` varchar(150) DEFAULT NULL,
  `country` varchar(45) DEFAULT NULL,
  `district` varchar(45) DEFAULT NULL,
  `zip_code` varchar(45) DEFAULT NULL,
  `shoper_name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `email_UNIQUE` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shop_user`
--

LOCK TABLES `shop_user` WRITE;
/*!40000 ALTER TABLE `shop_user` DISABLE KEYS */;
INSERT INTO `shop_user` VALUES (1,'alparves.dc@gmail.com','123','2016-07-21','01929645480',2,'Feni','Bangladesh','Chittagong','3910','Md.ABDULLAH AL MAMUN'),(2,'almamun.dc@gmail.com','121','2016-07-26','01929694548',2,'Chhagalnaya, Feni-1205','Bangladesh','Chittagong','1205','Md.ABDULLAH AL PARVES'),(3,'angur87@gmail.com','123','2016-07-30','01817577725',2,'Dhanmondi','Bangladesh','Chandpur','1209','Angur Mia');
/*!40000 ALTER TABLE `shop_user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sliderfont`
--

DROP TABLE IF EXISTS `sliderfont`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sliderfont` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(200) DEFAULT NULL,
  `desc` varchar(500) DEFAULT NULL,
  `img_url` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sliderfont`
--

LOCK TABLES `sliderfont` WRITE;
/*!40000 ALTER TABLE `sliderfont` DISABLE KEYS */;
/*!40000 ALTER TABLE `sliderfont` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sub_category`
--

DROP TABLE IF EXISTS `sub_category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sub_category` (
  `sub_cat_id` int(11) NOT NULL AUTO_INCREMENT,
  `cat_id` int(11) DEFAULT NULL,
  `sub_cat_name` varchar(45) DEFAULT NULL,
  `sub_cat_desc` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`sub_cat_id`)
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sub_category`
--

LOCK TABLES `sub_category` WRITE;
/*!40000 ALTER TABLE `sub_category` DISABLE KEYS */;
INSERT INTO `sub_category` VALUES (1,4,'NIKE','Nike dress'),(2,4,'UNDER ARMOUR','Under Armour dress'),(3,4,'ADDIDAS','Addidas dress'),(4,4,'PUMA','Puma dress'),(5,4,'ASICS ','Asics  dress'),(6,5,'FENDI','Fendi dress'),(7,6,'FENDI','Fendi dress'),(8,5,'GUESS','Guess dress'),(9,5,'VALENTINO','Valentino dress'),(10,5,'DIOR','Dior dress'),(11,5,'VERSACE','Versace dress'),(12,5,'ARMANI','Armani dress'),(13,5,'PRADA','Prada dress'),(14,5,'DOLCE AND GABBANA','Dolce and Gabbana dress'),(15,5,'CHANEL','Chanel dress'),(16,5,'GUCCI','Gucci dress'),(17,6,'GUESS','Guess dress'),(18,6,'VALENTINO','Valentino dress'),(19,6,'DIOR','Dior dress'),(20,6,'VERSACE','Versace dress'),(21,7,'Kids','Kids product'),(22,8,'Fashion','Fashion product'),(23,9,'Households','Households product'),(24,10,'Interiors','Interiors products'),(25,11,'Clothing','Clothing products'),(26,12,'Bags','Bags products'),(27,13,'shoes','shoes products'),(28,14,'Other','Other Product'),(29,15,'Tshirt','New Tshirt'),(30,16,'Blazer','new Blazer'),(31,17,'Sunglass','new Sunglass');
/*!40000 ALTER TABLE `sub_category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_role`
--

DROP TABLE IF EXISTS `user_role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_role` (
  `role_id` int(11) NOT NULL AUTO_INCREMENT,
  `role_name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_role`
--

LOCK TABLES `user_role` WRITE;
/*!40000 ALTER TABLE `user_role` DISABLE KEYS */;
INSERT INTO `user_role` VALUES (1,'Admin'),(2,'User'),(3,'Manager'),(4,'Accountent'),(5,'Employee'),(6,'Assistent Manager');
/*!40000 ALTER TABLE `user_role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_trans`
--

DROP TABLE IF EXISTS `user_trans`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_trans` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_email` varchar(45) DEFAULT 'angur87@gmail.com',
  `pro_id` int(11) DEFAULT NULL,
  `pro_name` varchar(100) DEFAULT NULL,
  `price` double DEFAULT NULL,
  `qty` int(11) DEFAULT NULL,
  `total` double DEFAULT NULL,
  `tr_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_trans`
--

LOCK TABLES `user_trans` WRITE;
/*!40000 ALTER TABLE `user_trans` DISABLE KEYS */;
INSERT INTO `user_trans` VALUES (1,'angur87@gmail.com',2,'Nike Cats',500,2,1000,'2016-08-01 06:20:38'),(2,'almamun.dc@gmail.com',3,'fdsfsd',90,3,270,'2016-08-01 08:24:38'),(3,'angur87@gmail.com',5,'rergrr',45,2,90,'2016-08-01 08:55:45'),(4,'almamun.dc@gmail.com',49,'Pampers Active Baby',100,1,100,'2016-08-01 18:06:30'),(5,'almamun.dc@gmail.com',68,'Philips B22 17-Watt Bulb',12,1,12,'2016-08-01 18:08:44'),(6,NULL,65,'HOKIPO Apple Shaped Bamboo',8,1,8,'2016-08-01 18:14:15'),(7,NULL,66,'Cartoon Design Plastic Self Adhesive',1,1,1,'2016-08-01 18:14:15'),(8,NULL,66,'Cartoon Design Plastic Self Adhesive',1,1,1,'2016-08-01 18:14:15'),(9,'alparves.dc@gmail.com',24,'Standard One Blocked Tank Top',40,3,120,'2016-08-02 04:16:00'),(10,'alparves.dc@gmail.com',24,'Standard One Blocked Tank Top',40,3,120,'2016-08-02 04:16:01'),(11,'alparves.dc@gmail.com',2,'Nike Tops',12,1,12,'2016-08-02 04:16:01');
/*!40000 ALTER TABLE `user_trans` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `wishlist`
--

DROP TABLE IF EXISTS `wishlist`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `wishlist` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_email` varchar(45) DEFAULT NULL,
  `pro_id` int(11) DEFAULT NULL,
  `pro_name` varchar(100) DEFAULT NULL,
  `pro_url` varchar(100) DEFAULT NULL,
  `price` double DEFAULT NULL,
  `quantity` int(11) DEFAULT NULL,
  `total` double DEFAULT NULL,
  `time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=36 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `wishlist`
--

LOCK TABLES `wishlist` WRITE;
/*!40000 ALTER TABLE `wishlist` DISABLE KEYS */;
INSERT INTO `wishlist` VALUES (16,'almamun.dc@gmail.com',1,'Nike Cads','resources/nike.jpg',15,1,15,'2016-07-27 17:44:28'),(17,'almamun.dc@gmail.com',2,'Nike Tops','resources/topsNike.jpg',12,1,12,'2016-07-27 17:44:31'),(18,'almamun.dc@gmail.com',5,'W NIKE AIR RIFT BR  ','resources/Wnikesopt12.jpeg',100,1,100,'2016-07-27 17:44:33'),(32,'angur87@gmail.com',1,'Nike Cads','resources/nike.jpg',15,1,15,'2016-08-03 11:57:06'),(35,'alparves.dc@gmail.com',89,'SCATCHITE Boxer Black Canvas','resources/411taaIRH2L.jpg',120,1,120,'2016-08-03 13:26:59');
/*!40000 ALTER TABLE `wishlist` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-08-06 15:44:20
