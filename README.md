# CriptKey

<p align="center">
  <img src="https://capsule-render.vercel.app/api?type=waving&color=0:0F172A,50:1E293B,100:2563EB&height=220&section=header&text=CriptKey&fontSize=64&fontColor=FFFFFF&animation=fadeIn&fontAlignY=38&desc=Sistema%20de%20Criptografia%20em%20Java&descAlignY=58&descSize=20" width="100%" alt="CriptKey">
</p>

<p align="center">
  <strong>Sistema de Criptografia desenvolvido em Java para estudo, experimentação e implementação de conceitos de segurança da informação.</strong>
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Java-21.0.11-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java 21.0.11">
  <img src="https://img.shields.io/badge/IntelliJ%20IDEA-Compatible-000000?style=for-the-badge&logo=intellijidea&logoColor=white" alt="IntelliJ IDEA">
  <img src="https://img.shields.io/badge/VS%20Code-Compatible-007ACC?style=for-the-badge&logo=visualstudiocode&logoColor=white" alt="VS Code">
  <img src="https://img.shields.io/badge/Git-Version%20Control-F05032?style=for-the-badge&logo=git&logoColor=white" alt="Git">
  <img src="https://img.shields.io/badge/Windows-Supported-0078D6?style=for-the-badge&logo=windows&logoColor=white" alt="Windows">
  <img src="https://img.shields.io/badge/Linux-Supported-FCC624?style=for-the-badge&logo=linux&logoColor=black" alt="Linux">
</p>

---

## Sobre o Projeto

**CriptKey** é um projeto de criptografia desenvolvido em Java com foco no aprendizado de programação, manipulação de caracteres, estruturas de dados, algoritmos e conceitos relacionados à transformação de informações.

O projeto foi criado como um ambiente de estudo para desenvolver e testar algoritmos de criptografia e codificação utilizando recursos nativos da linguagem Java.

> **Nota:** O CriptKey é um projeto educacional. Não deve ser considerado, em seu estado atual, uma implementação criptográfica adequada para proteger informações sensíveis em ambientes de produção.

---

## Demonstração

> Substitua o caminho abaixo pelo seu GIF de demonstração.

<p align="center">
  <img src="./assets/criptkey-demo.gif" width="900" alt="Demonstração do CriptKey">
</p>

---

<p align="center">
  <img src="https://img.shields.io/badge/Version-1.0.0-7C3AED?style=for-the-badge" alt="Version 1.0.0">
  <img src="https://img.shields.io/badge/Status-Initial%20Release-22C55E?style=for-the-badge" alt="Initial Release">
  <img src="https://img.shields.io/badge/License-MIT-22C55E?style=for-the-badge&logo=opensourceinitiative&logoColor=white" alt="MIT License">
</p>

## Versão

**CriptKey v1.0.0 — Initial Release**

Esta é a primeira versão oficial do CriptKey.

A versão `1.0.0` representa a primeira release do projeto, contendo a implementação inicial do sistema de criptografia e sua estrutura base em Java.

### Informações da Release

| Informação           | Valor                     |
| -------------------- | ------------------------- |
| Projeto              | CriptKey                  |
| Versão               | `1.0.0`                   |
| Release              | Initial Release           |
| Linguagem            | Java                      |
| JDK                  | 21.0.11                   |
| Licença              | MIT                       |
| Plataforma principal | Windows                   |
| Linux                | Suportado                 |



## Tecnologias

<p align="center">
  <img src="https://img.shields.io/badge/Java-21-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java">
  <img src="https://img.shields.io/badge/JVM-Java%20Virtual%20Machine-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="JVM">
  <img src="https://img.shields.io/badge/Git-Version%20Control-F05032?style=for-the-badge&logo=git&logoColor=white" alt="Git">
  <img src="https://img.shields.io/badge/GitHub-Repository-181717?style=for-the-badge&logo=github&logoColor=white" alt="GitHub">
</p>

### Ambiente de desenvolvimento

* Java JDK 21.0.11
* IntelliJ IDEA ou Visual Studio Code
* Git
* Terminal/PowerShell
* Sistema operacional Windows
* Linux: compatibilidade

O projeto utiliza Java 21, uma versão LTS do Java SE.

---

## Requisitos

Antes de executar o projeto, certifique-se de possuir:

### Java

```text
Java JDK 21.0.11
```

Verifique sua instalação:

```bash
java --version
```

O resultado esperado deve indicar uma versão Java 21.

### Git

Verifique:

```bash
git --version
```

### IDE

Você pode utilizar uma das seguintes opções:

```text
IntelliJ IDEA
Visual Studio Code
Outras no seu Gosto ☕🖖😃
```

A IDE deve estar instalada e configurada para utilizar o JDK 21.

---

## Instalação

Clone o repositório:

```bash
git clone https://github.com/0xKxbyte/Sistema-Criptografia-Java.git
```

Entre no diretório:

```bash
cd Sistema-Criptografia-Java
```

Abra o projeto no IntelliJ IDEA ou Visual Studio Code.

---

## Execução

### IntelliJ IDEA

Abra o projeto e localize a classe principal:

