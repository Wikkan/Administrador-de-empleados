-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema SistemaEmpresa
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema SistemaEmpresa
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `SistemaEmpresa` DEFAULT CHARACTER SET utf8 ;
USE `SistemaEmpresa` ;

-- -----------------------------------------------------
-- Table `SistemaEmpresa`.`Puesto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SistemaEmpresa`.`Puesto` (
  `idPuesto` INT NOT NULL AUTO_INCREMENT,
  `nombrePuesto` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idPuesto`),
  UNIQUE INDEX `nombrePuesto_UNIQUE` (`nombrePuesto` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `SistemaEmpresa`.`Persona`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SistemaEmpresa`.`Persona` (
  `cedula` INT NOT NULL,
  `numeroCuenta` INT NOT NULL,
  `primerNombre` VARCHAR(45) NOT NULL,
  `segundoNombre` VARCHAR(45) NULL,
  `primerApellido` VARCHAR(45) NOT NULL,
  `segundoApellido` VARCHAR(45) NOT NULL,
  `direccion` VARCHAR(1000) NULL,
  `numeroCelular` INT NOT NULL,
  `numeroCasa` INT NULL,
  `correo` VARCHAR(45) NOT NULL,
  `puesto` INT NULL,
  `fechaNacimiento` DATE NULL,
  PRIMARY KEY (`cedula`),
  UNIQUE INDEX `cedula_UNIQUE` (`cedula` ASC),
  UNIQUE INDEX `correo_UNIQUE` (`correo` ASC),
  INDEX `puesto_idx` (`puesto` ASC),
  CONSTRAINT `puesto`
    FOREIGN KEY (`puesto`)
    REFERENCES `SistemaEmpresa`.`Puesto` (`idPuesto`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `SistemaEmpresa`.`Usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SistemaEmpresa`.`Usuario` (
  `idUsuario` INT NOT NULL AUTO_INCREMENT,
  `nombreUsuario` VARCHAR(45) NOT NULL,
  `contraseña` VARCHAR(200) NOT NULL,
  `Persona_cedula` INT NOT NULL,
  `administrador` BIT NOT NULL,
  PRIMARY KEY (`idUsuario`),
  UNIQUE INDEX `Correo_UNIQUE` (`nombreUsuario` ASC),
  INDEX `fk_Usuario_Persona_idx` (`Persona_cedula` ASC),
  UNIQUE INDEX `Persona_cedula_UNIQUE` (`Persona_cedula` ASC),
  CONSTRAINT `fk_Usuario_Persona`
    FOREIGN KEY (`Persona_cedula`)
    REFERENCES `SistemaEmpresa`.`Persona` (`cedula`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `SistemaEmpresa`.`Familiares`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SistemaEmpresa`.`Familiares` (
  `cedula1` INT NOT NULL,
  `cedula2` INT NOT NULL,
  `id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `cedulaFamiliar1_idx` (`cedula1` ASC),
  INDEX `cedulaFamiliar2_idx` (`cedula2` ASC),
  CONSTRAINT `cedulaFamiliar1`
    FOREIGN KEY (`cedula1`)
    REFERENCES `SistemaEmpresa`.`Persona` (`cedula`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `cedulaFamiliar2`
    FOREIGN KEY (`cedula2`)
    REFERENCES `SistemaEmpresa`.`Persona` (`cedula`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `SistemaEmpresa`.`Vacaciones`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SistemaEmpresa`.`Vacaciones` (
  `idVacacion` INT NOT NULL AUTO_INCREMENT,
  `fecha` DATE NULL,
  `idUsuario` INT NULL,
  PRIMARY KEY (`idVacacion`),
  UNIQUE INDEX `idUsuario_UNIQUE` (`idUsuario` ASC),
  UNIQUE INDEX `idVacacion_UNIQUE` (`idVacacion` ASC),
  CONSTRAINT `vacacion`
    FOREIGN KEY (`idUsuario`)
    REFERENCES `SistemaEmpresa`.`Usuario` (`idUsuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `SistemaEmpresa`.`Pago`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SistemaEmpresa`.`Pago` (
  `idPago` INT NOT NULL,
  `idUsuario` INT NULL,
  `fecha` DATE NOT NULL,
  `cantidad` INT NOT NULL,
  PRIMARY KEY (`idPago`),
  INDEX `idUsuario_idx` (`idUsuario` ASC),
  CONSTRAINT `idUsuario`
    FOREIGN KEY (`idUsuario`)
    REFERENCES `SistemaEmpresa`.`Usuario` (`idUsuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

insert into puesto values (0, 'admi');
insert into persona values (116490794, 116490794, 'A', 'A', 'A', 'B', 'a', 1, 10, 'a@c', 1, '2000-1-1');
insert into usuario values (0, 'j', md5('hola'), 116490794, 1);