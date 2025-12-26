## Adapter

O **Adapter** é um padrão estrutural que permite que classes com interfaces incompatíveis trabalhem juntas ao converter uma interface existente em outra esperada pelo cliente; em Java, ele é comum ao integrar bibliotecas externas ou sistemas legados, como adaptar um serviço antigo de pagamento para uma nova interface do sistema, evitando reescrita de código e reduzindo acoplamento.

---
## Informações Adicionais Para Aprofundamento

### Exemplo De Cenário Legado
```java
public class PagamentoLegado {
    public void efetuarPagamento() {}
}
```

### Exemplo Aplicando Adapter
```java
public interface Pagamento {
    void pagar();
}

public class PagamentoAdapter implements Pagamento {
    private PagamentoLegado legado;

    public void pagar() {
        legado.efetuarPagamento();
    }
}
```

### Aplicação Em Cenários Reais
- Integração com APIs externas e SDKs
- Uso frequente em drivers, gateways e bibliotecas Java
- Facilita manutenção sem impactar o código cliente