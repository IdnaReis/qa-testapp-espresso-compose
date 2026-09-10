# 📱 Automação de Testes Android — Espresso & Jetpack Compose



![Kotlin](https://img.shields.io/badge/Kotlin-7F52FF?style=for-the-badge&logo=kotlin&logoColor=white)




![Android](https://img.shields.io/badge/Android-3DDC84?style=for-the-badge&logo=android&logoColor=white)




![Espresso](https://img.shields.io/badge/Espresso-Testing-orange?style=for-the-badge)



Projeto de automação de testes de UI para Android, desenvolvido como desafio da **Digital Innovation One (DIO)**.

## 📌 Sobre o Projeto

Automação de testes end-to-end para um aplicativo Android construído com **Jetpack Compose**, cobrindo múltiplos fluxos da aplicação. Os testes seguem o **Robot Pattern**, um padrão de organização que separa a lógica de interação com a tela da lógica de asserção, deixando os testes mais legíveis e fáceis de manter.

## 🛠️ Tecnologias Utilizadas

| Tecnologia | Descrição |
|---|---|
| **Kotlin** | Linguagem de desenvolvimento |
| **Jetpack Compose** | Framework de UI declarativa do Android |
| **Espresso** | Framework de testes de UI para Android |
| **Robot Pattern** | Padrão de organização das telas |

## 🧪 Fluxos Testados

- Navegação entre telas
- Preenchimento e validação de formulários
- Interações de UI (cliques, inputs, estados de tela)

## 📁 Estrutura do Projeto

    qa-testapp-espresso-compose/
    ├── app/               # Código-fonte do aplicativo
    ├── evidencias/        # Prints e evidências de execução dos testes
    ├── gradle/            # Configurações do Gradle Wrapper
    └── build.gradle.kts   # Configurações de build

## ▶️ Como Executar

```bash
# Clone o repositório
git clone https://github.com/IdnaReis/qa-testapp-espresso-compose.git

# Abra no Android Studio e execute os testes instrumentados
./gradlew connectedAndroidTest
```
## 📸 Evidências

Confira a pasta [`evidencias/`](./evidencias) para prints e detalhes da execução dos testes em dispositivo físico.

## 👩‍💻 Autora

**Idna Reis**  
Profissional em transição para QA | Testes Manuais & Automação

<a href="https://linkedin.com/in/idna-reis"><img src="https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white"></a>
<a href="https://github.com/IdnaReis"><img src="https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github&logoColor=white"></a>






