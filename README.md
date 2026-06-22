# 🛒 Sistema de Lista de Compras

Aplicação de console desenvolvida em **Java** para gerenciar uma lista de compras de forma simples e interativa. O usuário pode visualizar, adicionar e editar itens diretamente pelo terminal.

---

## 📋 Funcionalidades

- **Exibir lista** — mostra todos os itens cadastrados ou avisa quando a lista está vazia
- **Adicionar item** — permite inserir novos produtos com validação de entrada
- **Editar item** — permite alterar o nome de um item já existente na lista
- **Sair** — encerra o programa com segurança

---

## 🚀 Como executar

### Pré-requisitos

- [Java JDK](https://www.oracle.com/java/technologies/downloads/) 8 ou superior instalado

### Passos

```bash
# Clone o repositório
git clone https://github.com/luccaves/sistema_lista_de_itens.git

# Acesse a pasta do projeto
cd sistema_lista_de_itens/src

# Compile o arquivo
javac Main.java

# Execute o programa
java Main
```

---

## 🖥️ Como usar

Ao iniciar, o menu principal será exibido:

```
--------------------------------
        LISTA DE COMPRAS
--------------------------------
Escolha a opção desejada:
0 -> SAIR (Encerra o programa)
1 -> EXIBIR LISTA
2 -> ADICIONAR ITEM A LISTA
3 -> EDITAR LISTA
>>>
```

Digite o número da opção desejada e pressione **Enter**.

> Para voltar ao menu principal durante a adição de itens, digite `<b`.

---

## 🗂️ Estrutura do projeto

```
sistema_lista_de_itens/
└── src/
    └── Main.java
```

---

## 🛠️ Tecnologias utilizadas

- Java
- `ArrayList` — armazenamento dinâmico dos itens
- `Scanner` — leitura de entrada do usuário

---

## 👤 Autor

Feito por [luccaves](https://github.com/luccaves)

