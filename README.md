# Lista de Tarefas em Java

Projeto desenvolvido para praticar os fundamentos de **Orientação a Objetos** com Java.

## Funcionalidades

- Adicionar tarefas
- Listar todas as tarefas com status (pendente ou concluída)
- Marcar tarefa como concluída
- Remover tarefa

## Como executar

1. Clone o repositório:
```bash
git clone https://github.com/kayky-coder/lista-de-tarefas-java.git
```
2. Compile os arquivos:
```bash
javac src/*.java -d bin
```
3. Execute o programa:
```bash
java -cp bin Main
```

## Estrutura do projeto

```
src/
├── Tarefa.java              # Modelo da tarefa (nome e status)
├── GerenciadorTarefas.java  # Lógica de adicionar, listar, concluir e remover
└── Main.java                # Interface com o usuário via terminal
```

## Conceitos praticados

- Classes e objetos
- Encapsulamento (getters e setters)
- ArrayList
- Estruturas de controle (switch, do-while)
- Scanner para entrada de dados

## Tecnologias

- Java
