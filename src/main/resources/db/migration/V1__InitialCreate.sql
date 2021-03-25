-- -----------------------------------------------------
-- Table `cidade`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cidade` (
  `id` INT(11) NOT NULL,
  `cidade` VARCHAR(255) NULL DEFAULT NULL,
  `uf` VARCHAR(255) NULL DEFAULT NULL,
  `created_at` DATETIME NOT NULL,
  `updated_at` DATETIME NOT NULL,
  `version` INT(11) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `pessoa`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `pessoa` (
  `tipo` VARCHAR(1) NOT NULL,
  `id` BIGINT(20) NOT NULL,
  `bairro` VARCHAR(255) NULL DEFAULT NULL,
  `cep` VARCHAR(255) NULL DEFAULT NULL,
  `cidade` VARCHAR(255) NULL DEFAULT NULL,
  `complemento` VARCHAR(255) NULL DEFAULT NULL,
  `email` VARCHAR(255) NULL DEFAULT NULL,
  `logradouro` VARCHAR(255) NULL DEFAULT NULL,
  `nome` VARCHAR(255) NULL DEFAULT NULL,
  `numero` VARCHAR(255) NULL DEFAULT NULL,
  `tel_cel` VARCHAR(255) NULL DEFAULT NULL,
  `tel_fixo` VARCHAR(255) NULL DEFAULT NULL,
  `uf` VARCHAR(255) NULL DEFAULT NULL,
  `user` VARCHAR(255) NULL DEFAULT NULL,
  `cpf` VARCHAR(255) NULL DEFAULT NULL,
  `sobre_nome` VARCHAR(255) NULL DEFAULT NULL,
  `cnpj` VARCHAR(255) NULL DEFAULT NULL,
  `nome_fantasia` VARCHAR(255) NULL DEFAULT NULL,
  `nome_responsavel` VARCHAR(255) NULL DEFAULT NULL,
  `created_at` DATETIME NOT NULL,
  `updated_at` DATETIME NOT NULL,
  `version` INT(11) NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `UK_nlwiu48rutiltbnjle59krljo` (`cpf` ASC) VISIBLE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `unidade`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `unidade` (
  `id` BIGINT(20) NOT NULL,
  `cidade` VARCHAR(255) NULL DEFAULT NULL,
  `complemento` VARCHAR(255) NULL DEFAULT NULL,
  `logradouro` VARCHAR(255) NULL DEFAULT NULL,
  `numero` VARCHAR(255) NULL DEFAULT NULL,
  `tipo_imovel` VARCHAR(255) NULL DEFAULT NULL,
  `uf` VARCHAR(255) NULL DEFAULT NULL,
  `user` VARCHAR(255) NULL DEFAULT NULL,
  `created_at` DATETIME NOT NULL,
  `updated_at` DATETIME NOT NULL,
  `version` INT(11) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `contrato`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `contrato` (
  `id` BIGINT(20) NOT NULL,
  `data_inicio` DATETIME(6) NULL DEFAULT NULL,
  `datafinal` DATETIME(6) NOT NULL,
  `dia_vencimento` INT(11) NOT NULL,
  `fianca` VARCHAR(255) NOT NULL,
  `imobiliaria` TINYBLOB NOT NULL,
  `tipo_competencia` INT(11) NOT NULL,
  `tipo_contrato` INT(11) NOT NULL,
  `tipo_situacao` INT(11) NOT NULL,
  `user` VARCHAR(255) NULL DEFAULT NULL,
  `valor` DOUBLE NOT NULL,
  `locador_id` BIGINT(20) NOT NULL,
  `locatario_id` BIGINT(20) NOT NULL,
  `unidade_id` BIGINT(20) NOT NULL,
  `created_at` DATETIME NOT NULL,
  `updated_at` DATETIME NOT NULL,
  `version` INT(11) NULL,
  PRIMARY KEY (`id`),
  INDEX `FKgvdhqk0smsmy5ng924nsbo0g7` (`locador_id` ASC) VISIBLE,
  INDEX `FKq34qgb7clh25a6g75x6sn7eny` (`locatario_id` ASC) VISIBLE,
  INDEX `FKp2tvmwugbfvtl6fosyq80rxlw` (`unidade_id` ASC) VISIBLE,
  CONSTRAINT `FKgvdhqk0smsmy5ng924nsbo0g7`
    FOREIGN KEY (`locador_id`)
    REFERENCES `pessoa` (`id`),
  CONSTRAINT `FKp2tvmwugbfvtl6fosyq80rxlw`
    FOREIGN KEY (`unidade_id`)
    REFERENCES `unidade` (`id`),
  CONSTRAINT `FKq34qgb7clh25a6g75x6sn7eny`
    FOREIGN KEY (`locatario_id`)
    REFERENCES `pessoa` (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `cobranca`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cobranca` (
  `id` BIGINT(20) NOT NULL,
  `user` VARCHAR(255) NULL DEFAULT NULL,
  `contrato_id` BIGINT(20) NOT NULL,
  `created_at` DATETIME NOT NULL,
  `updated_at` DATETIME NOT NULL,
  `version` INT(11) NULL,
  PRIMARY KEY (`id`),
  INDEX `FKtp7larwtmia1wu3bv7fhurmn4` (`contrato_id` ASC) VISIBLE,
  CONSTRAINT `FKtp7larwtmia1wu3bv7fhurmn4`
    FOREIGN KEY (`contrato_id`)
    REFERENCES `contrato` (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `hibernate_sequence`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `hibernate_sequence` (
  `next_val` BIGINT(20) NULL DEFAULT NULL)
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `imobiliaria`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `imobiliaria` (
  `id` BIGINT(20) NOT NULL,
  `bairro` VARCHAR(255) NULL DEFAULT NULL,
  `cep` VARCHAR(255) NULL DEFAULT NULL,
  `cidade` VARCHAR(255) NULL DEFAULT NULL,
  `complemento` VARCHAR(255) NULL DEFAULT NULL,
  `cpf_cnpj` VARCHAR(255) NULL DEFAULT NULL,
  `creci` VARCHAR(255) NULL DEFAULT NULL,
  `date_update` DATETIME(6) NOT NULL,
  `email` VARCHAR(255) NULL DEFAULT NULL,
  `logo` LONGBLOB NULL DEFAULT NULL,
  `logradouro` VARCHAR(255) NULL DEFAULT NULL,
  `nome` VARCHAR(255) NULL DEFAULT NULL,
  `numero` VARCHAR(255) NULL DEFAULT NULL,
  `tel_cel` VARCHAR(255) NULL DEFAULT NULL,
  `tel_fixo` VARCHAR(255) NULL DEFAULT NULL,
  `tipo_pessoa_enum` VARCHAR(255) NULL DEFAULT NULL,
  `uf` VARCHAR(255) NULL DEFAULT NULL,
  `user` VARCHAR(255) NULL DEFAULT NULL,
  `created_at` DATETIME NOT NULL,
  `updated_at` DATETIME NOT NULL,
  `version` INT(11) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `pagamento`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `pagamento` (
  `id` BIGINT(20) NOT NULL,
  `user` VARCHAR(255) NULL DEFAULT NULL,
  `created_at` DATETIME NOT NULL,
  `updated_at` DATETIME NOT NULL,
  `version` INT(11) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `papel_contrato`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `papel_contrato` (
  `id` BIGINT(20) NOT NULL,
  `papel` VARCHAR(255) NULL DEFAULT NULL,
  `pessoa` TINYBLOB NULL DEFAULT NULL,
  `created_at` DATETIME NOT NULL,
  `updated_at` DATETIME NOT NULL,
  `version` INT(11) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `role`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `role` (
  `id` BIGINT(20) NOT NULL,
  `descricao` VARCHAR(255) NULL DEFAULT NULL,
  `nome` VARCHAR(255) NULL DEFAULT NULL,
  `created_at` DATETIME NOT NULL,
  `updated_at` DATETIME NOT NULL,
  `version` INT(11) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `usuario` (
  `id` BIGINT(20) NOT NULL,
  `is_ativo` BIT(1) NOT NULL,
  `login` VARCHAR(255) NULL DEFAULT NULL,
  `nome` VARCHAR(255) NULL DEFAULT NULL,
  `senha` VARCHAR(255) NULL DEFAULT NULL,
  `imobiliaria_id` BIGINT(20) NULL DEFAULT NULL,
  `created_at` DATETIME NOT NULL,
  `updated_at` DATETIME NOT NULL,
  `version` INT(11) NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `UK_pm3f4m4fqv89oeeeac4tbe2f4` (`login` ASC) VISIBLE,
  INDEX `FKdajcnujydceh7oh1ck0pp14q` (`imobiliaria_id` ASC) VISIBLE,
  CONSTRAINT `FKdajcnujydceh7oh1ck0pp14q`
    FOREIGN KEY (`imobiliaria_id`)
    REFERENCES `imobiliaria` (`id`)
    ON DELETE RESTRICT
    ON UPDATE RESTRICT)
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `role_usuarios`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `role_usuarios` (
  `role_id` BIGINT(20) NOT NULL,
  `usuarios_id` BIGINT(20) NOT NULL,
  `created_at` DATETIME NOT NULL,
  `updated_at` DATETIME NOT NULL,
  `version` INT(11) NULL,
  INDEX `FKigrj7h5iju6oqt1ylf4bsc57f` (`usuarios_id` ASC) VISIBLE,
  INDEX `FKcgp7x6s0ia8odsa0vioe3mups` (`role_id` ASC) VISIBLE,
  CONSTRAINT `FKcgp7x6s0ia8odsa0vioe3mups`
    FOREIGN KEY (`role_id`)
    REFERENCES `role` (`id`),
  CONSTRAINT `FKigrj7h5iju6oqt1ylf4bsc57f`
    FOREIGN KEY (`usuarios_id`)
    REFERENCES `usuario` (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `usuario_roles`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `usuario_roles` (
  `usuario_id` BIGINT(20) NOT NULL,
  `roles_id` BIGINT(20) NOT NULL,
  `created_at` DATETIME NOT NULL,
  `updated_at` DATETIME NOT NULL,
  `version` INT(11) NULL,
  INDEX `FKr5p0u8r15jjo6u7xr1928hsld` (`roles_id` ASC) VISIBLE,
  INDEX `FKqblnumndby0ftm4c7sg6uso6p` (`usuario_id` ASC) VISIBLE,
  CONSTRAINT `FKqblnumndby0ftm4c7sg6uso6p`
    FOREIGN KEY (`usuario_id`)
    REFERENCES `usuario` (`id`),
  CONSTRAINT `FKr5p0u8r15jjo6u7xr1928hsld`
    FOREIGN KEY (`roles_id`)
    REFERENCES `role` (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;
