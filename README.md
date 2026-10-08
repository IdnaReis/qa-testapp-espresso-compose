# 📱 Automação de Testes Android — Espresso & Jetpack Compose

![Kotlin](https://img.shields.io/badge/Kotlin-7F52FF?style=for-the-badge&logo=kotlin&logoColor=white)
![Android](https://img.shields.io/badge/Android-3DDC84?style=for-the-badge&logo=android&logoColor=white)
![Espresso](https://img.shields.io/badge/Espresso-Testing-FF6F00?style=for-the-badge)

Primeiro projeto de testes instrumentados Android, desenvolvido como desafio da **Digital Innovation One (DIO)**. O objetivo foi configurar o ambiente, escrever um teste de UI com Jetpack Compose e executá-lo em um **dispositivo físico**.

## 📌 Sobre o Projeto

App Android simples construído com Jetpack Compose, com um teste de interface que valida a exibição da mensagem de saudação na tela principal.

## 🧪 Testes Implementados

| Classe | Teste | O que valida |
|---|---|---|
| `MainScreenTest` | `deveExibirSaudacaoParaAndroid` | A saudação é exibida corretamente na tela principal |
| `ExampleInstrumentedTest` | `useAppContext` | Teste padrão do Android Studio: confirma o contexto do app |

## 🛠️ Tecnologias

| Tecnologia | Uso |
|---|---|
| Kotlin | Linguagem do app e dos testes |
| Jetpack Compose | Interface declarativa do Android |
| Espresso / Compose Testing | Testes instrumentados de UI |
| Gradle | Build e execução dos testes |

## 📱 Ambiente de Execução

- **Dispositivo:** Samsung Galaxy A11 (SM-A115M), Android 12
- **Relatório:** gerado automaticamente pelo Gradle

## ▶️ Como Executar

```bash
git clone https://github.com/IdnaReis/qa-testapp-espresso-compose.git
# Abra no Android Studio, conecte um dispositivo e rode:
./gradlew connectedAndroidTest
```

## 📸 Evidências

**Resumo da execução: 2 testes, 0 falhas, 100% de sucesso**

![Resumo dos testes](evidencias/relatorio-sucesso-100.png)

**Teste da tela principal (MainScreenTest)**

![MainScreenTest](evidencias/relatorio-mainscreentest.png)

## 🚀 Próximos Passos

- Adicionar testes de navegação e interação com componentes
- Organizar os testes com Robot Pattern

## 👩‍💻 Autora

**Idna Reis**
QA | Analista de Qualidade | Automação de Testes

[![LinkedIn](https://img.shields.io/badge/LinkedIn-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/idna-reis)
[![GitHub](https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github&logoColor=white)](https://github.com/IdnaReis)
