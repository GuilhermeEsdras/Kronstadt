<!-- Título do Respositório -->
# Kronstadt
<!-- -->

<!-- Badges -->
<p align="center">
    <img src="https://img.shields.io/badge/made%20with-Kotlin-purple.svg?style=flat&colorB=BD5CF3&logo=Kotlin" alt="Kotlin Badge">
</p>
<!-- -->

<!-- Msg de boas vindas -->
<p align="center">Bem-vindo ao meu repositório de
<!-- -->

<!-- Logo -->
<p align="center">
    <img align="center" src="https://logos-download.com/wp-content/uploads/2016/10/Kotlin_logo_wordmark.png" alt="Kotlin Logo" width="300">
</p>
<!-- -->

<!-- Links Principais-->
<p align="center">
    <a href="https://kotlinlang.org/docs/reference/" target="_blank"><strong>Documentação da linguagem »</strong></a>
    <br/>
    <a href="https://pt.wikipedia.org/wiki/Kotlin" target="_blank"><strong>Página no Wikipedia »</strong></a>
    <br/>
    <a href="https://kotlinlang.org/" target="_blank"><strong>Site Oficial »</strong></a>
    <br/>
</p>
<!-- -->

<!-- Links do Repositório -->
<p align="center">
    <a href="Exercícios Resolvidos">Exercícios Resolvidos</a>
    ·
    <a href="Programas Simples">Programas Simples</a>
    ·
    <a href="Projetos Android">Projetos Android</a>
</p>
<!-- -->

<!-- Language Preview-->
<p align="center">
    <img align="center" src="https://raw.githubusercontent.com/alexmt/atom-kotlin-language/master/sample.png" alt="Kotlin Preview" width="400">
</p>
<!-- -->

---

