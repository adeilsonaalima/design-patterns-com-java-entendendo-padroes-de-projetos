package br.com.adeilsonaalima.builder.builders;

import br.com.adeilsonaalima.builder.components.Color;

public interface IBuilderWithColor extends IBuilder {
    void setColor(Color color);
}
