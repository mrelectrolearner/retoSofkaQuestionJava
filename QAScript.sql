-- ----------------------------------------------------------------------------
-- MySQL Workbench Migration
-- Migrated Schemata: database_challenge
-- Source Schemata: mydb
-- Created: Thu Dec 23 23:51:58 2021
-- Workbench Version: 8.0.27
-- ----------------------------------------------------------------------------

SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------------------------------------------------------
-- Schema database_challenge
-- ----------------------------------------------------------------------------
DROP SCHEMA IF EXISTS `database_challenge` ;
CREATE SCHEMA IF NOT EXISTS `database_challenge` ;

-- ----------------------------------------------------------------------------
-- Table database_challenge.answer_option
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `database_challenge`.`answer_option` (
  `id_answer_option` INT NOT NULL AUTO_INCREMENT,
  `id_question` INT NOT NULL,
  `answer` VARCHAR(300) NOT NULL,
  `is_correct` TINYINT(1) NULL DEFAULT NULL,
  PRIMARY KEY (`id_answer_option`),
  INDEX `fk_opcion_respuesta_pregunta_idx` (`id_question` ASC) VISIBLE,
  CONSTRAINT `fk_opcion_respuesta_pregunta`
    FOREIGN KEY (`id_question`)
    REFERENCES `database_challenge`.`question` (`id_question`))
ENGINE = InnoDB
AUTO_INCREMENT = 14
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;

