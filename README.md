# 🏭 Sistemas WEG - Soluções Java para Indústria 4.0

<div align="center">

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![OOP](https://img.shields.io/badge/OOP-Oriented-blue?style=for-the-badge)
![Design Pattern](https://img.shields.io/badge/Pattern-MVC-green?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-Concluído-success?style=for-the-badge)

*Sistemas desenvolvidos para otimização de processos industriais da WEG*

</div>

## 📋 Índice

- [🎯 Sobre o Projeto](#-sobre-o-projeto)
- [🏗️ Arquitetura](#️-arquitetura)
- [🚀 Sistemas Implementados](#-sistemas-implementados)
  - [Sistema de Monitoramento Preditivo](#sistema-de-monitoramento-preditivo)
  - [Sistema de Controle de Equipamentos](#sistema-de-controle-de-equipamentos)
- [💻 Tecnologias](#-tecnologias)
- [📁 Estrutura do Projeto](#-estrutura-do-projeto)
- [⚡ Como Executar](#-como-executar)
- [🧪 Testes](#-testes)
- [📊 Funcionalidades](#-funcionalidades)
- [🎨 Padrões de Código](#-padrões-de-código)
- [👨‍💻 Autor](#-autor)

## 🎯 Sobre o Projeto

Este repositório contém duas soluções Java enterprise desenvolvidas para a **WEG**, multinacional do setor eletroindustrial. Os sistemas aplicam conceitos avançados de **Programação Orientada a Objetos (POO)** e seguem as melhores práticas de desenvolvimento de software, incluindo arquitetura **MVC (Model-View-Controller)**.

### Contexto de Negócio

A WEG necessitava de soluções tecnológicas para:

1. **Monitoramento Preditivo**: Antecipar falhas em equipamentos industriais através da análise de sensores IoT
2. **Gestão de Estoque**: Otimizar o controle de equipamentos de manutenção

Ambos os sistemas foram projetados para aumentar a **produtividade**, reduzir **custos operacionais** e implementar práticas de **Indústria 4.0**.

## 🏗️ Arquitetura

Os sistemas seguem rigorosamente a arquitetura **MVC**, garantindo:

- **Separação de Responsabilidades**: Cada camada tem sua função específica
- **Manutenibilidade**: Código modular e de fácil manutenção  
- **Escalabilidade**: Estrutura preparada para crescimento
- **Testabilidade**: Camadas isoladas facilitam testes unitários

```
📦 Arquitetura MVC
├── 🎯 Model      → Entidades de negócio e dados
├── ⚙️ Service    → Regras de negócio e processamento
├── 🖥️ View       → Interface de usuário (Terminal)
└── 🚀 Main       → Inicialização da aplicação
```

## 🚀 Sistemas Implementados

### Sistema de Monitoramento Preditivo

**Versão**: 1.0 | **Status**: ✅ Produção

Sistema IoT para monitoramento em tempo real de equipamentos industriais através de sensores especializados.

#### 🎯 Objetivos
- Detectar anomalias antes que falhas ocorram
- Reduzir paradas não programadas
- Otimizar manutenção preventiva
- Aumentar vida útil dos equipamentos

#### 🔧 Funcionalidades Core
- ✅ Cadastro de sensores (Temperatura/Vibração)
- ✅ Registro de medições com timestamp
- ✅ Sistema de alertas automático
- ✅ Histórico completo de medições
- ✅ Identificação de sensores críticos
- ✅ Dashboard de monitoramento

#### 📊 Parâmetros Técnicos
| Tipo de Sensor | Limite de Alerta | Criticidade |
|----------------|------------------|-------------|
| Temperatura    | > 80.0°C        | > 3 alertas |
| Vibração       | ≠ 60.0Hz        | > 3 alertas |

---

### Sistema de Controle de Equipamentos

**Versão**: 2.0 | **Status**: ✅ Produção

Sistema ERP para gestão inteligente de estoque de equipamentos de manutenção industrial.

#### 🎯 Objetivos
- Controle preciso de inventário
- Rastreabilidade completa de movimentações
- Otimização de recursos
- Relatórios gerenciais avançados

#### 🔧 Funcionalidades Core

**Versão 1.0:**
- ✅ Cadastro de equipamentos (Motores/Painéis)
- ✅ Listagem e filtros inteligentes
- ✅ Pesquisa por código
- ✅ Remoção segura
- ✅ Movimentação de estoque com validações

**Versão 2.0 - Melhorias:**
- ✅ Relatórios executivos de estoque
- ✅ Busca avançada por nome 
- ✅ Filtros por faixa de preço
- ✅ Analytics de estoque baixo
- ✅ Dashboard de métricas

## 💻 Tecnologias

<div align="center">

| Tecnologia | Versão | Propósito |
|------------|--------|-----------|
| **Java** | 8+ | Linguagem principal |
| **Collections Framework** | - | Estruturas de dados |
| **Exception Handling** | - | Tratamento de erros |
| **OOP Principles** | - | Paradigma de programação |
| **MVC Pattern** | - | Arquitetura |
| **Terminal Interface** | - | Interface do usuário |

</div>

### 🧬 Conceitos POO Aplicados

- **Encapsulamento**: Proteção de dados com getters/setters
- **Herança**: Hierarquia de sensores e equipamentos
- **Polimorfismo**: Sobrescrita de métodos especializados
- **Abstração**: Interfaces bem definidas entre camadas

## 📁 Estrutura do Projeto

```
sistemas-weg/
│
├── 📁 sistema-monitoramento/
│   ├── 📦 model/
│   │   ├── Sensor.java
│   │   ├── SensorTemperatura.java
│   │   ├── SensorVibracao.java
│   │   └── Medicao.java
│   ├── 📦 service/
│   │   └── SensorService.java
│   ├── 📦 view/
│   │   └── InterfaceUsuario.java
│   └── 📦 main/
│       └── Main.java
│
├── 📁 sistema-equipamentos/
│   ├── 📦 model/
│   │   ├── Equipamento.java
│   │   ├── MotorEletrico.java
│   │   └── PainelControle.java
│   ├── 📦 service/
│   │   └── EstoqueService.java
│   ├── 📦 view/
│   │   └── InterfaceUsuario.java
│   └── 📦 main/
│       └── Main.java
│
├── 📄 README.md
└── 📄 .gitignore
```

## ⚡ Como Executar

### Pré-requisitos
- ☕ Java JDK 8 ou superior
- 🔧 IDE de sua preferência (IntelliJ IDEA, Eclipse, VS Code)

### Execução

```bash
# Clone o repositório
git clone https://github.com/seu-usuario/sistemas-weg.git
cd sistemas-weg

# Sistema de Monitoramento
cd sistema-monitoramento
javac -d bin src/**/*.java
java -cp bin main.Main

# Sistema de Equipamentos  
cd ../sistema-equipamentos
javac -d bin src/**/*.java
java -cp bin main.Main
```

### 🖥️ Interface de Terminal

Ambos os sistemas possuem interfaces intuitivas via terminal com:
- 🎨 Menus organizados e responsivos
- ✅ Validação robusta de entradas
- 🚨 Tratamento inteligente de exceções
- 📊 Feedback visual em tempo real

## 🧪 Testes

### Cenários de Teste Implementados

**Sistema de Monitoramento:**
- ✅ Cadastro de sensores com validações
- ✅ Medições dentro e fora dos limites
- ✅ Geração automática de alertas
- ✅ Histórico de medições ordenado
- ✅ Identificação de sensores críticos

**Sistema de Equipamentos:**
- ✅ CRUD completo de equipamentos
- ✅ Movimentações de estoque com restrições
- ✅ Buscas e filtros avançados
- ✅ Relatórios gerenciais
- ✅ Validação de dados de entrada

## 📊 Funcionalidades

### 🔍 Sistema de Monitoramento - Features

<details>
<summary><b>📋 Gestão de Sensores</b></summary>

- Cadastro com tipagem automática
- Validação de códigos únicos
- Configuração automática de limites
- Associação com equipamentos

</details>

<details>
<summary><b>📈 Análise Preditiva</b></summary>

- Coleta de medições timestamped
- Algoritmos de detecção de anomalias
- Sistema de alertas em tempo real
- Classificação de criticidade

</details>

<details>
<summary><b>📊 Relatórios e Dashboards</b></summary>

- Histórico completo de medições
- Status de alertas por sensor
- Identificação de equipamentos críticos
- Métricas de performance

</details>

### 📦 Sistema de Equipamentos - Features

<details>
<summary><b>🏭 Gestão de Inventário</b></summary>

- Cadastro de motores elétricos e painéis
- Controle de especificações técnicas
- Validação de dados críticos
- Prevenção de duplicatas

</details>

<details>
<summary><b>📊 Controle de Estoque</b></summary>

- Movimentações rastreadas
- Validação de quantidades
- Prevenção de estoque negativo
- Histórico de transações

</details>

<details>
<summary><b>🔍 Business Intelligence</b></summary>

- Relatórios executivos automatizados
- Análise de estoque crítico
- Identificação de equipamentos premium
- Métricas de performance

</details>

## 🎨 Padrões de Código

### 📏 Code Standards

- **Nomenclatura**: camelCase para métodos, PascalCase para classes
- **Documentação**: JavaDoc em métodos públicos críticos
- **Tratamento de Erros**: Try-catch específicos com mensagens claras
- **Validação**: Entrada de dados robusta com feedback
- **Modularidade**: Responsabilidade única por classe

### 🏗️ Design Patterns Utilizados

- **MVC (Model-View-Controller)**: Arquitetura principal
- **Template Method**: Sobrescrita de métodos especializados
- **Strategy**: Diferentes algoritmos de validação por tipo
- **Factory Method**: Criação de sensores especializados

## 🔒 Segurança e Validação

- 🛡️ Validação de entrada robusta
- 🚫 Prevenção de valores inválidos
- ✅ Tratamento de exceções específico
- 🔍 Verificação de integridade de dados

## 📈 Performance

- ⚡ Algoritmos otimizados para busca
- 💾 Uso eficiente de memória
- 🚀 Interface responsiva no terminal
- 📊 Processamento em tempo real

## 👨‍💻 Autor

Desenvolvido por **Letícia Emanuele Güths** como parte dos estudos avançados em **Técnicas de Programação Java** com foco atual em **Programação Orientada a Objetos**.

---

<div align="center">

**🏭 WEG Systems - Driving Innovation in Industrial IoT**

*Sistemas desenvolvidos para otimizar a produtividade e reduzir custos operacionais através de tecnologia Java enterprise.*

</div>

---
