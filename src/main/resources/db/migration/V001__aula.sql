CREATE TABLE `aula` (
    `id` INT NOT NULL AUTO_INCREMENT,
    `data_hora_inicio_planejado` DATETIME NOT NULL,
    `data_hora_fim_planejado` DATETIME NOT NULL,
    `data_hora_inicio_real` DATETIME NOT NULL,
    `data_hora_fim_real` DATETIME NOT NULL,
    PRIMARY KEY (`id`)
) COLLATE='utf8mb4_0900_ai_ci';

ALTER TABLE `aula`
    CHANGE COLUMN `data_hora_inicio_planejado` `data_hora_inicio_planejado` DATETIME NULL AFTER `id`,
    CHANGE COLUMN `data_hora_fim_planejado` `data_hora_fim_planejado` DATETIME NULL AFTER `data_hora_inicio_planejado`,
    CHANGE COLUMN `data_hora_inicio_real` `data_hora_inicio_real` DATETIME NULL AFTER `data_hora_fim_planejado`,
    CHANGE COLUMN `data_hora_fim_real` `data_hora_fim_real` DATETIME NULL AFTER `data_hora_inicio_real`;

ALTER TABLE `aula`
    CHANGE COLUMN `data_hora_inicio_planejado` `data_hora_inicio_planejado` DATE NULL DEFAULT NULL AFTER `id`,
    CHANGE COLUMN `data_hora_fim_planejado` `data_hora_fim_planejado` DATE NULL DEFAULT NULL AFTER `data_hora_inicio_planejado`,
    CHANGE COLUMN `data_hora_inicio_real` `data_hora_inicio_real` DATE NULL DEFAULT NULL AFTER `data_hora_fim_planejado`,
    CHANGE COLUMN `data_hora_fim_real` `data_hora_fim_real` DATE NULL DEFAULT NULL AFTER `data_hora_inicio_real`;
