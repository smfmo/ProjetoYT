# Projeto de Aplicação de Vídeo em Java

Este projeto é uma aplicação simples desenvolvida em Java que utiliza os conceitos de **Programação Orientada a Objetos (POO)**. Ele simula um sistema de gerenciamento de vídeos, incluindo ações realizadas pelos vídeos e interações de usuários.

## 🛠️ Funcionalidades do Projeto
- **Gerenciamento de Vídeos**: Representação de vídeos com atributos como título, avaliação, número de curtidas, visualizações e estado de reprodução.
- **Ações em Vídeos**: Implementação de uma interface que permite executar ações como:
    - Reproduzir (`play`)
    - Pausar (`pause`)
    - Curtir (`like`)
- **Gerenciamento de Usuários**: Representação de usuários com atributos e métodos que gerenciam a experiência e o histórico de visualizações.

## 🧩 Estrutura do Projeto

### Classes e Interfaces
1. **`AcoesVideo` (Interface)**  
   Define as ações que um vídeo pode realizar:
    - `play()`
    - `pause()`
    - `like()`

2. **`Video` (Classe Concreta)**  
   Implementa a interface `AcoesVideo` e gerencia os atributos e comportamentos de um vídeo.

3. **`Pessoa` (Classe Abstrata)**  
   Representa uma pessoa genérica no sistema com atributos como:
    - Nome, idade, sexo e experiência.
      Contém métodos abstratos para ganho de experiência (`ganharExp`).

4. **`User` (Classe Concreta)**  
   Herda de `Pessoa` e adiciona funcionalidades específicas para um usuário do sistema:
    - Gerencia o login e o total de vídeos assistidos.
    - Sobrescreve métodos abstratos da classe `Pessoa`.

## 🛠️ Tecnologias Utilizadas
- **Linguagem**: Java
- **Paradigma**: Programação Orientada a Objetos (POO)
- **Conceitos Aplicados**:
    - Herança
    - Polimorfismo
    - Classes abstratas
    - Interfaces
    - Encapsulamento