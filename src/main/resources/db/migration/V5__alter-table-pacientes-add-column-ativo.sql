alter table pacientes add ativo tinyint;

update pacientes set ativo = 1 where id >= 1;