<!-- Table of Contents -->
## Glossário
- [Kronstadt](#Kronstadt)
  - [Glossário](#Gloss%C3%A1rio)
  - [Objetivo](#Objetivo)
  - [Material Utilizado](#Material-Utilizado)
    - [Sistema Operacional](#Sistema-Operacional)
    - [Compilador](#Compilador)
    - [IDE](#IDE)
  - [Programando em Kotlin](#Programando-em-Kotlin)
    - [Pré-Requisitos](#Pr%C3%A9-Requisitos)
    - [Executando .kt pelo CMD](#Executando-kt-pelo-CMD)
    - [Criando Projeto para Android](#Criando-Projeto-para-Android)
    - [Exemplo de Hello World](#Exemplo-de-Hello-World)
  - [Links Úteis](#Links-%C3%9Ateis)
  - [Autor](#Autor)
  - [Licença](#Licen%C3%A7a)
<!-- -->

<!-- Objetivo -->
## Objetivo
Este repositório foi criado com a finalidade de guardar meus projetos, ideias, anotações, exercícios e programas pessoais feitos em <strong>Kotlin</strong>.
<!-- -->

<!-- Material Utilizado -->
## Material Utilizado
Estes são os materiais usados por mim para desenvolver e rodar meus programas em Kotlin.
### Sistema Operacional
- [Windows 10](https://www.microsoft.com/pt-br/windows/)
### Compilador
- [Java Runtime Environment](#Links-%C3%9Ateis)
- [Kotlinc](#Links-%C3%9Ateis)
### IDE
- [Visual Studio Code](https://code.visualstudio.com/)
  - Com as extensões: <br/>
    [Kotlin Language](https://marketplace.visualstudio.com/items?itemName=mathiasfrohlich.Kotlin)
    [Kotlin](https://marketplace.visualstudio.com/items?itemName=fwcd.kotlin)
- [IntelliJ IDEA by JetBrains](https://www.jetbrains.com/idea/)
- [Android Studio](https://developer.android.com/studio)
<!-- -->

<!-- Programando em ... -->
## Programando em Kotlin
O que foi necessário para criar e rodar meus programas em Kotlin

### Pré-Requisitos
Para executar e criar programas em **Kotlin** é necessário ter o compilador do Java (JRE) instalado no computador e também o compilador do Kotlin (kotlinc).

- Para verificar se o compilador do kotlin está instalado no PC, basta executar o comando no CMD: <br/>
    `> kotlinc`
> - Se o comando não for reconhecido, **não está** instalado! *(ver [Links Úteis](#Links-%C3%9Ateis) para instalar o Kotlin e suas dependências)* <br/>
> - Caso exiba a versão do kotlin e inicie o ambiente virtual, **está** instalado! <br/>

### Executando .kt pelo CMD
Criando e executando um programa simples em Kotlin pelo CMD

1. Para executar arquivos *.kt* pelo terminal deve-se ter o Java JDK (Java Development Kit) e o compilador Kotlinc devidamente instalados e configurados no PC. <br/>
   Para instalar o compilador, baixar os arquivos comprimidos contendo o compilador do Kotlin *(ver [Links Úteis](#Links-%C3%9Ateis))* e então seguir as instruções:
   1. Extrair o arquivo baixado para o diretório local C:/;
   2. Ir até as configurações de variáveis do ambiente do sistema;
   3. Copie o endereço da pasta **bin** do compilador;
   4. Abra "Path" e cole a linha no final;
   5. Pronto para compilar e executar arquivos .kt.

2. Após ter baixado e configurado o compilador, já será capaz de criar e executar programas Kotlin no Windows (levando em consideração que o Java JDK também está instalado e configurado).

- Para iniciar um ambiente virtual de desenvolvimento e criar programas rápidos pelo CMD, é só executar o comando: <br/>
    `> kotlinc` <br/>
    Aparecerá a versão do compilador seguido de: <br/>
    `>>>` <br/>
    Então é só digitar os códigos. <br/>

- Para compilar programas *".kt"* e executá-los no terminal/cmd:
  - Abrir pasta onde se localiza o arquivo main *.kt*: <br/>
     `> cd "pasta do programa"`
  - Compilar o programa: <br/>
     `> kotlinc "nome do programa".kt -include-runtime -d "nome de saída".jar // Será gerado um arquivo "nome de saída".jar, -include-runtime é necessário para poder executar o programa pelo terminal, -d indica que queremos compilar um programa com saída .jar`
  - Para executar: <br/>
     `> java -jar "nome de saída".jar`
  
  - Exemplo: <br/>
     `> cd "C:\Users\Guilherme\Documentos\Meus Programas\Kotlin\Programa Hello World" // Para ir até a pasta do arquivo .kt` <br/>
     `> kotlinc HelloWorld.kt -include-runtime -d OlaMundo.jar // Para compilar um programa chamado "HelloWorld.kt" e executá-lo como "OlaMundo.jar"` <br/>
     `> java -jar OlaMundo.jar // Para executar este programa`

### Criando Projeto para Android
> Em breve... *talvez...*

### Exemplo de Hello World
``` Kotlin
fun main(args: Array<String>) {
    println("Hello, Gui! =)")
}
```

Saída: <br/>
`> Hello Gui! =)`
<!-- -->

<!-- Links-->
## Links Úteis
- [Java™ SE (Standard Edition) Development Kit (JDK™) - Java JDK](https://www.oracle.com/technetwork/pt/java/javase/downloads/jdk8-downloads-2133151.html)
- [Compilador Kotlin](https://github.com/JetBrains/kotlin/releases/tag/v1.3.41)
- [Getting Started with Kotlin](https://kotlinlang.org/docs/tutorials/command-line.html)
- [Tutoriais Kotlin](https://kotlinlang.org/docs/tutorials/)
<!-- -->

<!-- Autor/Contato -->
## Autor
* **Guilherme Esdras (guilherme.esdras@outlook.com)** - [GitHub Page](https://github.com/GuilhermeEsdras)
<!-- -->

<!-- Licença -->
## Licença
*Distributed under the MIT License. See LICENSE for more information.*