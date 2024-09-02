# Comentários
```css
/*Os comentários no css não irão afetar seu código, mas pode nos ajudar a lembrar de blocos de códigos ou agrupar e organizar nosso código, deixa dicas para a leitura e ajuda os outros a entenderem nosso código.

Apenas não esqueça de fechar um comentário aberto.

Você também pode usar um comentário para desabilitar partes do seu código, o que possibilitaria um debug mais fácil, ou caso deseje fazer alguma alteração sem quebrar todo o seu código.*/
```

* Não irá afetar o seu código
* Ajuda a lembrar blocos de códigos
* Deixa dicas para leitura
* Ajuda outros a entenderem
* Nunca esqueça de fechar um comentário aberto 

Comentários começam com `/*` e terminam com `*/` .

```css

/* Básico */
/* ------------------------------------------ */
body {
    font: lem/150% Helvetica, Arial, sans-serif;
    padding: lem;
    margin: 0 auto;
    max-width: 33em;
} 

@media (min-width: 70em) {
    /* Let´s special case the global font size. On large screen or window, we increase the font size for better readability */
    body {
        font-size: 130%
    }
}
```

* Você poderá usar para desabilitar partes do seu código

```css

/* .special {
    color: red;
}*/

p {
    color: blue;
}
```