-- ----------------------------------------------------------------------------
-- Table database_challenge.game
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `database_challenge`.`game` (
  `id_game` INT NOT NULL AUTO_INCREMENT,
  `id_player` INT NOT NULL,
  `date` VARCHAR(10) NULL DEFAULT NULL,
  `final_round` INT NULL DEFAULT NULL,
  PRIMARY KEY (`id_game`),
  INDEX `fk_game_player1_idx` (`id_player` ASC) VISIBLE,
  CONSTRAINT `fk_game_player1`
    FOREIGN KEY (`id_player`)
    REFERENCES `database_challenge`.`player` (`id_player`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;

-- ----------------------------------------------------------------------------
-- Table database_challenge.player
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `database_challenge`.`player` (
  `id_player` INT NOT NULL AUTO_INCREMENT,
  `player_name` VARCHAR(12) NOT NULL,
  `points` INT NULL DEFAULT '0',
  PRIMARY KEY (`id_player`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;

-- ----------------------------------------------------------------------------
-- Table database_challenge.question
-- ----------------------------------------------------------------------------

CREATE TABLE IF NOT EXISTS `database_challenge`.`question` (
  `id_question` INT NOT NULL AUTO_INCREMENT,
  `question` VARCHAR(300) NOT NULL,
  `category` INT NOT NULL,
  PRIMARY KEY (`id_question`))
ENGINE = InnoDB
AUTO_INCREMENT = 6
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;
SET FOREIGN_KEY_CHECKS = 1;

-- ---------------------------------------------------------------------
-- Ingreso de las 25 preguntas
-- ---------------------------------------------------------------------

INSERT INTO `database_challenge`.`question` (`id_question`, `question`, `category`) 
VALUES 
('1', '¿Cuanto es 1+1?', '1'),
('2', '¿Cuanto es 2+2?', '1'),
('3', '¿Cuanto es 2+3?', '1'),
('4', '¿Cuanto es 4+2?', '1'),
('5', '¿Cuanto es 3+3?', '1'),
('6', '¿Cuanto es 2*2?', '2'),
('7', '¿Cuanto es 4*3?', '2'),
('8', '¿Cuanto es 5*2?', '2'),
('9', '¿Cuanto es 6*3?', '2'),
('10', '¿Cuanto es 3*3?', '2'),
('11', '¿Cuanto es 2*3+4?', '3'),
('12', '¿Cuanto es 3*5+1?', '3'),
('13', '¿Cuanto es 4*2+8?', '3'),
('14', '¿Cuanto es 1*1+1?', '3'),
('15', '¿Cuanto es 1*3+3?', '3'),
('16', '¿Cuanto es 6/2?', '4'),
('17', '¿Cuanto es 21/7?', '4'),
('18', '¿Cuanto es 15/3?', '4'),
('19', '¿Cuanto es 18/6?', '4'),
('20', '¿Cuanto es 32/8?', '4'),
('21', '¿Cuanto es 5+2*3?', '5'),
('22', '¿Cuanto es 18/2+2?', '5'),
('23', '¿Cuanto es 30/10+3?', '5'),
('24', '¿Cuanto es sqrt(25)?', '5'),
('25', '¿Cuanto es 5^2?', '5');

-- ---------------------------------------------------------------------
-- Ingreso de las respuestas para cada pregunta
-- ---------------------------------------------------------------------
INSERT INTO `database_challenge`.`answer_option` (`id_answer_option`, `id_question`, `answer`, `is_correct`) 
VALUES 
('1', '1', '2', '1'),
('2', '1', '1', '0'),
('3', '1', '3', '0'),
('4', '1', '4', '0'),

('5', '2', '4', '1'),
('6', '2', '2', '0'),
('7', '2', '3', '0'),
('8', '2', '5', '0'),

('9', '3', '5', '1'),
('10', '3', '7', '0'),
('11', '3', '9', '0'),
('12', '3', '2', '0'),

('13', '4', '6', '1'),
('14', '4', '8', '0'),
('15', '4', '3', '0'),
('16', '4', '4', '0'),

('17', '5', '6', '1'),
('18', '5', '2', '0'),
('19', '5', '8', '0'),
('20', '5', '10', '0'),

('21', '6', '4', '1'),
('22', '6', '6', '0'),
('23', '6', '5', '0'),
('24', '6', '8', '0'),

('25', '7', '12', '1'),
('26', '7', '10', '0'),
('27', '7', '21', '0'),
('28', '7', '8', '0'),

('29', '8', '10', '1'),
('30', '8', '5', '0'),
('31', '8', '2', '0'),
('32', '8', '8', '0'),

('33', '9', '18', '1'),
('34', '9', '15', '0'),
('35', '9', '12', '0'),
('36', '9', '16', '0'),

('37', '10', '9', '1'),
('38', '10', '7', '0'),
('39', '10', '8', '0'),
('40', '10', '6', '0'),

('41', '11', '10', '1'),
('42', '11', '12', '0'),
('43', '11', '8', '0'),
('44', '11', '11', '0'),

('45', '12', '16', '1'),
('46', '12', '15', '0'),
('47', '12', '18', '0'),
('48', '12', '14', '0'),

('49', '13', '16', '1'),
('50', '13', '40', '0'),
('51', '13', '14', '0'),
('52', '13', '18', '0'),

('53', '14', '2', '1'),
('54', '14', '1', '0'),
('55', '14', '3', '0'),
('56', '14', '4', '0'),

('57', '15', '6', '1'),
('58', '15', '7', '0'),
('59', '15', '9', '0'),
('60', '15', '8', '0'),

('61', '16', '3', '1'),
('62', '16', '4', '0'),
('63', '16', '2', '0'),
('64', '16', '5', '0'),

('65', '17', '3', '1'),
('66', '17', '2', '0'),
('67', '17', '6', '0'),
('68', '17', '5', '0'),

('69', '18', '5', '1'),
('70', '18', '3', '0'),
('71', '18', '4', '0'),
('72', '18', '7', '0'),

('73', '19', '3', '1'),
('74', '19', '4', '0'),
('75', '19', '6', '0'),
('76', '19', '8', '0'),

('77', '20', '4', '1'),
('78', '20', '8', '0'),
('79', '20', '6', '0'),
('80', '20', '10', '0'),

('81', '21', '11', '1'),
('82', '21', '21', '0'),
('83', '21', '22', '0'),
('84', '21', '12', '0'),

('85', '22', '11', '1'),
('86', '22', '4', '0'),
('87', '22', '5', '0'),
('88', '22', '12', '0'),

('89', '23', '6', '1'),
('90', '23', '8', '0'),
('91', '23', '4', '0'),
('92', '23', '5', '0'),

('93', '24', '5', '1'),
('94', '24', '8', '0'),
('95', '24', '6', '0'),
('96', '24', '4', '0'),

('97', '25', '25', '1'),
('98', '25', '24', '0'),
('99', '25', '10', '0'),
('100', '25', '22', '0');

INSERT INTO `database_challenge`.`player` (`player_name`, `points`) 
VALUES 
('Mateo', '500'),
('Luis', '550'),
('Jose', '600');