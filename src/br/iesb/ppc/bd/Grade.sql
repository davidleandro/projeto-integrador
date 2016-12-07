-- MySQL Script generated by MySQL Workbench
-- ter 06 dez 2016 20:45:33 BRST
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`Modalidade`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Modalidade` (
  `id_Modalidade` INT NOT NULL AUTO_INCREMENT,
  `modalidadeTipo` INT NOT NULL,
  PRIMARY KEY (`id_Modalidade`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Periodo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Periodo` (
  `id_Periodo` INT NOT NULL AUTO_INCREMENT,
  `Turno` INT NOT NULL,
  PRIMARY KEY (`id_Periodo`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Curso`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Curso` (
  `id_Curso` INT NOT NULL AUTO_INCREMENT,
  `nomeCurso` VARCHAR(255) NOT NULL,
  `Modalidade_id` INT NOT NULL,
  `Periodo_id` INT NOT NULL,
  PRIMARY KEY (`id_Curso`, `Modalidade_id`, `Periodo_id`),
  INDEX `fk_Curso_Modalidade1_idx` (`Modalidade_id` ASC),
  INDEX `fk_Curso_Periodo1_idx` (`Periodo_id` ASC),
  CONSTRAINT `fk_Curso_Modalidade1`
    FOREIGN KEY (`Modalidade_id`)
    REFERENCES `mydb`.`Modalidade` (`id_Modalidade`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Curso_Periodo1`
    FOREIGN KEY (`Periodo_id`)
    REFERENCES `mydb`.`Periodo` (`id_Periodo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Turma`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Turma` (
  `id_Turma` INT NOT NULL AUTO_INCREMENT,
  `nomeTurma` VARCHAR(255) NOT NULL,
  `Curso_id` INT NOT NULL,
  PRIMARY KEY (`id_Turma`, `Curso_id`),
  INDEX `fk_Turma_Curso1_idx` (`Curso_id` ASC),
  CONSTRAINT `fk_Turma_Curso1`
    FOREIGN KEY (`Curso_id`)
    REFERENCES `mydb`.`Curso` (`id_Curso`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Grade`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Grade` (
  `id_Grade` INT NOT NULL AUTO_INCREMENT,
  `Turma_id_Turma` INT NOT NULL,
  PRIMARY KEY (`id_Grade`, `Turma_id_Turma`),
  INDEX `fk_Grade_Turma1_idx` (`Turma_id_Turma` ASC),
  CONSTRAINT `fk_Grade_Turma1`
    FOREIGN KEY (`Turma_id_Turma`)
    REFERENCES `mydb`.`Turma` (`id_Turma`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Disciplina`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Disciplina` (
  `id_Disciplina` INT NOT NULL AUTO_INCREMENT,
  `nomeDisciplina` VARCHAR(255) NOT NULL,
  `Grade_id` INT NOT NULL,
  PRIMARY KEY (`id_Disciplina`, `Grade_id`),
  INDEX `fk_Disciplina_Grade1_idx` (`Grade_id` ASC),
  CONSTRAINT `fk_Disciplina_Grade1`
    FOREIGN KEY (`Grade_id`)
    REFERENCES `mydb`.`Grade` (`id_Grade`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Semestre`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Semestre` (
  `id_Semestre` INT NOT NULL AUTO_INCREMENT,
  `quantidade` INT NOT NULL,
  `Curso_id` INT NOT NULL,
  `Grade_id` INT NOT NULL,
  PRIMARY KEY (`id_Semestre`, `Curso_id`, `Grade_id`),
  INDEX `fk_Semestre_Curso1_idx` (`Curso_id` ASC),
  INDEX `fk_Semestre_Grade1_idx` (`Grade_id` ASC),
  CONSTRAINT `fk_Semestre_Curso1`
    FOREIGN KEY (`Curso_id`)
    REFERENCES `mydb`.`Curso` (`id_Curso`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Semestre_Grade1`
    FOREIGN KEY (`Grade_id`)
    REFERENCES `mydb`.`Grade` (`id_Grade`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

use mydb;

-- select nomeTurma, modalidadeTipo, nomeCurso from Curso, Modalidade, Turma where Modalidade_id = id_Modalidade and Curso_id = id_Curso;
insert into Modalidade value (null, 1);
insert into Modalidade value (null, 2);
-- select * from Modalidade;
insert into Periodo value (null, 1);
insert into Periodo value (null, 2);
insert into Periodo value (null, 3);
insert into Periodo value (null, 4);
-- select * from Periodo;
insert into Curso value (null, "Análise e Desenvolvimento de Sistemas", 2, 3);
insert into Curso value (null, "Engenharia da Computação", 2, 1);
insert into Curso value (null, "Ciência da Computação", 1, 4);
insert into Curso value (null, "Jogos Digitais", 1, 4);
-- select * from Curso;
insert into Turma value (null, "ADS001", 1);
insert into Turma value (null, "ENG001", 2);
insert into Turma value (null, "CCO001", 3);
insert into Turma value (null, "JD001", 4);
-- select nomeCurso, modalidadeTipo, id_Curso from Curso, Modalidade where Modalidade_id = id_Modalidade and modalidadeTipo = 2;
-- select nomeTurma from Curso, Turma where id_Curso = 1 and id_Curso = Curso_id;

insert into Grade values (null, 1);
insert into Grade values (null, 2);
insert into Grade values (null, 3);
insert into Grade values (null, 4);


insert into Disciplina values (null, "ALGORITMOS E PROGRAMAÇÃO DE COMPUTADORES", 1);
insert into Disciplina values (null, "ARQUITETURA DE COMPUTADORES", 1);
insert into Disciplina values (null, "ENGENHARIA DE SOFTWARE", 1);

insert into Disciplina values (null, "PRÁTICAS DE ENGENHARIA", 2);
insert into Disciplina values (null, "QUÍMICA GERAL", 2);
insert into Disciplina values (null, "TÓPICOS DE FÍSICA", 2);


insert into Disciplina values (null, "INTRODUÇÃO À CIÊNCIA DA COMPUTAÇÃO", 3);
insert into Disciplina values (null, "FUNDAMENTOS DE LÓGICA", 3);
insert into Disciplina values (null, "CÁLCULO I", 3);


insert into Disciplina values (null, "CONCEITOS E FUNDAMENTOS DO JORNALISMO", 4);
insert into Disciplina values (null, "HISTÓRIA DO JORNALISMO", 4);
insert into Disciplina values (null, "PROJETO INTEGRADOR I - FOTOGRAFIA MULTIMÍDIA", 4);


insert into Semestre values (null, 5, 1, 1);
insert into Semestre values (null, 10, 2, 2);
insert into Semestre values (null, 10, 3,  3);
insert into Semestre values (null, 8, 4, 4);