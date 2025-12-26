O **Bridge** é um padrão estrutural que separa **abstração** de **implementação**, permitindo que ambas evoluam independentemente; em Java, ele é útil quando uma hierarquia cresce em duas dimensões, como forma e plataforma, evitando explosão de subclasses e mantendo o código flexível, assim como separar o controle remoto do aparelho que ele controla.

---
## Informações Adicionais Para Aprofundamento

### Exemplo De Problema Sem Bridge
- `RelatorioPDFWindows`, `RelatorioPDFLinux`, `RelatorioHTMLWindows`, etc.
- Crescimento exponencial de classes.

### Exemplo Aplicando Bridge
```java
public interface Exportador {
    void exportar();
}

public abstract class Relatorio {
    protected Exportador exportador;
}
```

```java
public class RelatorioFinanceiro extends Relatorio {
    public void gerar() {
        exportador.exportar();
    }
}
```

### Aplicação Em Cenários Reais
- Sistemas multiplataforma
- Drivers, renderização gráfica e APIs desacopladas
- Reduz herança excessiva e melhora manutenibilidade

---
---

## O Que É Abstração E O Que É Implementação?

**Abstração** é a definição do _o que_ um objeto faz, expondo apenas comportamentos essenciais e ocultando detalhes, enquanto **implementação** é o _como_ esses comportamentos são realizados; em Java, a abstração aparece em **interfaces e classes abstratas**, e a implementação nas **classes concretas**, permitindo trocar comportamentos sem impactar quem usa, como dirigir um carro sem precisar saber como o motor funciona.

---
## Informações Adicionais Para Aprofundamento

### Exemplo De Abstração
```java
public interface Pagamento {
    void pagar();
}
```

### Exemplo De Implementação
```java
public class Pix implements Pagamento {
    public void pagar() {}
}
```

### Aplicação Em Cenários Reais
- Base do **polimorfismo** e do **Dependency Inversion Principle**
- Permite evolução do sistema sem quebrar código cliente
- Essential em arquiteturas desacopladas, APIs e frameworks Java