```text
src/
└── Main.java
```

Execute a classe `Main`.

### Terminal

Caso o projeto esteja estruturado para compilação direta:

```bash
javac src/Main.java
```

Depois:

```bash
java -cp src Main
```

A estrutura exata de execução pode mudar conforme a organização futura do projeto.

---

## Estrutura do Projeto

```text
Sistema-Criptografia-Java/
│
├── .gitignore
├── README.md
│
├── assets/
│   └── criptkey-demo.gif
│
└── src/
    └── Main.java
```

A pasta `assets/` é destinada aos recursos visuais do projeto.

O arquivo:

```text
assets/criptkey-demo.gif
```

é o único espaço reservado para a demonstração animada do CriptKey.

---

## Conceito

O projeto trabalha com a transformação de caracteres em valores numéricos.

Por exemplo, utilizando a posição de cada letra no alfabeto:

```text
A → 1
B → 2
C → 3
D → 4
...
Z → 26
```

Uma entrada como:

```text
mamaco
```

pode ser transformada em:

```text
13 1 13 1 3 15
```

O objetivo inicial é compreender como uma informação pode ser percorrida, analisada e transformada por meio de algoritmos.

---

## Fluxo do CriptKey

```text
Entrada
   │
   ▼
Texto fornecido pelo usuário
   │
   ▼
Leitura dos caracteres
   │
   ▼
Análise do alfabeto
   │
   ▼
Conversão dos caracteres
   │
   ▼
Resultado criptográfico
```

---

## Objetivos

O CriptKey foi desenvolvido com os seguintes objetivos:

* Praticar Java.
* Trabalhar com arrays.
* Trabalhar com `char` e `String`.
* Utilizar estruturas de repetição.
* Utilizar estruturas condicionais.
* Trabalhar com `List` e `ArrayList`.
* Desenvolver algoritmos próprios.
* Estudar transformação de dados.
* Compreender conceitos básicos de criptografia.
* Evoluir posteriormente para algoritmos criptográficos mais robustos.
* Praticar Git e GitHub.
* Desenvolver organização de projetos Java.

---

## Roadmap

### Fase 1 — Fundamentos

* [x] Entrada de texto
* [x] Manipulação de caracteres
* [x] Array de caracteres
* [x] Busca no alfabeto
* [x] Conversão de caracteres
* [x] Estruturas de repetição
* [x] Estruturas condicionais
* [x] Integração inicial com Git

### Fase 2 — CriptKey Core

* [ ] Separar responsabilidades em classes
* [ ] Criar camada de criptografia
* [ ] Criar camada de descriptografia
* [ ] Melhorar tratamento de entrada
* [ ] Implementar validações
* [ ] Criar testes automatizados
* [ ] Melhorar arquitetura do projeto

### Fase 3 — Criptografia

* [ ] Implementar algoritmos adicionais
* [ ] Comparar diferentes métodos
* [ ] Trabalhar com chaves
* [ ] Estudar hashing
* [ ] Estudar criptografia simétrica
* [ ] Estudar criptografia assimétrica
* [ ] Estudar gerenciamento de chaves

### Fase 4 — CriptKey Advanced

* [ ] Interface de usuário
* [ ] Sistema de configuração
* [ ] Logs
* [ ] Testes de segurança
* [ ] Documentação técnica
* [ ] Melhorias de performance
* [ ] Empacotamento da aplicação

---

## Segurança

O CriptKey possui finalidade **educacional e experimental**.

Implementações próprias de criptografia não devem ser utilizadas para proteger senhas, dados financeiros, informações pessoais ou outros dados sensíveis sem uma análise de segurança adequada.

Para aplicações reais, recomenda-se utilizar algoritmos e bibliotecas criptográficas amplamente auditados e estabelecidos.

---

## Compatibilidade

| Sistema | Status                    |
| ------- | ------------------------- |
| Windows | Suportado                 |
| Linux   | Suportado                 |
| macOS   | Suportado                 |

A compatibilidade está diretamente relacionada à instalação e configuração correta do Java JDK 21 e das ferramentas utilizadas.

---

## Desenvolvimento

O projeto utiliza Git para controle de versão.

Fluxo básico:

```bash
git pull
git add .
git commit -m "Descrição da alteração"
git push
```

---

## Licença

Este projeto é distribuído sob a **Licença MIT**.

A Licença MIT permite uso, cópia, modificação, distribuição e sublicenciamento do software, desde que o aviso de copyright e o texto da licença sejam mantidos.

Para consultar os termos completos:

[MIT License](./LICENSE)

<p align="left">
  <img src="https://img.shields.io/badge/License-MIT-22C55E?style=for-the-badge&logo=opensourceinitiative&logoColor=white" alt="MIT License">
</p>


## Projeto

**CriptKey**

Sistema de Criptografia em Java.

Desenvolvido com foco em aprendizado, experimentação, algoritmos e evolução contínua.

<p align="center">
  <img src="https://capsule-render.vercel.app/api?type=waving&color=0:2563EB,50:1E293B,100:0F172A&height=120&section=footer&animation=fadeIn" width="100%" alt="CriptKey Footer">
</p>
