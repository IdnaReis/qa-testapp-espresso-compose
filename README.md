# QA Test App — Testes de UI Automatizados com Espresso + Jetpack Compose

Projeto de automação de testes de UI para Android, desenvolvido como desafio prático da **DIO (Digital Innovation One)**, aplicando boas práticas de QA em um app Android moderno com Jetpack Compose.

## 🎯 Objetivo

Validar automaticamente o comportamento da interface do app através de testes instrumentados, garantindo que os componentes visuais (Composables) sejam exibidos corretamente na tela, utilizando o padrão **Robot Pattern** para organizar as interações de forma limpa e reutilizável.

## 🛠️ Tecnologias utilizadas

- **Kotlin**
- **Jetpack Compose** — construção da UI declarativa
- **Espresso / Compose UI Testing** — automação de testes de interface
- **JUnit4** (`AndroidJUnit4`) — runner dos testes instrumentados
- **Robot Pattern** — abstração das interações de tela em classes dedicadas
- **Gradle** — build e gerenciamento de dependências

## 📱 Sobre o app

App simples criado a partir do template *Empty Activity* do Android Studio com Jetpack Compose, exibindo uma tela principal com o texto de saudação `"Hello Android!"` através do composable `Greeting`.

## 🧪 Estrutura dos testes

```
app/src/androidTest/java/com/example/qatestapp/
├── MainScreenRobot.kt   → Robot com as interações e verificações da tela principal
└── MainScreenTest.kt    → Caso de teste que utiliza o Robot
```

### Robot Pattern (`MainScreenRobot.kt`)

Encapsula as interações com a tela principal, isolando os detalhes de implementação do Compose Testing das asserções do teste:

```kotlin
class MainScreenRobot(private val composeTestRule: AndroidComposeTestRule<*, *>) {
    fun verifyGreetingIsDisplayed(expectedText: String) {
        composeTestRule.onNodeWithText(expectedText).assertIsDisplayed()
    }
}
```

### Teste (`MainScreenTest.kt`)

```kotlin
@RunWith(AndroidJUnit4::class)
class MainScreenTest {
    @get:Rule
    val composeTestRule = createAndroidComposeRule<MainActivity>()
    private lateinit var robot: MainScreenRobot

    @Test
    fun deveExibirSaudacaoParaAndroid() {
        robot = MainScreenRobot(composeTestRule)
        robot.verifyGreetingIsDisplayed("Hello Android!")
    }
}
```

## ▶️ Como rodar os testes

1. Clone o repositório:
   ```
   git clone https://github.com/IdnaReis/qa-testapp-espresso-compose.-.git
   ```
2. Abra o projeto no **Android Studio**.
3. Conecte um dispositivo físico ou emulador Android com **Depuração USB** ativada.
4. Clique com o botão direito na classe `MainScreenTest` → **Run 'MainScreenTest'**.

## ✅ Resultado

Testes executados e validados com sucesso em dispositivo físico **Samsung Galaxy A11 (Android 12)**:

```
BUILD SUCCESSFUL
SM-A115M - 2 Tests 2/2 completed. (0 skipped) (0 failed)
```

## 📌 Aprendizados

- Configuração de `AndroidComposeTestRule` para testes instrumentados com Compose.
- Aplicação do Robot Pattern para deixar os testes mais legíveis e de fácil manutenção.
- Diagnóstico e resolução de problemas de comunicação entre o Android Studio e o dispositivo físico via `adb`.

---

Desenvolvido por **Idna Reis** como parte do bootcamp de QA da DIO.
