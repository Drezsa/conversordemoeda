# 💰 Conversor de Moedas (Java + API ExchangeRate)
Este projeto é um **Conversor de Moedas** desenvolvido em Java, utilizando a API pública **ExchangeRate-API** para obter taxas de câmbio atualizadas em tempo real.
O usuário pode escolher a conversão desejada, informar o valor e o programa calcula automaticamente o resultado usando as taxas fornecidas pela API.
---
## 🚀 Funcionalidades
- **✔ Consulta taxas de câmbio em tempo real via API**
- **✔ Converte entre 6 pares de moedas:**

- USD → ARS
- ARS → USD
- USD → BRL
- BRL → USD
- USD → COP
- COP → USD

- **✔ Interface simples por terminal**
- **✔ Tratamento de erros para falhas na API**
- **✔ Conversões organizadas em métodos para facilitar manutenção**
---

## 🛠 Tecnologias  utilizadas

- **Java 17+**
- **HTTP Client (java.net.http)**
- **Gson (Google) para leitura do JSON**
- **API ExchangeRate-API**
- **IntelliJ IDEA (opcional)**
---  

📁 Estrutura do Projeto
src/
 └── main/
       ├── Principal.java       # Menu e interação com usuário
       ├── ConverteMoeda.java   # Consulta API e converte valores
       └── Moedas.java          # Record com taxas de câmbio
---

🔐 Segurança da Chave da API
Para manter sua chave protegida, ** não suba ela para o GitHub**.
O ideal é armazená-la em um arquivo local ignorado pelo Git:

➤ 1. Crie um arquivo **config.properties**
➤ 2. Adicione no .gitignore
➤ 3. Leia no código:
'''java
Properties props = new Properties();
props.load(new FileInputStream("config.properties"));
String chave = props.getProperty("API_KEY");
---

▶️ Como executar o projeto
Clone o repositório:
git clone https://github.com/seu-usuario/seu-repositorio.git
Abra o projeto no IntelliJ ou rode pelo terminal

Configure seu arquivo config.properties com sua chave

Compile o projeto:
javac src/*.java

Execute:
java Principal
---

🔄 Exemplo de Uso
1 - Dólar => Peso Argentino
2 - Peso Argentino => Dólar
3 - Dólar => Real Brasileiro
4 - Real Brasileiro => Dólar
5 - Dólar => Peso Colombiano
6 - Peso Colombiano => Dólar
7 - Sair
Escolha uma opção válida:

Digite o valor para converter:
---

📌 Melhorias Futuras
Interface gráfica com JavaFX
Mais moedas disponíveis
Histórico de conversões
Exportar resultado para arquivo
---

👩‍💻 Desenvolvido por
Andreza Oliveira com apoio do curso Alura + One
Projeto acadêmico para prática de Java, API REST e manipulação de JSON.


