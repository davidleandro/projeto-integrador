-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `mydb` ;

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`referencia_bibliografica`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`referencia_bibliografica` ;

CREATE TABLE IF NOT EXISTS `mydb`.`referencia_bibliografica` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `autor` VARCHAR(80) NULL,
  `titulo` VARCHAR(150) NULL,
  `editora` VARCHAR(80) NULL,
  `ano` VARCHAR(45) NULL,
  `quantidade` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`ata`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`ata` ;

CREATE TABLE IF NOT EXISTS `mydb`.`ata` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `data` VARCHAR(45) NULL,
  `horaInicio` VARCHAR(45) NULL,
  `horaFim` VARCHAR(45) NULL,
  `assunto` VARCHAR(45) NULL,
  `sede` VARCHAR(45) NULL,
  `sala` VARCHAR(45) NULL,
  `descricao` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`professor`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`professor` ;

CREATE TABLE IF NOT EXISTS `mydb`.`professor` (
  `id` INT NOT NULL,
  `nome` VARCHAR(45) NULL,
  `cpf` INT NULL,
  `maior_titulacao` VARCHAR(45) NULL,
  `formacao_titulacao` VARCHAR(45) NULL,
  `curriculo_lattes` VARCHAR(45) NULL,
  `atualizacao_curriculo_lates` DATE NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`participantes`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`participantes` ;

CREATE TABLE IF NOT EXISTS `mydb`.`participantes` (
  `professor_id` INT NOT NULL,
  `ata_id` INT NOT NULL,
  PRIMARY KEY (`professor_id`, `ata_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`disciplina`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`disciplina` ;

CREATE TABLE IF NOT EXISTS `mydb`.`disciplina` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NULL,
  `carga_horaria` INT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`curso`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`curso` ;

CREATE TABLE IF NOT EXISTS `mydb`.`curso` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NULL,
  `tipo_curso` VARCHAR(45) NULL,
  `carga_horaria` INT NULL,
  `semestre` INT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`modalidade`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`modalidade` ;

CREATE TABLE IF NOT EXISTS `mydb`.`modalidade` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `tipo` INT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`grade`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`grade` ;

CREATE TABLE IF NOT EXISTS `mydb`.`grade` (
  `aluno_id` INT NOT NULL,
  `grade_id` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`aluno_id`, `grade_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`aluno`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`aluno` ;

CREATE TABLE IF NOT EXISTS `mydb`.`aluno` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`grade`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`grade` ;

CREATE TABLE IF NOT EXISTS `mydb`.`grade` (
  `aluno_id` INT NOT NULL,
  `grade_id` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`aluno_id`, `grade_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`plano_ensino`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`plano_ensino` ;

CREATE TABLE IF NOT EXISTS `mydb`.`plano_ensino` (
  `id` INT NOT NULL,
  `curso_id` INT NOT NULL,
  `disciplina_id` INT NOT NULL,
  `ano` INT NULL,
  `semestre` INT NULL,
  `carga_horaria_semanal` INT NULL,
  `professor_id` INT NOT NULL,
  `ementa` TEXT NULL,
  `competencias` TEXT NULL,
  `metodologia` TEXT NULL,
  `cronograma` TEXT NULL,
  `avaliacao` TEXT NULL,
  PRIMARY KEY (`id`, `curso_id`, `disciplina_id`, `professor_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`bibliografia_disciplina`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`bibliografia_disciplina` ;

CREATE TABLE IF NOT EXISTS `mydb`.`bibliografia_disciplina` (
  `disciplina_id` INT NOT NULL,
  `referencia_bibliografica_id` INT NOT NULL,
  PRIMARY KEY (`disciplina_id`, `referencia_bibliografica_id`))
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
