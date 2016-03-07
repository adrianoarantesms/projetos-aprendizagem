CREATE TABLE cardapio_item (
  id_cardapio_item int(4) AUTO_INCREMENT NOT NULL,
  nm_descricao varchar(200) NOT NULL,
  vl_preco decimal(10,2) NOT NULL,
  PRIMARY KEY (id_cardapio_item)
);

CREATE TABLE pedido (
  id_pedido int(4) AUTO_INCREMENT NOT NULL,
  id_cardapio_item int(4) NOT NULL,
  cd_mesa int(10) NOT NULL,
  dt_pedido date,
  PRIMARY KEY (id_pedido)
);
