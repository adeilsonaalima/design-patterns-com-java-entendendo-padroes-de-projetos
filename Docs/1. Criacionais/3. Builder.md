O **Builder** é um padrão criacional que separa a construção de um objeto complexo da sua representação final, permitindo criar diferentes variações passo a passo sem poluir o constructor; em Java, ele é muito usado quando há muitos parâmetros opcionais, como na criação de um `Pedido` ou `Usuario`, tornando o código mais legível, seguro e alinhado a boas práticas.

---
## Informações Adicionais Para Aprofundamento

### Exemplo Sem Builder (baixa legibilidade)
```java
Pedido pedido = new Pedido("João", "Rua A", "PIX", true, false);
```

### Exemplo Aplicando Builder
```java
Pedido pedido = Pedido.builder()
    .cliente("João")
    .endereco("Rua A")
    .pagamento("PIX")
    .build();
```

### Aplicação Em Cenários Reais
- Muito utilizado em APIs fluentes e bibliotecas Java
- Evita construtores extensos e errors de ordem de parâmetros
- Comum em frameworks como Lombok e em objetos imutáveis