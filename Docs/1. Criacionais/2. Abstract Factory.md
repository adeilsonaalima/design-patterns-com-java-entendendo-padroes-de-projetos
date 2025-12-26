## Abstract Factory
O **Abstract Factory** é um padrão criacional que fornece uma interface para criar **famílias de objetos relacionados ou dependentes** sem especificar suas classes concretas; em Java, ele é usado quando o sistema precisa garantir compatibilidade entre objetos, como criar botões e janelas para diferentes sistemas operacionais, permitindo trocar a família inteira sem alterar o código cliente.

---
## Informações Adicionais Para Aprofundamento

### Estrutura Básica
```java
public interface UIFactory {
    Botao criarBotao();
    Janela criarJanela();
}
```

```java
public class WindowsFactory implements UIFactory {
    public Botao criarBotao() { return new BotaoWindows(); }
    public Janela criarJanela() { return new JanelaWindows(); }
}
```

### Aplicação Em Cenários Reais
- Criação de components gráficos multiplataforma
- Uso conjunto com **Factory Method**
- Forte alinhamento ao **Open/Closed Principle** e **Dependency Inversion Principle**