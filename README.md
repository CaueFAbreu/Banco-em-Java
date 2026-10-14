# 🏦 Banco em Java

![Java](https://img.shields.io/badge/Java-15%2B-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Interface](https://img.shields.io/badge/Interface-Swing-lightgrey?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-Concluído-brightgreen?style=for-the-badge)

> Simulação de contas correntes em Java com interface gráfica via `JOptionPane` (Swing), desenvolvida como prática introdutória de **Programação Orientada a Objetos**.

---

## ✅ Funcionalidades

- Consultar o saldo das contas.
- Depositar valores (apenas valores positivos).
- Sacar valores, com verificação de saldo.
- Transferir entre contas.
- **Conta especial**: pode sacar e transferir além do saldo disponível.

---

## 🧱 Modelagem

| Classe | Responsabilidade |
|--------|------------------|
| `ContaCorrente` | Guarda cliente, saldo e tipo de conta (comum ou especial), e implementa `EmitirSaldo`, `Depositar`, `Sacar` e `transferir` |
| `Main` | Menu interativo em `JOptionPane` com duas contas de exemplo |

---

## ⚙️ Como Compilar e Executar

**Pré-requisito:** JDK 15 ou superior (o menu usa *text blocks*).

```bash
javac -d out src/*.java
java -cp out Main
```

---

## 👤 Autor

**Cauê Fernando Faria Abreu**, Ciência da Computação, UFU

[![GitHub](https://img.shields.io/badge/GitHub-CaueFAbreu-181717?style=flat&logo=github)](https://github.com/CaueFAbreu)
