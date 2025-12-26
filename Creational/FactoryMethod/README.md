## Factory Method

O **Factory Method** é um padrão criacional que define uma interface para criar objetos, permitindo que subclasses decidam qual classe instanciar; em Java, ele elimina o acoplamento direto ao `new`, facilitando extensão do sistema sem modificar o código cliente, como em um serviço que cria diferentes tipos de notificações conforme o contexto, mantendo a lógica de criação isolada.

---
## Informações Adicionais Para Aprofundamento

### Exemplo Sem Factory Method (acoplamento alto)
```java
public class NotificacaoService {
    public Notificacao criar(String tipo) {
        if (tipo.equals("EMAIL")) return new Email();
        return new Sms();
    }
}
```

### Exemplo Aplicando Factory Method
```java
public abstract class NotificacaoFactory {
    abstract Notificacao criarNotificacao();
}

public class EmailFactory extends NotificacaoFactory {
    Notificacao criarNotificacao() {
        return new Email();
    }
}
```

### Aplicação Em Cenários Reais
- Muito usado em frameworks Java (ex.: criação de beans no Spring)
- Facilita aderência ao **Open/Closed Principle**
- Indicado quando a lógica de criação varia ou cresce com frequência