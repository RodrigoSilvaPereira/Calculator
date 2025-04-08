
# 📱 Calculator Kotlin - Jetpack Compose

Uma aplicação de **calculadora moderna** desenvolvida em **Kotlin** utilizando **Jetpack Compose** e boas práticas de arquitetura como **MVVM**, **componentização**, **gerenciamento de estado**, e separação de camadas.  

Este projeto foi desenvolvido com o objetivo de praticar os conhecimentos adquiridos em aula, focando em **Clean Architecture**, **usabilidade**, **manutenibilidade** e **código limpo**.

---

## 🎯 Objetivo

Criar uma calculadora funcional com operações básicas (adição, subtração, multiplicação e divisão), que siga as boas práticas de desenvolvimento Android, com uma interface intuitiva e modular.

---

## 📸 Interface

A interface da aplicação segue o layout apresentado abaixo, com foco em clareza, responsividade e usabilidade:

- Campos de entrada para dois números (N1 e N2)
- Botões de operação: `+`, `-`, `×`, `÷`
- Botão de **Calcular**
- Exibição do **resultado**

---

## 🧱 Arquitetura

A estrutura do projeto foi pensada para escalabilidade e manutenibilidade:

```bash
📁 ui/
 ├── 📁 screens/
 │    └── CalculatorScreen.kt       # Tela principal
 ├── 📁 components/
 │    ├── NumberInputField.kt       # Campo de entrada numérica
 │    ├── OperatorButton.kt         # Botão de operação
 │    └── ResultDisplay.kt          # Exibição de resultado
 ├── 📁 viewmodel/
 │    └── CalculatorViewModel.kt    # Lógica e estado da calculadora
 ├── 📁 theme/
 │    ├── Color.kt
 │    ├── Typography.kt
 │    └── Theme.kt
 ├── 📁 utils/
 │    └── CalculatorUtils.kt        # Função de cálculo principal
```

---

## ⚙️ Tecnologias Utilizadas

- ✅ **Kotlin**
- ✅ **Jetpack Compose**
- ✅ **MVVM Architecture**
- ✅ **State Management** com `remember`, `mutableStateOf`
- ✅ **Material Design 3**
- ✅ Componentização e reutilização de código

---

## ✅ Funcionalidades Implementadas

- Inserção de dois números
- Seleção de uma operação aritmética
- Cálculo do resultado com tratamento de erros
- Exibição do resultado
- Validação de entrada (ex: evitar divisão por zero)

---

## 📌 Boas Práticas Adotadas

- Componentes reutilizáveis (`@Composable`)
- Lógica isolada no ViewModel
- Separação de responsabilidades (UI, lógica, cálculo)
- Código idiomático, limpo e documentado
- Responsividade para diferentes tamanhos de tela

---

## 🛠️ Como rodar o projeto

1. Clone o repositório:
   ```bash
   git clone https://github.com/RodrigoSilvaPereira/Calculator.git
   ```

2. Abra com o **Android Studio** (Hedgehog ou superior)

3. Aguarde o Gradle sincronizar e **rode o projeto em um emulador ou dispositivo físico**

---

## ⚠️ Problema Encontrado: Versão do Android Gradle Plugin
Durante o desenvolvimento, ocorreu um problema de compatibilidade com a versão do Android Gradle Plugin (AGP). A mensagem de erro indicava:
```
The project is using an incompatible version of the Android Gradle plugin. Please upgrade to AGP 8.0 or higher.
```

Foi necessário atualizar a versão do AGP para uma versão compatível com o projeto no arquivo build.gradle (nível de projeto) e também ajustar a versão do Gradle caso necessário. Após isso, a sincronização do projeto voltou a funcionar normalmente.

### Substitua:
```
agp = "8.9.0"
```

### Por:
```
agp = "8.7.2"
```

## 🧑‍💻 Autor

Desenvolvido por Rodrigo, estudante de desenvolvimento mobile com foco em Kotlin e Jetpack Compose.  
Sinta-se à vontade para contribuir ou sugerir melhorias!

---

## 📄 Licença

Este projeto está sob a licença [MIT](LICENSE).

---
